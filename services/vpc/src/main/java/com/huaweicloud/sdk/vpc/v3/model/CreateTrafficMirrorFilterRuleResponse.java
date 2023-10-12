package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTrafficMirrorFilterRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_rule")

    private TrafficMirrorFilterRule trafficMirrorFilterRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateTrafficMirrorFilterRuleResponse withTrafficMirrorFilterRule(
        TrafficMirrorFilterRule trafficMirrorFilterRule) {
        this.trafficMirrorFilterRule = trafficMirrorFilterRule;
        return this;
    }

    public CreateTrafficMirrorFilterRuleResponse withTrafficMirrorFilterRule(
        Consumer<TrafficMirrorFilterRule> trafficMirrorFilterRuleSetter) {
        if (this.trafficMirrorFilterRule == null) {
            this.trafficMirrorFilterRule = new TrafficMirrorFilterRule();
            trafficMirrorFilterRuleSetter.accept(this.trafficMirrorFilterRule);
        }

        return this;
    }

    /**
     * Get trafficMirrorFilterRule
     * @return trafficMirrorFilterRule
     */
    public TrafficMirrorFilterRule getTrafficMirrorFilterRule() {
        return trafficMirrorFilterRule;
    }

    public void setTrafficMirrorFilterRule(TrafficMirrorFilterRule trafficMirrorFilterRule) {
        this.trafficMirrorFilterRule = trafficMirrorFilterRule;
    }

    public CreateTrafficMirrorFilterRuleResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrafficMirrorFilterRuleResponse that = (CreateTrafficMirrorFilterRuleResponse) obj;
        return Objects.equals(this.trafficMirrorFilterRule, that.trafficMirrorFilterRule)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterRule, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrafficMirrorFilterRuleResponse {\n");
        sb.append("    trafficMirrorFilterRule: ").append(toIndentedString(trafficMirrorFilterRule)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
