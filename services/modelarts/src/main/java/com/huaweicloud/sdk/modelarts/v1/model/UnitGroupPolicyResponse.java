package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 单副本资源实例调度约束配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class UnitGroupPolicyResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_scope")

    private String scheduleScope;

    public UnitGroupPolicyResponse withScheduleScope(String scheduleScope) {
        this.scheduleScope = scheduleScope;
        return this;
    }

    /**
     * **参数解释：** 调度范围。 **取值范围：** HYPERNODE：超节点调度 SLICE：柜级调度
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
        UnitGroupPolicyResponse that = (UnitGroupPolicyResponse) obj;
        return Objects.equals(this.scheduleScope, that.scheduleScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnitGroupPolicyResponse {\n");
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
