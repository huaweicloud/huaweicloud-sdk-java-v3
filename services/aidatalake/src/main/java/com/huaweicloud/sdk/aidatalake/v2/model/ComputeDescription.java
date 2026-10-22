package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：资源描述信息。 **约束限制**：不涉及。 **取值范围**：不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号、艾特符、井号、百分号、分号、左括号、右括号、竖线、星号、反斜杠。长度为0~512个字符。 **默认取值**：不涉及。
 */
public class ComputeDescription {

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
        sb.append("class ComputeDescription {\n");
        sb.append("}");
        return sb.toString();
    }

}
