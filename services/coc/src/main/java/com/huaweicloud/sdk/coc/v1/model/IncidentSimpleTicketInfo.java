package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentSimpleTicketInfo
 */
public class IncidentSimpleTicketInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private List<String> assignee = null;

    public IncidentSimpleTicketInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 事件单标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IncidentSimpleTicketInfo withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 事件单单号
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public IncidentSimpleTicketInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件单描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IncidentSimpleTicketInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 事件状态 参考：枚举 [事件状态](coc_api_04_03_001_006.xml) incident_status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public IncidentSimpleTicketInfo withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 事件级别 参考：枚举 [事件级别](coc_api_04_03_001_006.xml) incident_level
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public IncidentSimpleTicketInfo withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public IncidentSimpleTicketInfo withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 单据来源 参考：枚举 [事件来源](coc_api_04_03_001_006.xml) incident_source
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public IncidentSimpleTicketInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人工号
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public IncidentSimpleTicketInfo withAssignee(List<String> assignee) {
        this.assignee = assignee;
        return this;
    }

    public IncidentSimpleTicketInfo addAssigneeItem(String assigneeItem) {
        if (this.assignee == null) {
            this.assignee = new ArrayList<>();
        }
        this.assignee.add(assigneeItem);
        return this;
    }

    public IncidentSimpleTicketInfo withAssignee(Consumer<List<String>> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new ArrayList<>();
        }
        assigneeSetter.accept(this.assignee);
        return this;
    }

    /**
     * 当前责任人，可能存在多个责任人使用列表展示，内容为责任人用户ID信息
     * @return assignee
     */
    public List<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(List<String> assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncidentSimpleTicketInfo that = (IncidentSimpleTicketInfo) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.ticketId, that.ticketId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.level, that.level) && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.source, that.source) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.assignee, that.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, ticketId, description, status, level, enterpriseProject, source, creator, assignee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncidentSimpleTicketInfo {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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
