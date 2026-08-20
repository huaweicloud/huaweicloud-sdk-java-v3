package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class RunSparkSqlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")

    private String xClientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RunSparkSqlRequestBody body;

    public RunSparkSqlRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间的ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public RunSparkSqlRequest withXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
        return this;
    }

    /**
     * **参数解释**：服务事务ID，用于链路追踪和问题定位。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return xClientToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Client-Token")
    public String getXClientToken() {
        return xClientToken;
    }

    public void setXClientToken(String xClientToken) {
        this.xClientToken = xClientToken;
    }

    public RunSparkSqlRequest withBody(RunSparkSqlRequestBody body) {
        this.body = body;
        return this;
    }

    public RunSparkSqlRequest withBody(Consumer<RunSparkSqlRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new RunSparkSqlRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RunSparkSqlRequestBody getBody() {
        return body;
    }

    public void setBody(RunSparkSqlRequestBody body) {
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
        RunSparkSqlRequest that = (RunSparkSqlRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.xClientToken, that.xClientToken) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, xClientToken, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSparkSqlRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    xClientToken: ").append(toIndentedString(xClientToken)).append("\n");
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
