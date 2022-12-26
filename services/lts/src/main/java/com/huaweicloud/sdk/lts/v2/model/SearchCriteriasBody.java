package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SearchCriteriasBody
 */
public class SearchCriteriasBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criterias")

    private List<GetQuerySearchCriteriasBody> criterias = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    public SearchCriteriasBody withCriterias(List<GetQuerySearchCriteriasBody> criterias) {
        this.criterias = criterias;
        return this;
    }

    public SearchCriteriasBody addCriteriasItem(GetQuerySearchCriteriasBody criteriasItem) {
        if (this.criterias == null) {
            this.criterias = new ArrayList<>();
        }
        this.criterias.add(criteriasItem);
        return this;
    }

    public SearchCriteriasBody withCriterias(Consumer<List<GetQuerySearchCriteriasBody>> criteriasSetter) {
        if (this.criterias == null) {
            this.criterias = new ArrayList<>();
        }
        criteriasSetter.accept(this.criterias);
        return this;
    }

    /**
     * 单个日志流的快速查询
     * @return criterias
     */
    public List<GetQuerySearchCriteriasBody> getCriterias() {
        return criterias;
    }

    public void setCriterias(List<GetQuerySearchCriteriasBody> criterias) {
        this.criterias = criterias;
    }

    public SearchCriteriasBody withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流id
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public SearchCriteriasBody withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchCriteriasBody searchCriteriasBody = (SearchCriteriasBody) o;
        return Objects.equals(this.criterias, searchCriteriasBody.criterias)
            && Objects.equals(this.logStreamId, searchCriteriasBody.logStreamId)
            && Objects.equals(this.logStreamName, searchCriteriasBody.logStreamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criterias, logStreamId, logStreamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCriteriasBody {\n");
        sb.append("    criterias: ").append(toIndentedString(criterias)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
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
