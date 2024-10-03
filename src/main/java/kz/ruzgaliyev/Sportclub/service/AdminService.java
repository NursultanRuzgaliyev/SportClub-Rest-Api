package kz.ruzgaliyev.Sportclub.service;

import kz.ruzgaliyev.Sportclub.entities.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAllAdmins();
    Admin getAdminById(Long id);
    Admin createAdmin(Admin admin);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(Long id);

}
