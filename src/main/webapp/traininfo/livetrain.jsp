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


     <div align="center"  >
     	<h3 >Live Train Status</h3>
     	<br>
     	<form name="myForm" action="/livetrain" method="get" >
     	    <table   cellpadding="2" cellspacing="2">

     	        <tbody>
                 	            <tr>
                 	                <td align="center" > Train No   </td>
                 	                <td><input type="text" class="form-control" name="id" placeholder="12595" size="10" /> </td>
                 	            </tr>
                 	            <tr>
                                     <td align="center" > Station  </td>
                                     <td><input type="text" class="form-control"   name="station" placeholder="NDLS" size="10" /> </td>
                                 </tr>
                                <tr>
                                      <td align="center" > Date   </td>
                                      <td><input type="text" class="form-control"  name="day" placeholder="11" size="10" /> </td>
                                      <td><input type="text" class="form-control"  name="month" placeholder="07"  size="10" /> </td>
                                      <td><input type="text" class="form-control"   name="year" placeholder="2019"  size="10" /> </td>
                                 </tr>
                 </tbody>

     	     </table>
     	     <br>
     	     <div>
     	             <button type="submit" class="btn btn-outline-dark" value="Submit">Submit</button>
     	             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     	              <button type="reset" class="btn btn-outline-danger"  value="Reset">Rest</button>
     	     </div>

     	 </form>

        </div>




	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>