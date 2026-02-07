package edu.comillas.icai.gitt.pat.spring.practica2.Controlador;

import edu.comillas.icai.gitt.pat.spring.practica2.modelo.Carrito;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collection;

@RestController
public class CarritoControlador {
    private final Map<Integer, Carrito> carritos = new HashMap<>();

    @PostMapping("/api/carrito")
    @ResponseStatus(HttpStatus.CREATED)
    public Carrito creaCarrito(@RequestBody Carrito carrito) {
        carritos.put(carrito.getIdCarrito(), carrito);
        return carrito;
    }

    @GetMapping("/api/carrito")
    public Collection<Carrito> getCarritos() {

        return carritos.values();
    }

    @GetMapping("/api/carrito/{idCarrito}")
    public Carrito getCarrito(@PathVariable int idCarrito) {
        return carritos.get(idCarrito);
    }

    @DeleteMapping("/api/carrito/{idCarrito}")
    public Carrito borrarCarrito(@PathVariable int idCarrito) {
            carritos.remove(idCarrito);
    }

}



//
//        @PutMapping("/api/contadores/{nombre}/incremento/{incremento}")
//        public ModeloContador incrementa(@PathVariable String nombre,
//                                         @PathVariable Integer incremento) {
//            ModeloContador contadorActual = contadores.get(nombre);
//            ModeloContador contadorIncrementado =
//                    new ModeloContador(nombre, contadorActual.valor() + incremento);
//            contadores.put(nombre, contadorIncrementado);
//            return contadorIncrementado;
//        }
//    }
//

