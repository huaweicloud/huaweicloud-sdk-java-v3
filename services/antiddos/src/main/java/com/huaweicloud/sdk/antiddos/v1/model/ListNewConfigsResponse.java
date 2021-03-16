package com.huaweicloud.sdk.antiddos.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.antiddos.v1.model.CleanLimitDict;
import com.huaweicloud.sdk.antiddos.v1.model.ExtendDDoSSet;
import com.huaweicloud.sdk.antiddos.v1.model.TriggerBpsDict;
import com.huaweicloud.sdk.antiddos.v1.model.TriggerQpsDict;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNewConfigsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="traffic_limited_list")
    
    private List<TriggerBpsDict> trafficLimitedList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="http_limited_list")
    
    private List<TriggerQpsDict> httpLimitedList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connection_limited_list")
    
    private List<CleanLimitDict> connectionLimitedList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_ddos_config")
    
    private List<ExtendDDoSSet> extendDdosConfig = null;
    
    public ListNewConfigsResponse withTrafficLimitedList(List<TriggerBpsDict> trafficLimitedList) {
        this.trafficLimitedList = trafficLimitedList;
        return this;
    }

    
    public ListNewConfigsResponse addTrafficLimitedListItem(TriggerBpsDict trafficLimitedListItem) {
        this.trafficLimitedList.add(trafficLimitedListItem);
        return this;
    }

    public ListNewConfigsResponse withTrafficLimitedList(Consumer<List<TriggerBpsDict>> trafficLimitedListSetter) {
        if(this.trafficLimitedList == null ){
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
        this.httpLimitedList.add(httpLimitedListItem);
        return this;
    }

    public ListNewConfigsResponse withHttpLimitedList(Consumer<List<TriggerQpsDict>> httpLimitedListSetter) {
        if(this.httpLimitedList == null ){
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
        this.connectionLimitedList.add(connectionLimitedListItem);
        return this;
    }

    public ListNewConfigsResponse withConnectionLimitedList(Consumer<List<CleanLimitDict>> connectionLimitedListSetter) {
        if(this.connectionLimitedList == null ){
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
        this.extendDdosConfig.add(extendDdosConfigItem);
        return this;
    }

    public ListNewConfigsResponse withExtendDdosConfig(Consumer<List<ExtendDDoSSet>> extendDdosConfigSetter) {
        if(this.extendDdosConfig == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNewConfigsResponse listNewConfigsResponse = (ListNewConfigsResponse) o;
        return Objects.equals(this.trafficLimitedList, listNewConfigsResponse.trafficLimitedList) &&
            Objects.equals(this.httpLimitedList, listNewConfigsResponse.httpLimitedList) &&
            Objects.equals(this.connectionLimitedList, listNewConfigsResponse.connectionLimitedList) &&
            Objects.equals(this.extendDdosConfig, listNewConfigsResponse.extendDdosConfig);
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

