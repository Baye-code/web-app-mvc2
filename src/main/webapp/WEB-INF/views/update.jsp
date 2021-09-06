<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="..\common\header.jspf" %>
<br>
<%@ include file="..\common\navbarlogin.jspf" %>
<div class="container">
	<form:form action="updateProcess" method="post" modelAttribute="todo">
		
		<form:hidden path="id"/>
		
		<fieldset>
			<div class="mb-3">
				<form:label path="username">Userame</form:label>
		        <form:input path="username"/>
		    </div>	  
		    <div class="mb-3">    
		        <form:label path="desc">Description</form:label>
		        <form:input path="desc"/>
		    </div>	
	        <button type="submit" class="btn btn-primary" name="">Submit</button>
		</fieldset>
		
	</form:form>
</div>	
<%@ include file="..\common\footer.jspf" %>