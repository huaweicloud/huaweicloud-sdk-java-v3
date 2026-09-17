package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IssueFlowRequest
 */
public class IssueFlowRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private Integer statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assigned_to_id")

    private String assignedToId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notes")

    private String notes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectUUId")

    private String projectUUId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public IssueFlowRequest withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * **参数解释**： 状态id。 **约束限制**： 不涉及。 **取值范围**： 1（新建） 2（进行中） 3（已解决） 4（测试中） 5（已关闭） 6（已拒绝）。 **默认取值**： 不涉及。
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public IssueFlowRequest withAssignedToId(String assignedToId) {
        this.assignedToId = assignedToId;
        return this;
    }

    /**
     * **参数解释：** 模块的负责人id，通过[获取指定项目的成员用户列表](ListProjectMembersV4.xml)接口获取，响应消息体中的**user_id**字段的值就是模块的负责人id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return assignedToId
     */
    public String getAssignedToId() {
        return assignedToId;
    }

    public void setAssignedToId(String assignedToId) {
        this.assignedToId = assignedToId;
    }

    public IssueFlowRequest withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * **参数解释：** 与日志记录相关的备注或注释。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return notes
     */
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public IssueFlowRequest withProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
        return this;
    }

    /**
     * **参数解释**： 项目的32位uuid，项目唯一标识，通过[查询项目列表](ListProjectsV4.xml)接口获取，响应消息体中的**project_id**字段的值就是项目ID。 **约束限制**： 32位的数字和字母组成的字符串。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return projectUUId
     */
    public String getProjectUUId() {
        return projectUUId;
    }

    public void setProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
    }

    public IssueFlowRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工作项id，可通过[高级查询工作项](ListIssuesV4.xml)接口获取，响应消息体中的**id**字段的值就是工作项id。 **约束限制：** 长度在1位到10位之间的纯数字。 **取值范围：** 最小长度：1，最大长度：10。 **默认取值：** 不涉及。
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IssueFlowRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 项目状态。 **约束限制**： 不涉及。 **取值范围**： scrum。 **默认取值**： 不涉及。
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
        IssueFlowRequest that = (IssueFlowRequest) obj;
        return Objects.equals(this.statusId, that.statusId) && Objects.equals(this.assignedToId, that.assignedToId)
            && Objects.equals(this.notes, that.notes) && Objects.equals(this.projectUUId, that.projectUUId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusId, assignedToId, notes, projectUUId, id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueFlowRequest {\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    assignedToId: ").append(toIndentedString(assignedToId)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    projectUUId: ").append(toIndentedString(projectUUId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
