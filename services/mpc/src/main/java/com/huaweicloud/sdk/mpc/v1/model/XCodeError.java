package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * XCodeError
 */
public class XCodeError  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="msg")
    
    private String msg;

    public XCodeError withCode(String code) {
        this.code = code;
        return this;
    }

    


    /**
     * 错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public XCodeError withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    


    /**
     * 错误信息
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        XCodeError xcodeError = (XCodeError) o;
        return Objects.equals(this.code, xcodeError.code) &&
            Objects.equals(this.msg, xcodeError.msg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, msg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class XCodeError {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

