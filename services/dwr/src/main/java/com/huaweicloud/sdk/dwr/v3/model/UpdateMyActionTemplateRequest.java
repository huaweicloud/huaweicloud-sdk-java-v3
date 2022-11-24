package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateMyActionTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ThirdTemplateRequestBody body;

    public UpdateMyActionTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称。名称必须以third开头，只能由字母、数字、下划线和中划线组成，长度小于等于32个字符。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public UpdateMyActionTemplateRequest withBody(ThirdTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateMyActionTemplateRequest withBody(Consumer<ThirdTemplateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ThirdTemplateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ThirdTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(ThirdTemplateRequestBody body) {
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
        UpdateMyActionTemplateRequest updateMyActionTemplateRequest = (UpdateMyActionTemplateRequest) o;
        return Objects.equals(this.templateName, updateMyActionTemplateRequest.templateName)
            && Objects.equals(this.body, updateMyActionTemplateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMyActionTemplateRequest {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
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
