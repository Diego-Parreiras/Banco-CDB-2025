package br.com.bancodigital.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransferenciaTedRequest {
    private Long idOrigem;
    private Long agenciaDestino;
    private Long numeroContaDestino;
    private double valor;
    private Long senha;

}
