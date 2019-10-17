 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body class="bgclass">

	<!-- <form action="getData">
		<input type = "text" name = "brandname" placeholder = "Brand Name">
		<input type= "text" name="size" placeholder = "Size">
		<input type="submit" value = "Add">
	
	</form> -->
	
	
<form>
			<div class="form-group">
		    	<label >Id:</label>
		    	<input type="text" name = "serialNumber" class="form-control" id="id">
		 	</div>
		 	<button type="submit" class="btn btn-primary" formaction="delete">Delete</button>
		</form>
</body>
</html>
