package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ResetVisionActiveCodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept-Language")

    private String acceptLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ActiveDTO body;

    public ResetVisionActiveCodeRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ResetVisionActiveCodeRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** 语言参数，默认为中文zh-CN, 英文为en-US
     * 
     * @return acceptLanguage */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public ResetVisionActiveCodeRequest withAccount(String account) {
        this.account = account;
        return this;
    }

    /** 账号 可通过用户管理中分页查询用户接口获取，对应接口返回userAccount字段。
     * 
     * @return account */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public ResetVisionActiveCodeRequest withBody(ActiveDTO body) {
        this.body = body;
        return this;
    }

    public ResetVisionActiveCodeRequest withBody(Consumer<ActiveDTO> bodySetter) {
        if (this.body == null) {
            this.body = new ActiveDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ActiveDTO getBody() {
        return body;
    }

    public void setBody(ActiveDTO body) {
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
        ResetVisionActiveCodeRequest resetVisionActiveCodeRequest = (ResetVisionActiveCodeRequest) o;
        return Objects.equals(this.xRequestId, resetVisionActiveCodeRequest.xRequestId)
            && Objects.equals(this.acceptLanguage, resetVisionActiveCodeRequest.acceptLanguage)
            && Objects.equals(this.account, resetVisionActiveCodeRequest.account)
            && Objects.equals(this.body, resetVisionActiveCodeRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, account, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetVisionActiveCodeRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
