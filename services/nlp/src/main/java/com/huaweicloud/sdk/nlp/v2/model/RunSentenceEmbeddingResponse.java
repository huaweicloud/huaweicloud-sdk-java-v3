package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunSentenceEmbeddingResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vectors")
    
    
    private List<List<Float>> vectors = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunSentenceEmbeddingResponse withVectors(List<List<Float>> vectors) {
        this.vectors = vectors;
        return this;
    }

    
    public RunSentenceEmbeddingResponse addVectorsItem(List<Float> vectorsItem) {
        if(this.vectors == null) {
            this.vectors = new ArrayList<>();
        }
        this.vectors.add(vectorsItem);
        return this;
    }

    public RunSentenceEmbeddingResponse withVectors(Consumer<List<List<Float>>> vectorsSetter) {
        if(this.vectors == null) {
            this.vectors = new ArrayList<>();
        }
        vectorsSetter.accept(this.vectors);
        return this;
    }

    /**
     * 句向量结果列表，按输入句子顺序返回句向量。调用失败时无此字段。
     * @return vectors
     */
    public List<List<Float>> getVectors() {
        return vectors;
    }

    public void setVectors(List<List<Float>> vectors) {
        this.vectors = vectors;
    }

    

    public RunSentenceEmbeddingResponse withErrorCode(String errorCode) {
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

    

    public RunSentenceEmbeddingResponse withErrorMsg(String errorMsg) {
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
        RunSentenceEmbeddingResponse runSentenceEmbeddingResponse = (RunSentenceEmbeddingResponse) o;
        return Objects.equals(this.vectors, runSentenceEmbeddingResponse.vectors) &&
            Objects.equals(this.errorCode, runSentenceEmbeddingResponse.errorCode) &&
            Objects.equals(this.errorMsg, runSentenceEmbeddingResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vectors, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunSentenceEmbeddingResponse {\n");
        sb.append("    vectors: ").append(toIndentedString(vectors)).append("\n");
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

