package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ClientNetworkRequestBody
 */
public class ClientNetworkRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_network_ranges")
    
    private List<String> clientNetworkRanges = null;
    
    public ClientNetworkRequestBody withClientNetworkRanges(List<String> clientNetworkRanges) {
        this.clientNetworkRanges = clientNetworkRanges;
        return this;
    }

    
    public ClientNetworkRequestBody addClientNetworkRangesItem(String clientNetworkRangesItem) {
        if(this.clientNetworkRanges == null) {
            this.clientNetworkRanges = new ArrayList<>();
        }
        this.clientNetworkRanges.add(clientNetworkRangesItem);
        return this;
    }

    public ClientNetworkRequestBody withClientNetworkRanges(Consumer<List<String>> clientNetworkRangesSetter) {
        if(this.clientNetworkRanges == null) {
            this.clientNetworkRanges = new ArrayList<>();
        }
        clientNetworkRangesSetter.accept(this.clientNetworkRanges);
        return this;
    }

    /**
     * 客户端所在网段。 跨网段访问配置只有在客户端与副本集实例部署在不同网段的情况下才需要配置，例如访问副本集的客户端所在网段为192.168.0.0/16，副本集所在的网段为172.16.0.0/24，则需要添加跨网段配置192.168.0.0/16才能正常访问。只有副本集有该功能。 注意：源端ECS连接实例的前提是与实例节点网络通信正常，如果网络不通，可以参考对等连接进行相关配置。
     * @return clientNetworkRanges
     */
    public List<String> getClientNetworkRanges() {
        return clientNetworkRanges;
    }

    public void setClientNetworkRanges(List<String> clientNetworkRanges) {
        this.clientNetworkRanges = clientNetworkRanges;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClientNetworkRequestBody clientNetworkRequestBody = (ClientNetworkRequestBody) o;
        return Objects.equals(this.clientNetworkRanges, clientNetworkRequestBody.clientNetworkRanges);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clientNetworkRanges);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientNetworkRequestBody {\n");
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

