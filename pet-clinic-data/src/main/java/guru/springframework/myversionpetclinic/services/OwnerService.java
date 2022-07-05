package guru.springframework.myversionpetclinic.services;

import guru.springframework.myversionpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);


}
