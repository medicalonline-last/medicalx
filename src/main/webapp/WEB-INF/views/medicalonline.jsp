<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<html xmlns="http://www.w3.org/1999/xhtml">
<!-- InstanceBegin template="/Templates/index's template.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<!--  jQuery -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<link rel="stylesheet"
	href="https://formden.com/static/cdn/font-awesome/4.4.0/css/font-awesome.min.css" />
<!-- Isolated Version of Bootstrap, not needed if your site already uses Bootstrap -->
<link rel="stylesheet"
	href="https://formden.com/static/cdn/bootstrap-iso.css" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css"
	type="text/css" rel="stylesheet"></link>
<!-- Bootstrap Date-Picker Plugin -->
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>Medical Online</title>
<!-- sukiendatlich -->
<script>
	function myFunction(value) {
		document.getElementById("khunggio").value = value;
	}
</script>
<!-- sukiendatlich end -->

<style type="text/css">
body, td, th {
	font-size: 14px;
}

.container {
	max-width: 1170px;
	margin: auto;
}

img {
	max-width: 100%;
}

.inbox_people {
	background: #f8f8f8 none repeat scroll 0 0;
	float: left;
	overflow: hidden;
	width: 40%;
	border-right: 1px solid #c4c4c4;
}

.inbox_msg {
	border: 1px solid #c4c4c4;
	clear: both;
	overflow: hidden;
}

.top_spac {
	margin: 20px 0 0;
}

.recent_heading {
	float: left;
	width: 40%;
}

.srch_bar {
	display: inline-block;
	text-align: right;
	width: 60%;
	padding:
}

.headind_srch {
	padding: 10px 29px 10px 20px;
	overflow: hidden;
	border-bottom: 1px solid #c4c4c4;
}

.recent_heading h4 {
	color: #05728f;
	font-size: 21px;
	margin: auto;
}

.srch_bar input {
	border: 1px solid #cdcdcd;
	border-width: 0 0 1px 0;
	width: 80%;
	padding: 2px 0 4px 6px;
	background: none;
}

.srch_bar .input-group-addon button {
	background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
	border: medium none;
	padding: 0;
	color: #707070;
	font-size: 18px;
}

.srch_bar .input-group-addon {
	margin: 0 0 0 -27px;
}

.chat_ib h5 {
	font-size: 15px;
	color: #464646;
	margin: 0 0 8px 0;
}

.chat_ib h5 span {
	font-size: 13px;
	float: right;
}

.chat_ib p {
	font-size: 14px;
	color: #989898;
	margin: auto
}

.chat_img {
	float: left;
	width: 11%;
}

.chat_ib {
	float: left;
	padding: 0 0 0 15px;
	width: 80%;
}

.chat_people {
	overflow: hidden;
	clear: both;
}

.chat_list {
	border-bottom: 1px solid #c4c4c4;
	margin: 0;
	padding: 18px 16px 10px;
}

.inbox_chat {
	height: 550px;
	overflow-y: scroll;
}

.active_chat {
	background: #ebebeb;
}

.incoming_msg_img {
	display: inline-block;
	width: 6%;
}

.received_msg {
	display: inline-block;
	padding: 0 0 0 10px;
	vertical-align: top;
	width: 92%;
}

.received_withd_msg p {
	background: #ebebeb none repeat scroll 0 0;
	border-radius: 3px;
	color: #646464;
	font-size: 14px;
	margin: 0;
	padding: 5px 10px 5px 12px;
	width: 100%;
}

.time_date {
	color: #747474;
	display: block;
	font-size: 12px;
	margin: 8px 0 0;
}

.received_withd_msg {
	width: 57%;
}

.mesgs {
	float: left;
	padding: 30px 15px 0 25px;
	width: 55%;
}

.sent_msg p {
	background: #05728f none repeat scroll 0 0;
	border-radius: 3px;
	font-size: 14px;
	margin: 0;
	color: #fff;
	padding: 5px 10px 5px 12px;
	width: 100%;
}

