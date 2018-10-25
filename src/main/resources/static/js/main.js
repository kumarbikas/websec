
/**
 * 
 */
$(document).ready(function(){
	$('.table .eBtn').on('click',function(event){
		//alert("called here");
		event.preventDefault();
		var href=$(this).attr('href');
		console.log(href);
		$.get(href,function(company,status){
			//console.log(status+":"+company);
			$('.companyForm #companyId').val(company.companyId);
			$('.companyForm #companyName').val(company.companyName);
			$('.companyForm #description').val(company.description);
			$('.companyForm #createdBy').val(company.createdBy);
		});
		$('.companyForm #companyModal').modal();
	});
});
