package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模板参数params
 */
public class TemplateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private String visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regex")

    private String regex;

    public TemplateParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：参数名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateParam withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：参数描述。 **取值范围**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateParam withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释**：参数取值。 **取值范围**：不涉及。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TemplateParam withVisible(String visible) {
        this.visible = visible;
        return this;
    }

    /**
     * **参数解释**：是否展示在console。 **取值范围**：- true   -false。
     * @return visible
     */
    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public TemplateParam withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * **参数解释**：正则校验。 **取值范围**：不涉及。
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TemplateParam that = (TemplateParam) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.value, that.value) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.regex, that.regex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, value, visible, regex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
