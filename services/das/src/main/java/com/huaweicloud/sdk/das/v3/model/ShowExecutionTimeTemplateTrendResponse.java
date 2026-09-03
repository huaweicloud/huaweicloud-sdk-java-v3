package com.huaweicloud.sdk.das.v3.model;

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
public class ShowExecutionTimeTemplateTrendResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_millis")

    private Long intervalMillis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_list")

    private List<ExTimeTrendItem> itemList = null;

    public ShowExecutionTimeTemplateTrendResponse withIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
        return this;
    }

    /**
     * 趋势图的时间间隔
     * @return intervalMillis
     */
    public Long getIntervalMillis() {
        return intervalMillis;
    }

    public void setIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    public ShowExecutionTimeTemplateTrendResponse withItemList(List<ExTimeTrendItem> itemList) {
        this.itemList = itemList;
        return this;
    }

    public ShowExecutionTimeTemplateTrendResponse addItemListItem(ExTimeTrendItem itemListItem) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        this.itemList.add(itemListItem);
        return this;
    }

    public ShowExecutionTimeTemplateTrendResponse withItemList(Consumer<List<ExTimeTrendItem>> itemListSetter) {
        if (this.itemList == null) {
            this.itemList = new ArrayList<>();
        }
        itemListSetter.accept(this.itemList);
        return this;
    }

    /**
     * SQL趋势列表
     * @return itemList
     */
    public List<ExTimeTrendItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<ExTimeTrendItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowExecutionTimeTemplateTrendResponse that = (ShowExecutionTimeTemplateTrendResponse) obj;
        return Objects.equals(this.intervalMillis, that.intervalMillis) && Objects.equals(this.itemList, that.itemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervalMillis, itemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowExecutionTimeTemplateTrendResponse {\n");
        sb.append("    intervalMillis: ").append(toIndentedString(intervalMillis)).append("\n");
        sb.append("    itemList: ").append(toIndentedString(itemList)).append("\n");
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
