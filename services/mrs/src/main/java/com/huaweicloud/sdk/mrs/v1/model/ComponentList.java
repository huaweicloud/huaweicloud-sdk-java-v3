package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ComponentList
 */
public class ComponentList  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component_name")
    
    private String componentName;

    public ComponentList withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    


    /**
     * 组件名称
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentList componentList = (ComponentList) o;
        return Objects.equals(this.componentName, componentList.componentName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(componentName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentList {\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
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

