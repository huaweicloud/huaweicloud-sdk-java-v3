package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGroupMergeRequestTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    public DeleteGroupMergeRequestTemplateRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public DeleteGroupMergeRequestTemplateRequest withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数解释：** 合并请求模板id。
     * minimum: 1
     * maximum: 2147483647
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGroupMergeRequestTemplateRequest that = (DeleteGroupMergeRequestTemplateRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.templateId, that.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGroupMergeRequestTemplateRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
