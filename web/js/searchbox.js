/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function tagtype(){
    
if(document.getElementById('type').value == 'manga'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"comedy\"> คอเมดี้ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"drama\"> ดราม่า </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"romantic\"> โรแมนติค </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"lovecomedy\"> เลิฟ-คอเมดี้ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"action\"> เแอคชั่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"fantasy\"> แฟนตาซี </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"detective\"> สืบสวนสอบสวน </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"\"> สยอง </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"Horror\"> น่ากลัว </input>";
        document.getElementById('publisher').innerHTML = "<select name=\"publisher\">\n\
                            <option value=\"\">เลือกสำนักพิมพ์</option>\n\
                            <option value=\"siam\">สยามอินเตอร์คอมิค</option>\n\
                            <option value=\"luck\">ลัคพิมพ์</option>\n\
                            <option value=\"bongkoch\">บงกช</option>\n\
                            <option value=\"zenshu\">เซนชู</option>\n\
                            <option value=\"vibul\">วิบูลย์กิจ</option>\n\
                            <option value=\"animag\">อนิแม็ก</option>\n\
                        </select>";
    }else if(document.getElementById('type').value == 'novel'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"comedy\"> คอเมดี้ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"drama\"> ดราม่า </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"romantic\"> โรแมนติค </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"lovecomedy\"> เลิฟ-คอเมดี้ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"action\"> เแอคชั่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"fantasy\"> แฟนตาซี </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"detective\"> สืบสวนสอบสวน </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"\"> สยอง </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"Horror\"> น่ากลัว </input>";
                        document.getElementById('publisher').innerHTML = "<select name=\"publisher\">\n\
                            <option value=\"\">เลือกสำนักพิมพ์</option>\n\
                            <option value=\"siam\">สยามอินเตอร์คอมิค</option>\n\
                            <option value=\"luck\">ลัคพิมพ์</option>\n\
                            <option value=\"bongkoch\">บงกช</option>\n\
                            <option value=\"zenshu\">เซนชู</option>\n\
                            <option value=\"vibul\">วิบูลย์กิจ</option>\n\
                            <option value=\"animag\">อนิแม็ก</option>\n\
                        </select>";
    }
    else if(document.getElementById('type').value == 'etc.'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> เทคโนโลยี </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> วิทยาศาสตร์ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> ศิลปะ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> ภาษา </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> คณิตศาตร์ </input>";
    }
    else if(document.getElementById('type').value == 'magazine'){
        document.getElementById('tag').innerHTML = "หมวดหมู่ <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> ทำอาหาร </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> แฟชั่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> บ้านและเฟอร์นิเจอร์ </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> วัยรุ่น </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> พระเครื่อง </input>\n\
                        <br>\n\
                        <input type=\"checkbox\" name=\"tag\" value=\"IT\"> การ์ตูน </input><br>";
    }else{
        document.getElementById('tag').innerHTML = "";
        document.getElementById('publisher').innerHTML = "";
    }
        
}


