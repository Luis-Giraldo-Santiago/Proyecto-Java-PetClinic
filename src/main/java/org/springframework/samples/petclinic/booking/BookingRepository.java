package org.springframework.samples.petclinic.booking;

import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
    
}
