package com.kurrant.multi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomerCorp is a Querydsl query type for CustomerCorp
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCustomerCorp extends EntityPathBase<CustomerCorp> {

    private static final long serialVersionUID = -1874962913L;

    public static final QCustomerCorp customerCorp = new QCustomerCorp("customerCorp");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public QCustomerCorp(String variable) {
        super(CustomerCorp.class, forVariable(variable));
    }

    public QCustomerCorp(Path<? extends CustomerCorp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomerCorp(PathMetadata metadata) {
        super(CustomerCorp.class, metadata);
    }

}

