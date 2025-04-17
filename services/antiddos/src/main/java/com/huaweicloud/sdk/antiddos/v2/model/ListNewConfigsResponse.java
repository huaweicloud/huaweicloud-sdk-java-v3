package com.huaweicloud.sdk.antiddos.v2.model;

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
public class ListNewConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_limited_list")

    private List<TriggerBpsDict> trafficLimitedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_limited_list")

    private List<TriggerQpsDict> httpLimitedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_limited_list")

    private List<CleanLimitDict> connectionLimitedList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_ddos_config")

    private List<ExtendDDoSSet> extendDdosConfig = null;

    public ListNewConfigsResponse withTrafficLimitedList(List<TriggerBpsDict> trafficLimitedList) {
        this.trafficLimitedList = trafficLimitedList;
        return this;
    }

    public ListNewConfigsResponse addTrafficLimitedListItem(TriggerBpsDict trafficLimitedListItem) {
        if (this.trafficLimitedList == null) {
            this.trafficLimitedList = new ArrayList<>();
        }
        this.trafficLimitedList.add(trafficLimitedListItem);
        return this;
    }

    public ListNewConfigsResponse withTrafficLimitedList(Consumer<List<TriggerBpsDict>> trafficLimitedListSetter) {
        if (this.trafficLimitedList == null) {
            this.trafficLimitedList = new ArrayList<>();
        }
        trafficLimitedListSetter.accept(this.trafficLimitedList);
        return this;
    }

    /**
     * 流量限制列表
     * @return trafficLimitedList
     */
    public List<TriggerBpsDict> getTrafficLimitedList() {
        return trafficLimitedList;
    }

    public void setTrafficLimitedList(List<TriggerBpsDict> trafficLimitedList) {
        this.trafficLimitedList = trafficLimitedList;
    }

    public ListNewConfigsResponse withHttpLimitedList(List<TriggerQpsDict> httpLimitedList) {
        this.httpLimitedList = httpLimitedList;
        return this;
    }

    public ListNewConfigsResponse addHttpLimitedListItem(TriggerQpsDict httpLimitedListItem) {
        if (this.httpLimitedList == null) {
            this.httpLimitedList = new ArrayList<>();
        }
        this.httpLimitedList.add(httpLimitedListItem);
        return this;
    }

    public ListNewConfigsResponse withHttpLimitedList(Consumer<List<TriggerQpsDict>> httpLimitedListSetter) {
        if (this.httpLimitedList == null) {
            this.httpLimitedList = new ArrayList<>();
        }
        httpLimitedListSetter.accept(this.httpLimitedList);
        return this;
    }

    /**
     * HTTP限制列表
     * @return httpLimitedList
     */
    public List<TriggerQpsDict> getHttpLimitedList() {
        return httpLimitedList;
    }

    public void setHttpLimitedList(List<TriggerQpsDict> httpLimitedList) {
        this.httpLimitedList = httpLimitedList;
    }

    public ListNewConfigsResponse withConnectionLimitedList(List<CleanLimitDict> connectionLimitedList) {
        this.connectionLimitedList = connectionLimitedList;
        return this;
    }

    public ListNewConfigsResponse addConnectionLimitedListItem(CleanLimitDict connectionLimitedListItem) {
        if (this.connectionLimitedList == null) {
            this.connectionLimitedList = new ArrayList<>();
        }
        this.connectionLimitedList.add(connectionLimitedListItem);
        return this;
    }

    public ListNewConfigsResponse withConnectionLimitedList(
        Consumer<List<CleanLimitDict>> connectionLimitedListSetter) {
        if (this.connectionLimitedList == null) {
            this.connectionLimitedList = new ArrayList<>();
        }
        connectionLimitedListSetter.accept(this.connectionLimitedList);
        return this;
    }

    /**
     * 连接数限制列表
     * @return connectionLimitedList
     */
    public List<CleanLimitDict> getConnectionLimitedList() {
        return connectionLimitedList;
    }

    public void setConnectionLimitedList(List<CleanLimitDict> connectionLimitedList) {
        this.connectionLimitedList = connectionLimitedList;
    }

    public ListNewConfigsResponse withExtendDdosConfig(List<ExtendDDoSSet> extendDdosConfig) {
        this.extendDdosConfig = extendDdosConfig;
        return this;
    }

    public ListNewConfigsResponse addExtendDdosConfigItem(ExtendDDoSSet extendDdosConfigItem) {
        if (this.extendDdosConfig == null) {
            this.extendDdosConfig = new ArrayList<>();
        }
        this.extendDdosConfig.add(extendDdosConfigItem);
        return this;
    }

    public ListNewConfigsResponse withExtendDdosConfig(Consumer<List<ExtendDDoSSet>> extendDdosConfigSetter) {
        if (this.extendDdosConfig == null) {
            this.extendDdosConfig = new ArrayList<>();
        }
        extendDdosConfigSetter.accept(this.extendDdosConfig);
        return this;
    }

    /**
     * 扩展配置列表
     * @return extendDdosConfig
     */
    public List<ExtendDDoSSet> getExtendDdosConfig() {
        return extendDdosConfig;
    }

    public void setExtendDdosConfig(List<ExtendDDoSSet> extendDdosConfig) {
        this.extendDdosConfig = extendDdosConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNewConfigsResponse that = (ListNewConfigsResponse) obj;
        return Objects.equals(this.trafficLimitedList, that.trafficLimitedList)
            && Objects.equals(this.httpLimitedList, that.httpLimitedList)
            && Objects.equals(this.connectionLimitedList, that.connectionLimitedList)
            && Objects.equals(this.extendDdosConfig, that.extendDdosConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficLimitedList, httpLimitedList, connectionLimitedList, extendDdosConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNewConfigsResponse {\n");
        sb.append("    trafficLimitedList: ").append(toIndentedString(trafficLimitedList)).append("\n");
        sb.append("    httpLimitedList: ").append(toIndentedString(httpLimitedList)).append("\n");
        sb.append("    connectionLimitedList: ").append(toIndentedString(connectionLimitedList)).append("\n");
        sb.append("    extendDdosConfig: ").append(toIndentedString(extendDdosConfig)).append("\n");
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
