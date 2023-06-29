package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentAmb
 */
public class ComponentAmb {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentId")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentName")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentVersion")

    private String componentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "componentDesc")

    private String componentDesc;

    public ComponentAmb withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件ID。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ComponentAmb withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * 组件名称。
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public ComponentAmb withComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
        return this;
    }

    /**
     * 组件版本。
     * @return componentVersion
     */
    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public ComponentAmb withComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
        return this;
    }

    /**
     * 组件描述信息。
     * @return componentDesc
     */
    public String getComponentDesc() {
        return componentDesc;
    }

    public void setComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentAmb that = (ComponentAmb) obj;
        return Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.componentVersion, that.componentVersion)
            && Objects.equals(this.componentDesc, that.componentDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId, componentName, componentVersion, componentDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentAmb {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    componentVersion: ").append(toIndentedString(componentVersion)).append("\n");
        sb.append("    componentDesc: ").append(toIndentedString(componentDesc)).append("\n");
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
