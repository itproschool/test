		 
		function sloganHighlight(){
			console.log("entering sloganHighlight");
			$("#slogan").css("background","red");
			$("#slogan").css("height","10%");
			
		}
		function sloganNormal(){
			$("#slogan").fadeIn();
		//	$("#slogan").slideDown();
		}
		function uidFocus(){
			console.log("customer focus in  userid text box");
		}
		
		function uidBlur(){
			console.log("customer lost focus from userid text box");
		}
		function     validateUid(  ){
			var userEnteredUID=$("#uid").val();
			
			console.log("inside javascript function : user entered :"+userEnteredUID);
			if(userEnteredUID == "")
				alert("userid is mandatory");
		}
		$(document).ready(function() {
			
			/*
			$("#pwd").blur(function(){
				$.ajax({
			        url: 'http://localhost:5050/auth.do',
			        type: 'post',
			        data: {
					   uid:$("#uid").val(),
					   pwd:$("#pwd").val()
					},
			        context: this,
				        success: function (data) {
			        	console.log("success");
				        },
			        errorfunction (data) {
			        	console.log("failure");
			        }
				});

			 */			
			
			$("#jquerySubmit").click(
				function(){
					console.log("jquery ajax submit in process");
					
				}
			);
		
			
		});
		