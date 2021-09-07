<%@ include file="..\common\header.jspf" %>
<br>
<div class="container">
	<%@ include file="..\common\navbar.jspf" %>
	<div class="container jumbotron">
			<div class="sidenav">
			         <div class="login-main-text">
			            <h2>Application Welcome Page</h2>
			         </div>
			         <hr>
		     </div>
	         <div class="alert alert-success d-flex align-items-center" role="alert">
		         <h4 class="alert-heading">Well done! <br></h4>
		         <spring:message code="welcome.message" /> 
				 <!-- <h1>Welcome ${username} you are authentic</h1> -->
			 </div>
			 <br>
			<p>You Log In successfully :) ${username}</p>
			<!-- <p class="mb-0">Welcome to your Saraya train Bootcamp Account</p> -->
			<br>
			<p><a href="/list" class="btn btn-info">Click here >></a> 
				to view the list of all your trainings
			</p>
	</div>
</div>	
<%@ include file="..\common\footer.jspf" %>