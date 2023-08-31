package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AdviceResult
 */
public class AdviceResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message_id")

    private String messageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_advice")

    private List<IndexAdviceInfo> indexAdvice = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_advice")

    private List<String> tuningAdvice = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formatted_sql")

    private String formattedSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_sql")

    private String originalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "explain")

    private List<Explain> explain = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_pos_infos")

    private List<TbPosInfo> tbPosInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feedback_infos")

    private FeedbackInfo feedbackInfos;

    public AdviceResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * messageId
     * @return messageId
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public AdviceResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public AdviceResult withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public AdviceResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AdviceResult withIndexAdvice(List<IndexAdviceInfo> indexAdvice) {
        this.indexAdvice = indexAdvice;
        return this;
    }

    public AdviceResult addIndexAdviceItem(IndexAdviceInfo indexAdviceItem) {
        if (this.indexAdvice == null) {
            this.indexAdvice = new ArrayList<>();
        }
        this.indexAdvice.add(indexAdviceItem);
        return this;
    }

    public AdviceResult withIndexAdvice(Consumer<List<IndexAdviceInfo>> indexAdviceSetter) {
        if (this.indexAdvice == null) {
            this.indexAdvice = new ArrayList<>();
        }
        indexAdviceSetter.accept(this.indexAdvice);
        return this;
    }

    /**
     * 索引建议
     * @return indexAdvice
     */
    public List<IndexAdviceInfo> getIndexAdvice() {
        return indexAdvice;
    }

    public void setIndexAdvice(List<IndexAdviceInfo> indexAdvice) {
        this.indexAdvice = indexAdvice;
    }

    public AdviceResult withTuningAdvice(List<String> tuningAdvice) {
        this.tuningAdvice = tuningAdvice;
        return this;
    }

    public AdviceResult addTuningAdviceItem(String tuningAdviceItem) {
        if (this.tuningAdvice == null) {
            this.tuningAdvice = new ArrayList<>();
        }
        this.tuningAdvice.add(tuningAdviceItem);
        return this;
    }

    public AdviceResult withTuningAdvice(Consumer<List<String>> tuningAdviceSetter) {
        if (this.tuningAdvice == null) {
            this.tuningAdvice = new ArrayList<>();
        }
        tuningAdviceSetter.accept(this.tuningAdvice);
        return this;
    }

    /**
     * 诊断建议
     * @return tuningAdvice
     */
    public List<String> getTuningAdvice() {
        return tuningAdvice;
    }

    public void setTuningAdvice(List<String> tuningAdvice) {
        this.tuningAdvice = tuningAdvice;
    }

    public AdviceResult withFormattedSql(String formattedSql) {
        this.formattedSql = formattedSql;
        return this;
    }

    /**
     * 格式化SQL
     * @return formattedSql
     */
    public String getFormattedSql() {
        return formattedSql;
    }

    public void setFormattedSql(String formattedSql) {
        this.formattedSql = formattedSql;
    }

    public AdviceResult withOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }

    /**
     * 原始SQL
     * @return originalSql
     */
    public String getOriginalSql() {
        return originalSql;
    }

    public void setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
    }

    public AdviceResult withExplain(List<Explain> explain) {
        this.explain = explain;
        return this;
    }

    public AdviceResult addExplainItem(Explain explainItem) {
        if (this.explain == null) {
            this.explain = new ArrayList<>();
        }
        this.explain.add(explainItem);
        return this;
    }

    public AdviceResult withExplain(Consumer<List<Explain>> explainSetter) {
        if (this.explain == null) {
            this.explain = new ArrayList<>();
        }
        explainSetter.accept(this.explain);
        return this;
    }

    /**
     * 执行计划
     * @return explain
     */
    public List<Explain> getExplain() {
        return explain;
    }

    public void setExplain(List<Explain> explain) {
        this.explain = explain;
    }

    public AdviceResult withTbPosInfos(List<TbPosInfo> tbPosInfos) {
        this.tbPosInfos = tbPosInfos;
        return this;
    }

    public AdviceResult addTbPosInfosItem(TbPosInfo tbPosInfosItem) {
        if (this.tbPosInfos == null) {
            this.tbPosInfos = new ArrayList<>();
        }
        this.tbPosInfos.add(tbPosInfosItem);
        return this;
    }

    public AdviceResult withTbPosInfos(Consumer<List<TbPosInfo>> tbPosInfosSetter) {
        if (this.tbPosInfos == null) {
            this.tbPosInfos = new ArrayList<>();
        }
        tbPosInfosSetter.accept(this.tbPosInfos);
        return this;
    }

    /**
     * 表位置信息
     * @return tbPosInfos
     */
    public List<TbPosInfo> getTbPosInfos() {
        return tbPosInfos;
    }

    public void setTbPosInfos(List<TbPosInfo> tbPosInfos) {
        this.tbPosInfos = tbPosInfos;
    }

    public AdviceResult withFeedbackInfos(FeedbackInfo feedbackInfos) {
        this.feedbackInfos = feedbackInfos;
        return this;
    }

    public AdviceResult withFeedbackInfos(Consumer<FeedbackInfo> feedbackInfosSetter) {
        if (this.feedbackInfos == null) {
            this.feedbackInfos = new FeedbackInfo();
            feedbackInfosSetter.accept(this.feedbackInfos);
        }

        return this;
    }

    /**
     * Get feedbackInfos
     * @return feedbackInfos
     */
    public FeedbackInfo getFeedbackInfos() {
        return feedbackInfos;
    }

    public void setFeedbackInfos(FeedbackInfo feedbackInfos) {
        this.feedbackInfos = feedbackInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdviceResult that = (AdviceResult) obj;
        return Objects.equals(this.messageId, that.messageId) && Objects.equals(this.statusCode, that.statusCode)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMessage, that.errorMessage)
            && Objects.equals(this.indexAdvice, that.indexAdvice)
            && Objects.equals(this.tuningAdvice, that.tuningAdvice)
            && Objects.equals(this.formattedSql, that.formattedSql)
            && Objects.equals(this.originalSql, that.originalSql) && Objects.equals(this.explain, that.explain)
            && Objects.equals(this.tbPosInfos, that.tbPosInfos)
            && Objects.equals(this.feedbackInfos, that.feedbackInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId,
            statusCode,
            errorCode,
            errorMessage,
            indexAdvice,
            tuningAdvice,
            formattedSql,
            originalSql,
            explain,
            tbPosInfos,
            feedbackInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdviceResult {\n");
        sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    indexAdvice: ").append(toIndentedString(indexAdvice)).append("\n");
        sb.append("    tuningAdvice: ").append(toIndentedString(tuningAdvice)).append("\n");
        sb.append("    formattedSql: ").append(toIndentedString(formattedSql)).append("\n");
        sb.append("    originalSql: ").append(toIndentedString(originalSql)).append("\n");
        sb.append("    explain: ").append(toIndentedString(explain)).append("\n");
        sb.append("    tbPosInfos: ").append(toIndentedString(tbPosInfos)).append("\n");
        sb.append("    feedbackInfos: ").append(toIndentedString(feedbackInfos)).append("\n");
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
