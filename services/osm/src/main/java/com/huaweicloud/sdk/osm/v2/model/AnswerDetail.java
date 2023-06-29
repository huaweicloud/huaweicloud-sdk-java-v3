package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AnswerDetail
 */
public class AnswerDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qabot_answers")

    private List<QabotAnswer> qabotAnswers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qa_flow_answers")

    private QaFlowHitResult qaFlowAnswers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chat_answer")

    private String chatAnswer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_answer")

    private QaGraphAnswer graphAnswer;

    public AnswerDetail withQabotAnswers(List<QabotAnswer> qabotAnswers) {
        this.qabotAnswers = qabotAnswers;
        return this;
    }

    public AnswerDetail addQabotAnswersItem(QabotAnswer qabotAnswersItem) {
        if (this.qabotAnswers == null) {
            this.qabotAnswers = new ArrayList<>();
        }
        this.qabotAnswers.add(qabotAnswersItem);
        return this;
    }

    public AnswerDetail withQabotAnswers(Consumer<List<QabotAnswer>> qabotAnswersSetter) {
        if (this.qabotAnswers == null) {
            this.qabotAnswers = new ArrayList<>();
        }
        qabotAnswersSetter.accept(this.qabotAnswers);
        return this;
    }

    /**
     * 答案列表
     * @return qabotAnswers
     */
    public List<QabotAnswer> getQabotAnswers() {
        return qabotAnswers;
    }

    public void setQabotAnswers(List<QabotAnswer> qabotAnswers) {
        this.qabotAnswers = qabotAnswers;
    }

    public AnswerDetail withQaFlowAnswers(QaFlowHitResult qaFlowAnswers) {
        this.qaFlowAnswers = qaFlowAnswers;
        return this;
    }

    public AnswerDetail withQaFlowAnswers(Consumer<QaFlowHitResult> qaFlowAnswersSetter) {
        if (this.qaFlowAnswers == null) {
            this.qaFlowAnswers = new QaFlowHitResult();
            qaFlowAnswersSetter.accept(this.qaFlowAnswers);
        }

        return this;
    }

    /**
     * Get qaFlowAnswers
     * @return qaFlowAnswers
     */
    public QaFlowHitResult getQaFlowAnswers() {
        return qaFlowAnswers;
    }

    public void setQaFlowAnswers(QaFlowHitResult qaFlowAnswers) {
        this.qaFlowAnswers = qaFlowAnswers;
    }

    public AnswerDetail withChatAnswer(String chatAnswer) {
        this.chatAnswer = chatAnswer;
        return this;
    }

    /**
     * 问题
     * @return chatAnswer
     */
    public String getChatAnswer() {
        return chatAnswer;
    }

    public void setChatAnswer(String chatAnswer) {
        this.chatAnswer = chatAnswer;
    }

    public AnswerDetail withGraphAnswer(QaGraphAnswer graphAnswer) {
        this.graphAnswer = graphAnswer;
        return this;
    }

    public AnswerDetail withGraphAnswer(Consumer<QaGraphAnswer> graphAnswerSetter) {
        if (this.graphAnswer == null) {
            this.graphAnswer = new QaGraphAnswer();
            graphAnswerSetter.accept(this.graphAnswer);
        }

        return this;
    }

    /**
     * Get graphAnswer
     * @return graphAnswer
     */
    public QaGraphAnswer getGraphAnswer() {
        return graphAnswer;
    }

    public void setGraphAnswer(QaGraphAnswer graphAnswer) {
        this.graphAnswer = graphAnswer;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnswerDetail that = (AnswerDetail) obj;
        return Objects.equals(this.qabotAnswers, that.qabotAnswers)
            && Objects.equals(this.qaFlowAnswers, that.qaFlowAnswers)
            && Objects.equals(this.chatAnswer, that.chatAnswer) && Objects.equals(this.graphAnswer, that.graphAnswer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qabotAnswers, qaFlowAnswers, chatAnswer, graphAnswer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnswerDetail {\n");
        sb.append("    qabotAnswers: ").append(toIndentedString(qabotAnswers)).append("\n");
        sb.append("    qaFlowAnswers: ").append(toIndentedString(qaFlowAnswers)).append("\n");
        sb.append("    chatAnswer: ").append(toIndentedString(chatAnswer)).append("\n");
        sb.append("    graphAnswer: ").append(toIndentedString(graphAnswer)).append("\n");
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
