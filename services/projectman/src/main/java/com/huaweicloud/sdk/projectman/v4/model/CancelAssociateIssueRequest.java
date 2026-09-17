package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 取消关联工作项请求对象
 */
public class CancelAssociateIssueRequest {

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
    @JsonProperty(value = "attachIssueId")

    private Integer attachIssueId;

    public CancelAssociateIssueRequest withProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
        return this;
    }

    /**
     * **参数解释**： 源项目UUID。标识执行取消关联操作的源工作项所属项目。 **约束限制**： 32位UUID字符串,必填字段。 **取值范围**： 32个字符,由小写字母和数字组成。 **默认取值**： 不涉及。
     * @return projectUUId
     */
    public String getProjectUUId() {
        return projectUUId;
    }

    public void setProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
    }

    public CancelAssociateIssueRequest withAttachProjectUUId(String attachProjectUUId) {
        this.attachProjectUUId = attachProjectUUId;
        return this;
    }

    /**
     * **参数解释**： 目标项目UUID。标识被取消关联工作项所属的项目;跨项目取消时必填。 **约束限制**： 32位UUID字符串。 **取值范围**： 32个字符,由小写字母和数字组成。 **默认取值**： 不涉及。
     * @return attachProjectUUId
     */
    public String getAttachProjectUUId() {
        return attachProjectUUId;
    }

    public void setAttachProjectUUId(String attachProjectUUId) {
        this.attachProjectUUId = attachProjectUUId;
    }

    public CancelAssociateIssueRequest withIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * **参数解释**： 源工作项ID。即需要解除关联关系的工作项唯一ID。 **约束限制**： 工作项必须存在且未被归档。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return issueId
     */
    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public CancelAssociateIssueRequest withAttachIssueId(Integer attachIssueId) {
        this.attachIssueId = attachIssueId;
        return this;
    }

    /**
     * **参数解释**： 待取消关联的目标工作项ID。 **约束限制**： 必须与源工作项已存在关联关系;不存在则返回错误码DEV_21_400806。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return attachIssueId
     */
    public Integer getAttachIssueId() {
        return attachIssueId;
    }

    public void setAttachIssueId(Integer attachIssueId) {
        this.attachIssueId = attachIssueId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelAssociateIssueRequest that = (CancelAssociateIssueRequest) obj;
        return Objects.equals(this.projectUUId, that.projectUUId)
            && Objects.equals(this.attachProjectUUId, that.attachProjectUUId)
            && Objects.equals(this.issueId, that.issueId) && Objects.equals(this.attachIssueId, that.attachIssueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUUId, attachProjectUUId, issueId, attachIssueId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelAssociateIssueRequest {\n");
        sb.append("    projectUUId: ").append(toIndentedString(projectUUId)).append("\n");
        sb.append("    attachProjectUUId: ").append(toIndentedString(attachProjectUUId)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    attachIssueId: ").append(toIndentedString(attachIssueId)).append("\n");
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
