package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteTrafficMirrorFilterRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_rule_id")

    private String trafficMirrorFilterRuleId;

    public DeleteTrafficMirrorFilterRuleRequest withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
        return this;
    }

    /**
     * 流量镜像筛选条件规则ID
     * @return trafficMirrorFilterRuleId
     */
    public String getTrafficMirrorFilterRuleId() {
        return trafficMirrorFilterRuleId;
    }

    public void setTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
        this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTrafficMirrorFilterRuleRequest that = (DeleteTrafficMirrorFilterRuleRequest) obj;
        return Objects.equals(this.trafficMirrorFilterRuleId, that.trafficMirrorFilterRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTrafficMirrorFilterRuleRequest {\n");
        sb.append("    trafficMirrorFilterRuleId: ").append(toIndentedString(trafficMirrorFilterRuleId)).append("\n");
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
