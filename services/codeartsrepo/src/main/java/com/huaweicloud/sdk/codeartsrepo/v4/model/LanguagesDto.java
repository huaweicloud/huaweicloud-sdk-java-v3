package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LanguagesDto
 */
public class LanguagesDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    public LanguagesDto withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释：** 颜色。
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LanguagesDto withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * **参数解释：** 语言类型。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public LanguagesDto withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * **参数解释：** 比重。
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LanguagesDto that = (LanguagesDto) obj;
        return Objects.equals(this.color, that.color) && Objects.equals(this.label, that.label)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, label, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LanguagesDto {\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
