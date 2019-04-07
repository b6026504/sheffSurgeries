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
		<h3>Prescription Management</h3>
		<p>Click below to add a new prescriptions</p>
		<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="create">Add Prescription<g/:link>
		</button>
	</div>

	<div class="second">
		<h3>View Prescriptions</h3>
		<p>Click below to view prescriptions</p>
		<button type="button" class="btn btn-success">
		<g:link controller="prescription" action="index">View Prescription<g/:link>
		</button>
	</div>

	<div class="third">
		<h3>View Patients</h3>
		<p>Click below to view patients</p>
		<button type="button" class="btn btn-success">
		<g:link controller="patient" action="index">View Patient<g/:link>
		</button>
	</div>

	<div class="fourth">
		<h3>View Appointments</h3>
		<p>Click below to view appointments</p>
		<button type="button" class="btn btn-success">
		<g:link controller="appointment" action="index">View Appointment<g/:link>
		</button>
	</div>

</div>
</div>
</body>
</html>

