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
public class RunEntitySentimentResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="entity")
    
    
    private String entity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    
    private Integer label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    
    private Double confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunEntitySentimentResponse withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 响应的文本
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public RunEntitySentimentResponse withEntity(String entity) {
        this.entity = entity;
        return this;
    }

    


    /**
     * 响应的实体
     * @return entity
     */
    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    

    public RunEntitySentimentResponse withLabel(Integer label) {
        this.label = label;
        return this;
    }

    


    /**
     * 响应的情感标签，0表示负面，1表示非负面，2表示不相关
     * @return label
     */
    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    

    public RunEntitySentimentResponse withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 该实体在文本中的情感label的置信度
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    

    public RunEntitySentimentResponse withErrorCode(String errorCode) {
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

    

    public RunEntitySentimentResponse withErrorMsg(String errorMsg) {
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
        RunEntitySentimentResponse runEntitySentimentResponse = (RunEntitySentimentResponse) o;
        return Objects.equals(this.content, runEntitySentimentResponse.content) &&
            Objects.equals(this.entity, runEntitySentimentResponse.entity) &&
            Objects.equals(this.label, runEntitySentimentResponse.label) &&
            Objects.equals(this.confidence, runEntitySentimentResponse.confidence) &&
            Objects.equals(this.errorCode, runEntitySentimentResponse.errorCode) &&
            Objects.equals(this.errorMsg, runEntitySentimentResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, entity, label, confidence, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunEntitySentimentResponse {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

