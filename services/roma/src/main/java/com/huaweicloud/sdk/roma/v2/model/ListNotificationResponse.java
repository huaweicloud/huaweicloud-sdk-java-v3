package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNotificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    @JacksonXmlProperty(localName = "items")

    private List<NotificationResponseBody> items = null;

    public ListNotificationResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 1
     * maximum: 9999999999
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListNotificationResponse withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回数量
     * minimum: 1
     * maximum: 999
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ListNotificationResponse withItems(List<NotificationResponseBody> items) {
        this.items = items;
        return this;
    }

    public ListNotificationResponse addItemsItem(NotificationResponseBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListNotificationResponse withItems(Consumer<List<NotificationResponseBody>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 订阅管理列表
     * @return items
     */
    public List<NotificationResponseBody> getItems() {
        return items;
    }

    public void setItems(List<NotificationResponseBody> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNotificationResponse listNotificationResponse = (ListNotificationResponse) o;
        return Objects.equals(this.total, listNotificationResponse.total)
            && Objects.equals(this.size, listNotificationResponse.size)
            && Objects.equals(this.items, listNotificationResponse.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, size, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
