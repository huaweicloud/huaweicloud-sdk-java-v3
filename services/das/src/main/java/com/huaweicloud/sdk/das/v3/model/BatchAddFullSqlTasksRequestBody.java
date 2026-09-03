package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量创建全量SQL明细解析任务请求体
 */
public class BatchAddFullSqlTasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_reqs")

    private List<QueryReq> queryReqs = null;

    public BatchAddFullSqlTasksRequestBody withQueryReqs(List<QueryReq> queryReqs) {
        this.queryReqs = queryReqs;
        return this;
    }

    public BatchAddFullSqlTasksRequestBody addQueryReqsItem(QueryReq queryReqsItem) {
        if (this.queryReqs == null) {
            this.queryReqs = new ArrayList<>();
        }
        this.queryReqs.add(queryReqsItem);
        return this;
    }

    public BatchAddFullSqlTasksRequestBody withQueryReqs(Consumer<List<QueryReq>> queryReqsSetter) {
        if (this.queryReqs == null) {
            this.queryReqs = new ArrayList<>();
        }
        queryReqsSetter.accept(this.queryReqs);
        return this;
    }

    /**
     * SQL解析任务列表
     * @return queryReqs
     */
    public List<QueryReq> getQueryReqs() {
        return queryReqs;
    }

    public void setQueryReqs(List<QueryReq> queryReqs) {
        this.queryReqs = queryReqs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddFullSqlTasksRequestBody that = (BatchAddFullSqlTasksRequestBody) obj;
        return Objects.equals(this.queryReqs, that.queryReqs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryReqs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddFullSqlTasksRequestBody {\n");
        sb.append("    queryReqs: ").append(toIndentedString(queryReqs)).append("\n");
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
