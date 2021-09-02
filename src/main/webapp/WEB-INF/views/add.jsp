<%@ include file="..\common\header.jspf" %>
<br>
<div class="container">
	<%@ include file="..\common\navbar.jspf" %>

	<div class="container jumbotron">
		<br>
		<form action="/add" method="post">
			<div class="container-fluid form-group">
				<label for="userName" class="form-label">Username</label>
                <input type="text" class="form-control" placeholder="Add a Username" name="addUser">
                <label for="description" class="form-label">Description</label>
                <input type="text" class="form-control" placeholder="Add a Description" name="addDesc">
                <label for="isDone" class="form-label">isDone</label>
                <input type="text" class="form-control" placeholder="Add an isDone" name="addIsDone">
                <br>
                <button type="submit" class="btn btn-success btn-sm">Add</button>
             </div>        
		</form>
	</div>
</div>
<%@ include file="..\common\footer.jspf" %>