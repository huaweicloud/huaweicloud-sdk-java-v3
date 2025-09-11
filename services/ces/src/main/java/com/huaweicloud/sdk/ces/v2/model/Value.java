package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 告警阈值。具体阈值取值请参见附录中各服务监控指标中取值范围。    **约束限制**： 单一阈值时value和alarm_level配对使用，当hierarchical_value和value同时使用时以hierarchical_value为准。 **取值范围**： 最小值为-1.7976931348623157e+108，最大值为1.7976931348623157e+108。           **默认取值**： 不涉及。 
 */
public class Value {

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
        sb.append("class Value {\n");
        sb.append("}");
        return sb.toString();
    }

}
