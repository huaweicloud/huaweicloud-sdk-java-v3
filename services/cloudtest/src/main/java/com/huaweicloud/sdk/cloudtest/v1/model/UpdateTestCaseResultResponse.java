package com.huaweicloud.sdk.cloudtest.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudtest.v1.model.ErrorDetailInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateTestCaseResultResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_detail")
    
    private ErrorDetailInfo errorDetail;

    public UpdateTestCaseResultResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 接口调用失败错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public UpdateTestCaseResultResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 接口调用失败错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    public UpdateTestCaseResultResponse withErrorDetail(ErrorDetailInfo errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    public UpdateTestCaseResultResponse withErrorDetail(Consumer<ErrorDetailInfo> errorDetailSetter) {
        if(this.errorDetail == null ){
            this.errorDetail = new ErrorDetailInfo();
            errorDetailSetter.accept(this.errorDetail);
        }
        
        return this;
    }


    /**
     * Get errorDetail
     * @return errorDetail
     */
    public ErrorDetailInfo getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(ErrorDetailInfo errorDetail) {
        this.errorDetail = errorDetail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTestCaseResultResponse updateTestCaseResultResponse = (UpdateTestCaseResultResponse) o;
        return Objects.equals(this.errorCode, updateTestCaseResultResponse.errorCode) &&
            Objects.equals(this.errorMsg, updateTestCaseResultResponse.errorMsg) &&
            Objects.equals(this.errorDetail, updateTestCaseResultResponse.errorDetail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorCode, errorMsg, errorDetail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTestCaseResultResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

