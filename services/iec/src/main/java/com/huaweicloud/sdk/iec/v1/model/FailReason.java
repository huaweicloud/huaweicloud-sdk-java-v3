package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 失败原因对象。
 */
public class FailReason  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_code")
    
    private String failCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fail_message")
    
    private String failMessage;

    public FailReason withFailCode(String failCode) {
        this.failCode = failCode;
        return this;
    }

    


    /**
     * 错误码
     * @return failCode
     */
    public String getFailCode() {
        return failCode;
    }

    public void setFailCode(String failCode) {
        this.failCode = failCode;
    }

    

    public FailReason withFailMessage(String failMessage) {
        this.failMessage = failMessage;
        return this;
    }

    


    /**
     * 边缘云失败原因列表。包含所边缘云的失败原因。
     * @return failMessage
     */
    public String getFailMessage() {
        return failMessage;
    }

    public void setFailMessage(String failMessage) {
        this.failMessage = failMessage;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailReason failReason = (FailReason) o;
        return Objects.equals(this.failCode, failReason.failCode) &&
            Objects.equals(this.failMessage, failReason.failMessage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(failCode, failMessage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailReason {\n");
        sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
        sb.append("    failMessage: ").append(toIndentedString(failMessage)).append("\n");
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

