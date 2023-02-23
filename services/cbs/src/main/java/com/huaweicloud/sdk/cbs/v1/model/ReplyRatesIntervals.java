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
public class ReplyRatesIntervals  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    

    private String start;

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
    @JsonProperty(value="invalid_count")
    

    private Long invalidCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="chat_count")
    

    private Long chatCount;

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
    @JsonProperty(value="chat_rate")
    

    private Double chatRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invalid_rate")
    

    private Double invalidRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dialog_count")
    

    private Long dialogCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dialog_rate")
    

    private Double dialogRate;

    public ReplyRatesIntervals withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * 间隔周期开始时间。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    

    public ReplyRatesIntervals withQuestionCount(Long questionCount) {
        this.questionCount = questionCount;
        return this;
    }

    


    /**
     * 间隔周期用户提问总数。
     * @return questionCount
     */
    public Long getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Long questionCount) {
        this.questionCount = questionCount;
    }

    

    public ReplyRatesIntervals withDirectCount(Long directCount) {
        this.directCount = directCount;
        return this;
    }

    


    /**
     * 间隔周期直接回答个数。
     * @return directCount
     */
    public Long getDirectCount() {
        return directCount;
    }

    public void setDirectCount(Long directCount) {
        this.directCount = directCount;
    }

    

    public ReplyRatesIntervals withRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
        return this;
    }

    


    /**
     * 间隔周期推荐回答个数。
     * @return recommendCount
     */
    public Long getRecommendCount() {
        return recommendCount;
    }

    public void setRecommendCount(Long recommendCount) {
        this.recommendCount = recommendCount;
    }

    

    public ReplyRatesIntervals withNotmatchCount(Long notmatchCount) {
        this.notmatchCount = notmatchCount;
        return this;
    }

    


    /**
     * 间隔周期未匹配个数。
     * @return notmatchCount
     */
    public Long getNotmatchCount() {
        return notmatchCount;
    }

    public void setNotmatchCount(Long notmatchCount) {
        this.notmatchCount = notmatchCount;
    }

    

    public ReplyRatesIntervals withInvalidCount(Long invalidCount) {
        this.invalidCount = invalidCount;
        return this;
    }

    


    /**
     * 间隔周期无效问题个数。
     * @return invalidCount
     */
    public Long getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(Long invalidCount) {
        this.invalidCount = invalidCount;
    }

    

    public ReplyRatesIntervals withChatCount(Long chatCount) {
        this.chatCount = chatCount;
        return this;
    }

    


    /**
     * 间隔周期闲聊匹配个数。
     * @return chatCount
     */
    public Long getChatCount() {
        return chatCount;
    }

    public void setChatCount(Long chatCount) {
        this.chatCount = chatCount;
    }

    

    public ReplyRatesIntervals withDirectRate(Double directRate) {
        this.directRate = directRate;
        return this;
    }

    


    /**
     * 间隔周期直接回答比率，保留小数点后三位。
     * @return directRate
     */
    public Double getDirectRate() {
        return directRate;
    }

    public void setDirectRate(Double directRate) {
        this.directRate = directRate;
    }

    

    public ReplyRatesIntervals withRecommendRate(Double recommendRate) {
        this.recommendRate = recommendRate;
        return this;
    }

    


    /**
     * 间隔周期推荐回答比率，保留小数点后三位。
     * @return recommendRate
     */
    public Double getRecommendRate() {
        return recommendRate;
    }

    public void setRecommendRate(Double recommendRate) {
        this.recommendRate = recommendRate;
    }

    

    public ReplyRatesIntervals withNotmatchRate(Double notmatchRate) {
        this.notmatchRate = notmatchRate;
        return this;
    }

    


    /**
     * 间隔周期未匹配比率，保留小数点后三位。
     * @return notmatchRate
     */
    public Double getNotmatchRate() {
        return notmatchRate;
    }

    public void setNotmatchRate(Double notmatchRate) {
        this.notmatchRate = notmatchRate;
    }

    

    public ReplyRatesIntervals withChatRate(Double chatRate) {
        this.chatRate = chatRate;
        return this;
    }

    


    /**
     * 间隔周期闲聊匹配比率，保留小数点后三位。
     * @return chatRate
     */
    public Double getChatRate() {
        return chatRate;
    }

    public void setChatRate(Double chatRate) {
        this.chatRate = chatRate;
    }

    

    public ReplyRatesIntervals withInvalidRate(Double invalidRate) {
        this.invalidRate = invalidRate;
        return this;
    }

    


    /**
     * 间隔周期无效问题比率，保留小数点后三位。
     * @return invalidRate
     */
    public Double getInvalidRate() {
        return invalidRate;
    }

    public void setInvalidRate(Double invalidRate) {
        this.invalidRate = invalidRate;
    }

    

    public ReplyRatesIntervals withDialogCount(Long dialogCount) {
        this.dialogCount = dialogCount;
        return this;
    }

    


    /**
     * 多轮会话次数。
     * @return dialogCount
     */
    public Long getDialogCount() {
        return dialogCount;
    }

    public void setDialogCount(Long dialogCount) {
        this.dialogCount = dialogCount;
    }

    

    public ReplyRatesIntervals withDialogRate(Double dialogRate) {
        this.dialogRate = dialogRate;
        return this;
    }

    


    /**
     * 多轮会话比例。
     * @return dialogRate
     */
    public Double getDialogRate() {
        return dialogRate;
    }

    public void setDialogRate(Double dialogRate) {
        this.dialogRate = dialogRate;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplyRatesIntervals replyRatesIntervals = (ReplyRatesIntervals) o;
        return Objects.equals(this.start, replyRatesIntervals.start) &&
            Objects.equals(this.questionCount, replyRatesIntervals.questionCount) &&
            Objects.equals(this.directCount, replyRatesIntervals.directCount) &&
            Objects.equals(this.recommendCount, replyRatesIntervals.recommendCount) &&
            Objects.equals(this.notmatchCount, replyRatesIntervals.notmatchCount) &&
            Objects.equals(this.invalidCount, replyRatesIntervals.invalidCount) &&
            Objects.equals(this.chatCount, replyRatesIntervals.chatCount) &&
            Objects.equals(this.directRate, replyRatesIntervals.directRate) &&
            Objects.equals(this.recommendRate, replyRatesIntervals.recommendRate) &&
            Objects.equals(this.notmatchRate, replyRatesIntervals.notmatchRate) &&
            Objects.equals(this.chatRate, replyRatesIntervals.chatRate) &&
            Objects.equals(this.invalidRate, replyRatesIntervals.invalidRate) &&
            Objects.equals(this.dialogCount, replyRatesIntervals.dialogCount) &&
            Objects.equals(this.dialogRate, replyRatesIntervals.dialogRate);
    }
    @Override
    public int hashCode() {
        return Objects.hash(start, questionCount, directCount, recommendCount, notmatchCount, invalidCount, chatCount, directRate, recommendRate, notmatchRate, chatRate, invalidRate, dialogCount, dialogRate);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplyRatesIntervals {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    questionCount: ").append(toIndentedString(questionCount)).append("\n");
        sb.append("    directCount: ").append(toIndentedString(directCount)).append("\n");
        sb.append("    recommendCount: ").append(toIndentedString(recommendCount)).append("\n");
        sb.append("    notmatchCount: ").append(toIndentedString(notmatchCount)).append("\n");
        sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
        sb.append("    chatCount: ").append(toIndentedString(chatCount)).append("\n");
        sb.append("    directRate: ").append(toIndentedString(directRate)).append("\n");
        sb.append("    recommendRate: ").append(toIndentedString(recommendRate)).append("\n");
        sb.append("    notmatchRate: ").append(toIndentedString(notmatchRate)).append("\n");
        sb.append("    chatRate: ").append(toIndentedString(chatRate)).append("\n");
        sb.append("    invalidRate: ").append(toIndentedString(invalidRate)).append("\n");
        sb.append("    dialogCount: ").append(toIndentedString(dialogCount)).append("\n");
        sb.append("    dialogRate: ").append(toIndentedString(dialogRate)).append("\n");
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

