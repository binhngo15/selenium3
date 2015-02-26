<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Display Entries</title>
</head>
<body>
	<form:form modelAttribute="fobs" action="save" method="post">
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Active</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${fobs.fobs}" var="fob" varStatus="status">
				<tr>
					<td><input name="fobs[${status.index}].firstName" value="${fob.firstName}" /></td>
					<td><input name="fobs[${status.index}].lastName" value="${fob.lastName}" /></td>
					<td><input name="fobs[${status.index}].emailAddress" value="${fob.emailAddress}" /></td>
					<td>
						<select name="fobs[${status.index}].active">
							<option value="true" <c:if test="${fob.active}">selected="selected"</c:if>>true</option>
							<option value="false" <c:if test="${not fob.active}">selected="selected"</c:if>>false</option>
						</select>
					</td>
					<td>
						<select name="fobs[${status.index}].age">
							<c:forEach begin="0" end="100" step="1" var="counter">
								<option value="${counter}" <c:if test="${fob.age eq counter}">selected="selected"</c:if>>${counter}</option>
							</c:forEach>
						</select>
					</td>
			</c:forEach>
		</table>
		<input type="submit" name="update" value="Update" />
	</form:form>
	<a href="./add">Add New Record</a>
</body>
</html>