<%@include file="/WEB-INF/views/header.jsp"%>
 
 <div class="container">
 <div class="row">
		<div class="col-xs-12">
			<a><center>
					<img
						src="https://img1a.flixcart.com/www/email/images/20160505-130640-moto360newlogo.jpg">
				</center></a>
				<p></p>
		</div>
	</div>
 </div>
 <div class="container">
 <div class="row">
 <c:forEach items="${brand}" var="br">


	
	
	
		<div class="col-xs-4">
			<div class="thumbnail">

				<img src="<c:url value="/resources/img/${br.image_name}" />"
					class="img-responsive">
				<div class="caption">
					<div class="row">
						<div class="col-md-12 col-xs-12">
							<h3>${br.product_name}</h3>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 price">

							<h3>
								<hr>
								<label>${br.product_price}</label>
							</h3>
							<hr>
						</div>
					</div>
					<p>
					<ul>
						<li>Built-in GPS</li>
						<li>MultiApp Compatibility</li>
						<li>Music Storage</li>
						<li>Any Light Display</li>
					</ul>
					</p>


					<div class="row">
						<div class="col-md-6">
							<a href="<c:url value='/view/${br.product_id}' />" class="btn btn-primary btn-product">
								view</a>
						</div>
						<div class="col-md-6">
							<a href="#" class="btn btn-success btn-product"><span
								class="glyphicon glyphicon-shopping-cart"></span> Add to cart</a>
						</div>
					</div>


					<p></p>
				</div>
			</div>
		</div>
	
	
		 </c:forEach>
		 </div>
		 </div>