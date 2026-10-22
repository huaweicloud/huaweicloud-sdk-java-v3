package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiguardCustomAnswersBatchDeleteBody
 */
public class AiguardCustomAnswersBatchDeleteBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_ids")

    private List<String> answerIds = null;

    public AiguardCustomAnswersBatchDeleteBody withAnswerIds(List<String> answerIds) {
        this.answerIds = answerIds;
        return this;
    }

    public AiguardCustomAnswersBatchDeleteBody addAnswerIdsItem(String answerIdsItem) {
        if (this.answerIds == null) {
            this.answerIds = new ArrayList<>();
        }
        this.answerIds.add(answerIdsItem);
        return this;
    }

    public AiguardCustomAnswersBatchDeleteBody withAnswerIds(Consumer<List<String>> answerIdsSetter) {
        if (this.answerIds == null) {
            this.answerIds = new ArrayList<>();
        }
        answerIdsSetter.accept(this.answerIds);
        return this;
    }

    /**
     * 代答库ID列表
     * @return answerIds
     */
    public List<String> getAnswerIds() {
        return answerIds;
    }

    public void setAnswerIds(List<String> answerIds) {
        this.answerIds = answerIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiguardCustomAnswersBatchDeleteBody that = (AiguardCustomAnswersBatchDeleteBody) obj;
        return Objects.equals(this.answerIds, that.answerIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answerIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiguardCustomAnswersBatchDeleteBody {\n");
        sb.append("    answerIds: ").append(toIndentedString(answerIds)).append("\n");
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
