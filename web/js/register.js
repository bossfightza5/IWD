function regvalidate(){
        if(document.register.username.value==""){
        alert("กรุณาใส่ชื่อผู้ใช้งานให้ถูกต้อง");
        return(false);
    }
	else if(document.register.password.value==""){
        alert("กรุณาใส่รหัสผ่าน");
        return(false);
    }
    else if(document.register.confirm.value==""){
        alert("กรุณายืนยันรหัสผ่าน");
        return(false);
    }
    else if(document.register.email.value==""){
        alert("กรุณาใส่อีเมลล์");
        return(false);
    }
    else if(document.register.fname.value==""){
        alert("กรุณาใส่ชื่อ");
        return(false);
    }
    else if(document.register.lname.value==""){
        alert("กรุณาใส่นามสกุล");
        return(false);
    }
    else{
        return(true);
    }
}