package com.example.samucafialho.study_apir.dto;

public enum OrderStatus {
    ABERTO("Pedido Aberto"), 
    CANCELADO("Pedido cancelado"),
    ENTREGUE("Pedido Entregue");
    
        OrderStatus(String mensagem) {
            this.mensagem = mensagem;
        }

        private String mensagem;

        public String getMensagem() {
            return mensagem;
        }
}
