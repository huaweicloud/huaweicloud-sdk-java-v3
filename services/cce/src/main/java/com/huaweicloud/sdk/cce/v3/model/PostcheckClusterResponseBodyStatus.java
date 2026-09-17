package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 集群升级后确认的状态信息 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及 
 */
public class PostcheckClusterResponseBodyStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    public PostcheckClusterResponseBodyStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释：** 状态 **约束限制：** 不涉及 **取值范围：** - Success：成功 - Failed：失败 - Error：错误  **默认取值：** 不涉及
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostcheckClusterResponseBodyStatus that = (PostcheckClusterResponseBodyStatus) obj;
        return Objects.equals(this.phase, that.phase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostcheckClusterResponseBodyStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
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
