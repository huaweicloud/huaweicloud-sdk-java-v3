package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LtsLogConfigResult
 */
public class LtsLogConfigResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_group_id")

    private String ltsGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_stream_id")

    private String ltsStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public LtsLogConfigResult withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * **参数解释**: 日志类型。 **取值范围**: - audit_log：审计日志。
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public LtsLogConfigResult withLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
        return this;
    }

    /**
     * **参数解释**: 关联的LTS日志组ID，若enabled为false，表示最近一次关联的LTS日志组ID。 **取值范围**: 不涉及。
     * @return ltsGroupId
     */
    public String getLtsGroupId() {
        return ltsGroupId;
    }

    public void setLtsGroupId(String ltsGroupId) {
        this.ltsGroupId = ltsGroupId;
    }

    public LtsLogConfigResult withLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
        return this;
    }

    /**
     * **参数解释**: 关联的LTS日志流ID，若enabled为false，表示最近一次关联的LTS日志流ID。 **取值范围**: 不涉及。
     * @return ltsStreamId
     */
    public String getLtsStreamId() {
        return ltsStreamId;
    }

    public void setLtsStreamId(String ltsStreamId) {
        this.ltsStreamId = ltsStreamId;
    }

    public LtsLogConfigResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 关联的LTS日志流是否启用。 **取值范围**: - true：启用。 - false：关闭。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LtsLogConfigResult that = (LtsLogConfigResult) obj;
        return Objects.equals(this.logType, that.logType) && Objects.equals(this.ltsGroupId, that.ltsGroupId)
            && Objects.equals(this.ltsStreamId, that.ltsStreamId) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logType, ltsGroupId, ltsStreamId, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LtsLogConfigResult {\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    ltsGroupId: ").append(toIndentedString(ltsGroupId)).append("\n");
        sb.append("    ltsStreamId: ").append(toIndentedString(ltsStreamId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
