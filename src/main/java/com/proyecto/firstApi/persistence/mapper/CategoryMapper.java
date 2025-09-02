package com.proyecto.firstApi.persistence.mapper;


import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.proyecto.firstApi.domian.Category;
import com.proyecto.firstApi.persistence.entity.Categoria;

@Mapper(componentModel = "spring")

public interface CategoryMapper {
    @Mappings({
        @Mapping(source =  "idCategoria", target = "categoryId"),
        @Mapping(source = "descripcion", target = "category"),
        @Mapping(source = "estado", target = "active"),

        })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mappings({
        @Mapping(target = "productos", ignore = true)
    })
    Categoria toCategoria(Category category);

}
