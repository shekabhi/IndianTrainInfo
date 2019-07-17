<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="java.util.ArrayList" %>
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
    <h2> Train Route Info </h2>

    <br />
    <br />
         <table class="table table-dark " border="0" cellpadding="2" cellspacing="2">

               <tr>
                    <th>Train No : </th>
                    <td>${trainroutestatus.trainNumber}</td>
               </tr>
               <tr>
                    <th>Train Name : </th>
                    <td>${trainroutestatus.trainName}</td>
               </tr>


         </table>
    <br />
    <br />

         <table class="table table-dark " border="0" cellpadding="2" cellspacing="2">


                <tr>
                       <th>No.</th>
                        <th>Station Name</th>
                        <th>Distance</th>
                        <th>Arrival Time</th>
                        <th>Departure Time</th>
                </tr>
                < c:forEach var="trainroute" items="${trainroutestatus.trainrote}">
                       <tr>
                        		<td>${trainroute.number}</td>
                        		<td>${trainroute.stationname}</td>
                        		<td>${trainroute.distance}</td>
                        		<td>${trainroute.scharr}</td>
                        		<td>${trainroute.schdep}</td>

                	   </tr>

                </c:forEach>

         </table>
</div>


</body>
</html>