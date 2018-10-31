package com.infotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.infotech.model.Account;
import com.infotech.service.impl.AccountService;
import com.infotech.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAopApplication.class, args);
		AccountService accountService = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		accountService.updateAccountBalance(new Account("67788888861", "Money tranfer"), 3000L);
	}
}
