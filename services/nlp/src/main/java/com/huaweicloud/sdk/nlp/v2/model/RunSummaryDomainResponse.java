package com.huaweicloud.sdk.nlp.v2.model;





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
public class RunSummaryDomainResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="summary")
    
    
    private String summary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunSummaryDomainResponse withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    


    /**
     * 根据文本请求体，返回摘要结果。调用失败时无此字段。
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    

    public RunSummaryDomainResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public RunSummaryDomainResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 调用失败时的错误信息。调用成功时无此字段。
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
        RunSummaryDomainResponse runSummaryDomainResponse = (RunSummaryDomainResponse) o;
        return Objects.equals(this.summary, runSummaryDomainResponse.summary) &&
            Objects.equals(this.errorCode, runSummaryDomainResponse.errorCode) &&
            Objects.equals(this.errorMsg, runSummaryDomainResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(summary, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSummaryDomainResponse {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

