package DatabaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class DatabaseRepository {
    @Id
    Integer ID;

}
