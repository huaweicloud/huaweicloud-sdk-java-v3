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
public class ShowMonitorItemDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collector_id")

    private Long collectorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_item_list")

    private List<ConfigItemValue> configItemList = null;

    public ShowMonitorItemDetailResponse withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 采集间隔
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public ShowMonitorItemDetailResponse withCollectorId(Long collectorId) {
        this.collectorId = collectorId;
        return this;
    }

    /**
     * 采集器ID
     * @return collectorId
     */
    public Long getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(Long collectorId) {
        this.collectorId = collectorId;
    }

    public ShowMonitorItemDetailResponse withConfigItemList(List<ConfigItemValue> configItemList) {
        this.configItemList = configItemList;
        return this;
    }

    public ShowMonitorItemDetailResponse addConfigItemListItem(ConfigItemValue configItemListItem) {
        if (this.configItemList == null) {
            this.configItemList = new ArrayList<>();
        }
        this.configItemList.add(configItemListItem);
        return this;
    }

    public ShowMonitorItemDetailResponse withConfigItemList(Consumer<List<ConfigItemValue>> configItemListSetter) {
        if (this.configItemList == null) {
            this.configItemList = new ArrayList<>();
        }
        configItemListSetter.accept(this.configItemList);
        return this;
    }

    /**
     * 采集参数配置列表
     * @return configItemList
     */
    public List<ConfigItemValue> getConfigItemList() {
        return configItemList;
    }

    public void setConfigItemList(List<ConfigItemValue> configItemList) {
        this.configItemList = configItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMonitorItemDetailResponse that = (ShowMonitorItemDetailResponse) obj;
        return Objects.equals(this.interval, that.interval) && Objects.equals(this.collectorId, that.collectorId)
            && Objects.equals(this.configItemList, that.configItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, collectorId, configItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMonitorItemDetailResponse {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    collectorId: ").append(toIndentedString(collectorId)).append("\n");
        sb.append("    configItemList: ").append(toIndentedString(configItemList)).append("\n");
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
