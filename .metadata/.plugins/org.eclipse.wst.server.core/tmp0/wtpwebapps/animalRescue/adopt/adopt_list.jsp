<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<link href="${pageContext.request.contextPath}/css/common.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/main.css" rel="stylesheet">
		<link href="${pageContext.request.contextPath}/css/jquery.bxslider.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>
		<script src="${pageContext.request.contextPath}/js/script.js"></script>
</head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<style type = "text/css">
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
		
		table{
			border-collapse: collapse;
			border-spacing: 0;
			width : 100%;
			border : 1px solid #ddd;
		}
		
		th, td{
			text-align: center;
			padding: 16px;
		}
		
		tr:nth-child(even){
			background-color: #f2f2f2
		}
		
		tr.listbar:hover{
			background-color: #ddd;
		}
		
		<!-- serch문 -->
		.topnav {
		  overflow: hidden;
		  background-color: #ddd;
		  width: 74.5%;
		}
		
		.topnav .search-container {
		  float: right;
		}
		
		.topnav input[type=text] {
		  padding: 6px;
		  margin-top: 8px;
		  font-size: 17px;
		  border: none;
		}

		.topnav .search-container button {
		  float: right;
		  padding: 6px 10px;
		  margin-top: 8px;
		  margin-right: 16px;
		  background: #ddd;
		  font-size: 17px;
		  border: none;
		  cursor: pointer;
		}
		
		.topnav .search-container button:hover {
		  background: #ccc;
		}
		
		.topnav .search-container select{
		  padding: 6px;
		  margin-top: 8px;
		  font-size: 12px;
		  border: none;
		}
		
		#listbutton{
			float: right;
			display: block;
			background-color: inherit;
			color: black;
			padding: 19px 5px;
			width: 19%;
			border: none;
			outline: none;
			text-align: center;
			cursor: pointer;
			font-size: 14px;
			margin-left : 10px;
		}
		
	</style>
<script type="text/javascript" src="script/script.js">
</script>
<body>
	<div class="hb">
		<jsp:include page="/main/mainBody.jsp"></jsp:include>
	</div>
	<div class="header">
		<jsp:include page="/main/mainHeader.jsp"></jsp:include>
	</div>
	<div class = "top_content">
		<h2>申請目録</h2>
	</div>
	<div class="tab">
		<button onclick=" location.href='/animalRescue/adopt_list.anires'">目録</button>
	</div>
	<div class="mid_content">
		<form action="adopt_list.anires" method="post">
			<table border="2" align="center" width="700" bordercolor="green"
				cellspacing="1">
				<tr>
					<th>番号</th>
					<th>タイトル</th>
					<th>作成者</th>
					<th>登録日</th>
				</tr>
				<c:if test="${s_list != null}">
					<c:forEach var="aa" items="${s_list}" varStatus = "status">
						<tr>
							<td align="center">
								${aa.ani_no}
							</td>
							<td align="center">
								<a href="javascript:void(window.open('adopt_select.anires?ani_no=${aa.ani_no}','${aa.ani_subject}'))">
									${aa.ani_subject}
								</a>
							</td>
							<td align="center">
								${aa.ani_name}
							</td>
							<td align="center">
								${aa.ani_dday}
							</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${s_list == null}">
					<tr>
						<td colspan="4" align="center"><label>登録した文書がないです。</label></td>
					</tr>
				</c:if>
			</table>
			<c:if test="${page != null }">
				<div align="center" style ="text-aling : 'center'">
					<c:forEach items = "${page}" var = "pagenum" varStatus="status">
						<a href ="list.hp?page=${status.index+1 }">${status.index+1 }</a>&nbsp;
					</c:forEach>
				</div>
			</c:if>
		</form>
	</div>
	<jsp:include page="/main/mainFooter.jsp"></jsp:include>
</body>
</html>