package com.kurrant.multi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QApartment is a Querydsl query type for Apartment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApartment extends EntityPathBase<Apartment> {

    private static final long serialVersionUID = -2026122981L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QApartment apartment = new QApartment("apartment");

    public final QAddress address;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QApartment(String variable) {
        this(Apartment.class, forVariable(variable), INITS);
    }

    public QApartment(Path<? extends Apartment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QApartment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QApartment(PathMetadata metadata, PathInits inits) {
        this(Apartment.class, metadata, inits);
    }

    public QApartment(Class<? extends Apartment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
    }

}

