package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ValidateHttpsInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_user_uuid")

    private String iamUserUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PasswordRequest body;

    public ValidateHttpsInfoRequest withIamUserUuid(String iamUserUuid) {
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

    public ValidateHttpsInfoRequest withBody(PasswordRequest body) {
        this.body = body;
        return this;
    }

    public ValidateHttpsInfoRequest withBody(Consumer<PasswordRequest> bodySetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ValidateHttpsInfoRequest that = (ValidateHttpsInfoRequest) obj;
        return Objects.equals(this.iamUserUuid, that.iamUserUuid) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamUserUuid, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidateHttpsInfoRequest {\n");
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
