package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowAuraSqlStatementResultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable_obs_path")

    private Boolean isEnableObsPath;

    public ShowAuraSqlStatementResultRequest withWorkspaceId(String workspaceId) {
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

    public ShowAuraSqlStatementResultRequest withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：会话ID。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ShowAuraSqlStatementResultRequest withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：statement id。 **约束限制**：不涉及。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、下划线。 **默认取值**：不涉及。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public ShowAuraSqlStatementResultRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * **参数解释**：查询页码。 **约束限制**：不涉及。 **取值范围**：1~2147483647。 **默认取值**：不涉及。
     * minimum: 1
     * maximum: 65535
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ShowAuraSqlStatementResultRequest withIsEnableObsPath(Boolean isEnableObsPath) {
        this.isEnableObsPath = isEnableObsPath;
        return this;
    }

    /**
     * **参数解释**：是否返回结果集的obs路径。 **约束限制**：不涉及。 **取值范围**：   - true：返回结果集的obs路径。   - false：返回结果集。 **默认取值**：不涉及。
     * @return isEnableObsPath
     */
    public Boolean getIsEnableObsPath() {
        return isEnableObsPath;
    }

    public void setIsEnableObsPath(Boolean isEnableObsPath) {
        this.isEnableObsPath = isEnableObsPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuraSqlStatementResultRequest that = (ShowAuraSqlStatementResultRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.statementId, that.statementId) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.isEnableObsPath, that.isEnableObsPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, sessionId, statementId, pageNum, isEnableObsPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuraSqlStatementResultRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    isEnableObsPath: ").append(toIndentedString(isEnableObsPath)).append("\n");
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
