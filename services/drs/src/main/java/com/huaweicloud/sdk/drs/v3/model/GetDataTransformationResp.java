package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据加工行过滤配置信息
 */
public class GetDataTransformationResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_conditions")

    private List<DataTransformationInfo> filterConditions = null;

    public GetDataTransformationResp withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据加工总数。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public GetDataTransformationResp withFilterConditions(List<DataTransformationInfo> filterConditions) {
        this.filterConditions = filterConditions;
        return this;
    }

    public GetDataTransformationResp addFilterConditionsItem(DataTransformationInfo filterConditionsItem) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        this.filterConditions.add(filterConditionsItem);
        return this;
    }

    public GetDataTransformationResp withFilterConditions(
        Consumer<List<DataTransformationInfo>> filterConditionsSetter) {
        if (this.filterConditions == null) {
            this.filterConditions = new ArrayList<>();
        }
        filterConditionsSetter.accept(this.filterConditions);
        return this;
    }

    /**
     * 数据过滤配置信息。
     * @return filterConditions
     */
    public List<DataTransformationInfo> getFilterConditions() {
        return filterConditions;
    }

    public void setFilterConditions(List<DataTransformationInfo> filterConditions) {
        this.filterConditions = filterConditions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDataTransformationResp getDataTransformationResp = (GetDataTransformationResp) o;
        return Objects.equals(this.totalCount, getDataTransformationResp.totalCount)
            && Objects.equals(this.filterConditions, getDataTransformationResp.filterConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, filterConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDataTransformationResp {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    filterConditions: ").append(toIndentedString(filterConditions)).append("\n");
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
