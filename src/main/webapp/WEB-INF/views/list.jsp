<%@ include file="..\common\header.jspf" %>
<br>
<div class="container">
	<%@ include file="..\common\navbar.jspf" %>
	<br>
	<div class="container jumbotron">
			
			<!-- <p> Here is the list of all my current Trainings: <br>
				${todos}
			</p> -->
			<div class="sidenav">
			         <div class="login-main-text">
			            <h2>Application List todo's Page</h2>
			         </div>
			         <hr>
		     </div>
		     <br>
			<table class="table table-striped">
				  <thead>
				    <tr>
				      <th scope="col">ID</th>
				      <th scope="col" colspan="2">Username</th>
				      <th scope="col" colspan="2">Description</th>
				      <th scope="col" colspan="1">isDone</th>
				      <th scope="col" colspan="1">Date</th>
				      <th scope="col" colspan="2">Action</th>
				    </tr>
				    <c:forEach items="${todos}" var="todo">
				    	<tr>
							<th>${ todo.id }</th>
							<td colspan="2">${ todo.username}</td>
							<td colspan="2">${ todo.desc }</th>
							<td colspan="1">${ todo.isDone()}</td>
							<td colspan="1">${ todo.targetDate}</td>
							<td colspan="2">
								<a class = "btn btn-danger" href="/delete?delId=${ todo.id }" onclick="return confirm('Are you sure ?')">
									Delete
								</a>
							</td>
						</tr>
					</c:forEach>
				  </thead>
			</table>
			<br>
	</div>	
	<p><a href="/add" class="btn btn-warning">Click here >></a> 
				to add a new training
	</p>
</div>
<%@ include file="..\common\footer.jspf" %>