<%@ include file="..\common\header.jspf" %>
<br>
<div class="container">
	<%@ include file="..\common\navbarlogin.jspf" %>
	<strong style="color: red;">${ errorMessage }</strong>
	<form:form method="post" action="processForm">
	  <div class="mb-3">
	    <label for="userName" class="form-label">Username</label>
	    <input type="text" class="form-control" id="userName" name="username">
	    <div class="form-text">We'll never share your email with anyone else.</div>
	  </div>
	  <div class="mb-3">
	    <label for="password" class="form-label">Password</label>
	    <input type="password" class="form-control" id="password" name="password">
	  </div>
	  <button type="submit" class="btn btn-primary" name="">Submit</button>
	</form:form>
</div>

<%@ include file="..\common\footer.jspf" %>