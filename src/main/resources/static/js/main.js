
/**
 * 
 */
$(document).ready(function(){
	$('.nBtn, .table .eBtn').on('click',function(event){		
		event.preventDefault();
		var href=$(this).attr('href');
		console.log(href);
		var text=$(this).text();
		//alert("called here:"+text);		
		if(text=="Edit"){
			console.log(text);
		$.get(href,function(company,status){
			//console.log(status+":"+company);
			$('.companyForm #companyId').val(company.companyId);
			$('.companyForm #companyName').val(company.companyName);
			$('.companyForm #description').val(company.description);
			$('.companyForm #createdBy').val(company.createdBy);
		});
		}
		else{
			console.log(text);
			$('.companyForm #companyId').prop( "disabled", true );
			$('.companyForm #companyName').val('');
			$('.companyForm #description').val('');
			$('.companyForm #createdBy').val('');
		}
		$('.companyForm #companyModal').modal();
	});
	
	$('.table .delBtn').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		console.log(href);
		$('#deleteCompanyModal #delRef').attr('href',href);
		$('#deleteCompanyModal').modal();
	});
});
