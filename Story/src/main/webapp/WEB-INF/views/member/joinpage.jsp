<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>

</head>
<body>
	<div>
		<form action="joining.do" method="post">
			<label>이름</label>
			<div>
				<input type="text" name="membername" placeholder="이름을 입력하세요"/>
			</div>
			<label>아이디</label>
			<div>
				<input type="text" name="memberid" placeholder="아이디를 입력하세요"/>
			</div>
			<label>비밀번호</label>
			<div>
				<input type="password" class="pw" id="memberpw" name="memberpw" placeholder="비밀번호를 입력하세요"/>
			</div>
			<label>비밀번호 확인</label>
			<div>
				<input type="password" class="pw" id="memberpwchk" placeholder="비밀번호를 입력하세요"/>
				<span id="alert-success" style="display: none;">비밀번호가 일치합니다.</span>
   				<span id="alert-danger" style="display: none; color: #d92742; font-weight: bold; ">비밀번호가 일치하지 않습니다.</span>
			</div>
			 
			<label>이메일</label>
			<div>
				<input type="email" name="memberemail" placeholder="이메일을 입력하세요"/>
			</div>
			<label>전화번호</label>
			<div>
				<input type="text" name="memberphone" placeholder="전화번호를 입력하세요"/>
			</div>
			<label>주소</label>
			<div>
				<input type="text" name="memberaddr" placeholder="주소를 입력하세요"/>
			</div>
			<div>
				<input type="submit" value="회원가입"/>
				<input type="button" value="취소" onclick="location.href='login.do'"/>
			</div>
		</form>
	</div>
	<script type="text/javascript">

	$(".pw").focusout(function(){
		var pw1 = $("#memberpw").val();
		var pw2 = $("#memberpwchk").val();
		
		if(pw1 !='' && pw2 ==''){
			null;
		}else if(pw1 !="" || pw2 !=""){
			if(pw1 == pw2){
				$("#alert-success").css('display', 'inline-block');
                $("#alert-danger").css('display', 'none');
			}else{
				$("#alert-success").css('display', 'none');
                $("#alert-danger").css('display', 'inline-block');
			}
		}
	});

</script>
</body>
</html>