package br.com.dafiti.correlationid.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Foo implements Message {

    private String foo;

    private String bar;
}
