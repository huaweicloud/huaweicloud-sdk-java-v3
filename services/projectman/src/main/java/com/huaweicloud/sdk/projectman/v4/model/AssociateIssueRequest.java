package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联工作项请求对象
 */
public class AssociateIssueRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectUUId")

    private String projectUUId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachProjectUUId")

    private String attachProjectUUId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issueId")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associatedIssueIdList")

    private List<String> associatedIssueIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unassociatedIssueIdList")

    private List<String> unassociatedIssueIdList = null;

    public AssociateIssueRequest withProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
        return this;
    }

    /**
     * **参数解释**： 源项目UUID。标识执行关联操作的源工作项所属项目。 **约束限制**： 32位UUID字符串,必填字段。 **取值范围**： 32个字符,由小写字母和数字组成。 **默认取值**： 不涉及。
     * @return projectUUId
     */
    public String getProjectUUId() {
        return projectUUId;
    }

    public void setProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
    }

    public AssociateIssueRequest withAttachProjectUUId(String attachProjectUUId) {
        this.attachProjectUUId = attachProjectUUId;
        return this;
    }

    /**
     * **参数解释**： 目标项目UUID。标识待关联工作项所属的项目;跨项目关联时必填,同项目关联时可省略。 **约束限制**： 32位UUID字符串;若与projectUUId不同则视为跨项目关联。 **取值范围**： 32个字符,由小写字母和数字组成。 **默认取值**： 不涉及。
     * @return attachProjectUUId
     */
    public String getAttachProjectUUId() {
        return attachProjectUUId;
    }

    public void setAttachProjectUUId(String attachProjectUUId) {
        this.attachProjectUUId = attachProjectUUId;
    }

    public AssociateIssueRequest withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * **参数解释**： 源工作项ID。即需要建立关联关系的工作项唯一ID。 **约束限制**： 工作项必须存在且未被归档。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public AssociateIssueRequest withAssociatedIssueIdList(List<String> associatedIssueIdList) {
        this.associatedIssueIdList = associatedIssueIdList;
        return this;
    }

    public AssociateIssueRequest addAssociatedIssueIdListItem(String associatedIssueIdListItem) {
        if (this.associatedIssueIdList == null) {
            this.associatedIssueIdList = new ArrayList<>();
        }
        this.associatedIssueIdList.add(associatedIssueIdListItem);
        return this;
    }

    public AssociateIssueRequest withAssociatedIssueIdList(Consumer<List<String>> associatedIssueIdListSetter) {
        if (this.associatedIssueIdList == null) {
            this.associatedIssueIdList = new ArrayList<>();
        }
        associatedIssueIdListSetter.accept(this.associatedIssueIdList);
        return this;
    }

    /**
     * **参数解释**： 待关联工作项ID列表。本次操作需要新增关联关系的目标工作项ID集合。 **约束限制**： 每个元素为字符串形式的工作项ID(服务端自动转换为整数);不能包含issueId自身;单工作项关联总数受系统上限约束。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return associatedIssueIdList
     */
    public List<String> getAssociatedIssueIdList() {
        return associatedIssueIdList;
    }

    public void setAssociatedIssueIdList(List<String> associatedIssueIdList) {
        this.associatedIssueIdList = associatedIssueIdList;
    }

    public AssociateIssueRequest withUnassociatedIssueIdList(List<String> unassociatedIssueIdList) {
        this.unassociatedIssueIdList = unassociatedIssueIdList;
        return this;
    }

    public AssociateIssueRequest addUnassociatedIssueIdListItem(String unassociatedIssueIdListItem) {
        if (this.unassociatedIssueIdList == null) {
            this.unassociatedIssueIdList = new ArrayList<>();
        }
        this.unassociatedIssueIdList.add(unassociatedIssueIdListItem);
        return this;
    }

    public AssociateIssueRequest withUnassociatedIssueIdList(Consumer<List<String>> unassociatedIssueIdListSetter) {
        if (this.unassociatedIssueIdList == null) {
            this.unassociatedIssueIdList = new ArrayList<>();
        }
        unassociatedIssueIdListSetter.accept(this.unassociatedIssueIdList);
        return this;
    }

    /**
     * **参数解释**： 待取消关联工作项ID列表。本次操作需要解除关联关系的目标工作项ID集合;可在同一次请求中混合使用以支持关联关系调整。 **约束限制**： 每个元素为字符串形式的工作项ID;仅处理已存在的关联关系。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return unassociatedIssueIdList
     */
    public List<String> getUnassociatedIssueIdList() {
        return unassociatedIssueIdList;
    }

    public void setUnassociatedIssueIdList(List<String> unassociatedIssueIdList) {
        this.unassociatedIssueIdList = unassociatedIssueIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateIssueRequest that = (AssociateIssueRequest) obj;
        return Objects.equals(this.projectUUId, that.projectUUId)
            && Objects.equals(this.attachProjectUUId, that.attachProjectUUId)
            && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.associatedIssueIdList, that.associatedIssueIdList)
            && Objects.equals(this.unassociatedIssueIdList, that.unassociatedIssueIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUUId, attachProjectUUId, issueId, associatedIssueIdList, unassociatedIssueIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateIssueRequest {\n");
        sb.append("    projectUUId: ").append(toIndentedString(projectUUId)).append("\n");
        sb.append("    attachProjectUUId: ").append(toIndentedString(attachProjectUUId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    associatedIssueIdList: ").append(toIndentedString(associatedIssueIdList)).append("\n");
        sb.append("    unassociatedIssueIdList: ").append(toIndentedString(unassociatedIssueIdList)).append("\n");
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
