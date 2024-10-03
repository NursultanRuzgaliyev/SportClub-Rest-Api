package kz.ruzgaliyev.Sportclub.controllers;

import kz.ruzgaliyev.Sportclub.entities.Admin;
import kz.ruzgaliyev.Sportclub.service.AdminService;
import kz.ruzgaliyev.Sportclub.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }
    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Long id){
        return adminService.getAdminById(id);
    }
    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin){
        return adminService.createAdmin(admin);
    }
    @PutMapping
    public Admin updateAdmin(@PathVariable Long id,@RequestBody Admin admin){
        return adminService.updateAdmin(admin);
    }
    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id){
        adminService.deleteAdmin(id);
    }
}
