package com.huaweicloud.sdk.drs.v3.model;

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
public class BatchShowParamsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params_list")

    private List<QueryDbParamsResp> paramsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public BatchShowParamsResponse withParamsList(List<QueryDbParamsResp> paramsList) {
        this.paramsList = paramsList;
        return this;
    }

    public BatchShowParamsResponse addParamsListItem(QueryDbParamsResp paramsListItem) {
        if (this.paramsList == null) {
            this.paramsList = new ArrayList<>();
        }
        this.paramsList.add(paramsListItem);
        return this;
    }

    public BatchShowParamsResponse withParamsList(Consumer<List<QueryDbParamsResp>> paramsListSetter) {
        if (this.paramsList == null) {
            this.paramsList = new ArrayList<>();
        }
        paramsListSetter.accept(this.paramsList);
        return this;
    }

    /**
     * 查询数据库参数响应体
     * @return paramsList
     */
    public List<QueryDbParamsResp> getParamsList() {
        return paramsList;
    }

    public void setParamsList(List<QueryDbParamsResp> paramsList) {
        this.paramsList = paramsList;
    }

    public BatchShowParamsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchShowParamsResponse batchShowParamsResponse = (BatchShowParamsResponse) o;
        return Objects.equals(this.paramsList, batchShowParamsResponse.paramsList)
            && Objects.equals(this.count, batchShowParamsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramsList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchShowParamsResponse {\n");
        sb.append("    paramsList: ").append(toIndentedString(paramsList)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
