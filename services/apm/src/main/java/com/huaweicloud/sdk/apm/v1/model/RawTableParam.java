package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取原始数据表格入参
 */
public class RawTableParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastRowId")

    private String lastRowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_config")

    private RawTableView viewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_word")

    private String searchWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_id")

    private Long monitorItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private Long envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public RawTableParam withLastRowId(String lastRowId) {
        this.lastRowId = lastRowId;
        return this;
    }

    /**
     * 上一次扫描的数据ID
     * @return lastRowId
     */
    public String getLastRowId() {
        return lastRowId;
    }

    public void setLastRowId(String lastRowId) {
        this.lastRowId = lastRowId;
    }

    public RawTableParam withViewConfig(RawTableView viewConfig) {
        this.viewConfig = viewConfig;
        return this;
    }

    public RawTableParam withViewConfig(Consumer<RawTableView> viewConfigSetter) {
        if (this.viewConfig == null) {
            this.viewConfig = new RawTableView();
            viewConfigSetter.accept(this.viewConfig);
        }

        return this;
    }

    /**
     * Get viewConfig
     * @return viewConfig
     */
    public RawTableView getViewConfig() {
        return viewConfig;
    }

    public void setViewConfig(RawTableView viewConfig) {
        this.viewConfig = viewConfig;
    }

    public RawTableParam withPage(Integer page) {
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

    public RawTableParam withPageSize(Integer pageSize) {
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

    public RawTableParam withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public RawTableParam withSearchWord(String searchWord) {
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

    public RawTableParam withInstanceId(Long instanceId) {
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

    public RawTableParam withMonitorItemId(Long monitorItemId) {
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

    public RawTableParam withEnvId(Long envId) {
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

    public RawTableParam withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public RawTableParam withEndTime(String endTime) {
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
        RawTableParam rawTableParam = (RawTableParam) o;
        return Objects.equals(this.lastRowId, rawTableParam.lastRowId)
            && Objects.equals(this.viewConfig, rawTableParam.viewConfig)
            && Objects.equals(this.page, rawTableParam.page) && Objects.equals(this.pageSize, rawTableParam.pageSize)
            && Objects.equals(this.orderBy, rawTableParam.orderBy)
            && Objects.equals(this.searchWord, rawTableParam.searchWord)
            && Objects.equals(this.instanceId, rawTableParam.instanceId)
            && Objects.equals(this.monitorItemId, rawTableParam.monitorItemId)
            && Objects.equals(this.envId, rawTableParam.envId)
            && Objects.equals(this.startTime, rawTableParam.startTime)
            && Objects.equals(this.endTime, rawTableParam.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastRowId,
            viewConfig,
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
        sb.append("class RawTableParam {\n");
        sb.append("    lastRowId: ").append(toIndentedString(lastRowId)).append("\n");
        sb.append("    viewConfig: ").append(toIndentedString(viewConfig)).append("\n");
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
