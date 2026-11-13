package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BatchCreateTrafficMirrorFilterRulesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_rules")

    private List<BatchCreateTrafficMirrorFilterRuleOption> trafficMirrorFilterRules = null;

    public BatchCreateTrafficMirrorFilterRulesRequestBody withTrafficMirrorFilterRules(
        List<BatchCreateTrafficMirrorFilterRuleOption> trafficMirrorFilterRules) {
        this.trafficMirrorFilterRules = trafficMirrorFilterRules;
        return this;
    }

    public BatchCreateTrafficMirrorFilterRulesRequestBody addTrafficMirrorFilterRulesItem(
        BatchCreateTrafficMirrorFilterRuleOption trafficMirrorFilterRulesItem) {
        if (this.trafficMirrorFilterRules == null) {
            this.trafficMirrorFilterRules = new ArrayList<>();
        }
        this.trafficMirrorFilterRules.add(trafficMirrorFilterRulesItem);
        return this;
    }

    public BatchCreateTrafficMirrorFilterRulesRequestBody withTrafficMirrorFilterRules(
        Consumer<List<BatchCreateTrafficMirrorFilterRuleOption>> trafficMirrorFilterRulesSetter) {
        if (this.trafficMirrorFilterRules == null) {
            this.trafficMirrorFilterRules = new ArrayList<>();
        }
        trafficMirrorFilterRulesSetter.accept(this.trafficMirrorFilterRules);
        return this;
    }

    /**
     * 流量镜像筛选条件规则对象列表
     * @return trafficMirrorFilterRules
     */
    public List<BatchCreateTrafficMirrorFilterRuleOption> getTrafficMirrorFilterRules() {
        return trafficMirrorFilterRules;
    }

    public void setTrafficMirrorFilterRules(List<BatchCreateTrafficMirrorFilterRuleOption> trafficMirrorFilterRules) {
        this.trafficMirrorFilterRules = trafficMirrorFilterRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateTrafficMirrorFilterRulesRequestBody that = (BatchCreateTrafficMirrorFilterRulesRequestBody) obj;
        return Objects.equals(this.trafficMirrorFilterRules, that.trafficMirrorFilterRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateTrafficMirrorFilterRulesRequestBody {\n");
        sb.append("    trafficMirrorFilterRules: ").append(toIndentedString(trafficMirrorFilterRules)).append("\n");
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
