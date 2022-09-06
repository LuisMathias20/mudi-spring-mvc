package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Notebook Lenovo");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51GqHrxFv2S._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Notebook-ideapad-i5-10300H-256GBSSD-82CGS00100/dp/B0945D7C9T?ref_=Oct_d_obs_d_16364755011&pd_rd_w=7JWO3&content-id=amzn1.sym.574d7dde-c8d1-436d-a7fc-f2654a8c3190&pf_rd_p=574d7dde-c8d1-436d-a7fc-f2654a8c3190&pf_rd_r=YANFEBTP10JJN20PWXSC&pd_rd_wg=JpMC3&pd_rd_r=b30dac0a-3e60-41a5-9647-72cce6b28a49&pd_rd_i=B0945D7C9T");
		pedido.setDescricao("Silencioso e não esquenta: projetado com um sistema de resfriamento otimizado composto por 2 coolers e 4 saídas de ar para suportar o alto desempenho do notebook");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
