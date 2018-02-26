<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>
jQuery(document).ready(function($) {   //it will alert after hitting url
	alert("js is working");
});
	</script>

<script type="text/javascript">
$(document).ready(function(){
	$('#button1').click(function(){ 	//BY ID SELECTOR
		alert('fgfgfgfgdfgdfgdfgf');
	});
});
</script>

<script type="text/javascript">
$(document).ready(function(){			//css jquery cnaging bCGROUN COLOR BY ELEMENT SELECTOR
	$('div a').css('background-color' , 'yellow'); 	//only a which is in dev will affected

});
</script>


<script type="text/javascript">
$(document).ready(function(){			//css jquery cnaging bCGROUN COLOR BY CLASS SELECTOR
	$('.cl ass1 , div.divclass2 , span.class12 ').css('border' , '2px solid red' , 'border-radius: 30px');
	

});

$(document).ready(function() {
    $("#dialog").dialog();
});
</script>

<script type="text/javascript">
$(document).ready(function(){			//css jquery cnaging bCGROUN COLOR BY attribute SELECTOR
	$('span[title]').css('border' , '2px solid red' , 'border-radius: 30px');
	$("[title='title1']").css('border' , '2px solid red' , 'border-radius: 30px');
	$('span[title="title1"][style="background-color:green"]').css('border' , '2px solid red' , 'border-radius: 30px');

	
});
</script>
<script type="text/javascript">
$(document).ready(function(){					//css jquery cnaging bCGROUN COLOR BY attribute SELECTOR
	$('div[title]').filter(function(){
		return $(this).attr('title').toLowerCase() == "divtitle";
	}).css('border' , '3px solid red');
	
});
</script>

</head>
<body>
	<h2>Spring MVC + jQuery + Autocomplete example</h2>
	<h1>${abutufail}</h1>

<input type="button" id="button1" value="click me bro plz work" />
	
	
<div>
div1conrent
<br>
<a href="http;//youtube.com">youtube</a>
</div>	<br>

<span class="class1">
	SPAN1 ELEMENT BY CLASS
	
</span><br>

<span class="class12">
	SPAN12 ELEMENT BY CLASS
	
</span><br>
<div CLASS="divclass2">
DEV ELEMENT BY CLASS<br>
</div><br>

<span title="class3">
	SPAN1 attribute selector
	
</span><br>

<span title="title1" >
	SPAN1 with title1 attribute selector
	
</span><br>

<span title="title2" style="background-color:green">
	SPAN1 with title2 and style attribute selector
	
</span><br>
<br>
<div title="DivTitle">
	DIV1
</div><br>
<div title="divTitle">
	DIV1
</div><br>
<div title="Divtitle">
	DIV1
</div><br>

<div id="dialog" title="Dialog Title">I'm in a dialog</div>

</body>
</html>