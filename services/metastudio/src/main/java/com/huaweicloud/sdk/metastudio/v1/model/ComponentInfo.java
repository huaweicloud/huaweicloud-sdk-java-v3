package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组件信息。
 */
public class ComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_type")

    private String componentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_desc")

    private String componentDesc;

    public ComponentInfo withComponentName(String componentName) {
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

    public ComponentInfo withComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * 组件类型。
     * @return componentType
     */
    public String getComponentType() {
        return componentType;
    }

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    public ComponentInfo withComponentDesc(String componentDesc) {
        this.componentDesc = componentDesc;
        return this;
    }

    /**
     * 组件描述。
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
        ComponentInfo that = (ComponentInfo) obj;
        return Objects.equals(this.componentName, that.componentName)
            && Objects.equals(this.componentType, that.componentType)
            && Objects.equals(this.componentDesc, that.componentDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentName, componentType, componentDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInfo {\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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
