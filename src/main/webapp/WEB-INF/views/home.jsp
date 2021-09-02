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
		         <h4 class="alert-heading">Well done!<br></h4>
			 </div>
			 <br>
			<p>You Log In successfully :)</p>
			<p class="mb-0">Welcome to your Saraya train Bootcamp Account Mr ${ username }</p>
			<br>
			<p><a href="/list" class="btn btn-info">Click here >></a> 
				to view the list of all your trainings
			</p>
	</div>
</div>	
<%@ include file="..\common\footer.jspf" %>