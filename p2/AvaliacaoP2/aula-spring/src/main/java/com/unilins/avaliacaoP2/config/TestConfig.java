package com.unilins.avaliacaoP2.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.ListCrudRepository;

import com.unilins.avaliacaoP2.entities.Alguel;
import com.unilins.avaliacaoP2.entities.Carro;
import com.unilins.avaliacaoP2.entities.Category;
import com.unilins.avaliacaoP2.entities.Cliente;
import com.unilins.avaliacaoP2.entities.OrderItem;
import com.unilins.avaliacaoP2.entities.Payment;
import com.unilins.avaliacaoP2.entities.enums.OrderStatus;
import com.unilins.avaliacaoP2.entities.pk.OrderItemPK;
import com.unilins.avaliacaoP2.repositories.AluguelRepository;
import com.unilins.avaliacaoP2.repositories.CarroRepository;
import com.unilins.avaliacaoP2.repositories.CategoryRepository;
import com.unilins.avaliacaoP2.repositories.ClienteRepository;
import com.unilins.avaliacaoP2.repositories.OrderItemRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	public ClienteRepository userRep;


	@Autowired
	public OrderItemRepository orderItemRepository;
	
	@Autowired
	public CarroRepository CarroRep;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Cliente c2 = new Cliente(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		userRep.saveAll(Arrays.asList(c1, c2));



		Alguel o1 = new Alguel(null, c1, "06/12/2023","25/12/2023", 150.00);


		Carro p1 = new Carro(null, "Volkswagem", "Jetta", "123456", 150.00);
		CarroRep.saveAll(Arrays.asList(p1));
		
		ListCrudRepository<OrderItem, OrderItemPK> orderRep;
		
		OrderItem oi1 = new OrderItem(o1, p1, "25/08/2023","26/12/2025", p1.getValorDiaria());
		orderItemRepository.saveAll(Arrays.asList(oi1));
		
		orderRep.saveAll(Arrays.asList(o1));


	}

}
