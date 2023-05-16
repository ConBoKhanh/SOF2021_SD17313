package su23b1.tiennh21.sd17313.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import viewModel.CuaHang;
import java.util.ArrayList;


@Controller
public class CuaHangController {
    private ArrayList<CuaHang> list = new ArrayList<>();

    @GetMapping("index")
    public String index(){
        return "index";
    }
//    create
    @GetMapping("create")
    public String create(){
        return "create";
    }

    @PostMapping("store")
    public String store(
//            @RequestParam("ma") String ma,
//            @RequestParam("ten") String ten,
//            @RequestParam("diaChi") String diaChi,
//            @RequestParam("thanhPho") String thanhPho,
//            @RequestParam("quocGia") String quocGia
    ){
        return "store";
    }
// update
    @GetMapping("edit")
    public String edit(){
        return "edit";
    }

    @PostMapping("update")
    public String update(
//            @RequestParam("ma") String ma,
//            @RequestParam("ten") String ten,
//            @RequestParam("diaChi") String diaChi,
//            @RequestParam("thanhPho") String thanhPho,
//            @RequestParam("quocGia") String quocGia
    ){
        return "upadte";
    }
// delete
    @GetMapping("delete")
    public String delete(){
        return "delete";
    }


}
