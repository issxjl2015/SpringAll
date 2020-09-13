package com.springboot.controller;


import com.springboot.bean.issxjlbean.IssxjlConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssxjlContraller {

    @Autowired
    IssxjlConfigBean issxjlConfigBean;

    public String getIssxjlGitInfo() {
        return issxjlConfigBean.getName() + " + " + issxjlConfigBean.getContext();
    }
}
