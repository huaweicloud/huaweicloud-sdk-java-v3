package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建知识库问法请求。
 */
public class CreateBatchKnowledgeQuestionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent_id")

    private String intentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_list")

    private List<KnowledgeQuestionCreateInfo> questionList = null;

    public CreateBatchKnowledgeQuestionReq withIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }

    /**
     * 意图ID。
     * @return intentId
     */
    public String getIntentId() {
        return intentId;
    }

    public void setIntentId(String intentId) {
        this.intentId = intentId;
    }

    public CreateBatchKnowledgeQuestionReq withQuestionList(List<KnowledgeQuestionCreateInfo> questionList) {
        this.questionList = questionList;
        return this;
    }

    public CreateBatchKnowledgeQuestionReq addQuestionListItem(KnowledgeQuestionCreateInfo questionListItem) {
        if (this.questionList == null) {
            this.questionList = new ArrayList<>();
        }
        this.questionList.add(questionListItem);
        return this;
    }

    public CreateBatchKnowledgeQuestionReq withQuestionList(
        Consumer<List<KnowledgeQuestionCreateInfo>> questionListSetter) {
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
    public List<KnowledgeQuestionCreateInfo> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<KnowledgeQuestionCreateInfo> questionList) {
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
        CreateBatchKnowledgeQuestionReq that = (CreateBatchKnowledgeQuestionReq) obj;
        return Objects.equals(this.intentId, that.intentId) && Objects.equals(this.questionList, that.questionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intentId, questionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchKnowledgeQuestionReq {\n");
        sb.append("    intentId: ").append(toIndentedString(intentId)).append("\n");
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
