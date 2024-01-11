package com.huaweicloud.sdk.drs.v5.model;

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
public class ListJobHistoryParametersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_history_config_list")

    private List<ListJobHistoryParameter> parameterHistoryConfigList = null;

    public ListJobHistoryParametersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 历史记录总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListJobHistoryParametersResponse withParameterHistoryConfigList(
        List<ListJobHistoryParameter> parameterHistoryConfigList) {
        this.parameterHistoryConfigList = parameterHistoryConfigList;
        return this;
    }

    public ListJobHistoryParametersResponse addParameterHistoryConfigListItem(
        ListJobHistoryParameter parameterHistoryConfigListItem) {
        if (this.parameterHistoryConfigList == null) {
            this.parameterHistoryConfigList = new ArrayList<>();
        }
        this.parameterHistoryConfigList.add(parameterHistoryConfigListItem);
        return this;
    }

    public ListJobHistoryParametersResponse withParameterHistoryConfigList(
        Consumer<List<ListJobHistoryParameter>> parameterHistoryConfigListSetter) {
        if (this.parameterHistoryConfigList == null) {
            this.parameterHistoryConfigList = new ArrayList<>();
        }
        parameterHistoryConfigListSetter.accept(this.parameterHistoryConfigList);
        return this;
    }

    /**
     * 任务参数历史修改列表
     * @return parameterHistoryConfigList
     */
    public List<ListJobHistoryParameter> getParameterHistoryConfigList() {
        return parameterHistoryConfigList;
    }

    public void setParameterHistoryConfigList(List<ListJobHistoryParameter> parameterHistoryConfigList) {
        this.parameterHistoryConfigList = parameterHistoryConfigList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobHistoryParametersResponse that = (ListJobHistoryParametersResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.parameterHistoryConfigList, that.parameterHistoryConfigList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, parameterHistoryConfigList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobHistoryParametersResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    parameterHistoryConfigList: ").append(toIndentedString(parameterHistoryConfigList)).append("\n");
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
