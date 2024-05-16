package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量修改知识库问法请求。
 */
public class UpdateBatchKnowledgeQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_list")

    private List<KnowledgeQuestionUpdateInfo> questionList = null;

    public UpdateBatchKnowledgeQuestionReq withQuestionList(List<KnowledgeQuestionUpdateInfo> questionList) {
        this.questionList = questionList;
        return this;
    }

    public UpdateBatchKnowledgeQuestionReq addQuestionListItem(KnowledgeQuestionUpdateInfo questionListItem) {
        if (this.questionList == null) {
            this.questionList = new ArrayList<>();
        }
        this.questionList.add(questionListItem);
        return this;
    }

    public UpdateBatchKnowledgeQuestionReq withQuestionList(
        Consumer<List<KnowledgeQuestionUpdateInfo>> questionListSetter) {
        if (this.questionList == null) {
            this.questionList = new ArrayList<>();
        }
        questionListSetter.accept(this.questionList);
        return this;
    }

    /**
     * 问法列表
     * @return questionList
     */
    public List<KnowledgeQuestionUpdateInfo> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<KnowledgeQuestionUpdateInfo> questionList) {
        this.questionList = questionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBatchKnowledgeQuestionReq that = (UpdateBatchKnowledgeQuestionReq) obj;
        return Objects.equals(this.questionList, that.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBatchKnowledgeQuestionReq {\n");
        sb.append("    questionList: ").append(toIndentedString(questionList)).append("\n");
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
