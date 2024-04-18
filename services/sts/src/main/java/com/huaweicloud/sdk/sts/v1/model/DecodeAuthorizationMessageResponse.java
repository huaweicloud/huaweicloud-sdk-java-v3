package com.huaweicloud.sdk.sts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DecodeAuthorizationMessageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decoded_message")

    private String decodedMessage;

    public DecodeAuthorizationMessageResponse withDecodedMessage(String decodedMessage) {
        this.decodedMessage = decodedMessage;
        return this;
    }

    /**
     * 鉴权失败原因的明文。
     * @return decodedMessage
     */
    public String getDecodedMessage() {
        return decodedMessage;
    }

    public void setDecodedMessage(String decodedMessage) {
        this.decodedMessage = decodedMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DecodeAuthorizationMessageResponse that = (DecodeAuthorizationMessageResponse) obj;
        return Objects.equals(this.decodedMessage, that.decodedMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decodedMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DecodeAuthorizationMessageResponse {\n");
        sb.append("    decodedMessage: ").append(toIndentedString(decodedMessage)).append("\n");
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
