 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link href="<c:url value="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body class="bgclass">
	
	<form  class = "container">
	
	<div class="form-group">
      <button type="submit" class="btn btn-primary" formaction="saveShoe">Insert Shoe Detail</button>
    
  </div>
  
  
  <div class="form-group">
      <button type="submit" class="btn btn-primary" formaction="displaySize">Get Shoe Details</button>

  </div>
  
  <div class="form-group">
    <button type="submit" class="btn btn-primary" formaction="retriveAll">See All shoes In Database</button>

  </div>
  

  <button type="submit" class="btn btn-primary" formaction = "deleteId">Delete Product By Id</button>
  <br/>
  <br/>
  <button type="submit" class="btn btn-primary" formaction = "update">Update Product By Id</button>
</form>

</body>
</html>
