<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
		<link href="css/common.css" rel="stylesheet">
		<link href="css/main.css" rel="stylesheet">
		<link href="css/jquery.bxslider.css" rel="stylesheet">
		<script src="js/jquery-3.3.1.min.js"></script>
		<script src="js/jquery.bxslider.js"></script>
		<script src="js/script.js"></script>
		
	</head>
	<body>
	<div class="header">
			<header>
				<h1 class="logo"><a href="/animalRescue/main/mainForm.jsp"/>Animal Rescue</h1>
				<nav id="nav">
					<ul class="depth1">
						<li class="on"><a href="/animalRescue/SearchList.anires">迷子の動物</a>
							<ul class="depth2">
								<li><a href="/animalRescue/aSearchList.anires">迷子の動物</a></li>
								<li><a href="/animalRescue/hSearchList.anires">保護中の動物</a></li>
								<li><a href="/animalRescue/cSearchList.anires">捜索済み</a></li>
							</ul>
						</li>
						<li><a href="/animalRescue/adopt_list.anires">里親申請</a>
							<ul class="depth2">
								<li><a href="/animalRescue/adopt_list.anires">申請見込み</a></li>
							</ul>
						</li>
						<li><a href="/animalRescue/list.anires?page=1">保護キャンペーン</a>
							<ul class="depth2">
								<li><a href="/animalRescue/list.anires?page=1">病院リスト</a></li>
								<li><a href="/animalRescue/protectList.anires?page=1">保護センターリスト</a></li>
								<li><a href ="/animalRescue/supportboard.anires">サポート掲示板</a></li>
							</ul>
						</li>
						</ul>
				</nav>
			</header>
		</div>
	</body>
</html>