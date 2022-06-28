package guru.springframework.myversionpetclinic.services;

import guru.springframework.myversionpetclinic.model.Owner;
import guru.springframework.myversionpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Owner owner);

    Set<Pet> findAll();

}
