package com.huaweicloud.sdk.bss.v2.model;

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
public class RenewalResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_ids")

    private List<String> orderIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_resource_infos")

    private List<FailResourceInfo> failResourceInfos = null;

    public RenewalResourcesResponse withOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    public RenewalResourcesResponse addOrderIdsItem(String orderIdsItem) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        this.orderIds.add(orderIdsItem);
        return this;
    }

    public RenewalResourcesResponse withOrderIds(Consumer<List<String>> orderIdsSetter) {
        if (this.orderIds == null) {
            this.orderIds = new ArrayList<>();
        }
        orderIdsSetter.accept(this.orderIds);
        return this;
    }

    /**
     * 续订资源生成的订单ID的列表。
     * @return orderIds
     */
    public List<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public RenewalResourcesResponse withFailResourceInfos(List<FailResourceInfo> failResourceInfos) {
        this.failResourceInfos = failResourceInfos;
        return this;
    }

    public RenewalResourcesResponse addFailResourceInfosItem(FailResourceInfo failResourceInfosItem) {
        if (this.failResourceInfos == null) {
            this.failResourceInfos = new ArrayList<>();
        }
        this.failResourceInfos.add(failResourceInfosItem);
        return this;
    }

    public RenewalResourcesResponse withFailResourceInfos(Consumer<List<FailResourceInfo>> failResourceInfosSetter) {
        if (this.failResourceInfos == null) {
            this.failResourceInfos = new ArrayList<>();
        }
        failResourceInfosSetter.accept(this.failResourceInfos);
        return this;
    }

    /**
     * |参数名称：失败的资源信息列表| |参数的约束及描述：套餐包使用量信息|
     * @return failResourceInfos
     */
    public List<FailResourceInfo> getFailResourceInfos() {
        return failResourceInfos;
    }

    public void setFailResourceInfos(List<FailResourceInfo> failResourceInfos) {
        this.failResourceInfos = failResourceInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RenewalResourcesResponse that = (RenewalResourcesResponse) obj;
        return Objects.equals(this.orderIds, that.orderIds)
            && Objects.equals(this.failResourceInfos, that.failResourceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderIds, failResourceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenewalResourcesResponse {\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
        sb.append("    failResourceInfos: ").append(toIndentedString(failResourceInfos)).append("\n");
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
