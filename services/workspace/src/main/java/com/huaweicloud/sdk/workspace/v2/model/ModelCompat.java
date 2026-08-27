package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型兼容性配置。
 */
public class ModelCompat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supports_usage_streaming")

    private Boolean supportsUsageStreaming;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "supports_developer_role")

    private Boolean supportsDeveloperRole;

    public ModelCompat withSupportsUsageStreaming(Boolean supportsUsageStreaming) {
        this.supportsUsageStreaming = supportsUsageStreaming;
        return this;
    }

    /**
     * 是否支持使用量流式传输。
     * @return supportsUsageStreaming
     */
    public Boolean getSupportsUsageStreaming() {
        return supportsUsageStreaming;
    }

    public void setSupportsUsageStreaming(Boolean supportsUsageStreaming) {
        this.supportsUsageStreaming = supportsUsageStreaming;
    }

    public ModelCompat withSupportsDeveloperRole(Boolean supportsDeveloperRole) {
        this.supportsDeveloperRole = supportsDeveloperRole;
        return this;
    }

    /**
     * 是否支持开发者角色。
     * @return supportsDeveloperRole
     */
    public Boolean getSupportsDeveloperRole() {
        return supportsDeveloperRole;
    }

    public void setSupportsDeveloperRole(Boolean supportsDeveloperRole) {
        this.supportsDeveloperRole = supportsDeveloperRole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelCompat that = (ModelCompat) obj;
        return Objects.equals(this.supportsUsageStreaming, that.supportsUsageStreaming)
            && Objects.equals(this.supportsDeveloperRole, that.supportsDeveloperRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportsUsageStreaming, supportsDeveloperRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelCompat {\n");
        sb.append("    supportsUsageStreaming: ").append(toIndentedString(supportsUsageStreaming)).append("\n");
        sb.append("    supportsDeveloperRole: ").append(toIndentedString(supportsDeveloperRole)).append("\n");
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
