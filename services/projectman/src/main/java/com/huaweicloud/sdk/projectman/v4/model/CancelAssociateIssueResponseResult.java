package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * **参数解释**： 被取消的关联关系记录详情,包含关联关系的所有属性信息。
 */
public class CancelAssociateIssueResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identifier")

    private String identifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issueId")

    private Integer issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private Integer projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associateType")

    private String associateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associateIssueId")

    private Integer associateIssueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associateProjectId")

    private Integer associateProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdOn")

    private OffsetDateTime createdOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorId")

    private Integer authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Boolean flag;

    public CancelAssociateIssueResponseResult withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * **参数解释**： 关联关系唯一标识。 **取值范围**： 32个字符,由小写字母和数字组成。
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public CancelAssociateIssueResponseResult withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * **参数解释**： 源工作项ID。 **取值范围**： 不涉及。
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public CancelAssociateIssueResponseResult withProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 源项目数字ID。 **取值范围**： 不涉及。
     * @return projectId
     */
    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public CancelAssociateIssueResponseResult withAssociateType(String associateType) {
        this.associateType = associateType;
        return this;
    }

    /**
     * **参数解释**： 关联类型。 **取值范围**： - associate：关联工作项。
     * @return associateType
     */
    public String getAssociateType() {
        return associateType;
    }

    public void setAssociateType(String associateType) {
        this.associateType = associateType;
    }

    public CancelAssociateIssueResponseResult withAssociateIssueId(Integer associateIssueId) {
        this.associateIssueId = associateIssueId;
        return this;
    }

    /**
     * **参数解释**： 被关联工作项ID。 **取值范围**： 不涉及。
     * @return associateIssueId
     */
    public Integer getAssociateIssueId() {
        return associateIssueId;
    }

    public void setAssociateIssueId(Integer associateIssueId) {
        this.associateIssueId = associateIssueId;
    }

    public CancelAssociateIssueResponseResult withAssociateProjectId(Integer associateProjectId) {
        this.associateProjectId = associateProjectId;
        return this;
    }

    /**
     * **参数解释**： 被关联项目数字ID。 **取值范围**： 不涉及。
     * @return associateProjectId
     */
    public Integer getAssociateProjectId() {
        return associateProjectId;
    }

    public void setAssociateProjectId(Integer associateProjectId) {
        this.associateProjectId = associateProjectId;
    }

    public CancelAssociateIssueResponseResult withCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * **参数解释**： 关联关系创建时间。 **取值范围**： 格式为yyyy-MM-dd HH:mm:ss。
     * @return createdOn
     */
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public CancelAssociateIssueResponseResult withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释**： 创建该关联关系的用户ID。 **取值范围**： 不涉及。
     * @return authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public CancelAssociateIssueResponseResult withFlag(Boolean flag) {
        this.flag = flag;
        return this;
    }

    /**
     * **参数解释**： 关联关系有效标识。 **取值范围**： - true：关联有效。 - false：关联已失效。
     * @return flag
     */
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelAssociateIssueResponseResult that = (CancelAssociateIssueResponseResult) obj;
        return Objects.equals(this.identifier, that.identifier) && Objects.equals(this.issueId, that.issueId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.associateType, that.associateType)
            && Objects.equals(this.associateIssueId, that.associateIssueId)
            && Objects.equals(this.associateProjectId, that.associateProjectId)
            && Objects.equals(this.createdOn, that.createdOn) && Objects.equals(this.authorId, that.authorId)
            && Objects.equals(this.flag, that.flag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier,
            issueId,
            projectId,
            associateType,
            associateIssueId,
            associateProjectId,
            createdOn,
            authorId,
            flag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelAssociateIssueResponseResult {\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    associateType: ").append(toIndentedString(associateType)).append("\n");
        sb.append("    associateIssueId: ").append(toIndentedString(associateIssueId)).append("\n");
        sb.append("    associateProjectId: ").append(toIndentedString(associateProjectId)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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
