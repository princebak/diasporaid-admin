package com.kindev.diasporaidadmin.service.implementation;

import com.kindev.diasporaidadmin.model.Person;
import com.kindev.diasporaidadmin.model.Registration;
import com.kindev.diasporaidadmin.service.RegistrationService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    private List<Registration> registrations = Arrays.asList(
            new Registration( UUID.randomUUID().toString(), new Date(),
                    new Person( "patrick", "ilunga", "mbuyi", "26/03/2021", "M" ), // concerned
                    new Person( "marth", "kitoko", "malangu", "20/01/2021", "F" ), // mother
                    new Person( "jhon", "ilunga", "mutombo", "05/03/2021","M" ), // father
                    Arrays.asList( new Person("lila", "ilunga", "kitoko", "05/03/2021","F" ),
                            new Person("benjammin", "ilunga", "tambwe", "05/03/2021","F")), // children
                    Arrays.asList("pic1","pic2","pic3","pic4") ),
            new Registration( UUID.randomUUID().toString(), new Date(),
                    new Person( "sharon", "douglas", "mbuyi", "26/03/2021", "M" ), // concerned
                    new Person( "mimi", "ndaya", "malangu", "20/01/2021", "F" ), // mother
                    new Person( "carlos", "ilunga", "mutombo", "05/03/2021","M" ), // father
                    Arrays.asList( new Person("lila", "ilunga", "kitoko", "05/03/2021","F" )), // children
                    Arrays.asList("pic1","pic2","pic3","pic4") ),
            new Registration( UUID.randomUUID().toString(), new Date(),
                    new Person( "juliana", "makusu", "liyota", "26/03/2021", "M" ), // concerned
                    new Person( "gemima", "kitoko", "malangu", "20/01/2021", "F" ), // mother
                    new Person( "martin", "liyota", "liyota", "05/03/2021","M" ), // father
                    new ArrayList<>(), // children
                    Arrays.asList("pic1","pic2","pic3","pic4") ),
            new Registration( UUID.randomUUID().toString(), new Date(),
                    new Person( "eunice", "omoyi", "mbuyi", "26/03/2021", "F" ), // concerned
                    new Person( "dorcas", "kiala", "lokola", "20/01/2021", "F" ), // mother
                    new Person( "pierre", "omoyi", "mpia", "05/03/2021","M" ), // father
                    Arrays.asList( new Person("lucie", "lusamba", "tambwe", "05/03/2021","F") ), // children
                    Arrays.asList("pic1","pic2","pic3","pic4") ),
            new Registration( UUID.randomUUID().toString(), new Date(),
                    new Person( "paul", "ilunga", "mbuyi", "26/03/2021", "M" ), // concerned
                    new Person( "olive", "kitoko", "malangu", "20/01/2021", "F" ), // mother
                    new Person( "gerard", "ilunga", "mutombo", "05/03/2021","M" ), // father
                    new ArrayList<>(), // children
                    Arrays.asList("pic1","pic2","pic3","pic4") )
    );

    @Override
    public Registration findRegistrationById() {
        return registrations.stream().filter( registration -> registration.getId().equalsIgnoreCase( registration.getId() ) ).findFirst().orElse( null );
    }

    @Override
    public List<Registration> findAllRegistration() {
        return registrations;
    }
}
