package com.huaweicloud.sdk.nlp.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.ClassificationResult;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunClassificationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    @JacksonXmlProperty(localName = "result")
    
    private ClassificationResult result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    @JacksonXmlProperty(localName = "error_code")
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    @JacksonXmlProperty(localName = "error_msg")
    
    private String errorMsg;

    public RunClassificationResponse withResult(ClassificationResult result) {
        this.result = result;
        return this;
    }

    public RunClassificationResponse withResult(Consumer<ClassificationResult> resultSetter) {
        if(this.result == null ){
            this.result = new ClassificationResult();
            resultSetter.accept(this.result);
        }
        
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public ClassificationResult getResult() {
        return result;
    }

    public void setResult(ClassificationResult result) {
        this.result = result;
    }

    

    public RunClassificationResponse withErrorCode(String errorCode) {
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

    

    public RunClassificationResponse withErrorMsg(String errorMsg) {
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
        RunClassificationResponse runClassificationResponse = (RunClassificationResponse) o;
        return Objects.equals(this.result, runClassificationResponse.result) &&
            Objects.equals(this.errorCode, runClassificationResponse.errorCode) &&
            Objects.equals(this.errorMsg, runClassificationResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(result, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunClassificationResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

