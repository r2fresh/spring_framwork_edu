<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>고객 정보 입력</h1>
	<form action="/insert.do" method="post">
		이름 <input type="text" name="username"><p>
		나이 <input type="text" name="age"><p>
		생년월일 <input type="text" name="birthdate"><p>
		이메일 <input type="text" name="email"><p>
		<input type="submit" value="저장">
		<input type="reset" value="취소">
	</form>
</body>
</html>