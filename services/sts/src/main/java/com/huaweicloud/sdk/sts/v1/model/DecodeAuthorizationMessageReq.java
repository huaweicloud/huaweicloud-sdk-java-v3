package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 接口/v5/decode-authorization-message的Http请求体。
 */
public class DecodeAuthorizationMessageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoded_message")

    private String encodedMessage;

    public DecodeAuthorizationMessageReq withEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
        return this;
    }

    /**
     * 加密的鉴权失败原因，字符串长度范围[1,10240]。
     * @return encodedMessage
     */
    public String getEncodedMessage() {
        return encodedMessage;
    }

    public void setEncodedMessage(String encodedMessage) {
        this.encodedMessage = encodedMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecodeAuthorizationMessageReq that = (DecodeAuthorizationMessageReq) obj;
        return Objects.equals(this.encodedMessage, that.encodedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodedMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecodeAuthorizationMessageReq {\n");
        sb.append("    encodedMessage: ").append(toIndentedString(encodedMessage)).append("\n");
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
