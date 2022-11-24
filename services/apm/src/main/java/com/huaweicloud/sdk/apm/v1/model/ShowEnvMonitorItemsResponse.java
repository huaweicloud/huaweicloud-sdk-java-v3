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
public class ShowEnvMonitorItemsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_info_list")

    private List<CollectorCategoryInfo> categoryInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_item_info_list")

    private List<MonitorItemEntity> monitorItemInfoList = null;

    public ShowEnvMonitorItemsResponse withCategoryInfoList(List<CollectorCategoryInfo> categoryInfoList) {
        this.categoryInfoList = categoryInfoList;
        return this;
    }

    public ShowEnvMonitorItemsResponse addCategoryInfoListItem(CollectorCategoryInfo categoryInfoListItem) {
        if (this.categoryInfoList == null) {
            this.categoryInfoList = new ArrayList<>();
        }
        this.categoryInfoList.add(categoryInfoListItem);
        return this;
    }

    public ShowEnvMonitorItemsResponse withCategoryInfoList(
        Consumer<List<CollectorCategoryInfo>> categoryInfoListSetter) {
        if (this.categoryInfoList == null) {
            this.categoryInfoList = new ArrayList<>();
        }
        categoryInfoListSetter.accept(this.categoryInfoList);
        return this;
    }

    /**
     * 采集器类别集合。
     * @return categoryInfoList
     */
    public List<CollectorCategoryInfo> getCategoryInfoList() {
        return categoryInfoList;
    }

    public void setCategoryInfoList(List<CollectorCategoryInfo> categoryInfoList) {
        this.categoryInfoList = categoryInfoList;
    }

    public ShowEnvMonitorItemsResponse withMonitorItemInfoList(List<MonitorItemEntity> monitorItemInfoList) {
        this.monitorItemInfoList = monitorItemInfoList;
        return this;
    }

    public ShowEnvMonitorItemsResponse addMonitorItemInfoListItem(MonitorItemEntity monitorItemInfoListItem) {
        if (this.monitorItemInfoList == null) {
            this.monitorItemInfoList = new ArrayList<>();
        }
        this.monitorItemInfoList.add(monitorItemInfoListItem);
        return this;
    }

    public ShowEnvMonitorItemsResponse withMonitorItemInfoList(
        Consumer<List<MonitorItemEntity>> monitorItemInfoListSetter) {
        if (this.monitorItemInfoList == null) {
            this.monitorItemInfoList = new ArrayList<>();
        }
        monitorItemInfoListSetter.accept(this.monitorItemInfoList);
        return this;
    }

    /**
     * 监控项集合。
     * @return monitorItemInfoList
     */
    public List<MonitorItemEntity> getMonitorItemInfoList() {
        return monitorItemInfoList;
    }

    public void setMonitorItemInfoList(List<MonitorItemEntity> monitorItemInfoList) {
        this.monitorItemInfoList = monitorItemInfoList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnvMonitorItemsResponse showEnvMonitorItemsResponse = (ShowEnvMonitorItemsResponse) o;
        return Objects.equals(this.categoryInfoList, showEnvMonitorItemsResponse.categoryInfoList)
            && Objects.equals(this.monitorItemInfoList, showEnvMonitorItemsResponse.monitorItemInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryInfoList, monitorItemInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvMonitorItemsResponse {\n");
        sb.append("    categoryInfoList: ").append(toIndentedString(categoryInfoList)).append("\n");
        sb.append("    monitorItemInfoList: ").append(toIndentedString(monitorItemInfoList)).append("\n");
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
