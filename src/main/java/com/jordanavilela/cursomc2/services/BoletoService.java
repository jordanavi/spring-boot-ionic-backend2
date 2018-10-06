package com.jordanavilela.cursomc2.services;

import java.util.Date;
import java.util.Calendar;

import org.springframework.stereotype.Service;

import com.jordanavilela.cursomc2.domain.PagamentoComBoleto;

@Service
public class BoletoService {
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
