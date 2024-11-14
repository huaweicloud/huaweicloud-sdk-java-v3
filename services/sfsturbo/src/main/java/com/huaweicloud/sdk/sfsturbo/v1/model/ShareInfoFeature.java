package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件系统的特性支持情况。
 */
public class ShareInfoFeature {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support")

    private Boolean isSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg_code")

    private String msgCode;

    public ShareInfoFeature withIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }

    /**
     * 文件系统是否支持该特性
     * @return isSupport
     */
    public Boolean getIsSupport() {
        return isSupport;
    }

    public void setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
    }

    public ShareInfoFeature withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 文件系统是否支持该特性的详细信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ShareInfoFeature withMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }

    /**
     * 文件系统是否支持该特性的详细信息
     * @return msgCode
     */
    public String getMsgCode() {
        return msgCode;
    }

    public void setMsgCode(String msgCode) {
        this.msgCode = msgCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShareInfoFeature that = (ShareInfoFeature) obj;
        return Objects.equals(this.isSupport, that.isSupport) && Objects.equals(this.message, that.message)
            && Objects.equals(this.msgCode, that.msgCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSupport, message, msgCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShareInfoFeature {\n");
        sb.append("    isSupport: ").append(toIndentedString(isSupport)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    msgCode: ").append(toIndentedString(msgCode)).append("\n");
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
