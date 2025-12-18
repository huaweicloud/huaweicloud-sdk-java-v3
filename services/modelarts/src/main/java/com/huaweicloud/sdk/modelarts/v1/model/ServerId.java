package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：服务器id。 **约束限制**：offering取值为LITE-CLUSTER，LITE-DEVSERVER时生效。 **取值范围**：长度为[4,255]的英文字符、数字、下划线(_)和中划线(-)的组合。 **默认取值**：不涉及。
 */
public class ServerId {

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
        sb.append("class ServerId {\n");
        sb.append("}");
        return sb.toString();
    }

}
