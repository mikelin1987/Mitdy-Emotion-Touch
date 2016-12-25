<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>

<script type="text/javascript">
var contextPath = '${pageContext.request.contextPath}';
</script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-utils.js"></script>
</head>
<body>

<div id="loading-status"></div>

user: ${user.id }-${user.nickname }-${user.status }

<script type="text/javascript">

	$(document).ready(function() {
		
	});

	function loadUsers() {
		$.ajax({
			url: '${pageContext.request.contextPath}/spring/getUsers',
			type: 'GET',
			dataType: 'json',
			contentType: 'application/json',
			data: '',
			success: function (data) {
				console.log('=========OK==========');
				console.log(data);
				$('#user-ul-2 li').remove();
				
				for (var i = 0; i < data.body.length; i++) {
					$('#user-ul-2').append('<li>' + data.body[i].username + '</li>');
				}
				
			}
		});
	}
	
</script>

</body>
</html>