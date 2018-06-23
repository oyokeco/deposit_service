package cn.oyo.deposit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by oyo on 2018/6/23.
 */
@RestController
@RequestMapping("/deposit")
public class DepositController {

    /**
     * 充值押金
     * @return
     */
    @RequestMapping("/topup")
    String topUp() {
        return "充押金完成";
    }

    /**
     * 退押金
     * @return
     */
    @RequestMapping("/refund")
    String refund() {
        return "退押金完成";
    }


    /**
     * 查看押金
     * @return
     */
    @RequestMapping("/show")
    String show() {
        return "查看押金完成";
    }


    /**
     * 调整押金
     * @return
     */
    @RequestMapping("/adjust")
    String adjust() {
        return "调整押金完成";
    }

}
