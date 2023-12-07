package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class BatchDeleteSecurityDataClassificationRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchDeleteRulesBaseDTO body;

    public BatchDeleteSecurityDataClassificationRuleRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public BatchDeleteSecurityDataClassificationRuleRequest withBody(BatchDeleteRulesBaseDTO body) {
        this.body = body;
        return this;
    }

    public BatchDeleteSecurityDataClassificationRuleRequest withBody(Consumer<BatchDeleteRulesBaseDTO> bodySetter) {
        if (this.body == null) {
            this.body = new BatchDeleteRulesBaseDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchDeleteRulesBaseDTO getBody() {
        return body;
    }

    public void setBody(BatchDeleteRulesBaseDTO body) {
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
        BatchDeleteSecurityDataClassificationRuleRequest that = (BatchDeleteSecurityDataClassificationRuleRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteSecurityDataClassificationRuleRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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
