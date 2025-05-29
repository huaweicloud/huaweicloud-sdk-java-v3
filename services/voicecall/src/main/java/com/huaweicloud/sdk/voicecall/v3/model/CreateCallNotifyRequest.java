package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateCallNotifyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-AKSK")

    private String xAksk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CallNotifyReq body;

    public CreateCallNotifyRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * 固定填写为AKSK realm='SDP',profile='UsernameToken',type='Appkey'。
     * @return authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public CreateCallNotifyRequest withXAksk(String xAksk) {
        this.xAksk = xAksk;
        return this;
    }

    /**
     * 取值为UsernameToken Username='APP_Key的值', PasswordDigest='PasswordDigest的值', Nonce='随机数', Created='随机数生成时间'。
     * @return xAksk
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-AKSK")
    public String getXAksk() {
        return xAksk;
    }

    public void setXAksk(String xAksk) {
        this.xAksk = xAksk;
    }

    public CreateCallNotifyRequest withBody(CallNotifyReq body) {
        this.body = body;
        return this;
    }

    public CreateCallNotifyRequest withBody(Consumer<CallNotifyReq> bodySetter) {
        if (this.body == null) {
            this.body = new CallNotifyReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CallNotifyReq getBody() {
        return body;
    }

    public void setBody(CallNotifyReq body) {
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
        CreateCallNotifyRequest that = (CreateCallNotifyRequest) obj;
        return Objects.equals(this.authorization, that.authorization) && Objects.equals(this.xAksk, that.xAksk)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xAksk, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCallNotifyRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xAksk: ").append(toIndentedString(xAksk)).append("\n");
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
