package com.Customer.Controller;

/**
 * PROJECT_NAME UserRegistry
 *
 * @author Alliance github_https://github.com/AllianceTing
 * DATE 2023/1/29~22:28
 */
//@RestController
//@RequestMapping(value = "/registry")
//public class UserRegistry {
//    @Resource
//    RegistryMailService registryMailService;
//    @Resource
//    JavaMailSender javaMailSender;
//
//    @PostMapping("/mailRegistry")
//    public void registryUserByMail(MailVo mailVo) {
//        registryMailService.registryMail(mailVo);
//    }
//
//    @PostMapping("/mailRegistry1")
//    public Object registryUserByMail1(@RequestBody MailVo mailVo) {
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setFrom(mailVo.getFrom());
//        simpleMailMessage.setSubject(mailVo.getObject());
//        simpleMailMessage.setTo(mailVo.getTarget());
//        simpleMailMessage.setText(mailVo.getContent());
//        System.out.println(1);
//        try {
//            javaMailSender.send(simpleMailMessage);
//        } catch (MailException e) {
//            e.printStackTrace();
//        }
//        return 1;
//    }
//}


