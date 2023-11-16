package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Objects;

/**
 * 删除失败结果。 
 */
@JacksonXmlRootElement(localName = "DeleteResultError")
public class DeleteResultError {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Key")

    @JacksonXmlProperty(localName = "Key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Code")

    @JacksonXmlProperty(localName = "Code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Message")

    @JacksonXmlProperty(localName = "Message")

    private String message;

    public DeleteResultError withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 每个删除结果的对象名。 
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DeleteResultError withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 删除失败结果的错误码。 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DeleteResultError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 删除失败结果的错误消息。 
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteResultError that = (DeleteResultError) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.code, that.code)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, code, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResultError {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
