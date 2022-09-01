package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeEnterpriseRealnameAuthenticationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private ChangeEnterpriseRealnameAuthsReq body;

    public ChangeEnterpriseRealnameAuthenticationRequest withBody(ChangeEnterpriseRealnameAuthsReq body) {
        this.body = body;
        return this;
    }

    public ChangeEnterpriseRealnameAuthenticationRequest withBody(
        Consumer<ChangeEnterpriseRealnameAuthsReq> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeEnterpriseRealnameAuthsReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeEnterpriseRealnameAuthsReq getBody() {
        return body;
    }

    public void setBody(ChangeEnterpriseRealnameAuthsReq body) {
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
        ChangeEnterpriseRealnameAuthenticationRequest changeEnterpriseRealnameAuthenticationRequest =
            (ChangeEnterpriseRealnameAuthenticationRequest) o;
        return Objects.equals(this.body, changeEnterpriseRealnameAuthenticationRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeEnterpriseRealnameAuthenticationRequest {\n");
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
