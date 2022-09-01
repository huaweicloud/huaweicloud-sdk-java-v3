package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTemplateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateTemplateReq body;

    public UpdateTemplateRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 需要修改信息的模板的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateTemplateRequest withBody(UpdateTemplateReq body) {
        this.body = body;
        return this;
    }

    public UpdateTemplateRequest withBody(Consumer<UpdateTemplateReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateTemplateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateTemplateReq getBody() {
        return body;
    }

    public void setBody(UpdateTemplateReq body) {
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
        UpdateTemplateRequest updateTemplateRequest = (UpdateTemplateRequest) o;
        return Objects.equals(this.id, updateTemplateRequest.id)
            && Objects.equals(this.body, updateTemplateRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTemplateRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
