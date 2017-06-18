package com.permispiste.controller;

import com.permispiste.dao.TraineeDAO;
import com.permispiste.model.ApprenantEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by JOYMANGUL Jensen Selwyn
 * on 6/17/2017.
 */
@Controller
public class TraineeController {
    @RequestMapping(value = "/apprenants", method = RequestMethod.GET)
    public ModelAndView Afficheindex2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TraineeDAO traineeDAO = new TraineeDAO();
        List trainees = traineeDAO.findAll();
        request.setAttribute("trainees", trainees);
        return new ModelAndView("trainees/view");
    }
}
