<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>	
<!DOCTYPE html><html><!-- InstanceBegin template="/Templates/template for admin.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <!-- InstanceBeginEditable name="doctitle" -->
    <title>Medical Online</title>
    <!-- InstanceEndEditable -->
    <!-- Fontfaces CSS-->
    <link href="css/font-face.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">
    <link href="vendor/vector-map/jqvmap.min.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/theme.css" rel="stylesheet" media="all">
    <!-- InstanceBeginEditable name="head" -->
    <!-- InstanceEndEditable -->
</head>

<body class="animsition">
    <div class="page-wrapper">
        <!-- MENU SIDEBAR-->
        <aside class="menu-sidebar2">
            <div class="logo">
                <a href="#">
                    <h3>Medical Online</h3>
                </a>
            </div>
            <div class="menu-sidebar2__content js-scrollbar1">
                <div class="account2">
                    <div class="image img-cir img-120">
                        <img src="Admin-images/icon/Admin.JPG" alt="Admin" />
                    </div>
                    <h4 class="name">Tuấn Anh</h4>
                    <a href="#">Đăng xuất</a>
                </div>
                <nav class="navbar-sidebar2">
                    <ul class="list-unstyled navbar__list">
                        
                        <li >
                            <a href="Admin-inbox.html">
                                <i class="fas fa-chart-bar"></i>Hộp thư phản hồi</a>
                            <span class="inbox-num">3</span>
                        </li>
                        <li>
                            <a href="Admin-ManageBill.html">
                                <i class="fas fa-shopping-basket"></i>Quản lý đơn hàng</a>
                        </li>
                        <li class="active has-sub">
                            <a href="Admin-ManageUser.html">
                                        <i class="fas fa-table"></i>Quản lý người dùng</a>
                        </li>
                        <li >
                            <a href="Admin-ManageProduct.html">
                                        <i class="fas fa-table"></i>Quản lý sản phẩm</a>
                        </li>
                        <li>
                            <a href="Admin-Work.html">
                                <i class="fas fa-calendar-alt"></i>Lịch làm việc</a>
                        </li>
                    
                        </li>
                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->

        <!-- PAGE CONTAINER-->
        <div class="page-container2">
            <!-- HEADER DESKTOP-->
            <header class="header-desktop2">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="header-wrap2">
                            <div class="logo d-block d-lg-none">
                                <a href="#">
                                   <h3>Medical Online</h3>
                                </a>
                            </div>
                            <div class="header-button2">
                                <div class="header-button-item js-item-menu">
                                    <i class="zmdi zmdi-search"></i>
                                    <div class="search-dropdown js-dropdown">
                                        <form action="">
                                            <input class="au-input au-input--full au-input--h65" type="text" placeholder="Search for datas &amp; reports..." />
                                            <span class="search-dropdown__icon">
                                                <i class="zmdi zmdi-search"></i>
                                            </span>
                                        </form>
                                    </div>
                                </div>
                                <div class="header-button-item has-noti js-item-menu">
                                    <i class="zmdi zmdi-notifications"></i>
                                    <div class="notifi-dropdown js-dropdown">
                                        <div class="notifi__title">
                                            <p>Bạn có 3 thông báo mới</p>
                                        </div>
                                        <div class="notifi__item">
                                            <div class="bg-c1 img-cir img-40">
                                                <i class="zmdi zmdi-email-open"></i>
                                            </div>
                                            <div class="content">
                                                <p>Một tài khoản mới đăng ký</p>
                                                <span class="date">T12, 12, 2018 06:50</span>
                                            </div>
                                        </div>
                                        <div class="notifi__item">
                                            <div class="bg-c2 img-cir img-40">
                                                <i class="zmdi zmdi-account-box"></i>
                                            </div>
                                            <div class="content">
                                                <p>Một tài khoản mới đăng ký</p>
                                                <span class="date">T12, 13, 2018 06:50</span>
                                            </div>
                                        </div>
                                        <div class="notifi__item">
                                            <div class="bg-c3 img-cir img-40">
                                                <i class="zmdi zmdi-file-text"></i>
                                            </div>
                                            <div class="content">
                                                <p>Bạn nhận được 1 phản hồi</p>
                                                <span class="date">Tháng 12, 16, 2018 06:50</span>
                                            </div>
                                        </div>
                                        <div class="notifi__footer">
                                            <a href="#">Toàn bộ thông báo</a>
                                        </div>
                                    </div>
                                </div>
                                <div class="header-button-item mr-0 js-sidebar-btn">
                                    <i class="zmdi zmdi-menu"></i>
                                </div>
                                <div class="setting-menu js-right-sidebar d-none d-lg-block">
                                    <div class="account-dropdown__body">
                                        <div class="account-dropdown__item">
                                            <a href="#">
                                                <i class="zmdi zmdi-account"></i>Thông tin tài khoản</a>
                                        </div>
                                        <div class="account-dropdown__item">
                                            <a href="#">
                                                <i class="zmdi zmdi-settings"></i>Cài đặt</a>
                                        </div>
                                       
                                    </div>
                                    <div class="account-dropdown__body">
                                        <div class="account-dropdown__item">
                                            <a href="#">
                                                <i class="zmdi zmdi-notifications"></i>Thông báo</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <aside class="menu-sidebar2 js-right-sidebar d-block d-lg-none">
                <div class="logo">
	                <a href="#">
	                    <h3>Medical Online</h3>
	                </a>
	            </div>
                <div class="menu-sidebar2__content js-scrollbar2">
                    <div class="account2">
                    <div class="image img-cir img-120">
                        <img src="Admin-images/icon/Admin.JPG" alt="Admin"  />
                    </div>
                    <h4 class="name">Tuấn Anh</h4>
                    <a href="#">Đăng xuất</a>
                </div>
                <nav class="navbar-sidebar2">
                    <ul class="list-unstyled navbar__list">
                        
                        <li>
                            <a href="Admin-feedback.html">
                                <i class="fas fa-chart-bar"></i>Hộp thư phản hồi</a>
                            <span class="inbox-num">3</span>
                        </li>
                        <li>
                            <a href="Admin-ManageBill.html">
                                <i class="fas fa-shopping-basket"></i>Quản lý đơn hàng</a>
                        </li>
                        <li class="active has-sub">
                            <a href="Admin-ManageUser.html">
                                        <i class="fas fa-table"></i>Quản lý người dùng</a>
                        </li>
                        <li >
                            <a href="Admin-ManageProduct.html">
                                        <i class="fas fa-table"></i>Quản lý sản phẩm</a>
                        </li>
                        <li>
                            <a href="Admin-Work.html">
                                <i class="fas fa-calendar-alt"></i>Lịch làm việc</a>
                        </li>
                    
                        </li>
                    </ul>
                </nav>
                </div>
            </aside>
            <!-- END HEADER DESKTOP-->

            <!-- BREADCRUMB-->
            <section class="au-breadcrumb m-t-75">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="au-breadcrumb-content">
                                    <div class="au-breadcrumb-left">
                                        <span class="au-breadcrumb-span">Trang hiện tại:</span>
                                        <ul class="list-unstyled list-inline au-breadcrumb__list">
                                            <li class="list-inline-item active">
                                                <a href="Admin-home.html">Trang Chủ</a>
                                            </li></ul>
                                        <ul>
                                          <!-- InstanceBeginEditable name="thanhdieuhuong" -->
                                            <li class="list-inline-item seprate"> <span>/Quản Lý Người Dùng</span></li>
                                          <!-- InstanceEndEditable -->
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- END BREADCRUMB--><!-- InstanceBeginEditable name="content" -->
            <div class="main-content">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <!-- DATA TABLE -->
                                <h3 class="title-5 m-b-35">Dữ liệu người dùng</h3>
                                <div class="table-data__tool">
                                    <div class="table-data__tool-left">
                                        <div class="rs-select2--light rs-select2--md">
                                            <select class="js-select2" name="property">
                                                <option selected="selected">Loại người dùng</option>
                                                <option value="">Bệnh Nhân</option>
                                                <option value="">Bác sĩ</option>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                        <div class="rs-select2--light rs-select2--sm">
                                            <select class="js-select2" name="time">
                                                <option selected="selected">Thời gian</option>
                                                <option value="">3 Ngày</option>
                                                <option value="">1 Tuần</option>
                                                <option value="">1 Năm</option>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                        <button class="au-btn-filter">
                                            <i class="zmdi zmdi-filter-list"></i>Lọc</button>
                                    </div>
                                    <div class="table-data__tool-right">
                                        <button class="au-btn au-btn-icon au-btn--green au-btn--small" data-toggle="modal" data-target="#ModalLoginForm">
                                            <i class="zmdi zmdi-plus"></i>Thêm tài khoản</button>
                                        <div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
                                        </div>
                                    </div>
                                </div>
                                <div class="table-responsive table-responsive-data2">
                                    <table class="table table-data2">
                                        <thead>
                                            <tr>
                                                <th>Họ và Tên</th>
                                                <th>Loại Tài Khoản</th>
                                                <th>Tên Đăng Nhập</th>
                                                <th>Mật Khẩu</th>
                                                <th>Số Điện Thoại</th>
                                                <th>Email</th>
                                                <th>Địa Chỉ</th>
                                            </tr>
                                        </thead>
                                        <c:forEach items="${userList}" var="u">
                                        <tbody>
                                            <tr class="tr-shadow">
                                                <td>Lori Lynch</td>
                                                <td><c:out value="${u.idphanquyen }"/></td>
                                                <td><c:out value = "${u.username}"/></td>
                                                <td><c:out value = "${u.password}"/></td>
                                                <td>0978855695</td>
                                                <td>
                                                    <span class="block-email">lori@example.com</span>
                                                </td>
                                                <td>Đông Anh - Hà Nội</td>
                                                <td>
                                                   <div class="table-data-feature">
	                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Edit">
	                                                            <a href="#"><i class="zmdi zmdi-edit" ></i></a>
	                                                        </button>
	                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Delete">
	                                                            <a href="#" onclick="if (!(confirm('Bạn có muốn xóa sản phẩm này?'))) return false"><i class="zmdi zmdi-delete"></i></a>
	                                                        </button>
	                                                    </div>
                                                </td>
                                            </tr>
                                            <tr class="spacer"></tr>
                                        </tbody>
                                        </c:forEach>
                                    </table>
                                </div>
                                <!-- END DATA TABLE -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div id="ModalLoginForm" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="smallmodalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h2 class="modal-title">Tạo người dùng mới</h2>
                                            </div>
                                            <div class="modal-body">
                                                <form role="form" method="POST" action="addUser.do">
                                                    <input type="hidden" name="_token" value="">
                                                    <div class="rs-select2--light rs-select2--md">
                                                        <select class="js-select2" name="loainguoidung">
                                                            <option selected="selected">Loại người dùng</option>
                                                            <option value="Bệnh Nhân">Bệnh Nhân</option>
                                                            <option value="Bác Sĩ">Bác Sĩ</option>
                                                        </select>
                                                        <div class="dropDownSelect2"></div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label">Username</label>
                                                        <div>
                                                            <input type="text" class="form-control input-lg" name="username" required="Bạn cần điền đầy đủ thông tin!">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label">Password</label>
                                                        <div>
                                                            <input type="password" class="form-control input-lg" name="password">
                                                        </div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label class="control-label">Nhập lại Password</label>
                                                        <div>
                                                            <input type="password" class="form-control input-lg" name="repeatpassword" required="Bạn cần điền đầy đủ thông tin!">
                                                        </div>
                                                    </div>


                                                    <div class="form-group">
                                                        <div>
                                                            <button type="submit" class="btn btn-success">
                                                                Lưu
                                                            </button>
                                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Hủy</button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div><!-- /.modal-content -->
                                    </div><!-- /.modal-dialog -->
                                </div>
        </div>
            <!-- InstanceEndEditable -->
            <section>
              <div class="container-fluid">
                <div class="row">
                  <div class="col-md-12">
                    <div class="copyright">
                      <p>Copyright © 1/2019 Medical. All rights reserved. Template by <a href="#">Medical Online</a>.</p>
                    </div>
                  </div>
                </div>
              </div>
          </section>
            <!-- END PAGE CONTAINER-->
        </div>

    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="vendor/slick/slick.min.js">
    </script>
    <script src="vendor/wow/wow.min.js"></script>
    <script src="vendor/animsition/animsition.min.js"></script>
    <script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="vendor/circle-progress/circle-progress.min.js"></script>
    <script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="vendor/chartjs/Chart.bundle.min.js"></script>
    <script src="vendor/select2/select2.min.js">
    </script>
    <script src="vendor/vector-map/jquery.vmap.js"></script>
    <script src="vendor/vector-map/jquery.vmap.min.js"></script>
    <script src="vendor/vector-map/jquery.vmap.sampledata.js"></script>
    <script src="vendor/vector-map/jquery.vmap.world.js"></script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

<!-- InstanceEnd --></html>
<!-- end document-->