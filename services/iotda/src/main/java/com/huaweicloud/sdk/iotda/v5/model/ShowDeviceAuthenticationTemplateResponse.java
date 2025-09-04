package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDeviceAuthenticationTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private AuthenticationTemplateBody templateBody;

    public ShowDeviceAuthenticationTemplateResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 鉴权模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public ShowDeviceAuthenticationTemplateResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 鉴权模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public ShowDeviceAuthenticationTemplateResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 鉴权模板创建的时间。格式：yyyyMMdd'T'HHmmss'Z'，如：20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowDeviceAuthenticationTemplateResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 鉴权模板最后一次修改的时间。格式：yyyyMMdd'T'HHmmss'Z'，如：20151212T121212Z。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowDeviceAuthenticationTemplateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 鉴权模板的描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowDeviceAuthenticationTemplateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：鉴权模板状态 - ACTIVE：该鉴权模板为激活状态。 - INACTIVE：该鉴权模板为停用状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDeviceAuthenticationTemplateResponse withTemplateBody(AuthenticationTemplateBody templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    public ShowDeviceAuthenticationTemplateResponse withTemplateBody(
        Consumer<AuthenticationTemplateBody> templateBodySetter) {
        if (this.templateBody == null) {
            this.templateBody = new AuthenticationTemplateBody();
            templateBodySetter.accept(this.templateBody);
        }

        return this;
    }

    /**
     * Get templateBody
     * @return templateBody
     */
    public AuthenticationTemplateBody getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(AuthenticationTemplateBody templateBody) {
        this.templateBody = templateBody;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeviceAuthenticationTemplateResponse that = (ShowDeviceAuthenticationTemplateResponse) obj;
        return Objects.equals(this.templateId, that.templateId) && Objects.equals(this.templateName, that.templateName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.templateBody, that.templateBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, templateName, createTime, updateTime, description, status, templateBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeviceAuthenticationTemplateResponse {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    templateBody: ").append(toIndentedString(templateBody)).append("\n");
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
