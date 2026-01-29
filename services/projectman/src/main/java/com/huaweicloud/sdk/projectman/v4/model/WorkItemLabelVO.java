package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 标签对象
 */
public class WorkItemLabelVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_type")

    private String labelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color")

    private String color;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_by")

    private String modifiedBy;

    public WorkItemLabelVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：**  标签Id。 **约束限制：**  最小长度：18，最大长度：19。 **取值范围：**  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkItemLabelVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释：**  对象类型。 **约束限制：**  固定为Label，表示当前对象类型为标签。 **取值范围：**  不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WorkItemLabelVO withLabelType(String labelType) {
        this.labelType = labelType;
        return this;
    }

    /**
     * **参数解释：**  标签所属的工作项的类别。 **取值范围：**  - requirement - raw requirement - bug - task - feature
     * @return labelType
     */
    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    public WorkItemLabelVO withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * **参数解释：**  标签颜色的RGB值。 **取值范围：**  - #86CAFF - #6DDEBB - #A6DD82 - #FAC20A  - #FA9841 - #F66F6A - #F3689A - #A97AF8 - #71757F - #5E7CE0 - #207AB3 - #169E6C - #6CA83B - #B58200 - #B54E04 - #B02121 - #AD215B - #572DB3 - #4F4F4F - #3C51A6
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public WorkItemLabelVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：**  标签标题。 **约束限制：**  最小长度：1，最大长度：30。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WorkItemLabelVO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**  表示当前对象数据类型为标签。 **约束限制：**  固定为label。 **取值范围：**  label。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WorkItemLabelVO withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释：**  标签的生命周期。 **取值范围：**  - 正在工作 - 作废 - 删除
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WorkItemLabelVO withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * **参数解释：**  最近修改人。 **约束限制：**  不涉及。
     * @return modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemLabelVO that = (WorkItemLabelVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.category, that.category)
            && Objects.equals(this.labelType, that.labelType) && Objects.equals(this.color, that.color)
            && Objects.equals(this.title, that.title) && Objects.equals(this.type, that.type)
            && Objects.equals(this.state, that.state) && Objects.equals(this.modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, labelType, color, title, type, state, modifiedBy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemLabelVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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
