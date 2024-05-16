package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateBatchKnowledgeQuestionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "question_list")

    private List<KnowledgeQuestionInfo> questionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateBatchKnowledgeQuestionResponse withQuestionList(List<KnowledgeQuestionInfo> questionList) {
        this.questionList = questionList;
        return this;
    }

    public CreateBatchKnowledgeQuestionResponse addQuestionListItem(KnowledgeQuestionInfo questionListItem) {
        if (this.questionList == null) {
            this.questionList = new ArrayList<>();
        }
        this.questionList.add(questionListItem);
        return this;
    }

    public CreateBatchKnowledgeQuestionResponse withQuestionList(
        Consumer<List<KnowledgeQuestionInfo>> questionListSetter) {
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
    public List<KnowledgeQuestionInfo> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<KnowledgeQuestionInfo> questionList) {
        this.questionList = questionList;
    }

    public CreateBatchKnowledgeQuestionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBatchKnowledgeQuestionResponse that = (CreateBatchKnowledgeQuestionResponse) obj;
        return Objects.equals(this.questionList, that.questionList) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchKnowledgeQuestionResponse {\n");
        sb.append("    questionList: ").append(toIndentedString(questionList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
