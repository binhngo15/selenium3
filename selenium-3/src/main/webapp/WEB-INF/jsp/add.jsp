<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Entry</title>
</head>
<body>
<form:form modelAttribute="fob" action="add" method="post">
	<form:label path="firstName">First Name</form:label>
	<form:input path="firstName" />
	<br/>
	<form:label path="lastName">Last Name</form:label>
	<form:input path="lastName" />
	<br/>
	<form:label path="emailAddress">Email</form:label>
	<form:input path="emailAddress" />
	<br/>
	<form:label path="active">Active</form:label>
	<form:radiobutton path="active" value="true"/>true
	<form:radiobutton path="active" value="false"/>false
	<br/>
	<form:label path="age">Age</form:label>
	<form:select path="age">
		<c:forEach begin="0" end="100" step="1" var="counter">
			<form:option value="${counter}">${counter}</form:option>
		</c:forEach>
	</form:select>
	<br/>
	<input type="submit" name="submit" value="Submit" />
</form:form>
</body>
</html>