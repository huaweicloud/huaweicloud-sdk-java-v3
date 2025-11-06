package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateGroupMergeRequestTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateMergeRequestTemplateDto body;

    public UpdateGroupMergeRequestTemplateRequest withGroupId(Integer groupId) {
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

    public UpdateGroupMergeRequestTemplateRequest withTemplateId(Integer templateId) {
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

    public UpdateGroupMergeRequestTemplateRequest withBody(CreateMergeRequestTemplateDto body) {
        this.body = body;
        return this;
    }

    public UpdateGroupMergeRequestTemplateRequest withBody(Consumer<CreateMergeRequestTemplateDto> bodySetter) {
        if (this.body == null) {
            this.body = new CreateMergeRequestTemplateDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateMergeRequestTemplateDto getBody() {
        return body;
    }

    public void setBody(CreateMergeRequestTemplateDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupMergeRequestTemplateRequest that = (UpdateGroupMergeRequestTemplateRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, templateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupMergeRequestTemplateRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
