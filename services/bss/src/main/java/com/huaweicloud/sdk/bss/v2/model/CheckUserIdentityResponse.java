package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckUserIdentityResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="check_result")
    
    private String checkResult;

    public CheckUserIdentityResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 状态码。具体请参考状态码。只有失败才会返回这个参数。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public CheckUserIdentityResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 错误描述信息。只有失败才会返回这个参数。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    public CheckUserIdentityResponse withCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }

    


    /**
     * available：该登录名称/手机号/邮箱有效。used_by_user：该登录名称/手机号/邮箱已被占用。
     * @return checkResult
     */
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckUserIdentityResponse checkUserIdentityResponse = (CheckUserIdentityResponse) o;
        return Objects.equals(this.errorCode, checkUserIdentityResponse.errorCode) &&
            Objects.equals(this.errorMsg, checkUserIdentityResponse.errorMsg) &&
            Objects.equals(this.checkResult, checkUserIdentityResponse.checkResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, checkResult);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckUserIdentityResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    checkResult: ").append(toIndentedString(checkResult)).append("\n");
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