.outgoing_msg {
	overflow: hidden;
	margin: 26px 0 26px;
}

.sent_msg {
	float: right;
	width: 46%;
}

.input_msg_write input {
	background: rgba(0, 0, 0, 0) none repeat scroll 0 0;
	border: medium none;
	color: #4c4c4c;
	font-size: 15px;
	min-height: 48px;
	width: 100%;
}

.upload-file {
	right: 50px;
	display: block;
	position: absolute;
	height: 30px;
	font-size: 25px;
	top: 4px;
	bottom: 0;
	margin: auto;
	opacity: 0.25;
}

.upload-file:hover {
	opacity: 1;
}

label.upload-file input[type="file"] {
	position: fixed;
	top: -1000px;
}

.type_msg {
	border-top: 1px solid #c4c4c4;
	position: relative;
}

.msg_send_btn {
	background: #05728f none repeat scroll 0 0;
	border: medium none;
	border-radius: 50%;
	color: #fff;
	cursor: pointer;
	font-size: 17px;
	height: 33px;
	position: absolute;
	right: 0;
	top: 11px;
	width: 33px;
}

.messaging {
	padding: 0 0 50px 0;
}

.msg_history {
	height: 516px;
	overflow-y: auto;
}
</style>
<!-- InstanceEndEditable -->
<link rel="stylesheet" type="text/css" href="css/top.css" />
<link rel="stylesheet" type="text/css" href="css/header.css" />
<link rel="stylesheet" type="text/css" href="css/menutab.css" />
<link href="js/SpryTabbedPanels.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/leftcontent.css" />
<link rel="stylesheet" type="text/css" href="css/rightcontent.css" />
<link rel="stylesheet" type="text/css" href="css/footer.css" />
<link rel="stylesheet" type="text/css" href="css/storecontent.css" />
<link rel="stylesheet" type="text/css" href="css/usercontent.css" />
<link href="js/SpryTabbedPanels.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/billcontent.css" />
<link rel="stylesheet" type="text/css" href="css/schedulecontent.css" />
<link rel="stylesheet" type="text/css"
	href="css/medicalonlinecontent.css" />
