package com.huaweicloud.sdk.dataartsfabric.v1.model;

import java.util.Objects;

/**
 * **参数解释**：是否开启资源自定义。 **约束限制**：不涉及。 **取值范围**：开启true，关闭false。 **默认取值**：false。 
 */
public class EnableCustom {

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
        sb.append("class EnableCustom {\n");
        sb.append("}");
        return sb.toString();
    }

}
