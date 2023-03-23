package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateFlinkTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateFlinkTemplateRequestBody body;

    public UpdateFlinkTemplateRequest withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Get templateId
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public UpdateFlinkTemplateRequest withBody(UpdateFlinkTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateFlinkTemplateRequest withBody(Consumer<UpdateFlinkTemplateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateFlinkTemplateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateFlinkTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateFlinkTemplateRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlinkTemplateRequest updateFlinkTemplateRequest = (UpdateFlinkTemplateRequest) o;
        return Objects.equals(this.templateId, updateFlinkTemplateRequest.templateId)
            && Objects.equals(this.body, updateFlinkTemplateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkTemplateRequest {\n");
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
