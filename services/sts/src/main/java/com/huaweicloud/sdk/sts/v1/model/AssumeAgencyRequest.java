package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssumeAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssumeAgencyReqBody body;

    public AssumeAgencyRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 通过临时安全凭证调用接口时，需要提供“X-Security-Token”Http头，取值为临时安全凭证的security_token字段。
     * @return xSecurityToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")
    public String getXSecurityToken() {
        return xSecurityToken;
    }

    public void setXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
    }

    public AssumeAgencyRequest withBody(AssumeAgencyReqBody body) {
        this.body = body;
        return this;
    }

    public AssumeAgencyRequest withBody(Consumer<AssumeAgencyReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssumeAgencyReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssumeAgencyReqBody getBody() {
        return body;
    }

    public void setBody(AssumeAgencyReqBody body) {
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
        AssumeAgencyRequest that = (AssumeAgencyRequest) obj;
        return Objects.equals(this.xSecurityToken, that.xSecurityToken) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecurityToken, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssumeAgencyRequest {\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
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
