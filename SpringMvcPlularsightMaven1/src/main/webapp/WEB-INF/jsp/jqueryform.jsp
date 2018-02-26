<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled and minified CSS -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.form-control {
    margin: auto;
    width: 35%;
    padding: 10px;
    }
   .form-hbx {
   margin: auto;
    width: 40%;
    padding: 10px;
    }
    
 
 .input1 {
 margin: auto;
    width: 40%;
    padding: 10px;
    }
 }   
 .form-group {
    margin: auto;
    width: 35%;
    padding: 10px;
    }
    
     .idd {
    margin: auto;
    width: 20%;
    padding: 10px;
    }
      .idd1 {
        margin-top: 0px;
   
    margin-left: 2px;
    background-color: lightblue;

    }
</style>

<script>
jQuery(document).ready(function($) {   //it will alert after hitting url
	alert("js is working");
});
	</script>
</head>
<body>
<form id="contact" method="post" action="" class="form-hbx">
	<!-- Name -->
	
	<p class="StudentName">
		student's Name :<input type="text" name="studentName" class="form-control" id="inputdefault"/> 		  <!-- we have to have same name= studentName as in class student.java file -->
		</p>
	
	<div class="form-group row">
		<label class="idd" for="contact_name">Name:</label>
		<input type="text" id="contact_name" name="name" class="input1" ></input>
		<span class="error">This field is required</span>
	</div>
	<!-- Email -->
	<div class="form-group row">
		<label class="idd"  for="contact_email">Email:</label>
		<input type="email" id="contact_email" name="email" class="input1"></input>
		<span class="error">A valid email address is required</span>				
	</div>						
	<!--Website -->
	<div class="form-group row">
		<label for="contact_website" class="idd" >Website:</label>
		<input type="url" id="contact_website" name="website" class="input1" ></input>
		<span class="error">A valid url is required</span>								
	</div>						
	<!-- Message -->
	<div class="form-group row">
		<label for="contact_message" class="idd1" >Message:</label>
		<textarea id="contact_message" name="message"  class="input1"></textarea>
		<span class="error" class="form-control">This field is required</span>												
	</div>					
	<!-- Submit Button -->
	<div id="contact_submit"  class="idd" >			
		<button type="submit" >Submit</button>
	</div>
</form>
<br>
<br>

</body>
</html>