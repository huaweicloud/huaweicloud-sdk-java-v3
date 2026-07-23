package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListOpsTraceRequestBody
 */
public class ListOpsTraceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_type")

    private String spanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "like")

    private Integer like;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private Map<String, String> label = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_sign")

    private String filterSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_filter")

    private List<FilterParam> labelFilter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private List<ListFilterParam> filter = null;

    public ListOpsTraceRequestBody withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间
     * minimum: 0
     * maximum: 4110338427000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListOpsTraceRequestBody withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * minimum: 0
     * maximum: 4110338427000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListOpsTraceRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * agent id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ListOpsTraceRequestBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ListOpsTraceRequestBody withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * 调用链id
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ListOpsTraceRequestBody withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public ListOpsTraceRequestBody withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话id
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ListOpsTraceRequestBody withSpanType(String spanType) {
        this.spanType = spanType;
        return this;
    }

    /**
     * span类型
     * @return spanType
     */
    public String getSpanType() {
        return spanType;
    }

    public void setSpanType(String spanType) {
        this.spanType = spanType;
    }

    public ListOpsTraceRequestBody withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * 输入过滤词
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public ListOpsTraceRequestBody withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * 输出过滤词
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public ListOpsTraceRequestBody withLike(Integer like) {
        this.like = like;
        return this;
    }

    /**
     * 评价
     * minimum: 1
     * maximum: 2
     * @return like
     */
    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public ListOpsTraceRequestBody withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public ListOpsTraceRequestBody putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public ListOpsTraceRequestBody withLabel(Consumer<Map<String, String>> labelSetter) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * 标注的过滤条件
     * @return label
     */
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    public ListOpsTraceRequestBody withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * minimum: 0
     * maximum: 10000
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListOpsTraceRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOpsTraceRequestBody withFilterSign(String filterSign) {
        this.filterSign = filterSign;
        return this;
    }

    /**
     * 连接标识
     * @return filterSign
     */
    public String getFilterSign() {
        return filterSign;
    }

    public void setFilterSign(String filterSign) {
        this.filterSign = filterSign;
    }

    public ListOpsTraceRequestBody withLabelFilter(List<FilterParam> labelFilter) {
        this.labelFilter = labelFilter;
        return this;
    }

    public ListOpsTraceRequestBody addLabelFilterItem(FilterParam labelFilterItem) {
        if (this.labelFilter == null) {
            this.labelFilter = new ArrayList<>();
        }
        this.labelFilter.add(labelFilterItem);
        return this;
    }

    public ListOpsTraceRequestBody withLabelFilter(Consumer<List<FilterParam>> labelFilterSetter) {
        if (this.labelFilter == null) {
            this.labelFilter = new ArrayList<>();
        }
        labelFilterSetter.accept(this.labelFilter);
        return this;
    }

    /**
     * 标签过滤条件
     * @return labelFilter
     */
    public List<FilterParam> getLabelFilter() {
        return labelFilter;
    }

    public void setLabelFilter(List<FilterParam> labelFilter) {
        this.labelFilter = labelFilter;
    }

    public ListOpsTraceRequestBody withFilter(List<ListFilterParam> filter) {
        this.filter = filter;
        return this;
    }

    public ListOpsTraceRequestBody addFilterItem(ListFilterParam filterItem) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(filterItem);
        return this;
    }

    public ListOpsTraceRequestBody withFilter(Consumer<List<ListFilterParam>> filterSetter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        filterSetter.accept(this.filter);
        return this;
    }

    /**
     * 过滤条件
     * @return filter
     */
    public List<ListFilterParam> getFilter() {
        return filter;
    }

    public void setFilter(List<ListFilterParam> filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsTraceRequestBody that = (ListOpsTraceRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.traceId, that.traceId) && Objects.equals(this.statusCode, that.statusCode)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.spanType, that.spanType)
            && Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.like, that.like) && Objects.equals(this.label, that.label)
            && Objects.equals(this.pageNo, that.pageNo) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.filterSign, that.filterSign) && Objects.equals(this.labelFilter, that.labelFilter)
            && Objects.equals(this.filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            resourceId,
            resourceType,
            traceId,
            statusCode,
            sessionId,
            spanType,
            input,
            output,
            like,
            label,
            pageNo,
            pageSize,
            filterSign,
            labelFilter,
            filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsTraceRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    spanType: ").append(toIndentedString(spanType)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    like: ").append(toIndentedString(like)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    filterSign: ").append(toIndentedString(filterSign)).append("\n");
        sb.append("    labelFilter: ").append(toIndentedString(labelFilter)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
