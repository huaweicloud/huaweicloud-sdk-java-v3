package com.huaweicloud.sdk.codeartscheck.v2.model;

import java.util.Objects;

/**
 * **参数解释：** [忽略类型，将问题修改为待审核状态时选填。](tag:fcs,hcs,hcs_sm,hcs_site,hcs_sitesm)[废弃字段。](tag:hws,hws_hk) **约束限制：** 不涉及。 **取值范围：** - NO_RISK：评估无风险暂不解决。 - FALSE_POSITIVES：纯属工具误报。 - THIRD_PARTY：开源及第三方。 - EFFUCUENCY_RETAIN：性能敏感保留危险函数。 - NO_SUPPORT_INKERNEL：不支持的内核危险函数。 - EXCLUDE_SCENES：规范例外场景。 - COMPATIBLE_THIRD_PARTY：兼容第三方。 **默认取值：** NO_RISK
 */
public class IgnoreType {

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
        sb.append("class IgnoreType {\n");
        sb.append("}");
        return sb.toString();
    }

}
