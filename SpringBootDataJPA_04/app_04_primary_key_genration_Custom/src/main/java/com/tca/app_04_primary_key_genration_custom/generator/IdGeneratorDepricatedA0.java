package com.tca.app_04_primary_key_genration_custom.generator;

import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class IdGeneratorDepricatedA0 implements IdentifierGenerator{

    @Override
    public Object generate(org.hibernate.engine.spi.SharedSessionContractImplementor session, Object object) {


        Random random = new Random();
        return "TCA-" + random.nextInt(9) + random.nextInt(9) + random.nextInt(9) + random.nextInt(9);
    }

}
