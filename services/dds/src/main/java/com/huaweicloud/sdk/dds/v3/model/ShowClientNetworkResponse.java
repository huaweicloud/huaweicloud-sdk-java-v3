package com.huaweicloud.sdk.dds.v3.model;

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
public class ShowClientNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_network_ranges")

    private List<String> clientNetworkRanges = null;

    public ShowClientNetworkResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，可以调用“[查询实例列表和详情](x-wc://file=zh-cn_topic_0000001369935045.xml)”接口获取。如果未申请实例，可以调用“[创建实例](x-wc://file=zh-cn_topic_0000001369734929.xml)”接口创建。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowClientNetworkResponse withClientNetworkRanges(List<String> clientNetworkRanges) {
        this.clientNetworkRanges = clientNetworkRanges;
        return this;
    }

    public ShowClientNetworkResponse addClientNetworkRangesItem(String clientNetworkRangesItem) {
        if (this.clientNetworkRanges == null) {
            this.clientNetworkRanges = new ArrayList<>();
        }
        this.clientNetworkRanges.add(clientNetworkRangesItem);
        return this;
    }

    public ShowClientNetworkResponse withClientNetworkRanges(Consumer<List<String>> clientNetworkRangesSetter) {
        if (this.clientNetworkRanges == null) {
            this.clientNetworkRanges = new ArrayList<>();
        }
        clientNetworkRangesSetter.accept(this.clientNetworkRanges);
        return this;
    }

    /**
     * 客户端所在网段。 > - [跨网段访问配置只有在客户端与副本集实例部署在不同网段的情况下才允许配置，例如访问副本集的客户端所在网段为192.168.0.0/16，副本集所在的网段为172.16.0.0/24，则需要添加跨网段配置192.168.0.0/16才能正常访问。只有副本集有该功能。](tag:ccs,cmcc,ctc,dt,dt_test,fcs,fcs_dt,g42,hic,hk_g42,hk_sbc,hc,hws_ocb,hws_sbc,ocb,tlf,tm,hk,hws_eu)
     * @return clientNetworkRanges
     */
    public List<String> getClientNetworkRanges() {
        return clientNetworkRanges;
    }

    public void setClientNetworkRanges(List<String> clientNetworkRanges) {
        this.clientNetworkRanges = clientNetworkRanges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClientNetworkResponse that = (ShowClientNetworkResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.clientNetworkRanges, that.clientNetworkRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, clientNetworkRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClientNetworkResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    clientNetworkRanges: ").append(toIndentedString(clientNetworkRanges)).append("\n");
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
