package com.proyecto.firstApi.persistence.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

import com.proyecto.firstApi.domian.Purchase;
import com.proyecto.firstApi.persistence.entity.Compra;

@Mapper(componentModel = "spring", uses = {PurchaseItemMapper.class})
public interface PurchaseMapper {

    @Mappings({
        @org.mapstruct.Mapping(source = "idCompra", target = "purchaseId"),
        @org.mapstruct.Mapping(source = "idCliente", target = "clienteId"),
        @org.mapstruct.Mapping(source = "fecha", target = "date"),
        @org.mapstruct.Mapping(source = "medioPago", target = "paymentMethod"),
        @org.mapstruct.Mapping(source = "comentario", target = "comment"),
        @org.mapstruct.Mapping(source = "estado", target = "state"),
        @org.mapstruct.Mapping(source = "productos", target = "items")
    })
    
    Purchase toPurchase(Compra compra);
    List<Purchase> toPurchases(List<Compra> compras);

    @InheritInverseConfiguration
    @Mappings({
        @org.mapstruct.Mapping(target = "cliente", ignore = true)
    })
    Compra toCompra(Purchase purchase);

}
