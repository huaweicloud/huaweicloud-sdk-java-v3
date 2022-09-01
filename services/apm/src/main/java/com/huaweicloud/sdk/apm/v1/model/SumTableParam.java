package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 汇聚数据表格传参
 */
public class SumTableParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_config")

    @JacksonXmlProperty(localName = "view_config")

    private SumTableView viewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    @JacksonXmlProperty(localName = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    @JacksonXmlProperty(localName = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    @JacksonXmlProperty(localName = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    @JacksonXmlProperty(localName = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_word")

    @JacksonXmlProperty(localName = "search_word")

    private String searchWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    @JacksonXmlProperty(localName = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private String endTime;

    public SumTableParam withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 上次请求的id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public SumTableParam withViewConfig(SumTableView viewConfig) {
        this.viewConfig = viewConfig;
        return this;
    }

    public SumTableParam withViewConfig(Consumer<SumTableView> viewConfigSetter) {
        if (this.viewConfig == null) {
            this.viewConfig = new SumTableView();
            viewConfigSetter.accept(this.viewConfig);
        }

        return this;
    }

    /**
     * Get viewConfig
     * @return viewConfig
     */
    public SumTableView getViewConfig() {
        return viewConfig;
    }

    public void setViewConfig(SumTableView viewConfig) {
        this.viewConfig = viewConfig;
    }

    public SumTableParam withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * 策略
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public SumTableParam withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 当前页码
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public SumTableParam withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页数据总数
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public SumTableParam withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序规则
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public SumTableParam withSearchWord(String searchWord) {
        this.searchWord = searchWord;
        return this;
    }

    /**
     * 搜索关键字
     * @return searchWord
     */
    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public SumTableParam withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public SumTableParam withMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
        return this;
    }

    /**
     * 监控项id
     * @return monitorItemId
     */
    public Long getMonitorItemId() {
        return monitorItemId;
    }

    public void setMonitorItemId(Long monitorItemId) {
        this.monitorItemId = monitorItemId;
    }

    public SumTableParam withEnvId(Long envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 环境id
     * @return envId
     */
    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public SumTableParam withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SumTableParam withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SumTableParam sumTableParam = (SumTableParam) o;
        return Objects.equals(this.requestId, sumTableParam.requestId)
            && Objects.equals(this.viewConfig, sumTableParam.viewConfig)
            && Objects.equals(this.strategy, sumTableParam.strategy) && Objects.equals(this.page, sumTableParam.page)
            && Objects.equals(this.pageSize, sumTableParam.pageSize)
            && Objects.equals(this.orderBy, sumTableParam.orderBy)
            && Objects.equals(this.searchWord, sumTableParam.searchWord)
            && Objects.equals(this.instanceId, sumTableParam.instanceId)
            && Objects.equals(this.monitorItemId, sumTableParam.monitorItemId)
            && Objects.equals(this.envId, sumTableParam.envId)
            && Objects.equals(this.startTime, sumTableParam.startTime)
            && Objects.equals(this.endTime, sumTableParam.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId,
            viewConfig,
            strategy,
            page,
            pageSize,
            orderBy,
            searchWord,
            instanceId,
            monitorItemId,
            envId,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SumTableParam {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    viewConfig: ").append(toIndentedString(viewConfig)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    searchWord: ").append(toIndentedString(searchWord)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    monitorItemId: ").append(toIndentedString(monitorItemId)).append("\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