<script src="js/SpryTabbedPanels.js" type="text/javascript"></script>
<script src="js/datepicker.js" type="text/javascript"></script>
<script type="text/javascript" src="js/tabletime.js"></script>
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>
<body>
	<div class="main">
		<!-- TOP: start -->
		<div class="top">
			<div class="languages">
				<div>Ngôn Ngữ:</div>
				<a href="#"><img src="images/language-vi.png" alt="Vi" /></a> <a
					href="#"><img src="images/language-en.png" alt="En" /></a>
			</div>
			<div class="search">
				<input type="text" class="search_input" name="search"
					placeholder=" Search..." /> <input type="image" class="search_bt"
					src="images/search.png" height="24" width="22" />
			</div>
			<div class="info">
				<a><img src="images/location.png" alt="location" height="25"
					width="22"/ ></a>
				<div>
					<strong>Địa chỉ: </strong> Tổ 1 - Thị trấn Đông Anh – Hà Nội
				</div>
				<a><img src="images/phone.png" alt="phone" height="24"
					width="22"/ ></a>
				<div>
					<strong>Số Điện Thoại: </strong> 0243.9655392 – 0243.8832450
				</div>
			</div>
		</div>
		<!-- TOP: end -->

		<!-- HEADER: start-->
		<div class="header">
			<div id="logo">
				<img src="images/logo1.jpeg" alt="images" />
			</div>
			<div class="slider">
				<div class="top_divider"></div>
				<div class="slide_content">
					<div class="content">
						<img src="images/sot%20xuat%20huyet_1.png" alt="images"
							class="slide_img" />
						<div class="slide_details">
							<div class="slide_title">"Phòng Bệnh Sốt Xuất Huyết" Thông
								tin cần biết</div>
							<div class="slide_text">Bệnh sốt xuất huyết là gì? Tại sao
								bệnh sốt xuất huyết lại nguy hiểm?</div>
							<a href="#" class="details">Chi tiết</a>
						</div>
					</div>
					<div class="top_divider"></div>
					<div class="pagination">
						<span class="current">1</span> <a href="">2</a> <a href="">3</a> <a
							href="">4</a> <a href="">5</a>
					</div>
					<div class="top_divider"></div>
				</div>
			</div>
			<div class="user" style="background-image: url(images/info-user.png)"></div>
		</div>
		<!-- HEADER: end -->
		<div class="clr"></div>
		<!-- Main-Body: start-->
		<div class="mainbody">
			<!-- Menu-tab: start-->
			<div id="menu_tab">
				<ul class="menu">
					<li><a href="index.html" id="nav_home">TRANG CHỦ</a></li>
					<li class="menu_divider"></li>
					<li><a href="userpage.html" id="nav_user">TRANG CÁ NHÂN</a></li>
					<li class="menu_divider"></li>
					<li><a href="store.html" id="nav_store">HIỆU THUỐC</a></li>
					<li class="menu_divider"></li>
					<li><a href="billcontent.html" id="nav_bill">THANH TOÁN</a></li>
					<li class="menu_divider"></li>
					<li><a href="schedule.html" id="nav_schedule">LỊCH LÀM
							VIỆC</a></li>
				</ul>
			</div>
			<!-- Menu-tab: end-->
			<div class="clr"></div>
			<!-- Content-body: start-->
			<div class="home-mid-mainbody">
				<div class="home-mid-left">
					<div class="function-1">
						<img src="images/medicalonline-icon.png" class="medicalonline" />
						<a href="medicalonline.html">Hỗ Trợ Trực Tuyến</a>
					</div>

					<div class="function-2">
						<div class="function-2-title">
							<img src="images/Speaker-icon.png" />
							<h4>Thông báo mới</h4>
						</div>
						<ul>
							<li class="function-2-li1"><a href="">Thông tư 43/TT –
									BYT và thông tư 21/TT – BYT Quy định chi tiết phân tuyến chuyên
									môn kỹ thuật đối với hệ thống cơ sở khám bệnh, chữa bệnh</a></li>
							<li class="function-2-li2"><a href="">Danh mục kĩ thuật
									được phê duyệt áp dụng tại bệnh viện đa khoa Đông Anh năm 2015,
									2016, 2018</a></li>
							<li class="function-2-li3"><a href="">Thành lập đơn
									nguyên Ung Bướu bệnh viện đa khoa Đông Anh</a></li>
							<li class="function-2-li4"><a href="">Lễ công bố quyết
									định thành lập khoa Cấp cứu, khoa Chấn thương chỉnh hỉnh và
									triển khai hoạt động của khoa Dinh dưỡng</a></li>
							<li class="function-2-li5"><a href="">Bảng giá khám chữa
									bệnh tại bệnh viện đa khoa Đông Anh</a></li>
						</ul>
					</div>
					<div class="function-3">
						<div class="function-3-title">
							<img src="images/link-icon.png" />
							<h4>Liên kết Websites</h4>
						</div>
						<li><select>
								<option value="http://moh.gov.vn/">Bộ y tế Việt Nam</option>
								<option value="#">Sở y tế các tỉnh</option>
								<option value="#">Khối bệnh viện</option>
								<option value="http://tonghoiyhoc.vn/">Tổng hội y học
									Việt Nam</option>
								<option value="#">Khối các trường đại học, cao đẳng y
									tế</option>


						</select></li>
					</div>
					<div class="function-4">
						<div class="function-4-title">
							<img src="images/guide-icon.png" />
							<h4>Hướng dẫn sử dụng</h4>
						</div>
						<li><select>
								<option value="#">Đặt Lịch Khám Online</option>
								<option value="#">Hỏi đáp trực tuyến</option>
								<option value="#">Mua thuốc online</option>
								<option value="#">Thanh toán hóa đơn</option>
								<option value="#">Xem lịch làm việc</option>
						</select></li>
					</div>
				</div>
				<!-- InstanceBeginEditable name="content" -->
				<div class="medicalonline-content">
					<div class="rightcontent-title">
						<img src="images/icon-hospitalonline.png" />
						<h2>Khám Bệnh Trực Tuyến</h2>
					</div>
					<div id="TabbedPanels1" class="TabbedPanels">
						<ul class="TabbedPanelsTabGroup">
							<li class="TabbedPanelsTab" tabindex="0">Đặt lịch khám trực
								tuyến</li>
							<li class="TabbedPanelsTab" tabindex="0">Hỏi đáp trực tuyến</li>
						</ul>
						<div class="TabbedPanelsContentGroup">
							<div id="TabbedPanelsContent" class="medicalonline-content-tab1">
								<div class="medicalonline-fuction-makeappointment">
									<div class="medicalonline-fuction-makeappointment-top">
										<h3>CHỌN NGÀY, BÁC SỸ VÀ KHUNG GIỜ BẠN MUỐN ĐẶT LỊCH HẸN</h3>
									</div>
									<style>
