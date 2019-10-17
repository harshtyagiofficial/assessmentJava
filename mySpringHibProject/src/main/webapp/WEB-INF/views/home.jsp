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
	
	
	<form action="saveShoes" class = "container">
	
	<div class="form-group">
    <label >Number:</label>
    <input type="text" name = "serialNumber" class="form-control" id="sNumber">
  </div>
  
  
  <div class="form-group">
    <label for="email">Brand:</label>
    <input type="text" name = "brandName" class="form-control" id="bname">
  </div>
  
  <div class="form-group">
    <label for="size">Size:</label>
    <input type="text" name = "size" class="form-control" id="sizeShoe">
  </div>
  

  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>
