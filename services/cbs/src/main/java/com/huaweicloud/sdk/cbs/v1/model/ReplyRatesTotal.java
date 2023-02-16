package com.huaweicloud.sdk.cbs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class ReplyRatesTotal  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="question_count")
    
    
    private Long questionCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direct_count")
    
    
    private Long directCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recommend_count")
    
    
    private Long recommendCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notmatch_count")
    
    
    private Long notmatchCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direct_rate")
    
    
    private Double directRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="recommend_rate")
    
    
    private Double recommendRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notmatch_rate")
    
    
    private Double notmatchRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dialog_count")
    
    
    private Long dialogCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dialog_rate")
    
    
    private Double dialogRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invalid_count")
    
    
    private Long invalidCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invalid_rate")
    
    
    private Double invalidRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_count")
    
    
    private Long chatCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_rate")
    
    
    private Double chatRate;

    public ReplyRatesTotal withQuestionCount(Long questionCount) {
        this.questionCount = questionCount;
        return this;
    }

    


    /**
     * 用户提问总数。
     * @return questionCount
     */
    public Long getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Long questionCount) {
        this.questionCount = questionCount;
    }

    

    public ReplyRatesTotal withDirectCount(Long directCount) {
        this.directCount = directCount;
        return this;
    }

    


    /**
     * 直接回答个数。
     * @return directCount
     */
    public Long getDirectCount() {
        return directCount;
    }

    public void setDirectCount(Long directCount) {
        this.directCount = directCount;
    }

    

    public ReplyRatesTotal withRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
        return this;
    }

    


    /**
     * 推荐回答个数。
     * @return recommendCount
     */
    public Long getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
    }

    

    public ReplyRatesTotal withNotmatchCount(Long notmatchCount) {
        this.notmatchCount = notmatchCount;
        return this;
    }

    


    /**
     * 未匹配个数。
     * @return notmatchCount
     */
    public Long getNotmatchCount() {
        return notmatchCount;
    }

    public void setNotmatchCount(Long notmatchCount) {
        this.notmatchCount = notmatchCount;
    }

    

    public ReplyRatesTotal withDirectRate(Double directRate) {
        this.directRate = directRate;
        return this;
    }

    


    /**
     * 直接回答比率，保留小数点后三位。
     * @return directRate
     */
    public Double getDirectRate() {
        return directRate;
    }

    public void setDirectRate(Double directRate) {
        this.directRate = directRate;
    }

    

    public ReplyRatesTotal withRecommendRate(Double recommendRate) {
        this.recommendRate = recommendRate;
        return this;
    }

    


    /**
     * 推荐回答比率，保留小数点后三位。
     * @return recommendRate
     */
    public Double getRecommendRate() {
        return recommendRate;
    }

    public void setRecommendRate(Double recommendRate) {
        this.recommendRate = recommendRate;
    }

    

    public ReplyRatesTotal withNotmatchRate(Double notmatchRate) {
        this.notmatchRate = notmatchRate;
        return this;
    }

    


    /**
     * 未匹配比率，保留小数点后三位。
     * @return notmatchRate
     */
    public Double getNotmatchRate() {
        return notmatchRate;
    }

    public void setNotmatchRate(Double notmatchRate) {
        this.notmatchRate = notmatchRate;
    }

    

    public ReplyRatesTotal withDialogCount(Long dialogCount) {
        this.dialogCount = dialogCount;
        return this;
    }

    


    /**
     * 多轮对话次数。
     * @return dialogCount
     */
    public Long getDialogCount() {
        return dialogCount;
    }

    public void setDialogCount(Long dialogCount) {
        this.dialogCount = dialogCount;
    }

    

    public ReplyRatesTotal withDialogRate(Double dialogRate) {
        this.dialogRate = dialogRate;
        return this;
    }

    


    /**
     * 多轮对话比例。
     * @return dialogRate
     */
    public Double getDialogRate() {
        return dialogRate;
    }

    public void setDialogRate(Double dialogRate) {
        this.dialogRate = dialogRate;
    }

    

    public ReplyRatesTotal withInvalidCount(Long invalidCount) {
        this.invalidCount = invalidCount;
        return this;
    }

    


    /**
     * 无效问题次数。
     * @return invalidCount
     */
    public Long getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(Long invalidCount) {
        this.invalidCount = invalidCount;
    }

    

    public ReplyRatesTotal withInvalidRate(Double invalidRate) {
        this.invalidRate = invalidRate;
        return this;
    }

    


    /**
     * 无效问题比例。
     * @return invalidRate
     */
    public Double getInvalidRate() {
        return invalidRate;
    }

    public void setInvalidRate(Double invalidRate) {
        this.invalidRate = invalidRate;
    }

    

    public ReplyRatesTotal withChatCount(Long chatCount) {
        this.chatCount = chatCount;
        return this;
    }

    


    /**
     * 闲聊匹配次数。
     * @return chatCount
     */
    public Long getChatCount() {
        return chatCount;
    }

    public void setChatCount(Long chatCount) {
        this.chatCount = chatCount;
    }

    

    public ReplyRatesTotal withChatRate(Double chatRate) {
        this.chatRate = chatRate;
        return this;
    }

    


    /**
     * 闲聊比例。
     * @return chatRate
     */
    public Double getChatRate() {
        return chatRate;
    }

    public void setChatRate(Double chatRate) {
        this.chatRate = chatRate;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplyRatesTotal replyRatesTotal = (ReplyRatesTotal) o;
        return Objects.equals(this.questionCount, replyRatesTotal.questionCount) &&
            Objects.equals(this.directCount, replyRatesTotal.directCount) &&
            Objects.equals(this.recommendCount, replyRatesTotal.recommendCount) &&
            Objects.equals(this.notmatchCount, replyRatesTotal.notmatchCount) &&
            Objects.equals(this.directRate, replyRatesTotal.directRate) &&
            Objects.equals(this.recommendRate, replyRatesTotal.recommendRate) &&
            Objects.equals(this.notmatchRate, replyRatesTotal.notmatchRate) &&
            Objects.equals(this.dialogCount, replyRatesTotal.dialogCount) &&
            Objects.equals(this.dialogRate, replyRatesTotal.dialogRate) &&
            Objects.equals(this.invalidCount, replyRatesTotal.invalidCount) &&
            Objects.equals(this.invalidRate, replyRatesTotal.invalidRate) &&
            Objects.equals(this.chatCount, replyRatesTotal.chatCount) &&
            Objects.equals(this.chatRate, replyRatesTotal.chatRate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(questionCount, directCount, recommendCount, notmatchCount, directRate, recommendRate, notmatchRate, dialogCount, dialogRate, invalidCount, invalidRate, chatCount, chatRate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplyRatesTotal {\n");
        sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
        sb.append("    directCount: ").append(toIndentedString(directCount)).append("\n");
        sb.append("    recommendCount: ").append(toIndentedString(recommendCount)).append("\n");
        sb.append("    notmatchCount: ").append(toIndentedString(notmatchCount)).append("\n");
        sb.append("    directRate: ").append(toIndentedString(directRate)).append("\n");
        sb.append("    recommendRate: ").append(toIndentedString(recommendRate)).append("\n");
        sb.append("    notmatchRate: ").append(toIndentedString(notmatchRate)).append("\n");
        sb.append("    dialogCount: ").append(toIndentedString(dialogCount)).append("\n");
        sb.append("    dialogRate: ").append(toIndentedString(dialogRate)).append("\n");
        sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
        sb.append("    invalidRate: ").append(toIndentedString(invalidRate)).append("\n");
        sb.append("    chatCount: ").append(toIndentedString(chatCount)).append("\n");
        sb.append("    chatRate: ").append(toIndentedString(chatRate)).append("\n");
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

