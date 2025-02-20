package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryDiagnosisResultDiagnosisResults
 */
public class QueryDiagnosisResultDiagnosisResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item")

    private QueryDiagnosisResultItem item;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_list")

    private List<QueryDiagnosisResultResultList> resultList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_list")

    private List<QueryDiagnosisResultSuggestionList> suggestionList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public QueryDiagnosisResultDiagnosisResults withItem(QueryDiagnosisResultItem item) {
        this.item = item;
        return this;
    }

    public QueryDiagnosisResultDiagnosisResults withItem(Consumer<QueryDiagnosisResultItem> itemSetter) {
        if (this.item == null) {
            this.item = new QueryDiagnosisResultItem();
            itemSetter.accept(this.item);
        }

        return this;
    }

    /**
     * Get item
     * @return item
     */
    public QueryDiagnosisResultItem getItem() {
        return item;
    }

    public void setItem(QueryDiagnosisResultItem item) {
        this.item = item;
    }

    public QueryDiagnosisResultDiagnosisResults withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 诊断项状态。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public QueryDiagnosisResultDiagnosisResults withResultList(List<QueryDiagnosisResultResultList> resultList) {
        this.resultList = resultList;
        return this;
    }

    public QueryDiagnosisResultDiagnosisResults addResultListItem(QueryDiagnosisResultResultList resultListItem) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        this.resultList.add(resultListItem);
        return this;
    }

    public QueryDiagnosisResultDiagnosisResults withResultList(
        Consumer<List<QueryDiagnosisResultResultList>> resultListSetter) {
        if (this.resultList == null) {
            this.resultList = new ArrayList<>();
        }
        resultListSetter.accept(this.resultList);
        return this;
    }

    /**
     * 诊断结果。
     * @return resultList
     */
    public List<QueryDiagnosisResultResultList> getResultList() {
        return resultList;
    }

    public void setResultList(List<QueryDiagnosisResultResultList> resultList) {
        this.resultList = resultList;
    }

    public QueryDiagnosisResultDiagnosisResults withSuggestionList(
        List<QueryDiagnosisResultSuggestionList> suggestionList) {
        this.suggestionList = suggestionList;
        return this;
    }

    public QueryDiagnosisResultDiagnosisResults addSuggestionListItem(
        QueryDiagnosisResultSuggestionList suggestionListItem) {
        if (this.suggestionList == null) {
            this.suggestionList = new ArrayList<>();
        }
        this.suggestionList.add(suggestionListItem);
        return this;
    }

    public QueryDiagnosisResultDiagnosisResults withSuggestionList(
        Consumer<List<QueryDiagnosisResultSuggestionList>> suggestionListSetter) {
        if (this.suggestionList == null) {
            this.suggestionList = new ArrayList<>();
        }
        suggestionListSetter.accept(this.suggestionList);
        return this;
    }

    /**
     * 诊断建议。
     * @return suggestionList
     */
    public List<QueryDiagnosisResultSuggestionList> getSuggestionList() {
        return suggestionList;
    }

    public void setSuggestionList(List<QueryDiagnosisResultSuggestionList> suggestionList) {
        this.suggestionList = suggestionList;
    }

    public QueryDiagnosisResultDiagnosisResults withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * 诊断项得分。
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public QueryDiagnosisResultDiagnosisResults withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 完成时间。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryDiagnosisResultDiagnosisResults that = (QueryDiagnosisResultDiagnosisResults) obj;
        return Objects.equals(this.item, that.item) && Objects.equals(this.state, that.state)
            && Objects.equals(this.resultList, that.resultList)
            && Objects.equals(this.suggestionList, that.suggestionList) && Objects.equals(this.score, that.score)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, state, resultList, suggestionList, score, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDiagnosisResultDiagnosisResults {\n");
        sb.append("    item: ").append(toIndentedString(item)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    resultList: ").append(toIndentedString(resultList)).append("\n");
        sb.append("    suggestionList: ").append(toIndentedString(suggestionList)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
