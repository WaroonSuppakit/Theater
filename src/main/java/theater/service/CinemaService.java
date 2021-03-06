package theater.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import theater.model.Cinema;
import theater.repository.CinemaRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> getALl(){
        return cinemaRepository.findAll();
    }

    public Cinema getCinema(UUID id){
        return cinemaRepository.findById(id).get();
    }

    public Cinema create(Cinema cinema){
        cinemaRepository.save(cinema);
        return cinema;
    }

    public Cinema delete(UUID id){
        Cinema record = cinemaRepository.findById(id).get();
        cinemaRepository.deleteById(id);
        return record;
    }
}
