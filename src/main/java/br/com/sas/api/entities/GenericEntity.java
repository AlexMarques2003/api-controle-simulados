package br.com.sas.api.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class GenericEntity implements Serializable {

    private static final long serialVersionUID = -7151752934351698766L;

}
