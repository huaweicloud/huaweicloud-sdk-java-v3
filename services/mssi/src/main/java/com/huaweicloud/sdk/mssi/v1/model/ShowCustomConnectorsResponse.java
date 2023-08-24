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
public class ShowCustomConnectorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connector_infos")

    private List<ConnectorInfo0> connectorInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ShowCustomConnectorsResponse withConnectorInfos(List<ConnectorInfo0> connectorInfos) {
        this.connectorInfos = connectorInfos;
        return this;
    }

    public ShowCustomConnectorsResponse addConnectorInfosItem(ConnectorInfo0 connectorInfosItem) {
        if (this.connectorInfos == null) {
            this.connectorInfos = new ArrayList<>();
        }
        this.connectorInfos.add(connectorInfosItem);
        return this;
    }

    public ShowCustomConnectorsResponse withConnectorInfos(Consumer<List<ConnectorInfo0>> connectorInfosSetter) {
        if (this.connectorInfos == null) {
            this.connectorInfos = new ArrayList<>();
        }
        connectorInfosSetter.accept(this.connectorInfos);
        return this;
    }

    /**
     * 连接器列表
     * @return connectorInfos
     */
    public List<ConnectorInfo0> getConnectorInfos() {
        return connectorInfos;
    }

    public void setConnectorInfos(List<ConnectorInfo0> connectorInfos) {
        this.connectorInfos = connectorInfos;
    }

    public ShowCustomConnectorsResponse withCount(Long count) {
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
        ShowCustomConnectorsResponse that = (ShowCustomConnectorsResponse) obj;
        return Objects.equals(this.connectorInfos, that.connectorInfos) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorInfos, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomConnectorsResponse {\n");
        sb.append("    connectorInfos: ").append(toIndentedString(connectorInfos)).append("\n");
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
