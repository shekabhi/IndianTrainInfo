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

<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
 <link href="css/home.css" rel="stylesheet">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

 <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
 <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />

</head>
<body>


     <div align="center"  >
     	<h3 style="margin:50px 0px 20px 0px ;">Seat Availability</h3>
     	<br>
     	<form name="myForm" action="/seatavailinfo" method="get" >
     	    <table  cellpadding="2" cellspacing="2">

     	        <tbody>
                 	            <tr>
                                     <td align="center" > Train No.  </td>
                                     <td><input type="text" class="form-control"   name="trainno" placeholder="12553" size="10" /> </td>
                                </tr>
                 	            <tr>
                                     <td align="center" > Source Code  </td>
                                     <td><input type="text" class="form-control"   name="soucode" placeholder="GKP" size="10" /> </td>
                                 </tr>
                                <tr>
                                     <td align="center" > Destination Code  </td>
                                     <td><input type="text" class="form-control"   name="descode" placeholder="NDLS" size="10" /> </td>
                                </tr>
                                <tr>
                                      <td align="center" > Date   </td>
                                      <td><input type="text" class="form-control datepickerr" width="276" name="date" /></td>
                                 </tr>

                                <tr>
                                        <td align="center" > Class </td>
                                         <td>
                                          <select class="form-control"  name = "trainclass">
                                            <option value="SL">Sleeper</option>
                                            <option value="FC">First Class</option>
                                            <option value="2A">AC 2-Tier</option>
                                            <option value="3A">AC 3-Tier</option>
                                            <option value="1A">AC First Class</option>
                                            <option value="CC">AC Chair Car</option>
                                            <option value="2S">Second Sitting</option>
                                          </select>
                                        </td>

                                </tr>
                                <tr>
                                        <td align="center" > Quota </td>
                                        <td>
                                           <select class="form-control" name="quota" >
                                              <option value="GN" >General Quota</option>
                                              <option value="PH" >Parliament house
                                                      Quota</option>
                                              <option value="HP" >Physically Handicapped Quota</option>
                                              <option value="DP" >Duty Pass Quota</option>
                                              <option value="YU" >Yuva</option>
                                              <option value="CK" >Tatkal Quota</option>
                                              <option value="FT" >	Foreign
                                                      Tourist Quota</option>
                                              <option value="SS" >Senior Citizen</option>
                                              <option value="LB" >Lower Berth</option>
                                              <option value="DP" >Duty Pass Quota</option>
                                              <option value="LD" >Ladies Quota</option>
                                              <option value="DF" >Defence Quota</option>

                                           </select>
                                        </td>

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



    <script>
        $('.datepickerr').datepicker({
            uiLibrary: 'bootstrap4'

        });
    </script>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>