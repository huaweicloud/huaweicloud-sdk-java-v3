package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 删除工作项评论请求对象
 */
public class DeleteIssueNoteParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public DeleteIssueNoteParam withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 评论ID。标识需要删除的工作项评论唯一记录。 **约束限制**： 评论必须存在，且当前用户必须是该评论的创建者。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DeleteIssueNoteParam withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。标识当前评论所属的项目，用于权限校验与服务可用性校验。 **约束限制**： 32位UUID字符串，且必须与评论对应工作项所属项目保持一致。 **取值范围**： 32个字符，由小写字母和数字组成。 **默认取值**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public DeleteIssueNoteParam withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 工作项类型。标识当前操作对应的工作项类型分类。 **约束限制**： 不涉及。 **取值范围**： - scrum：Scrum项目类型工作项 - 其他类型取值请参考实际业务定义。 **默认取值**： 不涉及。
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
        DeleteIssueNoteParam that = (DeleteIssueNoteParam) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteIssueNoteParam {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
