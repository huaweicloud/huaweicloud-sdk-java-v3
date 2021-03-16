package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CreateCompareTaskResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compare_task_id")
    
    private String compareTaskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    private String errorMsg;

    public CreateCompareTaskResult withCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
        return this;
    }

    


    /**
     * 对比任务创建成功后，返回对比任务的id，用于查询该对比任务的结果。
     * @return compareTaskId
     */
    public String getCompareTaskId() {
        return compareTaskId;
    }

    public void setCompareTaskId(String compareTaskId) {
        this.compareTaskId = compareTaskId;
    }

    

    public CreateCompareTaskResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public CreateCompareTaskResult withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCompareTaskResult createCompareTaskResult = (CreateCompareTaskResult) o;
        return Objects.equals(this.compareTaskId, createCompareTaskResult.compareTaskId) &&
            Objects.equals(this.errorCode, createCompareTaskResult.errorCode) &&
            Objects.equals(this.errorMsg, createCompareTaskResult.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(compareTaskId, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompareTaskResult {\n");
        sb.append("    compareTaskId: ").append(toIndentedString(compareTaskId)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

