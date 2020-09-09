package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Plugin
 */
public class Plugin  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="attribute")
    
    private String attribute;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;

    public Plugin withAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    


    /**
     * 插件属性
     * @return attribute
     */
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Plugin withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 插件名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Plugin plugin = (Plugin) o;
        return Objects.equals(this.attribute, plugin.attribute) &&
            Objects.equals(this.name, plugin.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(attribute, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Plugin {\n");
        sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

