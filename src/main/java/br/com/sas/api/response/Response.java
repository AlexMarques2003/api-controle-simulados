package br.com.sas.api.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Response<T> {

    private T data;
    private List<String> errors;

}
