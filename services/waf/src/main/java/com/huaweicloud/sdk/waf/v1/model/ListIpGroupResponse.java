package com.huaweicloud.sdk.waf.v1.model;

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
public class ListIpGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<IpGroupBody> items = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudTotal")

    private Integer cloudTotal;

    public ListIpGroupResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 该用户当前企业项目下Ip地址组数量，只包含本地地址组
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListIpGroupResponse withItems(List<IpGroupBody> items) {
        this.items = items;
        return this;
    }

    public ListIpGroupResponse addItemsItem(IpGroupBody itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListIpGroupResponse withItems(Consumer<List<IpGroupBody>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 地址组信息列表
     * @return items
     */
    public List<IpGroupBody> getItems() {
        return items;
    }

    public void setItems(List<IpGroupBody> items) {
        this.items = items;
    }

    public ListIpGroupResponse withCloudTotal(Integer cloudTotal) {
        this.cloudTotal = cloudTotal;
        return this;
    }

    /**
     * 该用户总的Ip地址组数量，包含本地与共享地址组
     * @return cloudTotal
     */
    public Integer getCloudTotal() {
        return cloudTotal;
    }

    public void setCloudTotal(Integer cloudTotal) {
        this.cloudTotal = cloudTotal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIpGroupResponse listIpGroupResponse = (ListIpGroupResponse) o;
        return Objects.equals(this.total, listIpGroupResponse.total)
            && Objects.equals(this.items, listIpGroupResponse.items)
            && Objects.equals(this.cloudTotal, listIpGroupResponse.cloudTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, items, cloudTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIpGroupResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    cloudTotal: ").append(toIndentedString(cloudTotal)).append("\n");
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
