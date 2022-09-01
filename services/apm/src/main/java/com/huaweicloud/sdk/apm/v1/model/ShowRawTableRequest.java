package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowRawTableRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")

    @JacksonXmlProperty(localName = "x-business-id")

    private Long xBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RawTableParam body;

    public ShowRawTableRequest withXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
        return this;
    }

    /**
     * 应用id
     * @return xBusinessId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-business-id")
    public Long getXBusinessId() {
        return xBusinessId;
    }

    public void setXBusinessId(Long xBusinessId) {
        this.xBusinessId = xBusinessId;
    }

    public ShowRawTableRequest withBody(RawTableParam body) {
        this.body = body;
        return this;
    }

    public ShowRawTableRequest withBody(Consumer<RawTableParam> bodySetter) {
        if (this.body == null) {
            this.body = new RawTableParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RawTableParam getBody() {
        return body;
    }

    public void setBody(RawTableParam body) {
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
        ShowRawTableRequest showRawTableRequest = (ShowRawTableRequest) o;
        return Objects.equals(this.xBusinessId, showRawTableRequest.xBusinessId)
            && Objects.equals(this.body, showRawTableRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xBusinessId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRawTableRequest {\n");
        sb.append("    xBusinessId: ").append(toIndentedString(xBusinessId)).append("\n");
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
