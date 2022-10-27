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

    public final BooleanPath addressOption = createBoolean("addressOption");

    public final NumberPath<Integer> allowDeliveryFee = createNumber("allowDeliveryFee", Integer.class);

    public final StringPath code = createString("code");

    public final DateTimePath<java.time.Instant> created = createDateTime("created", java.time.Instant.class);

    public final BooleanPath creationCycle = createBoolean("creationCycle");

    public final NumberPath<Integer> customerGroupId = createNumber("customerGroupId", Integer.class);

    public final NumberPath<Integer> customPrice = createNumber("customPrice", Integer.class);

    public final NumberPath<Integer> customTotalNum = createNumber("customTotalNum", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> isApt = createNumber("isApt", Integer.class);

    public final BooleanPath isCustom = createBoolean("isCustom");

    public final NumberPath<Integer> isExposed = createNumber("isExposed", Integer.class);

    public final NumberPath<Integer> isGarbage = createNumber("isGarbage", Integer.class);

    public final NumberPath<Integer> isMembership = createNumber("isMembership", Integer.class);

    public final NumberPath<Integer> isPublic = createNumber("isPublic", Integer.class);

    public final BooleanPath isSalad = createBoolean("isSalad");

    public final NumberPath<Integer> isWarmbox = createNumber("isWarmbox", Integer.class);

    public final NumberPath<Integer> locationId = createNumber("locationId", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath orderCode = createString("orderCode");

    public final NumberPath<Integer> parent = createNumber("parent", Integer.class);

    public final StringPath phone = createString("phone");

    public final NumberPath<Integer> preferStyle = createNumber("preferStyle", Integer.class);

    public final NumberPath<Integer> totalNum = createNumber("totalNum", Integer.class);

    public final DateTimePath<java.time.Instant> updated = createDateTime("updated", java.time.Instant.class);

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

