package main.java.com.thehecklers.sburrestdemo.controller;

import com.thehecklers.sburrestdemo.entity.model.Coffee;
import com.thehecklers.sburrestdemo.repository.CoffeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.beans.ConstructorProperties;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coffees")
class RestApiDemoController {
	private List<Coffee> coffees = new ArrayList<>();

	public RestApiDemoController() {
		coffees.addAll(List.of(
				new Coffee("Café 3 coracoes"),
				new Coffee("Café pilao"),
				new Coffee("Café arabico"),
				new Coffee("Café pingado")
		));
	}

    @postmapping
    @Operation(summary = "Listar todos os cafés")
    public List<Coffee> getCoffees() {
        return coffeeService.listarCoffees();
    }

    @postmapping
    @operation(summary = "Adicionar um café")

    @ApiResponses(value = {@ApiResponse(responseCode = "201"),@ApiResponse(responseCode = "400")})
    public ResponseEntity<Coffee> addCoffee(@RequestBody Coffee coffee) {
        Coffee novoCoffee = new Coffe();
        novoCoffee.setName(coffee.getName());

        coffeService.adicionarCoffee(novoCoffee);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCoffee);
    }


    @GetMapping ("/{id}")
    @Operation(summary = "Listar todos os cafés pelo id")
    public ResponseEntity<Coffee> getCoffeePorId(@PathVariable String id) {
        return ResponseEntity.of(coffeeService.obterCoffeePorId(id));
    }

}