.bootstrap-iso .formden_header h2, .bootstrap-iso .formden_header p,
	.bootstrap-iso .row {
	background-color: #F5F5F5
}

,
.bootstrap-iso form {
	font-family: Arial, Helvetica, sans-serif;
	color: black
}

.bootstrap-iso form button, .bootstrap-iso .form-horizontal .control-label
	{
	text-align: left
}

,
.bootstrap-iso form button:hover {
	color: white !important;
}

.asteriskField {
	color: red;
}
</style>
									<div class="medicalonline-fuction-makeappointment-content">
										<div
											class="medicalonline-fuction-makeappointment-content-selectdate">
											<div class="bootstrap-iso">
												<div class="container-fluid">
													<div class="row">
														<div class="col-md-12 col-sm-12 col-xs-12">
															<form class="form-horizontal" method="post">

																<div class="form-group ">
																	<label class="control-label col-sm-12 requiredField"
																		for="select_dev"> Chuyên môn <span
																		class="asteriskField"> * </span>
																	</label>
																	<div class="col-sm-10">
																		<s:select  path="listPB" class="select form-control" id="select_dev"
																			name="select_dev">
																			<s:option value="NONE" label="Select" />
																			<s:options items="${listPB}"/>
																		</s:select>
																	</div>
																</div>

																<div class="form-group ">
																	<label class="control-label col-sm-12 requiredField"
																		for="select_doctor"> Bác Sĩ <span
																		class="asteriskField"> * </span>
																	</label>
																	<div class="col-sm-10">
																		<s:select path="listBS"
																			class="select form-control" id="select_doctor"
																			name="select_doctor">
																			<s:option value="NONE" label="Select" />
																			<s:options items="${listBS}"/>
																		</s:select>
																	</div>
																</div>

																<div class="form-group ">
																	<label class="control-label col-sm-12 requiredField"
																		for="date"> Ngày <span class="asteriskField">
																			* </span>

																	</label>
																	<div class="col-sm-10">
																		<div class="input-group">
																			<div class="input-group-addon">
																				<i class="fa fa-calendar"> </i>
																			</div>
																			<input class="form-control" id="date" name="date"
																				placeholder="MM/DD/YYYY" type="text" />
																		</div>
																	</div>
																</div>
																<input style="display: none" type="text" id="khunggio"
																	value="">
																<div class="form-group">
																	<div class="col-sm-10 col-sm-offset-2">
																		<button class="btn btn-primary " name="submit"
																			type="submit">Đặt Lịch Khám</button>
																	</div>
																</div>

															</form>
														</div>
													</div>
												</div>
											</div>

										</div>

										<div
											class="medicalonline-fuction-makeappointment-content-selecttime">
											<label class="control-label col-sm-12 requiredField"
												for="select_time"> <strong style="font-size: 14px">Chọn
													khung giờ</strong> <span class="asteriskField"> * </span>
											</label>
											<div class="row">
												<button id="1" class="btn btn-info" value="7h30 - 8h30"
													onclick="myFunction(this.value)">7h30 - 8h30</button>
												<button id="2" class="btn btn-info" value="8h30 - 9h30"
													onclick="myFunction(this.value)">8h30 - 9h30</button>
												<button id="3" class="btn btn-info" value="9h30 - 10h30"
													onclick="myFunction(this.value)">9h30 - 10h30</button>
												<button id="4" class="btn btn-info" value="10h30 - 11h30"
													onclick="myFunction(this.value)">10h30 - 11h30</button>
											</div>
											<div class="row">
												<button id="5" class="btn btn-info" value="13h30 - 14h3"
													onclick="myFunction(this.value)">13h30 - 14h30</button>
												<button id="6" class="btn btn-info" value="7h30 - 8h30"
													onclick="myFunction(this.value)">14h30 - 15h30</button>
												<button id="7" class="btn btn-info" value="14h30 - 15h30"
													onclick="myFunction(this.value)">15h30 - 16h30</button>
												<button id="8" class="btn btn-info" value="16h30 - 17h30"
													onclick="myFunction(this.value)">16h30 - 17h30</button>

											</div>
										</div>
									</div>
								</div>
							</div>
							<div id="TabbedPanelsContent" class="medicalonline-content-tab2">
								<div class="container">
									<div class="messaging">
										<div class="inbox_msg">
											<div class="inbox_people">
												<div class="headind_srch">
													<div class="recent_heading">
														<h4>Hòm Thư</h4>
													</div>
													<div class="srch_bar">
														<div class="stylish-input-group">
															<input type="text" class="search-bar"
																placeholder="Tìm kiếm"> <span
																class="input-group-addon">
																	<button type="button">
																		<i class="fa fa-search" aria-hidden="true"></i>
																	</button>
															</span>
														</div>
													</div>
												</div>
												<div class="inbox_chat">
													<div class="chat_list active_chat">
														<div class="chat_people">
															<div class="chat_img">
																<img src="images/admin.png" alt="Admin">
															</div>
															<div class="chat_ib">
																<h5>
																	Admin <span class="chat_date">25-T12</span>
																</h5>
																<p></p>
															</div>
														</div>
													</div>
												</div>
											</div>
											<div class="mesgs">
												<div class="msg_history">
													<div class="incoming_msg">
														<div class="incoming_msg_img">
															<img src="images/admin.png" alt="Admin">
														</div>
														<div class="received_msg">
															<div class="received_withd_msg">
																<p>Người dùng vui lòng cập nhật thông tin cá nhân.</p>
																<span class="time_date"> 11:01 AM | 9 - T6</span>
															</div>
														</div>
													</div>
													<div class="outgoing_msg">
														<div class="sent_msg">
															<p>Tôi đã cập nhật đầy đủ</p>
															<span class="time_date"> 11:01 AM | 9 - T6</span>
														</div>
													</div>
													<div class="incoming_msg">
														<div class="incoming_msg_img">
															<img src="images/admin.png" alt="Admin">
														</div>
														<div class="received_msg">
															<div class="received_withd_msg">
																<p>Hệ thống nhận thấy bạn đăng nhập sai mật khẩu
																	nhiều lần. Bạn có cần cấp lại mật khẩu không?</p>
																<span class="time_date"> 11:01 AM | Hôm qua</span>
															</div>
														</div>
													</div>
													<div class="outgoing_msg">
														<div class="sent_msg">
															<p>Tôi cảm ơn nhưng hiện tại tôi đã nhớ</p>
															<span class="time_date"> 11:01 AM | Hôm nay</span>
														</div>
													</div>
													<div class="incoming_msg">
														<div class="incoming_msg_img">
															<img src="images/admin.png" alt="Admin">
														</div>
														<div class="received_msg">
															<div class="received_withd_msg">
																<p>Nếu gặp vấn đề gì khi sử dụng hệ thống hãy cho
																	chúng tôi biết!</p>
																<span class="time_date"> 11:01 AM | Hôm nay</span>
															</div>
														</div>
													</div>
												</div>
												<div class="type_msg">
													<div class="input_msg_write">
														<input type="text" class="write_msg"
															placeholder="Nhập nội dung" /> <label
															class="upload-file"> <input type="file"
															required=""> <i class="fa fa-paperclip"></i></label>
														<button class="msg_send_btn" type="button">
															<i class="fa fa-paper-plane-o" aria-hidden="true"></i>
														</button>
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- InstanceEndEditable -->
		</div>
		<!-- Content-body: end-->
	</div>
	<!-- Main - body: end -->
	<div class="clr"></div>
	<!--FOOTER: start-->
	<div class="footer">
		<div class="footer-left">
			<h1 id="footer-word">Medical Online</h1>
			<h3 id="footer-word">BỆNH VIỆN ĐA KHOA ĐÔNG ANH</h3>
			<div class="footer-left-info">

				<div class="footer-left-info-word" id="footer-word">
					<a><img src="images/location.png" alt="location" height="25"
						width="22"/ ></a>
					<p>
						<strong>Địa chỉ: </strong> Tổ 1 - Thị trấn Đông Anh – Hà Nội
					</p>
				</div>

				<div class="footer-left-info-word" id="footer-word">
					<a><img src="images/phone.png" alt="location" height="24"
						width="22"/ ></a>
					<p>
						<strong>Số Điện Thoại: </strong> 0243.9655392 – 0243.8832450
					</p>
				</div>
			</div>
		</div>
		<div class="footer-right">
			<h2 id="footer-word">Bản đồ chỉ dẫn</h2>
			<a
				href="https://www.google.com/maps/place/B%E1%BB%87nh+Vi%E1%BB%87n+%C4%90a+Khoa+%C4%90%C3%B4ng+Anh/@21.1244813,105.8010464,12.17z/data=!4m5!3m4!1s0x313500ddeda3e3e7:0xf5016d28393fd8cf!8m2!3d21.1393037!4d105.8534046"><img
				src="images/bg-map.png" /></a>
		</div>
		<div class="footer-bottom">
			<div class="footer-bottom-info" id="footer-word">
				<b>Bản quyền thuộc về Medical Online</b>
				<p>
					<strong>Địa chỉ:</strong> số 88, đường Bắc Hồng, xã Bắc Hồng, Đông
					Anh, Hà Nội
				</p>
				<p>
					<strong>Điện thoại:</strong> 0978855695
				</p>
				<p>
					<strong>Email:</strong> anhpt.hust@gmail.com
				</p>
			</div>
			<!-- InstanceBeginEditable name="footer-menu" -->
			<div class="footer-bottom-menu">
				<ul>
					<li class="active"><a href="index.html">TRANG CHỦ</a></li>
					<li><a href="userpage.html">TRANG CÁ NHÂN</a></li>
					<li><a href="store.html">HIỆU THUỐC</a></li>
					<li><a href="billcontent.html">THANH TOÁN</a></li>
					<li><a href="schedule.html">LỊCH LÀM VIỆC</a></li>
				</ul>
			</div>
			<script type="text/javascript">
				var TabbedPanels1 = new Spry.Widget.TabbedPanels(
						"TabbedPanels1");
			</script>
			<!-- InstanceEndEditable -->
		</div>
	</div>
	<!--FOOTER: end-->
	</div>
</body>
<!-- InstanceEnd -->
	</html>