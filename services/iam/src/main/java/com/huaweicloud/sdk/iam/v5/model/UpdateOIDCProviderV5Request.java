package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateOIDCProviderV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_id")

    private String providerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateOIDCProviderReqBody body;

    public UpdateOIDCProviderV5Request withProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * 提供商ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return providerId
     */
    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public UpdateOIDCProviderV5Request withBody(UpdateOIDCProviderReqBody body) {
        this.body = body;
        return this;
    }

    public UpdateOIDCProviderV5Request withBody(Consumer<UpdateOIDCProviderReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateOIDCProviderReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateOIDCProviderReqBody getBody() {
        return body;
    }

    public void setBody(UpdateOIDCProviderReqBody body) {
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
        UpdateOIDCProviderV5Request that = (UpdateOIDCProviderV5Request) obj;
        return Objects.equals(this.providerId, that.providerId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(providerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOIDCProviderV5Request {\n");
        sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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
