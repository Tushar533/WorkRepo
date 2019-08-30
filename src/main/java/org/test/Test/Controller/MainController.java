package org.test.Test.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.test.Test.Beans.TermDepositsRequestBean;

@RestController
@RequestMapping("v1/test")
public class MainController {

    @PostMapping("/term-deposits")
    public void GetUser(@RequestBody TermDepositsRequestBean bean){

        System.out.println("mapped request----"+bean.getFundingAccountDetails().getAmount());
        System.out.println("mapped request----"+bean.getFundingAccountDetails().getCurrency());
    }

}
