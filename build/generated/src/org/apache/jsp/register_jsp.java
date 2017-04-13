package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.management.Query;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/structure.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"main.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Register</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"main.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>main</title>\n");
      out.write("        ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <img src=\"img/brand.png\" height=110 width=\"100%\">\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"navbar navbar-default\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"main.jsp\">หน้าหลัก</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li><a href=\"how_to_buy.html\">วิธีการสั่งซื้อ<span></span></a></li>\n");
      out.write("                        <li><a href=\"product.html\">สินค้าทั้งหมด</a></li>\n");
      out.write("                        <li><a href=\"register.jsp\">สมัครสมาชิก</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"confirm_transaction.html\">แจ้งโอนเงิน</a></li>\n");
      out.write("                        <li><a href=\"contact.html\">ติดต่อ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("            <div id=\"l_cont\">\n");
      out.write("                ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                    ");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
          if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("                        <div class=\"menubox\">\n");
              out.write("                <div class=\"menuhead\">\n");
              out.write("                    <h3>เข้าสู่ระบบ</h3>\n");
              out.write("                </div>\n");
              out.write("                <div class=\"menucontent\">\n");
              out.write("                    <ul>\n");
              out.write("                        <p>\n");
              out.write("                            welcome ");
 out.println(session.getAttribute("username")); 
              out.write("\n");
              out.write("                        </p>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/user.png\" height=\"17\" width=\"17\"><a href=\"profile.html\">ข้อมูลสมาชิก</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/cart.png\" height=\"17\" width=\"17\"><a href=\"cart.html\">ตะกร้าสินค้า</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/bill.png\" height=\"17\" width=\"17\"><a href=\"history.html\">ประวัติการสั่งซื้อ</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/pay.png\" height=\"17\" width=\"17\"><a href=\"report_transter.html\">แจ้งโอนเงิน</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <a href=\"logout\">ออกจากระบบ</a>\n");
              out.write("                    </ul>\n");
              out.write("                </div>\n");
              out.write("                <div class=\"menubottom\">\n");
              out.write("                </div>\n");
              out.write("            </div>\n");
              out.write("                    ");
              int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
            return;
          }
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
          out.write("\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\n");
      out.write("                <div class=\"menubox\">\n");
      out.write("                    <div class=\"menuhead\">\n");
      out.write("                        <h3>ค้นหาหนังสือ</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"menucontent\">\n");
      out.write("                        <div class=\"label\">\n");
      out.write("                            <select name=\"category\">\n");
      out.write("                                <option value=\"\">เลือกประเภทหนังสือ</option>\n");
      out.write("                                <option value=\"manga\">การ์ตูน</option>\n");
      out.write("                                <option value=\"novel\">นิยาย</option>\n");
      out.write("                                <option value=\"magazine\">นิตยสาร</option>\n");
      out.write("                                <option value=\"knowledge\">ความรู้</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"label\">\n");
      out.write("                            <select name=\"publisher\">\n");
      out.write("                                <option value=\"\">เลือกสำนักพิมพ์</option>\n");
      out.write("                                <option value=\"siam\">สยามอินเตอร์คอมิค</option>\n");
      out.write("                                <option value=\"luck\">ลัคพิมพ์</option>\n");
      out.write("                                <option value=\"bongkoch\">บงกช</option>\n");
      out.write("                                <option value=\"zenshu\">เซนชู</option>\n");
      out.write("                                <option value=\"vibul\">วิบูลย์กิจ</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"label\">\n");
      out.write("                            <label style=\"float: left;font-size:15px;color:black;\">ความรู้</label>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> เทคโนโลยี </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> วิทยาศาสตร์ </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ศิลปะ </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ภาษา </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> คณิตศาตร์ </input>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <label style=\"float: left;font-size:15px;color:black;\">นิยายและการ์ตูน</label>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> คอเมดี้ </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ดราม่า </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> โรแมนติค </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> เลิฟ-คอเมดี้ </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> เแอคชั่น </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> แฟนตาซี </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> สืบสวนสอบสวน </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> สยอง </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> น่ากลัว </input>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <label style=\"float: left;font-size:15px;color:black;\">นิตยสาร</label>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ทำอาหาร </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> แฟชั่น </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> บ้านและเฟอร์นิเจอร์ </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> วัยรุ่น </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> พระเครื่อง </input>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"checkbox\" name=\"genre\" value=\"IT\"> การ์ตูน </input>\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"text\" name=\"searchinput\" style=\"width:160px; text-align: center; height:25px;border-radius: 3px\" />\n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"label\" style=\"text-align: center;\">\n");
      out.write("                            <input type=\"submit\" name=\"search\" value=\"Search\" class=\"button\" style=\" margin-right: 10px\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"menubottom\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                   ");
      out.write("\n");
      out.write("            <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("            <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("            <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div id=\"r_cont\">\n");
      out.write("            <script type=\"text/javascript\" src=\"js/register.js\"></script>\n");
      out.write("            <form action=\"RegisterServlet\" method=\"POST\" name=\"register\" onsubmit=\"return(regvalidate())\">\n");
      out.write("                <fieldset>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    username :\n");
      out.write("                </label>\n");
      out.write("                <input pattern=\"^[a-zA-Z0-9]{6,50}$\" type=\"text\" class=\"textreg\" placeholder=\"Username\" name=\"username\" id=\"username\" required />\n");
      out.write("                <div class=\"regnote\">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    password :\n");
      out.write("                </label>\n");
      out.write("                <input pattern=\"^[a-zA-Z0-9]{6,50}$\" type=\"password\" class=\"textreg\" placeholder=\"Password\" name=\"password\" id=\"password\" />\n");
      out.write("                <div class=\"regnote\">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    confirm password :\n");
      out.write("                </label>\n");
      out.write("                <input pattern=\"^[a-zA-Z0-9]{6,50}$\" title=\"\" type=\"password\" class=\"textreg\" placeholder=\"Password\" name=\"confirm\" id=\"confirm\" />\n");
      out.write("                <div class=\"regnote\">เฉพาะA-Z a-z และ 0-9 ความยาว 6-50ตัวอักษร</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    E-MAIL :\n");
      out.write("                </label>\n");
      out.write("                <input type=\"email\" class=\"textreg\" placeholder=\"E-mail\" name=\"email\" id=\"email\" />\n");
      out.write("                <div class=\"regnote\">Example : example@example.com</div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    First Name :\n");
      out.write("                </label>\n");
      out.write("                <input type=\"text\" class=\"textreg\" placeholder=\"First Name\" name=\"fname\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    Last Name :\n");
      out.write("                </label>\n");
      out.write("                <input type=\"text\" class=\"textreg\" placeholder=\"First Name\" name=\"lname\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    Province :\n");
      out.write("                </label>\n");
      out.write("                <select name=\"province\" class=\"textreg\">\n");
      out.write("                    <option value=\"\" selected>--------- เลือกจังหวัด ---------</option>\n");
      out.write("                    <option value=\"กรุงเทพมหานคร\">กรุงเทพมหานคร</option>\n");
      out.write("                    <option value=\"กระบี่\">กระบี่ </option>\n");
      out.write("                    <option value=\"กาญจนบุรี\">กาญจนบุรี </option>\n");
      out.write("                    <option value=\"กาฬสินธุ์\">กาฬสินธุ์ </option>\n");
      out.write("                    <option value=\"กำแพงเพชร\">กำแพงเพชร </option>\n");
      out.write("                    <option value=\"ขอนแก่น\">ขอนแก่น</option>\n");
      out.write("                    <option value=\"จันทบุรี\">จันทบุรี</option>\n");
      out.write("                    <option value=\"ฉะเชิงเทรา\">ฉะเชิงเทรา </option>\n");
      out.write("                    <option value=\"ชัยนาท\">ชัยนาท </option>\n");
      out.write("                    <option value=\"ชัยภูมิ\">ชัยภูมิ </option>\n");
      out.write("                    <option value=\"ชุมพร\">ชุมพร </option>\n");
      out.write("                    <option value=\"ชลบุรี\">ชลบุรี </option>\n");
      out.write("                    <option value=\"เชียงใหม่\">เชียงใหม่ </option>\n");
      out.write("                    <option value=\"เชียงราย\">เชียงราย </option>\n");
      out.write("                    <option value=\"ตรัง\">ตรัง </option>\n");
      out.write("                    <option value=\"ตราด\">ตราด </option>\n");
      out.write("                    <option value=\"ตาก\">ตาก </option>\n");
      out.write("                    <option value=\"นครนายก\">นครนายก </option>\n");
      out.write("                    <option value=\"นครปฐม\">นครปฐม </option>\n");
      out.write("                    <option value=\"นครพนม\">นครพนม </option>\n");
      out.write("                    <option value=\"นครราชสีมา\">นครราชสีมา </option>\n");
      out.write("                    <option value=\"นครศรีธรรมราช\">นครศรีธรรมราช </option>\n");
      out.write("                    <option value=\"นครสวรรค์\">นครสวรรค์ </option>\n");
      out.write("                    <option value=\"นราธิวาส\">นราธิวาส </option>\n");
      out.write("                    <option value=\"น่าน\">น่าน </option>\n");
      out.write("                    <option value=\"นนทบุรี\">นนทบุรี </option>\n");
      out.write("                    <option value=\"บึงกาฬ\">บึงกาฬ</option>\n");
      out.write("                    <option value=\"บุรีรัมย์\">บุรีรัมย์</option>\n");
      out.write("                    <option value=\"ประจวบคีรีขันธ์\">ประจวบคีรีขันธ์ </option>\n");
      out.write("                    <option value=\"ปทุมธานี\">ปทุมธานี </option>\n");
      out.write("                    <option value=\"ปราจีนบุรี\">ปราจีนบุรี </option>\n");
      out.write("                    <option value=\"ปัตตานี\">ปัตตานี </option>\n");
      out.write("                    <option value=\"พะเยา\">พะเยา </option>\n");
      out.write("                    <option value=\"พระนครศรีอยุธยา\">พระนครศรีอยุธยา </option>\n");
      out.write("                    <option value=\"พังงา\">พังงา </option>\n");
      out.write("                    <option value=\"พิจิตร\">พิจิตร </option>\n");
      out.write("                    <option value=\"พิษณุโลก\">พิษณุโลก </option>\n");
      out.write("                    <option value=\"เพชรบุรี\">เพชรบุรี </option>\n");
      out.write("                    <option value=\"เพชรบูรณ์\">เพชรบูรณ์ </option>\n");
      out.write("                    <option value=\"แพร่\">แพร่ </option>\n");
      out.write("                    <option value=\"พัทลุง\">พัทลุง </option>\n");
      out.write("                    <option value=\"ภูเก็ต\">ภูเก็ต </option>\n");
      out.write("                    <option value=\"มหาสารคาม\">มหาสารคาม </option>\n");
      out.write("                    <option value=\"มุกดาหาร\">มุกดาหาร </option>\n");
      out.write("                    <option value=\"แม่ฮ่องสอน\">แม่ฮ่องสอน </option>\n");
      out.write("                    <option value=\"ยโสธร\">ยโสธร </option>\n");
      out.write("                    <option value=\"ยะลา\">ยะลา </option>\n");
      out.write("                    <option value=\"ร้อยเอ็ด\">ร้อยเอ็ด </option>\n");
      out.write("                    <option value=\"ระนอง\">ระนอง </option>\n");
      out.write("                    <option value=\"ระยอง\">ระยอง </option>\n");
      out.write("                    <option value=\"ราชบุรี\">ราชบุรี</option>\n");
      out.write("                    <option value=\"ลพบุรี\">ลพบุรี </option>\n");
      out.write("                    <option value=\"ลำปาง\">ลำปาง </option>\n");
      out.write("                    <option value=\"ลำพูน\">ลำพูน </option>\n");
      out.write("                    <option value=\"เลย\">เลย </option>\n");
      out.write("                    <option value=\"ศรีสะเกษ\">ศรีสะเกษ</option>\n");
      out.write("                    <option value=\"สกลนคร\">สกลนคร</option>\n");
      out.write("                    <option value=\"สงขลา\">สงขลา </option>\n");
      out.write("                    <option value=\"สมุทรสาคร\">สมุทรสาคร </option>\n");
      out.write("                    <option value=\"สมุทรปราการ\">สมุทรปราการ </option>\n");
      out.write("                    <option value=\"สมุทรสงคราม\">สมุทรสงคราม </option>\n");
      out.write("                    <option value=\"สระแก้ว\">สระแก้ว </option>\n");
      out.write("                    <option value=\"สระบุรี\">สระบุรี </option>\n");
      out.write("                    <option value=\"สิงห์บุรี\">สิงห์บุรี </option>\n");
      out.write("                    <option value=\"สุโขทัย\">สุโขทัย </option>\n");
      out.write("                    <option value=\"สุพรรณบุรี\">สุพรรณบุรี </option>\n");
      out.write("                    <option value=\"สุราษฎร์ธานี\">สุราษฎร์ธานี </option>\n");
      out.write("                    <option value=\"สุรินทร์\">สุรินทร์ </option>\n");
      out.write("                    <option value=\"สตูล\">สตูล </option>\n");
      out.write("                    <option value=\"หนองคาย\">หนองคาย </option>\n");
      out.write("                    <option value=\"หนองบัวลำภู\">หนองบัวลำภู </option>\n");
      out.write("                    <option value=\"อำนาจเจริญ\">อำนาจเจริญ </option>\n");
      out.write("                    <option value=\"อุดรธานี\">อุดรธานี </option>\n");
      out.write("                    <option value=\"อุตรดิตถ์\">อุตรดิตถ์ </option>\n");
      out.write("                    <option value=\"อุทัยธานี\">อุทัยธานี </option>\n");
      out.write("                    <option value=\"อุบลราชธานี\">อุบลราชธานี</option>\n");
      out.write("                    <option value=\"อ่างทอง\">อ่างทอง </option>\n");
      out.write("                    <option value=\"อื่นๆ\">อื่นๆ</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    Address :\n");
      out.write("                </label>\n");
      out.write("                <textarea class=\"textreg\" name=\"address\" rows=\"5\" placeholder=\"address\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"regis\">\n");
      out.write("                <label class=\"labelreg\">\n");
      out.write("                    zipcode :\n");
      out.write("                </label>\n");
      out.write("                <input pattern=\"^[0-9]{5,5}$\"type=\"text\" class=\"textreg\" placeholder=\"zipcode\" name=\"zipcode\" maxlength=\"5\" />\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\"  class=\"button\" name=\"submitreg\" value=\"Register\" style=\"margin-left:250px; margin-top: 50px;\" />\n");
      out.write("                </fieldset>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("dokfah");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql:///dokfah");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("9999");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.username==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <form action=\"LoginServlet\" method=\"POST\">\n");
        out.write("                    <div class=\"menubox\">\n");
        out.write("                        <div class=\"menuhead\">\n");
        out.write("                            <h3>เข้าสู่ระบบ</h3>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"menucontent\">\n");
        out.write("                            <div class=\"label\">\n");
        out.write("                                <label style=\"float: left;\">username : </label>\n");
        out.write("                                <input type=\"text\" name=\"username\" class=\"textinput\" />\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"label\">\n");
        out.write("                                <label style=\"float: left;\">password : </label>\n");
        out.write("                                <input type=\"password\" name=\"password\" class=\"textinput\" />\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"label\" style=\"text-align: center; margin-right:10px\">\n");
        out.write("                                <input type=\"submit\" class=\"button\" value=\"Login\" />\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"label\" style=\"text-align: center; margin-right:10px\">\n");
        out.write("                                <a href=\"register.jsp\">สมัครสมาชิก</a> | <a hisf=\"forgot_pwd.html\">ลืมรหัสผ่าน</a>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"menubottom\">\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </form>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }
}
