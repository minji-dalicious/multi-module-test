package com.kurrant.multi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QApartment is a Querydsl query type for Apartment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApartment extends EntityPathBase<Apartment> {

    private static final long serialVersionUID = -2026122981L;

    public static final QApartment apartment = new QApartment("apartment");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QApartment(String variable) {
        super(Apartment.class, forVariable(variable));
    }

    public QApartment(Path<? extends Apartment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApartment(PathMetadata metadata) {
        super(Apartment.class, metadata);
    }

}

