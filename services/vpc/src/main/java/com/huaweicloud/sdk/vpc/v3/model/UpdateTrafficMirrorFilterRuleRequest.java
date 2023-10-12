package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTrafficMirrorFilterRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_mirror_filter_rule_id")

    private String trafficMirrorFilterRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateTrafficMirrorFilterRuleRequestBody body;

    public UpdateTrafficMirrorFilterRuleRequest withTrafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
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

    public UpdateTrafficMirrorFilterRuleRequest withBody(UpdateTrafficMirrorFilterRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTrafficMirrorFilterRuleRequest withBody(
        Consumer<UpdateTrafficMirrorFilterRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTrafficMirrorFilterRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTrafficMirrorFilterRuleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTrafficMirrorFilterRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTrafficMirrorFilterRuleRequest that = (UpdateTrafficMirrorFilterRuleRequest) obj;
        return Objects.equals(this.trafficMirrorFilterRuleId, that.trafficMirrorFilterRuleId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficMirrorFilterRuleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTrafficMirrorFilterRuleRequest {\n");
        sb.append("    trafficMirrorFilterRuleId: ").append(toIndentedString(trafficMirrorFilterRuleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
