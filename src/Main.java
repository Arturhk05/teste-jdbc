import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        SellerDao sellerDao = DaoFactory.createSellerDao();
//
//        System.out.println("==== Test 1: seller findById ====");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("==== Test 2: seller findByDepartment ====");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        for (Seller obf : list) {
//            System.out.println(obf);
//        }
//
//        System.out.println("==== Test 3: seller findAll ====");
//        list = sellerDao.findAll();
//        for (Seller obf : list) {
//            System.out.println(obf);
//        }
//
//        System.out.println("==== Test 4: seller insert ====");
//        Seller newSeller = new Seller("Greg", "greg@gmail.com", new Date(), 4000.00, department);
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id = " + newSeller.getId());
//
//        System.out.println("==== Test 5: seller update ====");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Waine");
//        sellerDao.update(seller);
//        System.out.println("Updated!");
//
//        System.out.println("==== Test 6: seller delete ====");
//        System.out.println("Enter id for delete test: ");
//        int id = sc.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Deleted");
//
//        sc.close();

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Test 1: department findAll ====");
        departmentDao.findAll().forEach(System.out::println);

        System.out.println("==== Test 2: department findById ====");
        System.out.println((departmentDao.findById(1)));

        System.out.println("==== Test 3: department insert ====");
        Department department = new Department(null, "Nada");
        departmentDao.insert(department);
        System.out.println("Inserted!");

        System.out.println("==== Test 4: department update ====");
        department = departmentDao.findById(1);
        department.setName("Troca");
        departmentDao.update(department);
        System.out.println("Updated!");

        System.out.println("==== Test 5: department delete ====");
        departmentDao.deleteById(7);
        System.out.println("Deleted!");
    }
}