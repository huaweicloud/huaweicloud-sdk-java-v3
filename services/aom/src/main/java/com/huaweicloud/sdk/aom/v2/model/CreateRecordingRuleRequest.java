package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateRecordingRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prometheus_instance")

    private String prometheusInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RecordingRuleRequest body;

    public CreateRecordingRuleRequest withPrometheusInstance(String prometheusInstance) {
        this.prometheusInstance = prometheusInstance;
        return this;
    }

    /**
     * prometheus实例id。
     * @return prometheusInstance
     */
    public String getPrometheusInstance() {
        return prometheusInstance;
    }

    public void setPrometheusInstance(String prometheusInstance) {
        this.prometheusInstance = prometheusInstance;
    }

    public CreateRecordingRuleRequest withBody(RecordingRuleRequest body) {
        this.body = body;
        return this;
    }

    public CreateRecordingRuleRequest withBody(Consumer<RecordingRuleRequest> bodySetter) {
        if (this.body == null) {
            this.body = new RecordingRuleRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RecordingRuleRequest getBody() {
        return body;
    }

    public void setBody(RecordingRuleRequest body) {
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
        CreateRecordingRuleRequest that = (CreateRecordingRuleRequest) obj;
        return Objects.equals(this.prometheusInstance, that.prometheusInstance) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prometheusInstance, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordingRuleRequest {\n");
        sb.append("    prometheusInstance: ").append(toIndentedString(prometheusInstance)).append("\n");
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
