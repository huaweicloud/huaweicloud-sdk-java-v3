package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * iac扫描信息
 */
public class IacScanRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_mode")

    private String configurationMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    public IacScanRequestInfo withConfigurationMode(String configurationMode) {
        this.configurationMode = configurationMode;
        return this;
    }

    /**
     * **参数解释**: 配置方式 **约束限制**: 不涉及 **取值范围**: - local_directory：本地目录。 - remote_address：https远程地址。 - git_repository_address：git仓库地址。  **默认取值**: 不涉及 
     * @return configurationMode
     */
    public String getConfigurationMode() {
        return configurationMode;
    }

    public void setConfigurationMode(String configurationMode) {
        this.configurationMode = configurationMode;
    }

    public IacScanRequestInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 配置文件路径 **约束限制**: 不涉及 **取值范围**: 字符取值1-256 **默认取值**: 不涉及 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IacScanRequestInfo that = (IacScanRequestInfo) obj;
        return Objects.equals(this.configurationMode, that.configurationMode) && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationMode, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IacScanRequestInfo {\n");
        sb.append("    configurationMode: ").append(toIndentedString(configurationMode)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
