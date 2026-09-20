package com.tca.app_04_primary_key_genration_custom.generator;

import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class IdGenerator implements IdentifierGenerator {


    private final String prefix;

    public IdGenerator(TcaId tcaId){
        this.prefix = tcaId.name();
    }


    @Override
    public Object generate(org.hibernate.engine.spi.SharedSessionContractImplementor session, Object object) {


        Random random = new Random();
        return "TCA-" + prefix + "-" + random.nextInt(9) + random.nextInt(9) + random.nextInt(9) + random.nextInt(9);

    }
}
