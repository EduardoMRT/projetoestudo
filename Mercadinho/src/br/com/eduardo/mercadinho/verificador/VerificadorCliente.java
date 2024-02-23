package br.com.eduardo.mercadinho.verificador;

import br.com.eduardo.mercadinho.util.Cliente;

public class VerificadorCliente {
    public String verificaIdade(Cliente cliente) {
        int idade = cliente.getIdade();
        if (idade < 18) {
            return "O cliente é menor de idade";
        } else {
            return "O cliente é maior de idade";
        }
    }
}
