package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchImportAgentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AgentBatchImportParamNew body;

    public BatchImportAgentRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * region id，例如：cn-north-7
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BatchImportAgentRequest withBody(AgentBatchImportParamNew body) {
        this.body = body;
        return this;
    }

    public BatchImportAgentRequest withBody(Consumer<AgentBatchImportParamNew> bodySetter) {
        if (this.body == null) {
            this.body = new AgentBatchImportParamNew();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AgentBatchImportParamNew getBody() {
        return body;
    }

    public void setBody(AgentBatchImportParamNew body) {
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
        BatchImportAgentRequest that = (BatchImportAgentRequest) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchImportAgentRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
