package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SqlPatchInfosResult
 */
public class SqlPatchInfosResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_name")

    private String patchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    /**
     * **参数解释**: Patch的状态。d表示SQL ID模式，h表示SQL Hash模式。 **取值范围**: - d：SQL ID模式 - h：SQL Hash模式
     */
    public static final class PatchStatusEnum {

        /**
         * Enum D for value: "d"
         */
        public static final PatchStatusEnum D = new PatchStatusEnum("d");

        /**
         * Enum H for value: "h"
         */
        public static final PatchStatusEnum H = new PatchStatusEnum("h");

        private static final Map<String, PatchStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PatchStatusEnum> createStaticFields() {
            Map<String, PatchStatusEnum> map = new HashMap<>();
            map.put("d", D);
            map.put("h", H);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PatchStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PatchStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PatchStatusEnum(value));
        }

        public static PatchStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PatchStatusEnum) {
                return this.value.equals(((PatchStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_status")

    private PatchStatusEnum patchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abort_patch")

    private Boolean abortPatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hint")

    private String hint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_text")

    private String sqlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public SqlPatchInfosResult withPatchName(String patchName) {
        this.patchName = patchName;
        return this;
    }

    /**
     * **参数解释**: Patch名称。 **取值范围**: 不涉及。
     * @return patchName
     */
    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    public SqlPatchInfosResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: unique_sql_id，标识SQL文本的ID。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public SqlPatchInfosResult withEnabled(Boolean enabled) {
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

    public SqlPatchInfosResult withPatchStatus(PatchStatusEnum patchStatus) {
        this.patchStatus = patchStatus;
        return this;
    }

    /**
     * **参数解释**: Patch的状态。d表示SQL ID模式，h表示SQL Hash模式。 **取值范围**: - d：SQL ID模式 - h：SQL Hash模式
     * @return patchStatus
     */
    public PatchStatusEnum getPatchStatus() {
        return patchStatus;
    }

    public void setPatchStatus(PatchStatusEnum patchStatus) {
        this.patchStatus = patchStatus;
    }

    public SqlPatchInfosResult withAbortPatch(Boolean abortPatch) {
        this.abortPatch = abortPatch;
        return this;
    }

    /**
     * **参数解释**: 是否为Abort Patch。 **取值范围**: - true：是 - false：否
     * @return abortPatch
     */
    public Boolean getAbortPatch() {
        return abortPatch;
    }

    public void setAbortPatch(Boolean abortPatch) {
        this.abortPatch = abortPatch;
    }

    public SqlPatchInfosResult withHint(String hint) {
        this.hint = hint;
        return this;
    }

    /**
     * **参数解释**: Patch内容（Hint文本）。 **取值范围**: 不涉及。
     * @return hint
     */
    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public SqlPatchInfosResult withSqlText(String sqlText) {
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

    public SqlPatchInfosResult withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: SQL Patch所属的节点。主备版为主DN，分布式版为CN。 **取值范围**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlPatchInfosResult that = (SqlPatchInfosResult) obj;
        return Objects.equals(this.patchName, that.patchName) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.patchStatus, that.patchStatus)
            && Objects.equals(this.abortPatch, that.abortPatch) && Objects.equals(this.hint, that.hint)
            && Objects.equals(this.sqlText, that.sqlText) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patchName, sqlId, enabled, patchStatus, abortPatch, hint, sqlText, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlPatchInfosResult {\n");
        sb.append("    patchName: ").append(toIndentedString(patchName)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    patchStatus: ").append(toIndentedString(patchStatus)).append("\n");
        sb.append("    abortPatch: ").append(toIndentedString(abortPatch)).append("\n");
        sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
        sb.append("    sqlText: ").append(toIndentedString(sqlText)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
