package com.huaweicloud.sdk.cloudrtc.v1.model;

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
public class ListRtcRealtimeNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private List<TimeDoubleValueData> network = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRtcRealtimeNetworkResponse withNetwork(List<TimeDoubleValueData> network) {
        this.network = network;
        return this;
    }

    public ListRtcRealtimeNetworkResponse addNetworkItem(TimeDoubleValueData networkItem) {
        if (this.network == null) {
            this.network = new ArrayList<>();
        }
        this.network.add(networkItem);
        return this;
    }

    public ListRtcRealtimeNetworkResponse withNetwork(Consumer<List<TimeDoubleValueData>> networkSetter) {
        if (this.network == null) {
            this.network = new ArrayList<>();
        }
        networkSetter.accept(this.network);
        return this;
    }

    /**
     * 时间戳及相应时间的指标数值列表
     * @return network
     */
    public List<TimeDoubleValueData> getNetwork() {
        return network;
    }

    public void setNetwork(List<TimeDoubleValueData> network) {
        this.network = network;
    }

    public ListRtcRealtimeNetworkResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRtcRealtimeNetworkResponse listRtcRealtimeNetworkResponse = (ListRtcRealtimeNetworkResponse) o;
        return Objects.equals(this.network, listRtcRealtimeNetworkResponse.network)
            && Objects.equals(this.xRequestId, listRtcRealtimeNetworkResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcRealtimeNetworkResponse {\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
