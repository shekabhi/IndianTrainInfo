<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
 <link href="css/home.css" rel="stylesheet">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>

<div class="container" align="center"  >
    <br />
    <h3 > Seat Availability Info </h3>

    <br />
    <br />

         <table class="table table-dark " border="0" cellpadding="2" cellspacing="2">
                <thead>
                    <tr>
                        <th>Availability </th>
                        <td>${seatavailability.availability}</td>
                    </tr>

                </thead>

                <thead>
         			<tr>
         			    <th>Date</th>
         			    <td>${seatavailability.date}</td>
         			</tr>
         		</thead>

         		<thead>

         			<tr>
         			    <th>Class</th>
                        <td>${seatavailability.journeyClass} </td>
         			</tr>
         		</thead>

         		<thead>
         			<tr>
         			    <th>Train No </th>
                        <td>${seatavailability.trainNumber}</td>
         			</tr>

         		</thead>
         		<thead>
                    <tr>
                         <th>Train Name </th>
                         <td>${seatavailability.trainName}</td>
                    </tr>

                </thead>
                <thead>
                    <tr>
                         <th>From Station </th>
                         <td>${seatavailability.fromStation}</td>
                    </tr>

                </thead>
                <thead>
                     <tr>
                         <th>To Station </th>
                         <td>${seatavailability.toStation}</td>
                     </tr>

                </thead>
                <thead>
                     <tr>
                         <th>Quota </th>
                         <td>${seatavailability.quota}</td>
                     </tr>

                </thead>
         	</table>
</div>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>