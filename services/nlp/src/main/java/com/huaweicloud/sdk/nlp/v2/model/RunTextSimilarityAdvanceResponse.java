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
public class RunTextSimilarityAdvanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="similarity")
    
    
    private Float similarity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunTextSimilarityAdvanceResponse withSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }

    


    /**
     * 相似度得分，范围在0~1，默认小数点后保留8位。调用失败时无此字段。
     * @return similarity
     */
    public Float getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Float similarity) {
        this.similarity = similarity;
    }

    

    public RunTextSimilarityAdvanceResponse withErrorCode(String errorCode) {
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

    

    public RunTextSimilarityAdvanceResponse withErrorMsg(String errorMsg) {
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
        RunTextSimilarityAdvanceResponse runTextSimilarityAdvanceResponse = (RunTextSimilarityAdvanceResponse) o;
        return Objects.equals(this.similarity, runTextSimilarityAdvanceResponse.similarity) &&
            Objects.equals(this.errorCode, runTextSimilarityAdvanceResponse.errorCode) &&
            Objects.equals(this.errorMsg, runTextSimilarityAdvanceResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(similarity, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTextSimilarityAdvanceResponse {\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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

