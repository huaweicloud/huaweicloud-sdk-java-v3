package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateReportCustomEventRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "integration_key")

    private String integrationKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ReportCustomEventRequestBody body;

    public CreateReportCustomEventRequest withIntegrationKey(String integrationKey) {
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

    public CreateReportCustomEventRequest withBody(ReportCustomEventRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateReportCustomEventRequest withBody(Consumer<ReportCustomEventRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ReportCustomEventRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ReportCustomEventRequestBody getBody() {
        return body;
    }

    public void setBody(ReportCustomEventRequestBody body) {
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
        CreateReportCustomEventRequest that = (CreateReportCustomEventRequest) obj;
        return Objects.equals(this.integrationKey, that.integrationKey) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integrationKey, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReportCustomEventRequest {\n");
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
