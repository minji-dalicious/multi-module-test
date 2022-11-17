package com.kurrant.multi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomerCorp is a Querydsl query type for CustomerCorp
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomerCorp extends EntityPathBase<CustomerCorp> {

    private static final long serialVersionUID = -1874962913L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomerCorp customerCorp = new QCustomerCorp("customerCorp");

    public final QAddress address;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QCustomerCorp(String variable) {
        this(CustomerCorp.class, forVariable(variable), INITS);
    }

    public QCustomerCorp(Path<? extends CustomerCorp> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomerCorp(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomerCorp(PathMetadata metadata, PathInits inits) {
        this(CustomerCorp.class, metadata, inits);
    }

    public QCustomerCorp(Class<? extends CustomerCorp> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
    }

}

