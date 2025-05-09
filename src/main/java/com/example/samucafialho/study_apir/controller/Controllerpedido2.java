// package com.example.samucafialho.study_apir.controller;

// import java.util.List;

// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.samucafialho.study_apir.dto.OrderRequestCreate;
// import com.example.samucafialho.study_apir.dto.OrderResponse;

// import io.swagger.v3.oas.annotations.parameters.RequestBody;

// public class Controllerpedido2 {


//     @RestController
// @RequestMapping("pedidos")
// public class ControllerPedido {
 
//     @PostMapping
//     public ResponseEntity<OrderResponse> create(
//                                 @RequestBody OrderRequestCreate dto) {                                            
//         return ResponseEntity.noContent().build();  
//     }

//     @GetMapping("{id}")
//     public ResponseEntity<OrderResponse> findById(@PathVariable Long id){
//         return ResponseEntity.noContent().build();
//     }

//     @GetMapping()
//     public ResponseEntity<List<OrderResponse>> listAll(){
//         return ResponseEntity.noContent().build();
//     }
// }
// }
