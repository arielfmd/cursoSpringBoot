package com.udemy.cursoSpringBoot.services;

import com.udemy.cursoSpringBoot.domain.Pedido;

import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
