package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateDomainTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tml_id")

    private String tmlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateTemplateRequestBody body;

    public UpdateDomainTemplateRequest withTmlId(String tmlId) {
        this.tmlId = tmlId;
        return this;
    }

    /**
     * **参数解释：** 域名模板ID，可以通过查询域名模板列表接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return tmlId
     */
    public String getTmlId() {
        return tmlId;
    }

    public void setTmlId(String tmlId) {
        this.tmlId = tmlId;
    }

    public UpdateDomainTemplateRequest withBody(CreateTemplateRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateDomainTemplateRequest withBody(Consumer<CreateTemplateRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateTemplateRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateTemplateRequestBody getBody() {
        return body;
    }

    public void setBody(CreateTemplateRequestBody body) {
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
        UpdateDomainTemplateRequest that = (UpdateDomainTemplateRequest) obj;
        return Objects.equals(this.tmlId, that.tmlId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tmlId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainTemplateRequest {\n");
        sb.append("    tmlId: ").append(toIndentedString(tmlId)).append("\n");
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
