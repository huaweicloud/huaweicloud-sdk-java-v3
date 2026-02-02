package com.huaweicloud.sdk.modelarts.v1.model;

import java.util.Objects;

/**
 * **参数解释**：profiling诊断输入profiling性能数据obs路径。 **约束限制**：不涉及。 **取值范围**：[0,2048]。 **默认取值**：不涉及。
 */
public class ObsPath {

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
        sb.append("class ObsPath {\n");
        sb.append("}");
        return sb.toString();
    }

}
