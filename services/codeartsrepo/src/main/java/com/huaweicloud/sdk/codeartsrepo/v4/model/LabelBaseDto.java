package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LabelBaseDto
 */
public class LabelBaseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_color")

    private String textColor;

    public LabelBaseDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 标签ID。 **取值范围：** 1-2147483647
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LabelBaseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 标签名。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LabelBaseDto withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释：** 标签颜色，以6位十六进制表示法给出，带有前导“#”符号（例如，#FFAABB）。 **取值范围：** 正则`^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$`
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LabelBaseDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LabelBaseDto withTextColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    /**
     * **参数解释：** 字体颜色，以6位十六进制表示法给出，带有前导“#”符号（例如，#FFAABB）。 **取值范围：** 正则`^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$`
     * @return textColor
     */
    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LabelBaseDto that = (LabelBaseDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.color, that.color) && Objects.equals(this.description, that.description)
            && Objects.equals(this.textColor, that.textColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, description, textColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelBaseDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
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
