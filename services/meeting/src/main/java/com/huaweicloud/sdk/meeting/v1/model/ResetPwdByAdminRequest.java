package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResetPwdByAdminRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-ID")

    @JacksonXmlProperty(localName = "X-Request-ID")

    private String xRequestID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept-Language")

    @JacksonXmlProperty(localName = "Accept-Language")

    private String acceptLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private AdminResetPwdReqDTO body;

    public ResetPwdByAdminRequest withXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
        return this;
    }

    /**
     * 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * @return xRequestID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-ID")
    public String getXRequestID() {
        return xRequestID;
    }

    public void setXRequestID(String xRequestID) {
        this.xRequestID = xRequestID;
    }

    public ResetPwdByAdminRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * 语言参数，默认为中文zh-CN, 英文为en-US
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public ResetPwdByAdminRequest withBody(AdminResetPwdReqDTO body) {
        this.body = body;
        return this;
    }

    public ResetPwdByAdminRequest withBody(Consumer<AdminResetPwdReqDTO> bodySetter) {
        if (this.body == null) {
            this.body = new AdminResetPwdReqDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AdminResetPwdReqDTO getBody() {
        return body;
    }

    public void setBody(AdminResetPwdReqDTO body) {
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
        ResetPwdByAdminRequest resetPwdByAdminRequest = (ResetPwdByAdminRequest) o;
        return Objects.equals(this.xRequestID, resetPwdByAdminRequest.xRequestID)
            && Objects.equals(this.acceptLanguage, resetPwdByAdminRequest.acceptLanguage)
            && Objects.equals(this.body, resetPwdByAdminRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestID, acceptLanguage, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetPwdByAdminRequest {\n");
        sb.append("    xRequestID: ").append(toIndentedString(xRequestID)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
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
