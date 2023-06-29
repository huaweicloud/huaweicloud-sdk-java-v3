package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Frame {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intention")

    private String intention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Double confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_slots")

    private List<CurrentSlot> currentSlots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_slots")

    private List<HistorySlot> historySlots = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply")

    private String reply;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_complete")

    private Boolean taskComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_complete")

    private Boolean flowComplete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "candidate_words")

    private List<String> candidateWords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intention_alias")

    private String intentionAlias;

    public Frame withIntention(String intention) {
        this.intention = intention;
        return this;
    }

    /**
     * 意图
     * @return intention
     */
    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public Frame withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 命中意图置信度。
     * @return confidence
     */
    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Frame withCurrentSlots(List<CurrentSlot> currentSlots) {
        this.currentSlots = currentSlots;
        return this;
    }

    public Frame addCurrentSlotsItem(CurrentSlot currentSlotsItem) {
        if (this.currentSlots == null) {
            this.currentSlots = new ArrayList<>();
        }
        this.currentSlots.add(currentSlotsItem);
        return this;
    }

    public Frame withCurrentSlots(Consumer<List<CurrentSlot>> currentSlotsSetter) {
        if (this.currentSlots == null) {
            this.currentSlots = new ArrayList<>();
        }
        currentSlotsSetter.accept(this.currentSlots);
        return this;
    }

    /**
     * 当前槽位列表。
     * @return currentSlots
     */
    public List<CurrentSlot> getCurrentSlots() {
        return currentSlots;
    }

    public void setCurrentSlots(List<CurrentSlot> currentSlots) {
        this.currentSlots = currentSlots;
    }

    public Frame withHistorySlots(List<HistorySlot> historySlots) {
        this.historySlots = historySlots;
        return this;
    }

    public Frame addHistorySlotsItem(HistorySlot historySlotsItem) {
        if (this.historySlots == null) {
            this.historySlots = new ArrayList<>();
        }
        this.historySlots.add(historySlotsItem);
        return this;
    }

    public Frame withHistorySlots(Consumer<List<HistorySlot>> historySlotsSetter) {
        if (this.historySlots == null) {
            this.historySlots = new ArrayList<>();
        }
        historySlotsSetter.accept(this.historySlots);
        return this;
    }

    /**
     * 历史槽位列表。
     * @return historySlots
     */
    public List<HistorySlot> getHistorySlots() {
        return historySlots;
    }

    public void setHistorySlots(List<HistorySlot> historySlots) {
        this.historySlots = historySlots;
    }

    public Frame withReply(String reply) {
        this.reply = reply;
        return this;
    }

    /**
     * 机器人回复。
     * @return reply
     */
    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Frame withTaskComplete(Boolean taskComplete) {
        this.taskComplete = taskComplete;
        return this;
    }

    /**
     * 任务是否完成。
     * @return taskComplete
     */
    public Boolean getTaskComplete() {
        return taskComplete;
    }

    public void setTaskComplete(Boolean taskComplete) {
        this.taskComplete = taskComplete;
    }

    public Frame withFlowComplete(Boolean flowComplete) {
        this.flowComplete = flowComplete;
        return this;
    }

    /**
     * 对话流程是否完成。
     * @return flowComplete
     */
    public Boolean getFlowComplete() {
        return flowComplete;
    }

    public void setFlowComplete(Boolean flowComplete) {
        this.flowComplete = flowComplete;
    }

    public Frame withCandidateWords(List<String> candidateWords) {
        this.candidateWords = candidateWords;
        return this;
    }

    public Frame addCandidateWordsItem(String candidateWordsItem) {
        if (this.candidateWords == null) {
            this.candidateWords = new ArrayList<>();
        }
        this.candidateWords.add(candidateWordsItem);
        return this;
    }

    public Frame withCandidateWords(Consumer<List<String>> candidateWordsSetter) {
        if (this.candidateWords == null) {
            this.candidateWords = new ArrayList<>();
        }
        candidateWordsSetter.accept(this.candidateWords);
        return this;
    }

    /**
     * 候选词。
     * @return candidateWords
     */
    public List<String> getCandidateWords() {
        return candidateWords;
    }

    public void setCandidateWords(List<String> candidateWords) {
        this.candidateWords = candidateWords;
    }

    public Frame withIntentionAlias(String intentionAlias) {
        this.intentionAlias = intentionAlias;
        return this;
    }

    /**
     * 意图名称
     * @return intentionAlias
     */
    public String getIntentionAlias() {
        return intentionAlias;
    }

    public void setIntentionAlias(String intentionAlias) {
        this.intentionAlias = intentionAlias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Frame that = (Frame) obj;
        return Objects.equals(this.intention, that.intention) && Objects.equals(this.confidence, that.confidence)
            && Objects.equals(this.currentSlots, that.currentSlots)
            && Objects.equals(this.historySlots, that.historySlots) && Objects.equals(this.reply, that.reply)
            && Objects.equals(this.taskComplete, that.taskComplete)
            && Objects.equals(this.flowComplete, that.flowComplete)
            && Objects.equals(this.candidateWords, that.candidateWords)
            && Objects.equals(this.intentionAlias, that.intentionAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intention,
            confidence,
            currentSlots,
            historySlots,
            reply,
            taskComplete,
            flowComplete,
            candidateWords,
            intentionAlias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Frame {\n");
        sb.append("    intention: ").append(toIndentedString(intention)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    currentSlots: ").append(toIndentedString(currentSlots)).append("\n");
        sb.append("    historySlots: ").append(toIndentedString(historySlots)).append("\n");
        sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
        sb.append("    taskComplete: ").append(toIndentedString(taskComplete)).append("\n");
        sb.append("    flowComplete: ").append(toIndentedString(flowComplete)).append("\n");
        sb.append("    candidateWords: ").append(toIndentedString(candidateWords)).append("\n");
        sb.append("    intentionAlias: ").append(toIndentedString(intentionAlias)).append("\n");
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
