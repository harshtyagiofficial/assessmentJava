<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body class="bgclass">

	
	<div class="container">
	
		<h1>Welcome, to Shoes Stock</h1>
		<h3>Get branded(or not) branded shoes at very cheap price</h3>
		<marquee>Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! </marquee>
		<hr>
		
		<form action="">
			<div class="form-group">
		    	<label >Id:</label>
		    	<input type="text" name = "serialNumber" class="form-control" id="id">
		 	</div>
		 	<button type="submit" class="btn btn-primary" formaction="deleteById">Delete</button>
		</form>
	</div>
	
</body>
</html>
