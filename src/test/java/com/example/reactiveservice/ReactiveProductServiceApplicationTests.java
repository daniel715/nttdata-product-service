package com.example.reactiveservice;

import com.nttdata.productservice.model.Product;
import com.nttdata.productservice.repository.ProductMongoRepository;
import com.nttdata.productservice.service.impl.ProductService;
import io.reactivex.rxjava3.core.Single;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Flux;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ClientServiceTest {

    private ProductService productService;

    @Mock
    private ProductMongoRepository productMongoRepository;

    @BeforeEach
    void setUp() {
        productService = new ProductService(productMongoRepository);
    }
//
//    @Test
//    @DisplayName("Test de encontrar producto por id")
//    public void testFindClientById() {
//        Product expected = new Product("1", "cuentas",new BigDecimal("354.5"), "soles", new BigDecimal(1000), true, "98741185158742", "1"  );
//
////        Mockito.when(productMongoRepository.findById(Mockito.anyString()) ).thenReturn(Single.just(new Product("1", "cuentas",new BigDecimal("354.5"), "soles", new BigDecimal(1000), true, "98741185158742", "1"  )));
//
//        Single<Product> response = productService.findById("1");
//
////        Assertions.assertEquals(expected.getId(),response.test().getId());
////        Assertions.assertEquals(expected.getName(),response.block().getName());
//
//
//        verify(productMongoRepository, times(1)).findById(Mockito.anyString());
//
//    }

//    @Test
//    @DisplayName("Test for obtener todos from clientes")
//    public void testFindAll() {
//        ArrayList<Product> expected = new ArrayList<>();
//        expected.add(new Product("1", "cuentas",new BigDecimal("354.5"), "soles", new BigDecimal(1000), true, "98741185158742", "1"  ));
//        expected.add(new Product("2", "cuentas",new BigDecimal("354.5"), "soles", new BigDecimal(1000), true, "98741185158742", "1"  ));
//
//
//        ArrayList<Product> clientsData = new ArrayList<>();
//        clientsData.add(new Product("1", "cuentas",new BigDecimal("354.5"), "soles", new BigDecimal(1000), true, "98741185158742", "1"  ));
//        clientsData.add(new Product("2", "cuentas",new BigDecimal("354.5"), "soles", new BigDecimal(1000), true, "98741185158742", "1"  ));
//
//        Flux<Product> clients = Flux.fromIterable(clientsData);

//        Mockito.when(productMongoRepository.findAll()).thenReturn(clients);

//        Flux<Product> actual = productService.list();


//    }


//    @Test
//    @DisplayName("Test de guardar client")
//    public void testSave() {
//        Client expected = new Client("1", "Daniel", "Montellanos", "email", "pass",
//                "createdAt", "address", "city", "country", "telephone");
//
//        Mockito.when( clientMongoRepository.insert((Client) Mockito.any()))
//                .thenReturn( Mono.just(new Client("1", "Daniel", "Montellanos", "email", "pass",
//                        "createdAt", "address", "city", "country", "telephone")) );
//
//        Mono<Client> actual = clientService.saveClient(Mono.just(new Client("1", "Daniel", "Montellanos", "email", "pass",
//                "createdAt", "address", "city", "country", "telephone")));
//
//        Assertions.assertEquals(expected.getId(),actual.block().getId());
//        Assertions.assertEquals(expected.getName(),actual.block().getName());
//        Assertions.assertEquals(expected.getLastname(),actual.block().getLastname());
//        Assertions.assertEquals(expected.getEmail(),actual.block().getEmail());
//        Assertions.assertEquals(expected.getPassword(),actual.block().getPassword());
//        Assertions.assertEquals(expected.getCreatedAt(),actual.block().getCreatedAt());
//        Assertions.assertEquals(expected.getAddress(),actual.block().getAddress());
//        Assertions.assertEquals(expected.getCity(),actual.block().getCity());
//        Assertions.assertEquals(expected.getCountry(),actual.block().getCountry());
//        Assertions.assertEquals(expected.getTelephone(),actual.block().getTelephone());
//    }
//    @Test
//    @DisplayName("Test de borrar un cliente por id")
//    public void testDeleteByIdReturnTrue() {
//
//        String id = "1";
//        when(clientMongoRepository.deleteById(id)).thenReturn(Mono.empty());
//        clientService.deleteClient(id);
//        verify(clientMongoRepository,times(1)).deleteById(id);
//
//    }
}
