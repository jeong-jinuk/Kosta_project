		var days = [ 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday',
			'Saturday', 'Sunday' ];
	var months = [ "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November",
			"December" ];
	var date = new Date();
	var array = new Array();
	var period_selected=0;
	var log_selected=1;
	var x_axis=getSelected(period_selected);
	var y_axis;
	var chart;
	var jsonData;

		
		
function start() {

	window.onload = function() {
		// 버튼 클릭시 실행할 함수
		// 나중에 y-axis에 들어갈 값도 배열형식으로 만들어 로드되는 값이 그래프에들어가도록수정.

		y_axis=getSelected_Log_Data(log_selected,period_selected);
		// 차트 initiate
		chart = new CanvasJS.Chart("chartContainer", {

			exportEnabled: true,
			animationEnabled : true,
			animationDuration : 1000,
			theme : "light2",
			title : {
				text : "총 방문자수"
			},
			axisY : {
				includeZero : false
			},
			axisY2:{},
			legend:{},
			toolTip:{shared : true},
			
			data : [ {
				type : "area",
				dataPoints : [ ]
			}]
		});
		updateGraphData();
		chart.render();

		// 기간 변경 버튼 listener
		$('#period a').on('click',function(e) {

					x_axis = getSelected($(this).data('value'));
					y_axis=getSelected_Log_Data(log_selected,period_selected);
					
					
					updateGraphData();
					chart.options.animationEnabled = true;
					$('#periodbtn').html($(this).text() + "<span class='caret'></span>");
					chart.render();

				});
		// 그래프 타입 변경 버튼 listener
		$('#type a').on('click', function(e) {
			var selecttype = $(this).data('value');
			var charttype;
			if (selecttype == 0)
				charttype = 'column';
			else if (selecttype == 1)
				charttype = 'doughnut';
			else
				charttype = 'area';
			$('#typebtn').html($(this).text() + "<span class='caret'></span>");
			chart.options.data[0].type = charttype;
			chart.render();
		});

		// 통계 아이콘 클릭 listener
		// 이미지를 눌렀을때 그래프가 해당 통계의 그래프로 바뀌게 하는 로직

		$(".icon").click(function() {
			var test = $(this).attr("id");
			var header;
			var y_label;
			if(log_selected==6){
				chart.options.data.pop();
			}
			if (test == "signupicon") {
				header = "총 가입수";
				y_label= "- 명";
				log_selected=5;
			} else if (test == "watchicon") {
				header = "총 시청수";
				y_label= "- 회";
				log_selected=4;
			} else if (test == "viewicon") {
				header = "총 조회수";
				y_label= "- 회";
				log_selected=3;
			} else if (test == "moneyicon") {
				header = "총 판매액";
				y_label= "- 원";
				log_selected=2;
			} else if (test == "usericon") {
				header = "총 방문자수";
				y_label= "- 명";
				log_selected=1;
			}
			
			// 판권 이익은 그래프 다른형식으로뿌려야함.
			else {
				header = "판권 수익";
				getMovie_Statistic();
				update2BarsGraphData();
				log_selected=6;
				return;
			}
			//y_axis에 선택된 로그의 데이터 업데이트
			y_axis=getSelected_Log_Data(log_selected,period_selected);
			updateGraphData();
			chart.options.animationEnabled = true;

			chart.options.axisY.title=header+y_label;
			chart.options.title.text = header;
			chart.render();

		});
	}
};
//선택된 기간을 판단하여 그래프에 표시될 기간 x축의 배열을 만들어 리턴함.
//요일,월,년의 결과를 x_axis에 할당하기위함.
function getSelected(selected) {
	var result;

	if (selected == 0) {
		result = date.getDay();
		for (var i = 0; i < 5; i++) {
			array[4 - i] = days[result - 1];
			if (0 == (--result)) {
				result = 6;
			}

		}
	} else if (selected == 1) {
		result = date.getMonth();
		for (var i = 0; i < 5; i++) {
			array[4 - i] = months[result];
			if (0 == (--result)) {
				result = 11;
			}
		}
	} else {
		result = date.getFullYear();
		for (var i = 0; i < 5; i++) {
			array[4 - i] = result;
			result--;
		}
	}
	period_selected=selected;
	return array;

};

//ajax를 통해 database에서 로그데이터를 불러와 저장한다.
function getSelected_Log_Data(log_selected,period_selected) {
	 $.ajax({
        url: "/MidProject/getLogData"+log_selected+"?cmd="+period_selected,
        success: function (data,status) {
        	y_axis=data;
        },
        error:function(e){
            alert(e);
        },
        async:false
    });
	 return y_axis;
};

function getMovie_Statistic() {
	 $.ajax({
       url: "/MidProject2/getMovieStatistic",
       dataType:'json',
       success: function (data,status) {
       	jsonData=data;
       },
       error:function(e){
           alert(e);
       },
       async:false
   });
	 return y_axis;
};

function update2BarsGraphData(){
	chart.options.axisY={
			title:"판권 구매액 총합 - 원",
			titleFontColor: "#4F81BC",
			lineColor: "#4F81BC",
			labelFontColor: "#4F81BC",
			tickColor: "#4F81BC"
	};
	chart.options.axisY2={
			title: "수익 총합 - 원",
			titleFontColor: "#C0504E",
			lineColor: "#C0504E",
			labelFontColor: "#C0504E",
			tickColor: "#C0504E"
	};
	chart.options.legend={
		cursor: "pointer",
		itemclick: toggleDataSeries
	};
	chart.options.data[0]=
	{
			type: "column",
				name: "판권 구매액 총합",
				showInLegend: true,      
				yValueFormatString: "#,##0.# 원",
				dataPoints: [
					{ label: "지난 달",  y: jsonData.copyrightcost_pastmonth },
					{ label: "이번 달", y: jsonData.copyrightcost_thismonth },
					{ label: "예 상", y: 10000000 }
				]
		};
	chart.options.data[1]=
	{
			type: "column",
			name: "수입 총합",
			showInLegend: true,      
			yValueFormatString: "#,##0.# 원",
			dataPoints: [
				{ label: "지난 달",  y: jsonData.investment_pastmonth },
				{ label: "이번 달", y: jsonData.investment_thismonth },
				{ label: "예 상", y: 10000000 }
			]
	};

	chart.render();
	
	
}
//그래프의 x축 이름과 y축 자료를 최신으로 업데이트한다
function updateGraphData(){
	chart.options.data[0].type="area";
	chart.options.data[0].showInLegend=false;
	chart.options.data[0].dataPoints = [ {
		label : x_axis[0],
		y : y_axis[0]
	}, {
		label : x_axis[1],
		y :y_axis[1]
	}, {
		label : x_axis[2],
		y : y_axis[2]
	}, {
		label : x_axis[3],
		y :y_axis[3]
	}, {
		label : x_axis[4],
		y :y_axis[4]
	} ];
};
function toggleDataSeries(e) {
	if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	} else {
		e.dataSeries.visible = true;
	}
	e.chart.render();
}
