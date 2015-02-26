<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
  <head>
    <title>Click and Hold Demo</title>

    <script>
    function myDblClickFunction() {
      alert("Double Clicked !!")
    }
    </script>
  </head>

  <body>
    <button name="dblClick" ondblclick="myDblClickFunction()">Click ME !</button>
  </body>
</html>