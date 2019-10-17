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
	
	
	
	<div class="container">
	
		<h1>Welcome, to Shoes Stock</h1>
		<h3>Gets branded(or not) branded shoes at very cheap price</h3>
		<marquee>Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! </marquee>
		<hr>
		
		<form>
		<div class="form-group">
		    	<label >Size:</label>
		    	<input type="text" name = "size" class="form-control" id="sNumber">
		    	<button type="submit" class="btn btn-primary" formaction="displayByBrand">Display</button>
		    	
		  		</div>
		</form>
	
			
			</div>
	
</body>
</html>
