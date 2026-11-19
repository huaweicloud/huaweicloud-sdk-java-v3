package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SqlPatchQueryInfoOption
 */
public class SqlPatchQueryInfoOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_text")

    private String sqlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_name")

    private String patchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abort_patch")

    private Boolean abortPatch;

    public SqlPatchQueryInfoOption withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: unique_sql_id。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public SqlPatchQueryInfoOption withSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }

    /**
     * **参数解释**: SQL文本。 **取值范围**: 不涉及。
     * @return sqlText
     */
    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public SqlPatchQueryInfoOption withPatchName(String patchName) {
        this.patchName = patchName;
        return this;
    }

    /**
     * **参数解释**: SQL Patch名称。 **取值范围**: 不涉及。
     * @return patchName
     */
    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    public SqlPatchQueryInfoOption withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: 节点ID。 **取值范围**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SqlPatchQueryInfoOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: Patch是否生效。 **取值范围**: - true：生效 - false：不生效
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SqlPatchQueryInfoOption withAbortPatch(Boolean abortPatch) {
        this.abortPatch = abortPatch;
        return this;
    }

    /**
     * **参数解释**: Patch类型。 **取值范围**: - true：Abort Patch - false：非Abort Patch
     * @return abortPatch
     */
    public Boolean getAbortPatch() {
        return abortPatch;
    }

    public void setAbortPatch(Boolean abortPatch) {
        this.abortPatch = abortPatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlPatchQueryInfoOption that = (SqlPatchQueryInfoOption) obj;
        return Objects.equals(this.sqlId, that.sqlId) && Objects.equals(this.sqlText, that.sqlText)
            && Objects.equals(this.patchName, that.patchName) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.abortPatch, that.abortPatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlId, sqlText, patchName, nodeId, enabled, abortPatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlPatchQueryInfoOption {\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlText: ").append(toIndentedString(sqlText)).append("\n");
        sb.append("    patchName: ").append(toIndentedString(patchName)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    abortPatch: ").append(toIndentedString(abortPatch)).append("\n");
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
