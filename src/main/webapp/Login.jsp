<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SpringMVCWithJSPExample Login Page</title>
 <script src="jquery-2.1.1.min.js"></script> 
<!-- Downloaded jquery location -->
<!-- <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script> -->
<!--Alternative 1 - ajax.googleapis.com - Google Hosted Libraries jquery -->
<!-- <script src="https://code.jquery.com/jquery-2.1.3.min.js"></script> -->
<!--Alternative 2 - code.jquery.com -->
<!-- <script src="sample.js"></script>  --> <!-- Specifying external java script location  -->
<!-- <link rel="stylesheet" type="text/css" href="sample.css"> --> <!-- Specifying external css location  -->
</head>
<body>
	<input type="button" value="HelloWorldController1 GET Message"
		onclick="helloWorldController1GET()" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="HelloWorldController1 POST Message"
		onclick="helloWorldController1POST()" />
	<br />
	<br />
	<input type="button" value="HelloWorldController2 GET Message"
		onclick="helloWorldController2GET()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="HelloWorldController2 POST Message"
		onclick="helloWorldController2POST()" />
	<br />
	<br />
	<input type="button" value="HelloWorldController3 GET Message"
		onclick="helloWorldController3GET()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="HelloWorldController3 POST Message"
		onclick="helloWorldController3POST()" />
	<br />
	<br />
	<input type="button" value="HelloWorldController4 GET Message"
		onclick="helloWorldController4GET()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="HelloWorldController4 POST Message"
		onclick="helloWorldController4POST()" />
	<br />
	<br />
	<input type="button" value="GET Message Using Model 1st Way"
		onclick="getMessageUsingModelFirstWay()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="GET Message Using Model 2nd Way"
		onclick="getMessageUsingModelSecondWay()" />
	<br />
	<br />
	<input type="button" value="GET Message Using ModelMap 1st Way"
		onclick="getMessageUsingModelMapFirstWay()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="GET Message Using ModelMap 2nd Way"
		onclick="getMessageUsingModelMapSecondWay()" />
	<br />
	<br />
	<input type="button" value="GET Message List Using Model 1st Way"
		onclick="getMessageListUsingModelFirstWay()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="GET Message List Using Model 2nd Way"
		onclick="getMessageListUsingModelSecondWay()" />
	<br />
	<br />
	<input type="button" value="GET Message List Using ModelMap 1st Way"
		onclick="getMessageListUsingModelMapFirstWay()" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" value="GET Message List Using ModelMap 2nd Way"
		onclick="getMessageListUsingModelMapSecondWay()" />
	<br />
	<br />
	<div id="mydiv"></div>
</body>
<script>
	function helloWorldController1GET() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "helloWorldMessage1/getHelloMessage",
					dataType : "text",
					async : true,
					success : function(html) {
						console
								.log("Inside helloWorldController1GET() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController1GET() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController1GET() complete callback");
					}
				});
	}

	function helloWorldController1POST() {
		debugger;
		$
				.ajax({
					type : "POST",
					url : "helloWorldMessage1/postHelloMessage",
					dataType : "text",
					async : true,
					success : function(html) {
						console
								.log("Inside helloWorldController1POST() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController1POST() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController1POST() complete callback");
					}
				});
	}

	function helloWorldController2GET() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "helloWorldMessage2",
					dataType : "text",
					async : true,
					success : function(html) {
						console
								.log("Inside helloWorldController2GET() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController2GET() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController2GET() complete callback");
					}
				});
	}

	function helloWorldController2POST() {
		debugger;
		$
				.ajax({
					type : "POST",
					url : "helloWorldMessage2",
					dataType : "text",
					async : true,
					success : function(html) {
						console
								.log("Inside helloWorldController2POST() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController2POST() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController2POST() complete callback");
					}
				});
	}

	function helloWorldController3GET() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getHelloMessage",
					dataType : "text",
					async : true,
					success : function(html) {
						console
								.log("Inside helloWorldController3GET() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController3GET() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController3GET() complete callback");
					}
				});
	}

	function helloWorldController3POST() {
		debugger;
		$
				.ajax({
					type : "POST",
					url : "postHelloMessage",
					dataType : "text",
					async : true,
					success : function(html) {
						console
								.log("Inside helloWorldController3POST() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController3POST() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController3POST() complete callback");
					}
				});
	}

	function helloWorldController4GET() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "helloWorldMessage4/getHelloMessage",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside helloWorldController4GET() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside helloWorldController4GET() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController4GET() complete callback");

					}
				});
	}

	function helloWorldController4POST() {
		debugger;
		$
				.ajax({
					type : "POST",
					url : "helloWorldMessage4/postHelloMessage",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside helloWorldController4POST() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside helloWorldController4POST() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside helloWorldController4POST() complete callback");

					}
				});
	}

	function getMessageUsingModelFirstWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageUsingModelFirstWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageUsingModelFirstWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageUsingModelFirstWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageUsingModelFirstWay() complete callback");

					}
				});
	}

	function getMessageUsingModelSecondWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageUsingModelSecondWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageUsingModelSecondWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageUsingModelSecondWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageUsingModelSecondWay() complete callback");

					}
				});
	}

	function getMessageUsingModelMapFirstWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageUsingModelMapFirstWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageUsingModelMapFirstWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageUsingModelMapFirstWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageUsingModelMapFirstWay() complete callback");

					}
				});
	}

	function getMessageUsingModelMapSecondWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageUsingModelMapSecondWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageUsingModelMapSecondWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageUsingModelMapSecondWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageUsingModelMapSecondWay() complete callback");

					}
				});
	}

	function getMessageListUsingModelFirstWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageListUsingModelFirstWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageListUsingModelFirstWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageListUsingModelFirstWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageListUsingModelFirstWay() complete callback");

					}
				});
	}

	function getMessageListUsingModelSecondWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageListUsingModelSecondWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageListUsingModelSecondWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageListUsingModelSecondWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageListUsingModelSecondWay() complete callback");

					}
				});
	}

	function getMessageListUsingModelMapFirstWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageListUsingModelMapFirstWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageListUsingModelMapFirstWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageListUsingModelMapFirstWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageListUsingModelMapFirstWay() complete callback");

					}
				});
	}

	function getMessageListUsingModelMapSecondWay() {
		debugger;
		$
				.ajax({
					type : "GET",
					url : "getMessageListUsingModelMapSecondWay",
					dataType : "text",
					async : true,
					success : function(html) {

						console
								.log("Inside getMessageListUsingModelMapSecondWay() success callback");
						$("#mydiv").html(html);
					},
					error : function(jqXHR, textStatus, errorThrown) {

						console
								.log("Inside getMessageListUsingModelMapSecondWay() errror callback");
						console.log(jqXHR + "  " + textStatus + "  "
								+ errorThrown);
					},
					complete : function(jqXHR, textStatus, errorThrown) {
						console
								.log("Inside getMessageListUsingModelMapSecondWay() complete callback");

					}
				});
	}
</script>
</html>