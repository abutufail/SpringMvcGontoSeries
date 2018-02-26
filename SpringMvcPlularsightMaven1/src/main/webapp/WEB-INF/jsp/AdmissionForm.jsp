<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
$(document).ready(function() {   //it will alert after hitting url
	alert("js is working");
});
	</script>
	
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">

<!--  <script src="/js/jquery.js" type="text/javascript"></script>-->


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form from</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style>
.form-group{
color: #99004d;
}
.StudentName{
font-family: "Times New Roman", Times, serif;
color: blue
}
.form-group {
    margin: auto;
    width: 35%;
    padding: 10px;
}
.button1{
 -webkit-transition-duration: 0.4s; /* Safari */
    transition-duration: 0.4s;
    border-radius: 4px;
    background-color: #4CAF54;
    color: #99004d;
}

.button1:hover {
    background-color: #4CAF50; /* Green */
    color: white;
}


</style>
</head>

<body>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">Page 1</a></li>
      <li><a href="#">Page 2</a></li>
      <li><a href="#">Page 3</a></li>
    </ul>
  </div>
</nav>
<h1>${headermsg}</h1>
<br>

<input type="button" id="buttonq" value="click me" /> 
<script type="text/javascript">
$(document).ready(function(){
	$('#buttonq').click(function(){ 	//BY ID SELECTOR
		alert('fgfgfgfgdfgdfgdfgf');
	});
});
</script>
<form action="greeting" class="button2">
<input type="submit" value="back">
</form>
<form:errors path="student1.*" />    <!-- if page cotain error after submittng form than it will redirect to this page (as we are using Binding result in controller file ) and will show the errors -->
	<form action="/FitnessTracker/submitAdmissionForm" method="post" class="form-group" >
		<p class="StudentName">
		student's Name :<input type="text" name="studentName" class="form-control" id="inputdefault"/> 		  <!-- we have to have same name= studentName as in class student.java file -->
		</p>
		<p>
		student's hobby :<input type="text" name="studentHobby" class="form-control" id="inputdefault"/>
		</p>
		<p>
		student's Mobile :<input type="text" name="studentMobile" class="form-control" id="inputdefault"/>
		</p>
		<p>
		student's DOB :<input type="text" name="studentDOB" class="form-control" id="datepicker" />
		</p>
	   <table action="/FitnessTracker/submitAdmissionForm" method="post">
	   		<tr> <td>Student Skills</td>
	   						<td>
							<select name="studentSkills" multiple>
							<option value="java">Java</option>
							<option value="spring">spring</option>
							<option value="html">html</option>
							</select></td>
							</tr>	
		 </table>
		 <table>
		 <tr><td>Student's Address</td></tr>
	   		<tr> 
	   			<td>Country:<input type="text" name="Address.country"/></td>
	   			<td>city:<input type="text" name="Address.city"/></td>
	   			<td>Country:<input type="text" name="Address.pincode"/></td>
			</tr>	
		 </table>
		 <br>
		<input type="hidden" class="hi" value="ddd"/>
		<input type="hidden" class="hi" value="ddd"/>
		 <input type="submit" class="button1" value="submit Form"/>
		<input type="hidden" class="hi" value="ddd"/>
	</form>

</body>
</html>