//var arr = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
//var dataarr = [29.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6, 148.5, 216.4, 194.1, 95.6, 54.4];
//

var chart = Highcharts.chart('chartcontainer', {
	
	title: {
        text: '내 월간 사용 금액'
    },	

    subtitle: {
        text: 'Plain'
    },
    xAxis: {
        categories: soldDate   
    },
    series: [{
        type: 'column',
        colorByPoint: true,
        data: soldAvg,
        showInLegend: false
    }]
});
//
function chartFunction(){
	
	console.log('day');
	$.ajax( {
		url: "./userInfo/chartType/day" ,			
		type: 'GET',				//타입
			success:function(data){
			  var soldDate = new Array();
			  var soldAvg = new Array();
			  for(var i=0; i<=data.length-1; i++ ){
				  soldDate[i] = data[i].sold_date;
				  soldAvg[i] = data[i].average;
			  }
			  chart.update({
			        chart: {
			            inverted: false,
			            polar: false
			        },
			        subtitle: {
			            text: 'Plain'
			        },
			        xAxis: {
			            categories: soldDate
			        },

			        series: [{
			          
			            data: soldAvg
			           
			        }]
			  });
			}
	});

}
	$('#inverted').click(function(){
		console.log('month');
		$.ajax( {
			url: "./userInfo/chartType/month" ,			
			type: 'GET',				//타입
				success:function(data){
				    var soldDate = new Array();
				    var soldAvg = new Array();
					for(var i=0; i<=data.length-1; i++ ){
				  	  soldDate[i] = data[i].sold_date;
					  soldAvg[i] = data[i].average;
					}
				  	chart.update({
				        chart: {
				            inverted: true,
				            polar: false
				        },
				        subtitle: {
				            text: 'Inverted'
				        },
				        
				        xAxis: {
				            categories: soldDate
				        },

				        series: [{
				          
				            data: soldAvg
				           
				        }]
				        
				    });
				}
		});
	});
	


/*$('#plain').click(function () {
    chart.update({
        chart: {
            inverted: false,
            polar: false
        },
        subtitle: {
            text: 'Plain'
        }
    });
});

$('#inverted').click(function () {
    chart.update({
        chart: {
            inverted: true,
            polar: false
        },
        subtitle: {
            text: 'Inverted'
        }
    });
});

$('#polar').click(function () {
	arr = ['1','2','3'];
	dataarr = [20,30,40];
    chart.update({
        chart: {
            inverted: false,
            polar: true
        },
        subtitle: {
            text: 'Polar'
        },
        
        xAxis: {
            categories: arr
        },

        series: [{
               
            data: dataarr
           
        }]
    });
});
	*/