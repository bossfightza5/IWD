/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author Amoeba
 */
@WebServlet(name = "AddBookServlet", urlPatterns = {"/add"})
public class AddBookServlet extends HttpServlet {

    @Resource(name = "dokfah")
    private DataSource dokfah;
    Connection connection;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    public void init(){
        try{
            connection = dokfah.getConnection();
        }catch (SQLException sqle){
            System.out.println(""+sqle);
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try{
                Statement stmt = connection.createStatement();;
                ResultSet rs;
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("name");
            String number = request.getParameter("number");
            String describe = request.getParameter("describe");
            String type = request.getParameter("type");
            float price = Float.parseFloat(request.getParameter("price"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            String picture = request.getParameter("picture");
            String book_id;
            String tag = "";
            String[] tag2 = request.getParameterValues("tag");
            for(int i=0;i<tag2.length;i++){
                tag += tag2[i];
                if(i != (tag2.length)-1)
                    tag += ", ";
            }          
            rs = stmt.executeQuery("SELECT book_id from books WHERE book_name LIKE '%"+name+" %' ORDER BY update_date DESC");
            if(rs.next()){
            book_id = Integer.toString(Integer.parseInt(rs.getString("book_id"))+1);
            }else{
                rs = stmt.executeQuery("SELECT book_id from books WHERE type ='"+type+"' ORDER BY book_id DESC");
                rs.next();
            book_id = Integer.toString(Integer.parseInt(rs.getString("book_id").substring(0, 5))+1)+"001";
            }
            name += " "+number;
            
            out.println(name+"<br>"+"<br>"+number+"<br>"+describe+"<br>"+type+"<br>"+price+"<br>"+quantity+"<br>"+picture+"<br>"+tag+"<br>"+book_id);
            
        }}catch (SQLException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
