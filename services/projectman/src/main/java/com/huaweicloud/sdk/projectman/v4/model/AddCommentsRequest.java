package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 工作项添加评论的请求参数。
 */
public class AddCommentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innerText")

    private String innerText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectUUId")

    private String projectUUId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public AddCommentsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工作项id。 **约束限制：** 长度在1位到10位之间的纯数字。 **取值范围：** 最小长度：1，最大长度：10。 **默认取值：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddCommentsRequest withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * **参数解释：** 工作项的URL编码后的评论内容。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public AddCommentsRequest withInnerText(String innerText) {
        this.innerText = innerText;
        return this;
    }

    /**
     * **参数解释：** 工作项的评论内容。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return innerText
     */
    public String getInnerText() {
        return innerText;
    }

    public void setInnerText(String innerText) {
        this.innerText = innerText;
    }

    public AddCommentsRequest withProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
        return this;
    }

    /**
     * **参数解释**： 项目的32位uuid。 **约束限制**： 由数字和英文组成的32字符串。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return projectUUId
     */
    public String getProjectUUId() {
        return projectUUId;
    }

    public void setProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
    }

    public AddCommentsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 工作项所属项目类型。 **约束限制**： 不涉及。 **取值范围**： scrum。 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddCommentsRequest that = (AddCommentsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.notes, that.notes)
            && Objects.equals(this.innerText, that.innerText) && Objects.equals(this.projectUUId, that.projectUUId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, notes, innerText, projectUUId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCommentsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    innerText: ").append(toIndentedString(innerText)).append("\n");
        sb.append("    projectUUId: ").append(toIndentedString(projectUUId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
