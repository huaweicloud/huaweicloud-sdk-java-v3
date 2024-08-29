package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateGaussDbInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Subscription-Agency")

    private String subscriptionAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private OpenGaussInstanceRequestBody body;

    public CreateGaussDbInstanceRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CreateGaussDbInstanceRequest withSubscriptionAgency(String subscriptionAgency) {
        this.subscriptionAgency = subscriptionAgency;
        return this;
    }

    /**
     * 委托urn。使用RAM共享的KMS秘钥创建包周期实例时必填,格式iam::{account_id}:agency:{agency_name}。
     * @return subscriptionAgency
     */
    public String getSubscriptionAgency() {
        return subscriptionAgency;
    }

    public void setSubscriptionAgency(String subscriptionAgency) {
        this.subscriptionAgency = subscriptionAgency;
    }

    public CreateGaussDbInstanceRequest withBody(OpenGaussInstanceRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateGaussDbInstanceRequest withBody(Consumer<OpenGaussInstanceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new OpenGaussInstanceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public OpenGaussInstanceRequestBody getBody() {
        return body;
    }

    public void setBody(OpenGaussInstanceRequestBody body) {
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
        CreateGaussDbInstanceRequest that = (CreateGaussDbInstanceRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.subscriptionAgency, that.subscriptionAgency) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, subscriptionAgency, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGaussDbInstanceRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    subscriptionAgency: ").append(toIndentedString(subscriptionAgency)).append("\n");
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
