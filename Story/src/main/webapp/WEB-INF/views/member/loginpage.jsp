<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div>
		<form action="logining.do" method="post">
			<label>아이디</label>
			<div>
				<input type="text" name="memberid" placeholder="아이디를 입력하세요"/>
			</div>
			<label>비밀번호</label>
			<div>
				<input type="password" name="memberpw" placeholder="비밀번호를 입력하세요"/>
			</div>
			<div>
				<input type="submit" value="로그인"/>
				<input type="button" value="취소" onclick=""/>
			</div>
		</form>
	</div>
</body>
</html>