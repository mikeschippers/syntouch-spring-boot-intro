package nl.syntouch.api.beerservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private UUID userId;

    @Max(5)
    @NotNull
    private Integer stars;

    private String description;
}
