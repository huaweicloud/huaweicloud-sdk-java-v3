package com.huaweicloud.sdk.codeartsinspector.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostVulnItemComponentList
 */
public class HostVulnItemComponentList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentName")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentInstallVersion")

    private String componentInstallVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentFixedVersion")

    private String componentFixedVersion;

    public HostVulnItemComponentList withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 内容名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public HostVulnItemComponentList withComponentInstallVersion(String componentInstallVersion) {
        this.componentInstallVersion = componentInstallVersion;
        return this;
    }

    /**
     * 安装版本
     * @return componentInstallVersion
     */
    public String getComponentInstallVersion() {
        return componentInstallVersion;
    }

    public void setComponentInstallVersion(String componentInstallVersion) {
        this.componentInstallVersion = componentInstallVersion;
    }

    public HostVulnItemComponentList withComponentFixedVersion(String componentFixedVersion) {
        this.componentFixedVersion = componentFixedVersion;
        return this;
    }

    /**
     * 已经修复版本
     * @return componentFixedVersion
     */
    public String getComponentFixedVersion() {
        return componentFixedVersion;
    }

    public void setComponentFixedVersion(String componentFixedVersion) {
        this.componentFixedVersion = componentFixedVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostVulnItemComponentList that = (HostVulnItemComponentList) obj;
        return Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.componentInstallVersion, that.componentInstallVersion)
            && Objects.equals(this.componentFixedVersion, that.componentFixedVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentName, componentInstallVersion, componentFixedVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVulnItemComponentList {\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    componentInstallVersion: ").append(toIndentedString(componentInstallVersion)).append("\n");
        sb.append("    componentFixedVersion: ").append(toIndentedString(componentFixedVersion)).append("\n");
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
