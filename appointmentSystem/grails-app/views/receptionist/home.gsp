<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Welcome to Sheffield Surgeries | Home Page</title>
</head>
<body>

	<div id="content" role="main">

<div class="row">

	<div class="first">
		<h3>Doctor Management</h3>
		<p>Click below to add a new doctor</p>
		<button type="button" class="btn btn-success">
		<g:link controller="doctor" action="create">Add Doctor<g/:link>
		</button>
	</div>

	<div class="second">
		<h3>Nurse Management</h3>
		<p>Click below to add a new nurse</p>
		<button type="button" class="btn btn-success">
		<g:link controller="nurse" action="create">Add Nurse<g/:link>
		</button>
	</div>

	<div class="third">
		<h3>Patient Management</h3>
		<p>Click below to add a new patient</p>
		<button type="button" class="btn btn-success">
		<g:link controller="patient" action="create">Add Patient<g/:link>
		</button>
	</div>


	<div class="fourth">
		<h3>Receptionist Management</h3>
		<p>Click below to add a new receptionist</p>
		<button type="button" class="btn btn-success">
		<g:link controller="receptionist" action="create">Add Receptionist<g/:link>
		</button>
	</div>
</div>
</div>
</body>
</html>

