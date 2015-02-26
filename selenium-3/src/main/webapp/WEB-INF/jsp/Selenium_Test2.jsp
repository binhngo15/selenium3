<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<HTML>
<head>
<title>Selenium Test Page</title>
</head>

<body>



<h3>Dialog windows</h3>
<script>
window.alert("This is an alert dialog");
window.confirm("This is a confirm dialog");  
window.prompt("This is a prompt","This is default text");
</script>


<form>
First name: <input enabled="true" id="fid" name="fname" type="text"><br>
Last name: <input disabled="true" name="lname" type="text"><br>
<input name="vehicle" type="checkbox" value="Bike"> I have a bike<br>
  <input name="vehicle" type="checkbox" value="Car"> I have a car<br>
  <input name="vehicle" type="checkbox" value="Boat"> I have a boat<br>
  <input name="gender" type="radio" value="male"> Male<br>
  <input name="gender" type="radio" value="female"> Female<br>
  Select a file: <input name="img" type="file">
</form>

Check Box:
<form>
<input type="checkbox" name="mushrooms" checked   >mushrooms<BR>
<input type="checkbox" name="greenpeppers">green peppers<BR>
<input type="checkbox" name="olives"      >olives<BR>
<input type="checkbox" name="onions"      >onions<P>
<input type="submit" value="submit">
</FORM>

Select Box: 
<select>
  <option value="USA">Volvo</option>
  <option value="UK">Saab</option>
  <option value="Singapore">Opel</option>
  <option value="Russia">Audi</option>
<option value="Russia">Toyota</option>
<option value="Russia">Renault</option>
</select>
<p>
<a href="http://www.amazon.com">Click Here</a>
</p>

<hr>



<h4>
Test Table</h4>
<table border="1" cellpadding="10">
<tbody><tr>
  <td>11</td>
  <td>12</td>
  <td>13</td>
<td>14</td>
<td>15</td>
<td>16</td>
</tr>
<tr>
  <td>21</td>
  <td>22</td>
  <td>23</td>
<td>24</td>
<td>25</td>
<td>26</td>
</tr>
<tr>
  <td>31</td>
  <td>32</td>
  <td>33</td>
<td>34</td>
<td>35</td>
</td></tr>
</tbody></table>



</body>




</HTML>
