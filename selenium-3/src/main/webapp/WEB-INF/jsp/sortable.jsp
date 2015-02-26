<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
 
<html lang="en">
<head>
  <meta charset="utf-8" />
  <title>Sort Example</title>
  <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
  <script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css" />
  <style>
  #sortable { list-style-type: none; margin: 0; padding: 0; width: 450px; }
  #sortable li { margin: 3px 3px 3px 0; padding: 1px; float: left; width: 100px; height: 90px; font-size: 4em; text-align: center; }
  </style>
  <script>
  $(function() {
    $( "#sortable" ).sortable();
    $( "#sortable" ).disableSelection();
  });
  </script>
</head>
<body>
 
<ul id="sortable">
  <li class="ui-state-default" name="one">1</li>
  <li class="ui-state-default" name="three">3</li>
  <li class="ui-state-default" name="two">2</li>
  <li class="ui-state-default" name="four">4</li>
  <li class="ui-state-default" name="five">5</li>
  <li class="ui-state-default" name="six">6</li>
  <li class="ui-state-default" name="seven">7</li>
  <li class="ui-state-default" name="eight">8</li>
  <li class="ui-state-default" name="nine">9</li>
  <li class="ui-state-default" name="ten">10</li>
  <li class="ui-state-default" name="eleven">11</li>
  <li class="ui-state-default" name="twelve">12</li>
</ul>
 
 
</body>
</html>