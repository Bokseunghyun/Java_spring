<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form action="" method="post">
		<div>
		<label for="userid">아이디</label>
		<input type="text" id="userid" name="userid" required="required"/>
		</div>
		
		<div>
		<label for="userpw">비밀번호</label>
		<input type="password" id="userpw" name="userpw" required="required"/>
		</div>
	
		<div>
		<button type="submit">로그인</button>
		</div>
	</form>
</body>
</html>