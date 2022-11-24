package com.huaweicloud.sdk.nlp.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.AspectAdvanceOpinion;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunAspectSentimentAdvanceResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    
    private Integer label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    
    private Float confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aspect_opinions")
    
    
    private List<AspectAdvanceOpinion> aspectOpinions = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunAspectSentimentAdvanceResponse withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 待分析文本
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public RunAspectSentimentAdvanceResponse withLabel(Integer label) {
        this.label = label;
        return this;
    }

    


    /**
     * 该文本的整体情感标签，取值如下： 0  负向 1  正向
     * @return label
     */
    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    

    public RunAspectSentimentAdvanceResponse withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * 该文本整体情感label的置信度,小数点精确到3位。
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    

    public RunAspectSentimentAdvanceResponse withAspectOpinions(List<AspectAdvanceOpinion> aspectOpinions) {
        this.aspectOpinions = aspectOpinions;
        return this;
    }

    
    public RunAspectSentimentAdvanceResponse addAspectOpinionsItem(AspectAdvanceOpinion aspectOpinionsItem) {
        if(this.aspectOpinions == null) {
            this.aspectOpinions = new ArrayList<>();
        }
        this.aspectOpinions.add(aspectOpinionsItem);
        return this;
    }

    public RunAspectSentimentAdvanceResponse withAspectOpinions(Consumer<List<AspectAdvanceOpinion>> aspectOpinionsSetter) {
        if(this.aspectOpinions == null) {
            this.aspectOpinions = new ArrayList<>();
        }
        aspectOpinionsSetter.accept(this.aspectOpinions);
        return this;
    }

    /**
     * 属性情感挖掘列表
     * @return aspectOpinions
     */
    public List<AspectAdvanceOpinion> getAspectOpinions() {
        return aspectOpinions;
    }

    public void setAspectOpinions(List<AspectAdvanceOpinion> aspectOpinions) {
        this.aspectOpinions = aspectOpinions;
    }

    

    public RunAspectSentimentAdvanceResponse withErrorCode(String errorCode) {
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

    

    public RunAspectSentimentAdvanceResponse withErrorMsg(String errorMsg) {
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
        RunAspectSentimentAdvanceResponse runAspectSentimentAdvanceResponse = (RunAspectSentimentAdvanceResponse) o;
        return Objects.equals(this.content, runAspectSentimentAdvanceResponse.content) &&
            Objects.equals(this.label, runAspectSentimentAdvanceResponse.label) &&
            Objects.equals(this.confidence, runAspectSentimentAdvanceResponse.confidence) &&
            Objects.equals(this.aspectOpinions, runAspectSentimentAdvanceResponse.aspectOpinions) &&
            Objects.equals(this.errorCode, runAspectSentimentAdvanceResponse.errorCode) &&
            Objects.equals(this.errorMsg, runAspectSentimentAdvanceResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, label, confidence, aspectOpinions, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunAspectSentimentAdvanceResponse {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    aspectOpinions: ").append(toIndentedString(aspectOpinions)).append("\n");
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

