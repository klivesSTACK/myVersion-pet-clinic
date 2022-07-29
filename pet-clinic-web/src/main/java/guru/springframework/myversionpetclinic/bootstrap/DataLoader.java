package guru.springframework.myversionpetclinic.bootstrap;

import guru.springframework.myversionpetclinic.model.Owner;
import guru.springframework.myversionpetclinic.model.Vet;
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

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    /*    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }*/

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        ownerService.save(owner1);
        //System.out.println("Loaded Owners. . .");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        ownerService.save(owner2);
        System.out.println("Loaded Owners!");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("porter");
        vetService.save(vet2);

        System.out.println("Loaded Vets. . . .");
    }
}
