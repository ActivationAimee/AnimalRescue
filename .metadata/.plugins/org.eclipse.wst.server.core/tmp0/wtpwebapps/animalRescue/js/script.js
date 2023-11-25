$(function(){
			//$("#nav>ul>li").hover(function(){<!-- 이벤트 핸들러,-->
				$("#nav>ul>li").hover(function(){
					$(this).children(".depth2").stop().slideDown(200);
					$(this).addClass("on");
			}, function(){
				$(".depth2").stop().slideUp(200);
				$(this).removeClass("on");
			});//거짓은 콤마
			
			
	
		$('.bxslider').bxSlider({
			mode: 'vertical',
			auto:true,
			captions: true,
			speed:500,
			slideWidth: 0
		});
	
			
	});//end
		
		//index에 있는 스크립트를 따로 js 파일로 만들음

function nwindow() {
	var url = "adopt/select.jsp";
	window.open(url, "", "width=60%,height=80%");
}

function checkForm() {
	if (aw.ani_subject.value == "") {
		alert("제목을 입력해주세요");
		aw.ani_subject.focus();
		return false;
	}
	if (aw.ani_name.value == "") {
		alert("성함을 입력해주세요");
		aw.ani_name.focus();
		return false;
	}
	if (aw.ani_tel.value == "") {
		alert("연락처를 입력해주세요");
		aw.ani_tel.focus();
		return false;
	}
	if (aw.ani_date.value == "") {
		alert("입양날짜를 입력해주세요");
		aw.ani_date.focus();
		return false;
	}
	if (aw.ani_content.value == "") {
		alert("내용을 입력해주세요");
		aw.ani_content.focus();
		return false;
	}

	return true;
}