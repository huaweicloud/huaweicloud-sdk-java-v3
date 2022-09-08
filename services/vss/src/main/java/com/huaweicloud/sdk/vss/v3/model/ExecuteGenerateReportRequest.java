package com.huaweicloud.sdk.vss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExecuteGenerateReportRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExecuteGenerateReportRequestBody body;

    public ExecuteGenerateReportRequest withBody(ExecuteGenerateReportRequestBody body) {
        this.body = body;
        return this;
    }

    public ExecuteGenerateReportRequest withBody(Consumer<ExecuteGenerateReportRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExecuteGenerateReportRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExecuteGenerateReportRequestBody getBody() {
        return body;
    }

    public void setBody(ExecuteGenerateReportRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGenerateReportRequest executeGenerateReportRequest = (ExecuteGenerateReportRequest) o;
        return Objects.equals(this.body, executeGenerateReportRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGenerateReportRequest {\n");
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
