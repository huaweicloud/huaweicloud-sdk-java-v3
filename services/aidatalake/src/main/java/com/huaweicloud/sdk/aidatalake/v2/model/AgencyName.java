package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：委托名称。 **约束限制**：具体请参见[[配置Aura委托](https://support.huaweicloud.com/usermanual-aidatalake/aidatalake_01_0078.html#section4)](tag:HEC)[[配置Aura委托](https://support.huaweicloud.com/intl/zh-cn/usermanual-aidatalake/aidatalake_01_0078.html#section4)](tag:hws_hk)。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class AgencyName {

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
        sb.append("class AgencyName {\n");
        sb.append("}");
        return sb.toString();
    }

}
