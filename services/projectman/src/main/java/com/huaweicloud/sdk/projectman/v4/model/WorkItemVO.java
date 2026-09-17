package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 工作项信息对象，包含工作项ID、标题、编号、分类、状态、责任人等。 **约束限制**： 不涉及。
 */
public class WorkItemVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusVoIpd status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private UserVO assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private String baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_status")

    private String changeStatus;

    public WorkItemVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 工作项唯一ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WorkItemVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释**： 工作项标题。 **取值范围**： 不涉及。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WorkItemVO withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释**： 工作项编号。 **取值范围**： 不涉及。
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public WorkItemVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 工作项分类。 **取值范围**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public WorkItemVO withStatus(StatusVoIpd status) {
        this.status = status;
        return this;
    }

    public WorkItemVO withStatus(Consumer<StatusVoIpd> statusSetter) {
        if (this.status == null) {
            this.status = new StatusVoIpd();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusVoIpd getStatus() {
        return status;
    }

    public void setStatus(StatusVoIpd status) {
        this.status = status;
    }

    public WorkItemVO withAssignee(UserVO assignee) {
        this.assignee = assignee;
        return this;
    }

    public WorkItemVO withAssignee(Consumer<UserVO> assigneeSetter) {
        if (this.assignee == null) {
            this.assignee = new UserVO();
            assigneeSetter.accept(this.assignee);
        }

        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    public UserVO getAssignee() {
        return assignee;
    }

    public void setAssignee(UserVO assignee) {
        this.assignee = assignee;
    }

    public WorkItemVO withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * **参数解释**： 工作项基线状态。 **取值范围**： - baselined：已基线 - unbaseline：未基线 - \"\"：未基线
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public WorkItemVO withChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
        return this;
    }

    /**
     * **参数解释**： 工作项变更状态。 **取值范围**： - cannot_finish：不可完成
     * @return changeStatus
     */
    public String getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(String changeStatus) {
        this.changeStatus = changeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemVO that = (WorkItemVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.title, that.title)
            && Objects.equals(this.number, that.number) && Objects.equals(this.category, that.category)
            && Objects.equals(this.status, that.status) && Objects.equals(this.assignee, that.assignee)
            && Objects.equals(this.baseline, that.baseline) && Objects.equals(this.changeStatus, that.changeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, number, category, status, assignee, baseline, changeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    changeStatus: ").append(toIndentedString(changeStatus)).append("\n");
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
