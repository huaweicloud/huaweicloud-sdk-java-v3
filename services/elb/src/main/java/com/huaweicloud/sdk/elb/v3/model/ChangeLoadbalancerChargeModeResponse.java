package com.huaweicloud.sdk.elb.v3.model;

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
public class ChangeLoadbalancerChargeModeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id_list")

    private List<String> eipIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id_list")

    private List<String> loadbalancerIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ChangeLoadbalancerChargeModeResponse withEipIdList(List<String> eipIdList) {
        this.eipIdList = eipIdList;
        return this;
    }

    public ChangeLoadbalancerChargeModeResponse addEipIdListItem(String eipIdListItem) {
        if (this.eipIdList == null) {
            this.eipIdList = new ArrayList<>();
        }
        this.eipIdList.add(eipIdListItem);
        return this;
    }

    public ChangeLoadbalancerChargeModeResponse withEipIdList(Consumer<List<String>> eipIdListSetter) {
        if (this.eipIdList == null) {
            this.eipIdList = new ArrayList<>();
        }
        eipIdListSetter.accept(this.eipIdList);
        return this;
    }

    /**
     * 转包周期下单成功的EIP ID列表
     * @return eipIdList
     */
    public List<String> getEipIdList() {
        return eipIdList;
    }

    public void setEipIdList(List<String> eipIdList) {
        this.eipIdList = eipIdList;
    }

    public ChangeLoadbalancerChargeModeResponse withLoadbalancerIdList(List<String> loadbalancerIdList) {
        this.loadbalancerIdList = loadbalancerIdList;
        return this;
    }

    public ChangeLoadbalancerChargeModeResponse addLoadbalancerIdListItem(String loadbalancerIdListItem) {
        if (this.loadbalancerIdList == null) {
            this.loadbalancerIdList = new ArrayList<>();
        }
        this.loadbalancerIdList.add(loadbalancerIdListItem);
        return this;
    }

    public ChangeLoadbalancerChargeModeResponse withLoadbalancerIdList(
        Consumer<List<String>> loadbalancerIdListSetter) {
        if (this.loadbalancerIdList == null) {
            this.loadbalancerIdList = new ArrayList<>();
        }
        loadbalancerIdListSetter.accept(this.loadbalancerIdList);
        return this;
    }

    /**
     * 转包周期下单成功的LB ID列表
     * @return loadbalancerIdList
     */
    public List<String> getLoadbalancerIdList() {
        return loadbalancerIdList;
    }

    public void setLoadbalancerIdList(List<String> loadbalancerIdList) {
        this.loadbalancerIdList = loadbalancerIdList;
    }

    public ChangeLoadbalancerChargeModeResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 转包周期订单号
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ChangeLoadbalancerChargeModeResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的UUIID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeLoadbalancerChargeModeResponse that = (ChangeLoadbalancerChargeModeResponse) obj;
        return Objects.equals(this.eipIdList, that.eipIdList)
            && Objects.equals(this.loadbalancerIdList, that.loadbalancerIdList)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eipIdList, loadbalancerIdList, orderId, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeLoadbalancerChargeModeResponse {\n");
        sb.append("    eipIdList: ").append(toIndentedString(eipIdList)).append("\n");
        sb.append("    loadbalancerIdList: ").append(toIndentedString(loadbalancerIdList)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
