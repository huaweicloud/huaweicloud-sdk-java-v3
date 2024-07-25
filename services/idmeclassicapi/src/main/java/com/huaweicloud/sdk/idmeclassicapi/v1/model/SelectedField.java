package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SelectedField
 */
public class SelectedField {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameAs")

    private String nameAs;

    public SelectedField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：**  字段名称，如果是子参考对象的属性，则为“参考对象.属性名称”，例如：“master.name”。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SelectedField withNameAs(String nameAs) {
        this.nameAs = nameAs;
        return this;
    }

    /**
     * **参数解释：**  字段别名。如果不填，默认使用name参数的值。  **约束限制：**  不涉及。  **取值范围：**  不涉及。  **默认取值：**  不涉及。 
     * @return nameAs
     */
    public String getNameAs() {
        return nameAs;
    }

    public void setNameAs(String nameAs) {
        this.nameAs = nameAs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SelectedField that = (SelectedField) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nameAs, that.nameAs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameAs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelectedField {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameAs: ").append(toIndentedString(nameAs)).append("\n");
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
