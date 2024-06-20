package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProvisioningTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private ProvisioningTemplateBody templateBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowProvisioningTemplateResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * **参数说明**：预调配模板ID。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ShowProvisioningTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * **参数说明**：预调配模板名称。 **取值范围**：长度不超过128，只允许中文、字母、数字、下划线（_）、连接符（-）的组合。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ShowProvisioningTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：预调配模板的描述信息。 **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProvisioningTemplateResponse withTemplateBody(ProvisioningTemplateBody templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    public ShowProvisioningTemplateResponse withTemplateBody(Consumer<ProvisioningTemplateBody> templateBodySetter) {
        if (this.templateBody == null) {
            this.templateBody = new ProvisioningTemplateBody();
            templateBodySetter.accept(this.templateBody);
        }

        return this;
    }

    /**
     * Get templateBody
     * @return templateBody
     */
    public ProvisioningTemplateBody getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(ProvisioningTemplateBody templateBody) {
        this.templateBody = templateBody;
    }

    public ShowProvisioningTemplateResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 在物联网平台创建预调配模板的时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowProvisioningTemplateResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 在物联网平台更新预调配模板的时间。格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProvisioningTemplateResponse that = (ShowProvisioningTemplateResponse) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.templateBody, that.templateBody) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, description, templateBody, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProvisioningTemplateResponse {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
