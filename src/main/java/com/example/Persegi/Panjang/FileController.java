
package com.example.Persegi.Panjang;

import java.text.DecimalFormat;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FileController {
    
    @RequestMapping("/hasil")
    public String getHasil (Model model, HttpServletRequest param){
        String Panjang = param.getParameter("panjang");
        String Lebar = param.getParameter("lebar");
        double luas, keliling;
        double p = Double.parseDouble(Panjang);
        double l = Double.parseDouble(Lebar);
        
        luas = p * l;
        keliling = p + l * 2;
        
        DecimalFormat df = new DecimalFormat ("#.##");
        model.addAttribute("Lebar", Lebar);
        model.addAttribute("Panjang", Panjang);
        model.addAttribute("Luas", luas);
        model.addAttribute("Keliling", df.format(keliling));
        
        return "index";
    }   
}
