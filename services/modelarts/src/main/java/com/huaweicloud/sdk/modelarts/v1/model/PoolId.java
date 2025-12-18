package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：作业对象，AI专属资源池/弹性集群ID。 **约束限制**：offering取值为STANDARD，LITE-CLUSTER时生效。 **取值范围**：长度为[4,255]的英文字符、数字、下划线(_)和中划线(-)的组合。 **默认取值**：不涉及。 
 */
public class PoolId {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolId {\n");
        sb.append("}");
        return sb.toString();
    }

}
