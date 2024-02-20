package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StartResourceScanRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "analyzer_id")

    private String analyzerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private StartResourceScanReqBody body;

    public StartResourceScanRequest withAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
        return this;
    }

    /**
     * 分析器的唯一标识符。
     * @return analyzerId
     */
    public String getAnalyzerId() {
        return analyzerId;
    }

    public void setAnalyzerId(String analyzerId) {
        this.analyzerId = analyzerId;
    }

    public StartResourceScanRequest withBody(StartResourceScanReqBody body) {
        this.body = body;
        return this;
    }

    public StartResourceScanRequest withBody(Consumer<StartResourceScanReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new StartResourceScanReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public StartResourceScanReqBody getBody() {
        return body;
    }

    public void setBody(StartResourceScanReqBody body) {
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
        StartResourceScanRequest that = (StartResourceScanRequest) obj;
        return Objects.equals(this.analyzerId, that.analyzerId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(analyzerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartResourceScanRequest {\n");
        sb.append("    analyzerId: ").append(toIndentedString(analyzerId)).append("\n");
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
