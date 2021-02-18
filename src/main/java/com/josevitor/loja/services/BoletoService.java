package com.josevitor.loja.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.josevitor.loja.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPeido) {
		Calendar cal = 	Calendar.getInstance();
		cal.setTime(instanteDoPeido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
