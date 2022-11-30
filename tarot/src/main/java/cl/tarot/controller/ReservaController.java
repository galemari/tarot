package cl.tarot.controller;

import cl.tarot.entity.Reserva;
import cl.tarot.service.TarotService;
import cl.tarot.vo.ReservaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {
    @Autowired
    private TarotService service;

    @PostMapping("/reserva")
    public Reserva crear(@RequestBody ReservaRequest request){
        return service.crearReserva(request);
    }
}
