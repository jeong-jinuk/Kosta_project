<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach var="e" items="${mlist }">
	<tr>
		<td>${e.member_number}</td>
		<td>${e.member_id }</td>
		<td>${e.member_name }</td>
	</tr>
</c:forEach>

<script>
	$(function() {
		//한 번에 여러 이벤트를 감지하고 처리하고 할 때 사용되는 함수
		$('#memberlist tbody tr').bind({
			click : function(e) {

				//var param = e.target.innerHTML;
				//var param = document.getElementById('memberlist');

				var tdArr = new Array();

				var tr = $(this);
				var td = tr.children();

				//console.log(param);
				//console.log(tr.text());

				// 							td.each(function(i){
				// 				                tdArr.push(td.eq(i).text());
				// 				            });

				// 				            console.log("배열에 담긴 값 : "+tdArr);

				var param = td.eq(0).text();
				var userid = td.eq(1).text();
				var name = td.eq(2).text();

				if (window.ActiveXObject) {
					xhr = new ActiveXObject("Microsoft.XMLHTTP");
				} else {
					xhr = new XMLHttpRequest();
				}
				// 서버로부터 결과가 도착할 때 수행하는 함수 지정(콜백함수)
				xhr.onreadystatechange = res;
				// 서버에게 호출하기 위한 준비
				// 전송방식, 주소, 비동기식(true), 동기식(false)
				xhr.open("POST", "./admin_MemberDetail?number=" + param, true);
				// 서버에게 요청보내기
				xhr.send(null);
				// 우린 get방식으로 보내기로 했기 때문에 인자는 반드시 null이어야 하고, 만약 post라면 null이 아니라, 보내고자 하는 파라미터를 문자열로 넣어야한다.
				// xhr.send(s);
			},
			mouseenter : function() {
				$(this).addClass('cng')
			},
			mouseleave : function() {
				$(this).removeClass('cng')
			}
		});
	});

	function res() {
		if (xhr.readyState == 4) { //서버로부터 데이터 처리가 완료된 경우
			if (xhr.status == 200) { //정상적인 처리인 경우
				let txt = document.getElementById("txt");
				txt.innerHTML = xhr.responseText;
				//alert(xhr.responseText);
			} else {
				alert("실패" + xhr.status);
			}
		}
	}
	
	// 페이징 처리 알고리즘
	$(function() {
		var $setRows = $('#setRows');

		$setRows.submit(function(e) {
			e.preventDefault();
			var rowPerPage = $('[name="rowPerPage"]').val() * 1;// 1 을  곱하여 문자열을 숫자형로 변환

			//		      console.log(typeof rowPerPage);

			var zeroWarning = '옳바른 값을 입력해 주세요.'
			if (!rowPerPage) {
				alert(zeroWarning);
				return;
			}
			$('.pagination').remove();
			var $products = $('#memberlist');
			// 					<div class="container">
			$products.after('<div id="next"><ul class="pagination">');
			// 					<ul class="pagination">
			var $tr = $($products).find('tbody tr');
			var rowTotals = $tr.length;
			//  console.log(rowTotals);

			var pageTotal = Math.ceil(rowTotals / rowPerPage);
			var i = 0;

			$('<li></li>').appendTo('.pagination');

			for (; i < pageTotal; i++) {
				$('<a href="#"></a>').attr('rel', i).html(i + 1).appendTo(
						'.pagination li');
				// 						$('</li>').appendTo('.pagination');
			}

			$tr.addClass('off-screen').slice(0, rowPerPage).removeClass(
					'off-screen');

			var $pagingLink = $('.pagination a');
			$pagingLink.on('click', function(evt) {
				evt.preventDefault();
				var $this = $(this);
				if ($this.hasClass('active')) {
					return;
				}
				$pagingLink.removeClass('active');
				$this.addClass('active');

				// 0 => 0(0*4), 4(0*4+4)
				// 1 => 4(1*4), 8(1*4+4)
				// 2 => 8(2*4), 12(2*4+4)
				// 시작 행 = 페이지 번호 * 페이지당 행수
				// 끝 행 = 시작 행 + 페이지당 행수

				var currPage = $this.attr('rel');
				var startItem = currPage * rowPerPage;
				var endItem = startItem + rowPerPage;

				$tr.css('opacity', '0.0').addClass('off-screen').slice(
						startItem, endItem).removeClass('off-screen').animate({
					opacity : 1
				}, 300);

			});

			$pagingLink.filter(':first').addClass('active');

		});

		$setRows.submit();
	});
</script>