package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteFlinkTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_success")

    @JacksonXmlProperty(localName = "is_success")

    private Boolean isSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    @JacksonXmlProperty(localName = "template")

    private DeleteTemplateRespTemplate template;

    public DeleteFlinkTemplateResponse withIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }

    /**
     * 响应正确与否的标志，true表示成功。
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public DeleteFlinkTemplateResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 消息内容。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DeleteFlinkTemplateResponse withTemplate(DeleteTemplateRespTemplate template) {
        this.template = template;
        return this;
    }

    public DeleteFlinkTemplateResponse withTemplate(Consumer<DeleteTemplateRespTemplate> templateSetter) {
        if (this.template == null) {
            this.template = new DeleteTemplateRespTemplate();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public DeleteTemplateRespTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DeleteTemplateRespTemplate template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteFlinkTemplateResponse deleteFlinkTemplateResponse = (DeleteFlinkTemplateResponse) o;
        return Objects.equals(this.isSuccess, deleteFlinkTemplateResponse.isSuccess)
            && Objects.equals(this.message, deleteFlinkTemplateResponse.message)
            && Objects.equals(this.template, deleteFlinkTemplateResponse.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSuccess, message, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFlinkTemplateResponse {\n");
        sb.append("    isSuccess: ").append(toIndentedString(isSuccess)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
