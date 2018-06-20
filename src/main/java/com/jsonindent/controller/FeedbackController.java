package com.jsonindent.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jsonindent.entity.Feedback;
import com.jsonindent.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vkamble on 04/06/18.
 */
@CrossOrigin
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    FeedbackRepository feedbackRepository;

    @RequestMapping(path="/add",method = RequestMethod.POST)
    public @ResponseBody String addFeedback(@RequestParam String name,@RequestParam String email,@RequestParam String message) {

        try {

            Feedback feedback = new Feedback();
            feedback.setName(name);
            feedback.setEmail(email);
            feedback.setMessage(message);
            feedback.setDate(new Date());
            feedbackRepository.save(feedback);
            return "Saved";
        } catch (Exception e)
        {
            return "Error";
        }
    }
}
