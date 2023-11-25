<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="vo.Member"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<%@ page import ="java.sql.Date" %> 
<%
	Member member = (Member)session.getAttribute("member"); 
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name = "viewport" content = "width = device-width, initial-scale=1">
		<link href="${pageContext.request.contextPath }/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath }/css/jquery.bxslider.css" rel="stylesheet">
		<title>項目作成</title>
		<style type="text/css">
			a:ts {
				text-decoraction : none;
			}
			.tab {
		 		float: left;
		 		border: 1px solid #ccc;
		  		background-color: #f1f1f1;
		  		width: 25%;
		  		height: 300px;
			}
		
			.mid_content{
				width : 74.5%;
				float : left;
				margin-left : 5px;
			}
		
			.top_content{
				padding : 18px; 
				background-color : skyblue;
				text-align : center;
				margin-bottom : 3px;
			}
		
			.tab button {
		 		display: block;
		  		background-color: inherit;
		  		color: black;
		 		padding: 22px 16px;
		 		width: 100%;
		 		border: none;
		 		outline: none;
		  		text-align: left;
		  		cursor: pointer;
		  		font-size: 17px;
			}
		
			.tab button:hover {
  				background-color: #ddd;
			}
		
			.tab button.active {
		 		background-color: #ccc;
			}
		
			table.type01 {
		    	border-collapse: separate;
		    	border-spacing: 1px;
		    	text-align: center;
		    	line-height: 1.5;
		    	border-top: 1px solid #ccc;
		    	margin: 20px 10px;
			}
		    
			td.style1 {
		    	width: 150px;
		    	padding: 10px;
		    	font-weight: bold;
		    	vertical-align: top;
		    	border-bottom: 1px solid #ccc;
		    	background: #efefef;
			}
		    
			td.style2 {
		    	width: 350px;
		    	vertical-align: top;
		    	border: 1px solid #ccc;
			}
		
			#listbutton{
					display: block;
				    background-color: inherit;
				    color: black;
				    padding: 15px 10px;
				    border: none;
				    outline: none;
				    text-align: left;
				    cursor: pointer;
				    font-size: 14px;
			}
			.btn_ok{
				float: right;
				   	background:#426aaa; 
				   	color : #fff;
				   	width : 150px; 
				   	height : 70px;
				    border : 0 none;
				    outline: none;
				    text-align: center;
				    cursor : pointer;
				    font-size: 14px;
				    margin-left : 10px;
			}
			
		</style>
		
		<script type="text/javascript">
		function check_form() {
			var form = document.animalS;
			// 해당달의 마지막 일자 구하기
			var nMaxDay = new Date(new Date(form.ani_date1.value, form.ani_date2.value, 1) - 86400000).getDate();
			// 존재하는 날자(유효한 날자) 인지 체크
			if(form.ani_date1.value.length != 4) {
				alert("年は4文字で入力してください");
				return form.ani_date1.focus();
			}else if(form.ani_date1.value>new Date().getFullYear()) {
				alert("存在しない日です。もう一度確認してください");
				return form.ani_date1.focus();
			}else if(form.ani_date2.value.length != 2) {
				alert("月は２文字で入力してください");
				return form.ani_date2.focus();
			}else if (form.ani_date2.value < 1 || form.ani_date2.value > 12) { // 사용가능 하지 않은 달 체크
				alert("存在しない日です。もう一度確認してください");
				return form.ani_date2.focus();
			}else if(form.ani_date3.value.length != 2) {
				alert("日は２文字で入力してください");
				return form.ani_date3.focus();
			}else if (form.ani_date3.value < 1 || form.ani_date3.value > nMaxDay) { // 사용가능 하지 않은 날자 체크
				alert("存在しない日です。もう一度確認してください");
				return form.ani_date3.focus();
			}else if(form.ani_area.value.length==0) {
				alert("地域を選んでください");
				return form.ani_area.focus();
			}else if(form.ani_subject.value.length==0) {
				alert("タイトルを書いてください");
				return form.ani_subject.focus();
			}else if(form.ani_kind.value.length==0) {
				alert("類を選んでください");
				return form.ani_kind.focus();
			}else if(form.ani_content.value.length==0) {
				alert("コンテンツを書いてください");
				return form.ani_content.focus();
			}else{
				alert("登録完了！");
				form.submit();
			}
		}
		</script>

	</head>
	<body>
			<div class="hb">
				<jsp:include page="/main/mainBody.jsp"/>
			</div>
			<div class="header">
				<jsp:include page="/main/mainHeader.jsp"/>
			</div>
			<div class = "top_content">
				<h2>迷子動物広告</h2>
			</div>
			<div class = "tab">
				<button onclick="location.href='/animalRescue/aSearchList.anires'">迷子動物</button>
				<button onclick = "location.href='/animalRescue/hSearchList.anires'">保護中の動物</button>
				<button onclick = "location.href='/animalRescue/cSearchList.anires'">捜索済み</button>
			</div>
			<form name = "animalS" method = "post" action = "/animalRescue/searchWrite.anires" enctype="Multipart/form-data">
			<div class = "mid_content">
				<table style="text-align: center;">
	        	<tr>
	            	<td width = "650">
	                <font size="5em">
	               		情報入力
	                </font>
	                </td>
	            </tr>
	        </table>
	        <input type = "hidden" name = "ani_name" value = "${member.name }"/>
	        <input type = "hidden" name = "ani_tel" value = "${member.phone }"/>
	        <input type = "hidden" name = "ani_id" value = "${member.id }"/>
			<table class="type01">
	        	<tr>
	            	<td class="style1">日付
	            	</td>
	                <td class="style2"><input type="text" name="ani_date1" style="width:80px; height:36px; border:none"/>-<input type="text" name="ani_date2" style="width:45px; height:36px; border:none"/>-<input type="text" name="ani_date3" style="width:45px; height:36px; border:none"/>
	                <br>※日付の形式は次の例のようにしてください。<br> 例)2018-01-01
	                </td>
					<td class="style1">地域</td>
					<td class="style2">
							<select name = "ani_area">
								<option>地域を選んでください</option>
								<option value = "area_seoul">ソウル特別市</option>
								<option value = "area_busan">釜山広域市</option>
								<option value = "area_daegu">大邱広域市</option>
								<option value = "area_incheon">仁川広域市</option>
								<option value = "area_gwangju">広州広域市</option>
								<option value = "area_daejeon">大田広域市</option>
								<option value = "area_ulsan">蔚山広域市</option>
								<option value = "area_sejong">世宗特別市</option>
								<option value = "area_kyungki">京畿道</option>
								<option value = "area_gangwon">江原道 </option>
								<option value = "area_chungbuk">忠清北道</option>
								<option value = "area_chungnam">忠清南道</option>
								<option value = "area_jeonbuk">全羅北道</option>
								<option value = "area_jeonnam">全羅南道</option>
								<option value = "area_kyeongbuk">慶尚北道</option>
								<option value = "area_kyeongnam">慶尚南道</option>
								<option value = "area_jeju">済州特別自治道</option>
							</select><br>
					</td>
	             </tr>
				 <tr>
					 <td class="style1">タイトル</td>
					 <td colspan="4" class="style2"><input type="text" name="ani_subject" size="55" style="width:510px; height:36px; border:none"/></td>
				</tr>
	            <tr>
	            	<td class="style1">種類</td>
	                <td class="style2">
	                		<select name = "ani_kind">
								<option>種類を選んでください</option>
								<option value = "kind_dog">犬</option>
								<option value = "kind_cat">猫</option>
								<option value = "kind_bird">鳥類</option>
								<option value = "kind_repamp">爬虫類・両生類</option>
								<option value = "kind_small">その他</option>
							</select>
					</td>
					<td class="style1">写真</td>
					<td class="style2"><input type = "file" name = "ani_image"/></td>
	            </tr>
				<tr>
	            	<td class="style1">コンテンツ</td>
	                <td colspan="3" class="style2">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                <textarea rows="10" cols="65" name="ani_content" style="width:520px; height:150px; border:none"></textarea>
	                </td>
				</tr>
				<tr>
					<td class = "style1">広告の種類</td>
					<td colspan="4" class="style2">
						<input type="radio" name="ani_attribute" value = 0 checked="checked">迷子動物探し</input>&nbsp;&nbsp;&nbsp;
						<input type="radio" name="ani_attribute" value = 1>保護者探し</input>
					</td>
				</tr>
			</table>
	        <table>
	        	<tr height="30">
					<td width = "650" align="right">
						<input type="button" class="btn_ok" value = "作成" onclick="check_form()"/>
	                </td>
	                <td width = "80" align="right">
	                	<input type="reset" class="btn_ok" value ="リセット"/>
	                </td>
	                <td width = "80" aling="right">
	                	<input type = "button" class="btn_ok" onclick = "history.back()" value = "戻る">
	                </td>
	            </tr>
	        </table>
			</div>
		</form>
		<jsp:include page="/main/mainFooter.jsp"/>
	</body>
</html>