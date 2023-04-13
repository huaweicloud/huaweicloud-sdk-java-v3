package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CaseQueryLabel
 */
public class CaseQueryLabel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelId")

    private String labelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    public CaseQueryLabel withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * 标签标识
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public CaseQueryLabel withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 标签名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CaseQueryLabel withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 标签颜色
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaseQueryLabel caseQueryLabel = (CaseQueryLabel) o;
        return Objects.equals(this.labelId, caseQueryLabel.labelId) && Objects.equals(this.name, caseQueryLabel.name)
            && Objects.equals(this.color, caseQueryLabel.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelId, name, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaseQueryLabel {\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
