/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function tagtype(){
    
if(document.getElementById('type').value == 'manga' || document.getElementById('type').value == 'novel'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> คอเมดี้ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ดราม่า </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> โรแมนติค </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> เลิฟ-คอเมดี้ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> เแอคชั่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> แฟนตาซี </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> สืบสวนสอบสวน </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> สยอง </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> น่ากลัว </input>";
        document.getElementById('publisher').innerHTML = "<select name=\"publisher\">\n\
                            <option value=\"\">เลือกสำนักพิมพ์</option>\n\
                            <option value=\"siam\">สยามอินเตอร์คอมิค</option>\n\
                            <option value=\"luck\">ลัคพิมพ์</option>\n\
                            <option value=\"bongkoch\">บงกช</option>\n\
                            <option value=\"zenshu\">เซนชู</option>\n\
                            <option value=\"vibul\">วิบูลย์กิจ</option>\n\
                            <option value=\"animag\">อนิแม็ก</option>\n\
                        </select>";
    }else if(document.getElementById('type').value == 'etc.'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> เทคโนโลยี </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> วิทยาศาสตร์ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ศิลปะ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ภาษา </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> คณิตศาตร์ </input>";
    }
    else if(document.getElementById('type').value == 'magazine'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> ทำอาหาร </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> แฟชั่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> บ้านและเฟอร์นิเจอร์ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> วัยรุ่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> พระเครื่อง </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"genre\" value=\"IT\"> การ์ตูน </input><br>";
    }else{
        document.getElementById('tag').innerHTML = "";
        document.getElementById('publisher').innerHTML = "";
    }
        
}


