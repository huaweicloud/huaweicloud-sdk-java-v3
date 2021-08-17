package com.huaweicloud.sdk.ecs.v2;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.huaweicloud.sdk.ecs.v2.model.ServerImage;

public class EcsCustomModule extends SimpleModule {
    private static final long serialVersionUID = 1L;

    public EcsCustomModule() {
        super("EcsCustomModule");
        this.addDeserializer(ServerImage.class, new EcsServerImageDeSerializer());
    }
}
