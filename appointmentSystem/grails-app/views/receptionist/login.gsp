<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title> Receptionist Login | Home Page </title>
</head>
</html>
<body>
	<g:if test="${flash message}">
	<div class="message">${flash.message}</div>
	</g:if>

	<g: form action="validate">
	<input type="hidden" name="cName" value="${cName}">
	<input type="hidden" name="aName" value="${aName}">
<table>
	<tr class="prop">
		<td class="name">
			<label for="username">Enter Username:</label>
		</td>
		<td class="value">
			<input type="text" id="username" name="username" value="">
		</td>
	</tr>
	<tr class="prop">
		<td class="name">
			<label for="password">Enter Password:</label>
		</td>
		<td class="value">
			<input type="text" id="password" name="password" value="">
		</td>
	</tr>
	<tr>
		<td>
			<input type="submit" value="login"/>
		</td>
	</tr>
</table>
</g:form>
</body>
</html>

