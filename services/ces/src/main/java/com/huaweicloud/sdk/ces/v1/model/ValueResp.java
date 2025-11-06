package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 告警阈值。具体阈值取值请参见附录中各服务监控指标中取值范围，如[支持监控的服务列表](ces_03_0059.xml)中ECS的CPU使用率cpu_util取值范围可配置80。 **取值范围**： 最小值为-1.7976931348623157e+108，最大值为1.7976931348623157e+108。 
 */
public class ValueResp {

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
        sb.append("class ValueResp {\n");
        sb.append("}");
        return sb.toString();
    }

}
