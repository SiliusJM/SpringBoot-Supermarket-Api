package com.proyecto.firstApi.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.proyecto.firstApi.domian.PurchaseItem;
import com.proyecto.firstApi.persistence.entity.ComprasProductos;


@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {
    @Mappings({
        @Mapping(source = "id.idProducto", target = "productId"),
        @Mapping(source = "cantidad", target = "quantity"),
        @Mapping(source = "estado", target = "active"),
    })

    PurchaseItem toPurchaseItem(ComprasProductos producto);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "compra", ignore = true),
        @Mapping(target = "producto", ignore = true),
        @Mapping(target = "id.idCompra", ignore = true)
    })
    ComprasProductos toComprasProductos(PurchaseItem item);



    



    

}
