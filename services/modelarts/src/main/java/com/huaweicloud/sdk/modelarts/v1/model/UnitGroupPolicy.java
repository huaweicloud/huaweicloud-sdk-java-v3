package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单副本资源实例调度约束配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。
 */
public class UnitGroupPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_scope")

    private String scheduleScope;

    public UnitGroupPolicy withScheduleScope(String scheduleScope) {
        this.scheduleScope = scheduleScope;
        return this;
    }

    /**
     * **参数解释：** 调度范围，仅A5超节点规格生效。 **约束限制：** - 仅当资源池包含A5(snt9e)规格时有效，非A5规格不执行调度范围校验。 - A5规格仅支持LWS工作负载类型，不支持DEPLOYMENT。 - A5规格需要Volcano调度插件版本满足要求。 **取值范围：** - HYPERNODE：超节点调度 - SLICE：柜级调度 **默认取值：** 不涉及。
     * @return scheduleScope
     */
    public String getScheduleScope() {
        return scheduleScope;
    }

    public void setScheduleScope(String scheduleScope) {
        this.scheduleScope = scheduleScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnitGroupPolicy that = (UnitGroupPolicy) obj;
        return Objects.equals(this.scheduleScope, that.scheduleScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnitGroupPolicy {\n");
        sb.append("    scheduleScope: ").append(toIndentedString(scheduleScope)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
