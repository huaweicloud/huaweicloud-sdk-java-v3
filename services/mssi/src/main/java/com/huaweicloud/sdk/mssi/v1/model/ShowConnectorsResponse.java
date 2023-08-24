package com.huaweicloud.sdk.mssi.v1.model;

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
public class ShowConnectorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectors")

    private List<ConnectorInfo> connectors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ShowConnectorsResponse withConnectors(List<ConnectorInfo> connectors) {
        this.connectors = connectors;
        return this;
    }

    public ShowConnectorsResponse addConnectorsItem(ConnectorInfo connectorsItem) {
        if (this.connectors == null) {
            this.connectors = new ArrayList<>();
        }
        this.connectors.add(connectorsItem);
        return this;
    }

    public ShowConnectorsResponse withConnectors(Consumer<List<ConnectorInfo>> connectorsSetter) {
        if (this.connectors == null) {
            this.connectors = new ArrayList<>();
        }
        connectorsSetter.accept(this.connectors);
        return this;
    }

    /**
     * 连接器列表
     * @return connectors
     */
    public List<ConnectorInfo> getConnectors() {
        return connectors;
    }

    public void setConnectors(List<ConnectorInfo> connectors) {
        this.connectors = connectors;
    }

    public ShowConnectorsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 连接器数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConnectorsResponse that = (ShowConnectorsResponse) obj;
        return Objects.equals(this.connectors, that.connectors) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectors, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectorsResponse {\n");
        sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
