package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateTrafficMirrorFilterRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_rule")

    private UpdateTrafficMirrorFilterRuleOption trafficMirrorFilterRule;

    public UpdateTrafficMirrorFilterRuleRequestBody withTrafficMirrorFilterRule(
        UpdateTrafficMirrorFilterRuleOption trafficMirrorFilterRule) {
        this.trafficMirrorFilterRule = trafficMirrorFilterRule;
        return this;
    }

    public UpdateTrafficMirrorFilterRuleRequestBody withTrafficMirrorFilterRule(
        Consumer<UpdateTrafficMirrorFilterRuleOption> trafficMirrorFilterRuleSetter) {
        if (this.trafficMirrorFilterRule == null) {
            this.trafficMirrorFilterRule = new UpdateTrafficMirrorFilterRuleOption();
            trafficMirrorFilterRuleSetter.accept(this.trafficMirrorFilterRule);
        }

        return this;
    }

    /**
     * Get trafficMirrorFilterRule
     * @return trafficMirrorFilterRule
     */
    public UpdateTrafficMirrorFilterRuleOption getTrafficMirrorFilterRule() {
        return trafficMirrorFilterRule;
    }

    public void setTrafficMirrorFilterRule(UpdateTrafficMirrorFilterRuleOption trafficMirrorFilterRule) {
        this.trafficMirrorFilterRule = trafficMirrorFilterRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrafficMirrorFilterRuleRequestBody that = (UpdateTrafficMirrorFilterRuleRequestBody) obj;
        return Objects.equals(this.trafficMirrorFilterRule, that.trafficMirrorFilterRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorFilterRuleRequestBody {\n");
        sb.append("    trafficMirrorFilterRule: ").append(toIndentedString(trafficMirrorFilterRule)).append("\n");
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
