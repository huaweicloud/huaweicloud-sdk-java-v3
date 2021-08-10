package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class MathInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_number")

    private String questionNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_block_count")

    private Integer answerBlockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_block_list")

    private List<AnswerBlockList> answerBlockList = null;

    public MathInfo withQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
        return this;
    }

    /** 数学试卷返回结果，表示题号。
     * 
     * @return questionNumber */
    public String getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(String questionNumber) {
        this.questionNumber = questionNumber;
    }

    public MathInfo withAnswerBlockCount(Integer answerBlockCount) {
        this.answerBlockCount = answerBlockCount;
        return this;
    }

    /** 数学试卷答案的文字块数目。
     * 
     * @return answerBlockCount */
    public Integer getAnswerBlockCount() {
        return answerBlockCount;
    }

    public void setAnswerBlockCount(Integer answerBlockCount) {
        this.answerBlockCount = answerBlockCount;
    }

    public MathInfo withAnswerBlockList(List<AnswerBlockList> answerBlockList) {
        this.answerBlockList = answerBlockList;
        return this;
    }

    public MathInfo addAnswerBlockListItem(AnswerBlockList answerBlockListItem) {
        if (this.answerBlockList == null) {
            this.answerBlockList = new ArrayList<>();
        }
        this.answerBlockList.add(answerBlockListItem);
        return this;
    }

    public MathInfo withAnswerBlockList(Consumer<List<AnswerBlockList>> answerBlockListSetter) {
        if (this.answerBlockList == null) {
            this.answerBlockList = new ArrayList<>();
        }
        answerBlockListSetter.accept(this.answerBlockList);
        return this;
    }

    /** 数学试卷答案识别文字块列表，输出顺序从左到右，从上到下。
     * 
     * @return answerBlockList */
    public List<AnswerBlockList> getAnswerBlockList() {
        return answerBlockList;
    }

    public void setAnswerBlockList(List<AnswerBlockList> answerBlockList) {
        this.answerBlockList = answerBlockList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MathInfo mathInfo = (MathInfo) o;
        return Objects.equals(this.questionNumber, mathInfo.questionNumber)
            && Objects.equals(this.answerBlockCount, mathInfo.answerBlockCount)
            && Objects.equals(this.answerBlockList, mathInfo.answerBlockList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionNumber, answerBlockCount, answerBlockList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MathInfo {\n");
        sb.append("    questionNumber: ").append(toIndentedString(questionNumber)).append("\n");
        sb.append("    answerBlockCount: ").append(toIndentedString(answerBlockCount)).append("\n");
        sb.append("    answerBlockList: ").append(toIndentedString(answerBlockList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
