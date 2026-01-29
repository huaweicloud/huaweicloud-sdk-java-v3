package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项标签对象
 */
public class LabelEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_type")

    private String labelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public LabelEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 标签id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LabelEntity withLabelType(String labelType) {
        this.labelType = labelType;
        return this;
    }

    /**
     * 标签所属工作项类型，对应工作项的type字段
     * @return labelType
     */
    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    public LabelEntity withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 标签颜色RGB
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LabelEntity withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 标签标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LabelEntity that = (LabelEntity) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.labelType, that.labelType)
            && Objects.equals(this.color, that.color) && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, labelType, color, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
