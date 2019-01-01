

<html lang="en">
<meta charset="UTF-8">
	<title>test</title>
	<link href="./setting.css" rel="stylesheet" type="text/css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="test.js"></script>

<body>
<div id="headerOption">
	<div class="logo">hellosdfds</div>
	<div id="slogan" onmouseover="sloganHighlight();"
		onmouseout="sloganNormal();">JEE tutorial</div>
	<div id="login">
	<%
	//	ConfigSettings configSett=new ConfigSettings();
	//	String actionUrl="http://"+configSett.myConfig.getIp()+":5050/auth.do";
	%>
		<form action="http://localhost:5050/auth.do" method="GET">
			userid <input onfocus="uidFocus();" onblur="uidBlur();" type="text"
				id="uid" name="uid" /><br> password<input type="password"
				id="pwd" name="pwd" /><br> 
			<input type="submit" />
			<button type="button" id="jquerySubmit" >jquery ajax submit</button>
		</form>
	</div>

</div>
<div id="bodyOption">
	<div id="menuOptions"></div>
	<div id="mainContent"></div>
</div>
<div id="footerOption"></div>

</body>


</html>