package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ValidateHttpsInfoV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_uuid")

    @JacksonXmlProperty(localName = "iam_user_uuid")

    private String iamUserUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private PasswordRequest body;

    public ValidateHttpsInfoV2Request withIamUserUuid(String iamUserUuid) {
        this.iamUserUuid = iamUserUuid;
        return this;
    }

    /**
     * 用户iam_user_uuid
     * @return iamUserUuid
     */
    public String getIamUserUuid() {
        return iamUserUuid;
    }

    public void setIamUserUuid(String iamUserUuid) {
        this.iamUserUuid = iamUserUuid;
    }

    public ValidateHttpsInfoV2Request withBody(PasswordRequest body) {
        this.body = body;
        return this;
    }

    public ValidateHttpsInfoV2Request withBody(Consumer<PasswordRequest> bodySetter) {
        if (this.body == null) {
            this.body = new PasswordRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PasswordRequest getBody() {
        return body;
    }

    public void setBody(PasswordRequest body) {
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
        ValidateHttpsInfoV2Request validateHttpsInfoV2Request = (ValidateHttpsInfoV2Request) o;
        return Objects.equals(this.iamUserUuid, validateHttpsInfoV2Request.iamUserUuid)
            && Objects.equals(this.body, validateHttpsInfoV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUserUuid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateHttpsInfoV2Request {\n");
        sb.append("    iamUserUuid: ").append(toIndentedString(iamUserUuid)).append("\n");
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
