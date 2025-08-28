package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowHealthMonitorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitor_id")

    private String healthmonitorId;

    public ShowHealthMonitorRequest withHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
        return this;
    }

    /**
     * **参数解释**：健康检查ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return healthmonitorId
     */
    public String getHealthmonitorId() {
        return healthmonitorId;
    }

    public void setHealthmonitorId(String healthmonitorId) {
        this.healthmonitorId = healthmonitorId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHealthMonitorRequest that = (ShowHealthMonitorRequest) obj;
        return Objects.equals(this.healthmonitorId, that.healthmonitorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHealthMonitorRequest {\n");
        sb.append("    healthmonitorId: ").append(toIndentedString(healthmonitorId)).append("\n");
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
