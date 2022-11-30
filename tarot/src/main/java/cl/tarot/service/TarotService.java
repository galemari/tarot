package cl.tarot.service;

import cl.tarot.entity.Cliente;
import cl.tarot.entity.Reserva;
import cl.tarot.entity.Tarotista;
import cl.tarot.exception.TarotException;
import cl.tarot.repository.ClienteRepository;
import cl.tarot.repository.ReservaRepository;
import cl.tarot.repository.TarotistaRepository;
import cl.tarot.vo.ReservaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TarotService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private TarotistaRepository tarotistaRepository;
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva crearReserva(ReservaRequest request){
        // convertir peticion en objeto reserva
        // verificar si el id de cliente es válido
        Optional<Cliente> optionalCliente = clienteRepository.findById(request.getIdCliente());
        if (!optionalCliente.isPresent()){
            throw new TarotException("No se encontró el cliente id : " + request.getIdCliente());
        }
        Cliente cliente = optionalCliente.get();

        // verificar si el id de tarotista es válido
        Optional<Tarotista> optionalTarotista = tarotistaRepository.findById(request.getIdTarotista());
        if (!optionalTarotista.isPresent()){
            throw new TarotException("No se encontró el tarotista id : " + request.getIdTarotista());
        }
        Tarotista tarotista = optionalTarotista.get();

        LocalDateTime fechaReserva = LocalDateTime.parse(request.getFechaReserva());

        // AQUI SE PUEDEN AGREGAR MAS VALIDACIONES
        Reserva reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setTarotista(tarotista);
        reserva.setHorariosDisponibles(fechaReserva);

        reserva = reservaRepository.save(reserva);

        return reserva;
    }
}
