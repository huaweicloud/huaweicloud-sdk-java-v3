package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新鉴权模板请求体。
 */
public class UpdateAuthenticationTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_body")

    private UpdateAuthenticationTemplateBody templateBody;

    public UpdateAuthenticationTemplate withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：鉴权模板的描述信息。 **取值范围**：长度不超过2048，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateAuthenticationTemplate withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数说明**：是否激活该鉴权模板 - ACTIVE：该鉴权模板为激活状态。 - INACTIVE：该鉴权模板为停用状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateAuthenticationTemplate withTemplateBody(UpdateAuthenticationTemplateBody templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    public UpdateAuthenticationTemplate withTemplateBody(
        Consumer<UpdateAuthenticationTemplateBody> templateBodySetter) {
        if (this.templateBody == null) {
            this.templateBody = new UpdateAuthenticationTemplateBody();
            templateBodySetter.accept(this.templateBody);
        }

        return this;
    }

    /**
     * Get templateBody
     * @return templateBody
     */
    public UpdateAuthenticationTemplateBody getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(UpdateAuthenticationTemplateBody templateBody) {
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
        UpdateAuthenticationTemplate that = (UpdateAuthenticationTemplate) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.templateBody, that.templateBody);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, status, templateBody);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAuthenticationTemplate {\n");
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
