package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAlertRuleMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Map<String, AlertRuleMetric> body = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListAlertRuleMetricsResponse withBody(Map<String, AlertRuleMetric> body) {
        this.body = body;
        return this;
    }

    public ListAlertRuleMetricsResponse putBodyItem(String key, AlertRuleMetric bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public ListAlertRuleMetricsResponse withBody(Consumer<Map<String, AlertRuleMetric>> bodySetter) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * ListAlertRuleMetricsResponseBody
     * @return body
     */
    public Map<String, AlertRuleMetric> getBody() {
        return body;
    }

    public void setBody(Map<String, AlertRuleMetric> body) {
        this.body = body;
    }

    public ListAlertRuleMetricsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlertRuleMetricsResponse listAlertRuleMetricsResponse = (ListAlertRuleMetricsResponse) o;
        return Objects.equals(this.body, listAlertRuleMetricsResponse.body)
            && Objects.equals(this.xRequestId, listAlertRuleMetricsResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRuleMetricsResponse {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
