package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PluginExtensions
 */
public class PluginExtensions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension_name")

    private String extensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public PluginExtensions withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * 拓展名称
     * @return extensionName
     */
    public String getExtensionName() {
        return extensionName;
    }

    public void setExtensionName(String extensionName) {
        this.extensionName = extensionName;
    }

    public PluginExtensions withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 拓展状态。on表示开启，off表示关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginExtensions that = (PluginExtensions) obj;
        return Objects.equals(this.extensionName, that.extensionName) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extensionName, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginExtensions {\n");
        sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
