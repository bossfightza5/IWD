package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/structure.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
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
      out.write("        <title>JSP Page</title>\n");
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
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
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
      out.write("                        <li><a href=\"how_to_buy.jsp\n");
      out.write("                               \">วิธีการสั่งซื้อ<span></span></a></li>\n");
      out.write("                        <li><a href=\"product.jsp\">สินค้าทั้งหมด</a></li>\n");
      out.write("                        <li><a href=\"register.jsp\">สมัครสมาชิก</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"confirm_transaction.jsp\n");
      out.write("                               \">แจ้งโอนเงิน</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\n");
      out.write("                               \">ติดต่อ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"l_cont\">\n");
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
              out.write("                        <img src=\"img/icon/user.png\" height=\"17\" width=\"17\"><a href=\"profile.jsp\n");
              out.write("                                                                               \">ข้อมูลสมาชิก</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/cart.png\" height=\"17\" width=\"17\"><a href=\"cart.jsp\n");
              out.write("                                                                               \">ตะกร้าสินค้า</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/bill.png\" height=\"17\" width=\"17\"><a href=\"history.jsp\n");
              out.write("                                                                               \">ประวัติการสั่งซื้อ</a>\n");
              out.write("                    </ul>\n");
              out.write("                    <ul>\n");
              out.write("                        <img src=\"img/icon/pay.png\" height=\"17\" width=\"17\"><a href=\"report_transter.jsp\n");
              out.write("                                                                              \">แจ้งโอนเงิน</a>\n");
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
      out.write("                        \n");
      out.write("                        <div class=\"label\">\n");
      out.write("                           \n");
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
      out.write("                            \n");
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
      out.write("            <div class=\"r_cont\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 session.setAttribute("book_id", request.getParameter("category"));
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
        out.write("                                <a href=\"register.jsp\">สมัครสมาชิก</a> | <a hisf=\"forgot_pwdjsp\n");
        out.write("                                                                            \">ลืมรหัสผ่าน</a>\n");
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

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("result");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dokfah}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("                    SELECT * FROM books WHERE book_id = \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${book_id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\";\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.getRowCount()!=0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    <div id=\"product\">\n");
        out.write("                        <div class=\"menuhead\">\n");
        out.write("                            <h4>เล่มอื่นๆ</h4>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"bookcont\">\n");
        out.write("                            <div id=\"productitem\">\n");
        out.write("                                <div id=\"producthumbimg\">\n");
        out.write("                                    <a href=\"\"> <img src=\"img/manga/Citrus2.jpg\" width=\"130px\" height=\"170px\" /></a>\n");
        out.write("                                </div>\n");
        out.write("                                <div id=\"describe\">\n");
        out.write("                                    <a href=\"\">\n");
        out.write("                                        <p>Citrus2</p>\n");
        out.write("                                    </a>\n");
        out.write("                                    <p>ราคา 55 บาท</p>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"label\" style=\"text-align: center;\">\n");
        out.write("                                    <input type=\"submit\" class=\"incart\" value=\"หยิบใส่ตะกร้า\" />\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                            <div id=\"productitem\">\n");
        out.write("                                <div id=\"producthumbimg\">\n");
        out.write("                                    <a href=\"\"> <img src=\"img/manga/Citrus3.jpg\" width=\"130px\" height=\"170px\" /></a>\n");
        out.write("                                </div>\n");
        out.write("                                <div id=\"describe\">\n");
        out.write("                                    <a href=\"\">\n");
        out.write("                                        <p>Citrus3</p>\n");
        out.write("                                    </a>\n");
        out.write("                                    <p>ราคา 60 บาท</p>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"label\" style=\"text-align: center;\">\n");
        out.write("                                    <input type=\"submit\" class=\"incart\" value=\"หยิบใส่ตะกร้า\" />\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                            <div id=\"productitem\">\n");
        out.write("                                <div id=\"producthumbimg\">\n");
        out.write("                                    <a href=\"\"> <img src=\"img/manga/Citrus4.jpg\" width=\"130px\" height=\"170px\" /></a>\n");
        out.write("                                </div>\n");
        out.write("                                <div id=\"describe\">\n");
        out.write("                                    <a href=\"\">\n");
        out.write("                                        <p>Citrus4</p>\n");
        out.write("                                    </a>\n");
        out.write("                                    <p>ราคา 65 บาท</p>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"label\" style=\"text-align: center;\">\n");
        out.write("                                    <input type=\"submit\" class=\"incart\" value=\"หยิบใส่ตะกร้า\" />\n");
        out.write("                                </div>\n");
        out.write("                            </div>                        \n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_0.setVar("books");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"book_header\">\n");
          out.write("                        <h1>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books.book_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h1>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"bookcont\">\n");
          out.write("                        <div class=\"bookpicture\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books.picture}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"300px\" height=\"400px\" />\n");
          out.write("                        </div>          \n");
          out.write("                        <div class=\"aboutbook\">\n");
          out.write("                            <label>\n");
          out.write("                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books.book_describe}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                            </label>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"bookdetail\">\n");
          out.write("                            <table class=\"detail_table\">\n");
          out.write("                                <div class=\"menuhead\"><h3><strong>รายละเอียดหนังสือ</strong></h3></div>\n");
          out.write("                                <tbody>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td class=left>ชื่อผู้แต่ง</td>\n");
          out.write("                                        <td>: ซาบูโรยูตะ</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td class=left>แนว</td>\n");
          out.write("                                        <td>: ยูริ, ดราม่า</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td class=\"left\">ราคา</td>\n");
          out.write("                                        <td>: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" บาท</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td class=\"left\">น้ำหนัก</td>\n");
          out.write("                                        <td>: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books.weight}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("0 กรัม</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td class=\"left\">สำนักพิมพ์</td>\n");
          out.write("                                        <td>: เซนชู</td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </tbody>\n");
          out.write("                            </table>\n");
          out.write("                        </div>\n");
          out.write("                        <div style=\"width:750px; overflow: hidden; padding-top:10px; text-align: left;\">\n");
          out.write("                            <input type=\"submit\" class=\"incart\" value=\"หยิบใส่ตะกร้า\" />\n");
          out.write("                        </div>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        ไม่พบหน้าที่คุณเลือก\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }
}
