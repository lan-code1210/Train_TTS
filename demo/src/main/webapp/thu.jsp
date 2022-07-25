<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/demo/savekhoa"
		modelAttribute="khoa">
		<div>
			<label>Name</label>
			<form:input path="tenKhoa" name="tenKhoa" />
			<form:errors path="tenKhoa" class="text-danger" style="color:red"/>
		</div>
		
		<form:button>Create</form:button>
	</form:form>
</body>
</html>