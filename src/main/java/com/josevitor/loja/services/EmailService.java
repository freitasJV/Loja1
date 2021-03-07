package com.josevitor.loja.services;

import org.springframework.mail.SimpleMailMessage;

import com.josevitor.loja.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
