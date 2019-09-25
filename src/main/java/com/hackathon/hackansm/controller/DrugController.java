package com.hackathon.hackansm.controller;

import com.hackathon.hackansm.dao.DrugDao;
import com.hackathon.hackansm.model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrugController {

    @Autowired
    private DrugDao drugDao;
    //Drugs
    @GetMapping(value = "Drugs")
    public List<Drug> listDrugs(){
        return drugDao.findAll();
    }

    //Drugs/{id}
    @GetMapping(value = "Drugs/{id}")
    public Drug displayDrug(@PathVariable int id){
        Drug drug = new Drug(id, new String("doliprane"), new String("douleurs et fièvre"));
        return drug;
    }
}
