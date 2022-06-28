package guru.springframework.myversionpetclinic.services;

import guru.springframework.myversionpetclinic.model.Owner;
import guru.springframework.myversionpetclinic.model.Pet;
import guru.springframework.myversionpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save (Owner owner);

    Set<Vet> findAll();
}
