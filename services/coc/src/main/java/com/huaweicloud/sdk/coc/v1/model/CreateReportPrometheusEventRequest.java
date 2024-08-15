package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateReportPrometheusEventRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "integration_key")

    private String integrationKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Map<String, Object> body = null;

    public CreateReportPrometheusEventRequest withIntegrationKey(String integrationKey) {
        this.integrationKey = integrationKey;
        return this;
    }

    /**
     * 集成ID
     * @return integrationKey
     */
    public String getIntegrationKey() {
        return integrationKey;
    }

    public void setIntegrationKey(String integrationKey) {
        this.integrationKey = integrationKey;
    }

    public CreateReportPrometheusEventRequest withBody(Map<String, Object> body) {
        this.body = body;
        return this;
    }

    public CreateReportPrometheusEventRequest putBodyItem(String key, Object bodyItem) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        this.body.put(key, bodyItem);
        return this;
    }

    public CreateReportPrometheusEventRequest withBody(Consumer<Map<String, Object>> bodySetter) {
        if (this.body == null) {
            this.body = new HashMap<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Map<String, Object> getBody() {
        return body;
    }

    public void setBody(Map<String, Object> body) {
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
        CreateReportPrometheusEventRequest that = (CreateReportPrometheusEventRequest) obj;
        return Objects.equals(this.integrationKey, that.integrationKey) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integrationKey, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReportPrometheusEventRequest {\n");
        sb.append("    integrationKey: ").append(toIndentedString(integrationKey)).append("\n");
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
