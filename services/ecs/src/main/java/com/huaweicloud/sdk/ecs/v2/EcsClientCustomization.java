package com.huaweicloud.sdk.ecs.v2;

import com.huaweicloud.sdk.core.ClientCustomization;
import com.huaweicloud.sdk.core.CustomizationConfigure;

public class EcsClientCustomization implements ClientCustomization {

    private static EcsCustomModule ecsCustomModule = new EcsCustomModule();

    @Override
    public void customize(CustomizationConfigure customizationConfigure) {
        customizationConfigure.configJson(objectMapper -> {
            if (!objectMapper.getRegisteredModuleIds().contains(ecsCustomModule.getTypeId())) {
                objectMapper.registerModule(ecsCustomModule);
            }
        });
    }
}
