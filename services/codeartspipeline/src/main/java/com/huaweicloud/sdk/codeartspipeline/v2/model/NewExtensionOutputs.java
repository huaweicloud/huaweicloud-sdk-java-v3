package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NewExtensionOutputs
 */
public class NewExtensionOutputs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop")

    private Map<String, String> prop = null;

    public NewExtensionOutputs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 名称。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NewExtensionOutputs withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **取值范围**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NewExtensionOutputs withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NewExtensionOutputs withProp(Map<String, String> prop) {
        this.prop = prop;
        return this;
    }

    public NewExtensionOutputs putPropItem(String key, String propItem) {
        if (this.prop == null) {
            this.prop = new HashMap<>();
        }
        this.prop.put(key, propItem);
        return this;
    }

    public NewExtensionOutputs withProp(Consumer<Map<String, String>> propSetter) {
        if (this.prop == null) {
            this.prop = new HashMap<>();
        }
        propSetter.accept(this.prop);
        return this;
    }

    /**
     * **参数解释**： 扩展信息定义。 **取值范围**： 不涉及。 
     * @return prop
     */
    public Map<String, String> getProp() {
        return prop;
    }

    public void setProp(Map<String, String> prop) {
        this.prop = prop;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewExtensionOutputs that = (NewExtensionOutputs) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.description, that.description) && Objects.equals(this.prop, that.prop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, description, prop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewExtensionOutputs {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    prop: ").append(toIndentedString(prop)).append("\n");
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
