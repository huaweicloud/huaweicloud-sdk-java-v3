package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 日志导出配置
 */
public class LogExportConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotation_enabled")

    private Boolean rotationEnabled;

    public LogExportConfig withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：日志版本号。 **约束限制**： - 日志版本取值为v0、v1，默认为v0。 **取值范围**：v0、v1 **默认取值**：v0。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LogExportConfig withRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
        return this;
    }

    /**
     * **参数解释**：是否开启日志分时段下载。 **约束限制**：不涉及。 **取值范围**： - true：开启日志分时段下载 - false：关闭日志分时段下载 **默认取值**：false。
     * @return rotationEnabled
     */
    public Boolean getRotationEnabled() {
        return rotationEnabled;
    }

    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogExportConfig that = (LogExportConfig) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.rotationEnabled, that.rotationEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, rotationEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogExportConfig {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    rotationEnabled: ").append(toIndentedString(rotationEnabled)).append("\n");
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
