package guru.springframework.myversionpetclinic.bootstrap;

import guru.springframework.myversionpetclinic.model.Owner;
import guru.springframework.myversionpetclinic.services.OwnerService;
import guru.springframework.myversionpetclinic.services.VetService;
import guru.springframework.myversionpetclinic.services.map.OwnerServiceMap;
import guru.springframework.myversionpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        System.out.println("Loaded Owners. . .");

    }
}
