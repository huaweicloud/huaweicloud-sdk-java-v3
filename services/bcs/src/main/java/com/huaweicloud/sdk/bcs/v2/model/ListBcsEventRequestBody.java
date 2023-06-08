package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询和统计事件告警请求体
 */
public class ListBcsEventRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_range")

    private String timeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Long step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_relation")

    private List<EventMetadataRelation> metadataRelation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private EventResultSort sort;

    public ListBcsEventRequestBody withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    /**
     * timeRange用于指标查询时间范围，主要用于解决客户端时间和服务端时间不一致情况下，查询最近N分钟的数据。另可用于精确查询某一段时间的数据。
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    public ListBcsEventRequestBody withStep(Long step) {
        this.step = step;
        return this;
    }

    /**
     * 统计步长。毫秒数
     * @return step
     */
    public Long getStep() {
        return step;
    }

    public void setStep(Long step) {
        this.step = step;
    }

    public ListBcsEventRequestBody withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * 模糊查询匹配字段，可以为空
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListBcsEventRequestBody withMetadataRelation(List<EventMetadataRelation> metadataRelation) {
        this.metadataRelation = metadataRelation;
        return this;
    }

    public ListBcsEventRequestBody addMetadataRelationItem(EventMetadataRelation metadataRelationItem) {
        if (this.metadataRelation == null) {
            this.metadataRelation = new ArrayList<>();
        }
        this.metadataRelation.add(metadataRelationItem);
        return this;
    }

    public ListBcsEventRequestBody withMetadataRelation(Consumer<List<EventMetadataRelation>> metadataRelationSetter) {
        if (this.metadataRelation == null) {
            this.metadataRelation = new ArrayList<>();
        }
        metadataRelationSetter.accept(this.metadataRelation);
        return this;
    }

    /**
     * 查询条件组合，可以为空
     * @return metadataRelation
     */
    public List<EventMetadataRelation> getMetadataRelation() {
        return metadataRelation;
    }

    public void setMetadataRelation(List<EventMetadataRelation> metadataRelation) {
        this.metadataRelation = metadataRelation;
    }

    public ListBcsEventRequestBody withSort(EventResultSort sort) {
        this.sort = sort;
        return this;
    }

    public ListBcsEventRequestBody withSort(Consumer<EventResultSort> sortSetter) {
        if (this.sort == null) {
            this.sort = new EventResultSort();
            sortSetter.accept(this.sort);
        }

        return this;
    }

    /**
     * Get sort
     * @return sort
     */
    public EventResultSort getSort() {
        return sort;
    }

    public void setSort(EventResultSort sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBcsEventRequestBody listBcsEventRequestBody = (ListBcsEventRequestBody) o;
        return Objects.equals(this.timeRange, listBcsEventRequestBody.timeRange)
            && Objects.equals(this.step, listBcsEventRequestBody.step)
            && Objects.equals(this.search, listBcsEventRequestBody.search)
            && Objects.equals(this.metadataRelation, listBcsEventRequestBody.metadataRelation)
            && Objects.equals(this.sort, listBcsEventRequestBody.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeRange, step, search, metadataRelation, sort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBcsEventRequestBody {\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    metadataRelation: ").append(toIndentedString(metadataRelation)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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
