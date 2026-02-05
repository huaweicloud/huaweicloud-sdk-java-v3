package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConfigSqlBlacklistReqV3VO
 */
public class ConfigSqlBlacklistReqV3VO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_black_list_full_check")

    private String sqlBlackListFullCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_db_name")

    private String logicDbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_black_list_prefix_check")

    private String sqlBlackListPrefixCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_black_list_regex_check")

    private String sqlBlackListRegexCheck;

    public ConfigSqlBlacklistReqV3VO withSqlBlackListFullCheck(String sqlBlackListFullCheck) {
        this.sqlBlackListFullCheck = sqlBlackListFullCheck;
        return this;
    }

    /**
     * **参数解释**：  全量匹配sql黑名单。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sqlBlackListFullCheck
     */
    public String getSqlBlackListFullCheck() {
        return sqlBlackListFullCheck;
    }

    public void setSqlBlackListFullCheck(String sqlBlackListFullCheck) {
        this.sqlBlackListFullCheck = sqlBlackListFullCheck;
    }

    public ConfigSqlBlacklistReqV3VO withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：  请求ID。  **约束限制**：  不涉及  **取值范围**：  只能由英文字母、数字组成。  **默认取值**：  不涉及。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ConfigSqlBlacklistReqV3VO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：  租户在某一Region下的project ID。  获取方法请参见[获取项目ID](https://support.huaweicloud.com/api-ddm/ddm_api_01_0063.html)。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，且长度为32个字符。  **默认取值**：  不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ConfigSqlBlacklistReqV3VO withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例ID，此参数是实例的唯一标识。  **约束限制**：  不涉及。  **取值范围**：  只能由英文字母、数字组成，后缀为in09，长度为36个字符。  **默认取值**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ConfigSqlBlacklistReqV3VO withLogicDbName(String logicDbName) {
        this.logicDbName = logicDbName;
        return this;
    }

    /**
     * **参数解释**：  逻辑库名称。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return logicDbName
     */
    public String getLogicDbName() {
        return logicDbName;
    }

    public void setLogicDbName(String logicDbName) {
        this.logicDbName = logicDbName;
    }

    public ConfigSqlBlacklistReqV3VO withSqlBlackListPrefixCheck(String sqlBlackListPrefixCheck) {
        this.sqlBlackListPrefixCheck = sqlBlackListPrefixCheck;
        return this;
    }

    /**
     * **参数解释**：  前缀匹配sql黑名单。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sqlBlackListPrefixCheck
     */
    public String getSqlBlackListPrefixCheck() {
        return sqlBlackListPrefixCheck;
    }

    public void setSqlBlackListPrefixCheck(String sqlBlackListPrefixCheck) {
        this.sqlBlackListPrefixCheck = sqlBlackListPrefixCheck;
    }

    public ConfigSqlBlacklistReqV3VO withSqlBlackListRegexCheck(String sqlBlackListRegexCheck) {
        this.sqlBlackListRegexCheck = sqlBlackListRegexCheck;
        return this;
    }

    /**
     * **参数解释**：  正则匹配sql黑名单。  **约束限制**：  不涉及  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sqlBlackListRegexCheck
     */
    public String getSqlBlackListRegexCheck() {
        return sqlBlackListRegexCheck;
    }

    public void setSqlBlackListRegexCheck(String sqlBlackListRegexCheck) {
        this.sqlBlackListRegexCheck = sqlBlackListRegexCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigSqlBlacklistReqV3VO that = (ConfigSqlBlacklistReqV3VO) obj;
        return Objects.equals(this.sqlBlackListFullCheck, that.sqlBlackListFullCheck)
            && Objects.equals(this.requestId, that.requestId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.logicDbName, that.logicDbName)
            && Objects.equals(this.sqlBlackListPrefixCheck, that.sqlBlackListPrefixCheck)
            && Objects.equals(this.sqlBlackListRegexCheck, that.sqlBlackListRegexCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlBlackListFullCheck,
            requestId,
            projectId,
            instanceId,
            logicDbName,
            sqlBlackListPrefixCheck,
            sqlBlackListRegexCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigSqlBlacklistReqV3VO {\n");
        sb.append("    sqlBlackListFullCheck: ").append(toIndentedString(sqlBlackListFullCheck)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    logicDbName: ").append(toIndentedString(logicDbName)).append("\n");
        sb.append("    sqlBlackListPrefixCheck: ").append(toIndentedString(sqlBlackListPrefixCheck)).append("\n");
        sb.append("    sqlBlackListRegexCheck: ").append(toIndentedString(sqlBlackListRegexCheck)).append("\n");
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
