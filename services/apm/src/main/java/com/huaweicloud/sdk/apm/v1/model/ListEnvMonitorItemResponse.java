package com.huaweicloud.sdk.apm.v1.model;

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
public class ListEnvMonitorItemResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_list")

    private List<MonitorItem> monitorItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalPage")

    private Integer totalPage;

    public ListEnvMonitorItemResponse withMonitorItemList(List<MonitorItem> monitorItemList) {
        this.monitorItemList = monitorItemList;
        return this;
    }

    public ListEnvMonitorItemResponse addMonitorItemListItem(MonitorItem monitorItemListItem) {
        if (this.monitorItemList == null) {
            this.monitorItemList = new ArrayList<>();
        }
        this.monitorItemList.add(monitorItemListItem);
        return this;
    }

    public ListEnvMonitorItemResponse withMonitorItemList(Consumer<List<MonitorItem>> monitorItemListSetter) {
        if (this.monitorItemList == null) {
            this.monitorItemList = new ArrayList<>();
        }
        monitorItemListSetter.accept(this.monitorItemList);
        return this;
    }

    /**
     * 监控项列表。
     * @return monitorItemList
     */
    public List<MonitorItem> getMonitorItemList() {
        return monitorItemList;
    }

    public void setMonitorItemList(List<MonitorItem> monitorItemList) {
        this.monitorItemList = monitorItemList;
    }

    public ListEnvMonitorItemResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListEnvMonitorItemResponse withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 总页数。
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnvMonitorItemResponse listEnvMonitorItemResponse = (ListEnvMonitorItemResponse) o;
        return Objects.equals(this.monitorItemList, listEnvMonitorItemResponse.monitorItemList)
            && Objects.equals(this.totalCount, listEnvMonitorItemResponse.totalCount)
            && Objects.equals(this.totalPage, listEnvMonitorItemResponse.totalPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(monitorItemList, totalCount, totalPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnvMonitorItemResponse {\n");
        sb.append("    monitorItemList: ").append(toIndentedString(monitorItemList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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
