package ro.tuc.ds2020.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.tuc.ds2020.entities.Caregiver;
        import ro.tuc.ds2020.entities.Patient;

public interface CaregiverRepository extends JpaRepository<Caregiver, Integer> {
        Caregiver findByUsername(String username);
}
