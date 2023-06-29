package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * the request body of login
 */
public class LoginSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ide_type")

    private String ideType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ide_version")

    private String ideVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    public LoginSchema withIdeType(String ideType) {
        this.ideType = ideType;
        return this;
    }

    /**
     * ide_type
     * @return ideType
     */
    public String getIdeType() {
        return ideType;
    }

    public void setIdeType(String ideType) {
        this.ideType = ideType;
    }

    public LoginSchema withIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
        return this;
    }

    /**
     * ide_version
     * @return ideVersion
     */
    public String getIdeVersion() {
        return ideVersion;
    }

    public void setIdeVersion(String ideVersion) {
        this.ideVersion = ideVersion;
    }

    public LoginSchema withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * plugin_version
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginSchema that = (LoginSchema) obj;
        return Objects.equals(this.ideType, that.ideType) && Objects.equals(this.ideVersion, that.ideVersion)
            && Objects.equals(this.pluginVersion, that.pluginVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ideType, ideVersion, pluginVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginSchema {\n");
        sb.append("    ideType: ").append(toIndentedString(ideType)).append("\n");
        sb.append("    ideVersion: ").append(toIndentedString(ideVersion)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
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
