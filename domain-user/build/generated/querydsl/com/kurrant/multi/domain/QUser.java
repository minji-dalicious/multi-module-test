package com.kurrant.multi.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 985343042L;

    public static final QUser user = new QUser("user");

    public final DateTimePath<java.time.Instant> birth = createDateTime("birth", java.time.Instant.class);

    public final NumberPath<Integer> box = createNumber("box", Integer.class);

    public final DateTimePath<java.time.Instant> created = createDateTime("created", java.time.Instant.class);

    public final NumberPath<Integer> customerCorpId = createNumber("customerCorpId", Integer.class);

    public final StringPath email = createString("email");

    public final StringPath fCMToken = createString("fCMToken");

    public final NumberPath<Integer> gender = createNumber("gender", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath id1 = createString("id1");

    public final NumberPath<Integer> isAcceptMarketing = createNumber("isAcceptMarketing", Integer.class);

    public final NumberPath<Integer> isAcceptTerms = createNumber("isAcceptTerms", Integer.class);

    public final NumberPath<Integer> isWework = createNumber("isWework", Integer.class);

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final NumberPath<Integer> locationId = createNumber("locationId", Integer.class);

    public final DateTimePath<java.time.Instant> marketingDate = createDateTime("marketingDate", java.time.Instant.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> os = createNumber("os", Integer.class);

    public final StringPath oSver = createString("oSver");

    public final StringPath phone = createString("phone");

    public final StringPath pwd = createString("pwd");

    public final DateTimePath<java.time.Instant> registered = createDateTime("registered", java.time.Instant.class);

    public final NumberPath<Integer> registerType = createNumber("registerType", Integer.class);

    public final DateTimePath<java.time.Instant> requestVerifying = createDateTime("requestVerifying", java.time.Instant.class);

    public final StringPath snsKey = createString("snsKey");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final DateTimePath<java.time.Instant> succeedVerifying = createDateTime("succeedVerifying", java.time.Instant.class);

    public final NumberPath<Integer> supplierCorpId = createNumber("supplierCorpId", Integer.class);

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath udid = createString("udid");

    public final DateTimePath<java.time.Instant> updated = createDateTime("updated", java.time.Instant.class);

    public final StringPath verifyNum = createString("verifyNum");

    public final NumberPath<Integer> verifyStatus = createNumber("verifyStatus", Integer.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

