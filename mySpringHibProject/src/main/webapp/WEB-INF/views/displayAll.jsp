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
	
		<h1>Welcome, to Mandir-Ke-Churaye-Joote</h1>
		<h3>Gets branded(or not) branded shoes at very cheap price</h3>
		<marquee>Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! Sale! </marquee>
		<hr>
		
		<c:forEach items="${products}" var = "prods">
			Serial Number: ${prods.serialNumber } <br/>
			
			Name: ${prods.brandName}<br/>
		</c:forEach>
	
	</div>
	
</body>
</html>
