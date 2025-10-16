package com.huaweicloud.sdk.cpcs.v1.model;

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
public class ShowStatusServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_list")

    private List<ShowStatusServiceResponseBodyServerList> serverList = null;

    public ShowStatusServiceResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowStatusServiceResponse withServerList(List<ShowStatusServiceResponseBodyServerList> serverList) {
        this.serverList = serverList;
        return this;
    }

    public ShowStatusServiceResponse addServerListItem(ShowStatusServiceResponseBodyServerList serverListItem) {
        if (this.serverList == null) {
            this.serverList = new ArrayList<>();
        }
        this.serverList.add(serverListItem);
        return this;
    }

    public ShowStatusServiceResponse withServerList(
        Consumer<List<ShowStatusServiceResponseBodyServerList>> serverListSetter) {
        if (this.serverList == null) {
            this.serverList = new ArrayList<>();
        }
        serverListSetter.accept(this.serverList);
        return this;
    }

    /**
     * 服务列表
     * @return serverList
     */
    public List<ShowStatusServiceResponseBodyServerList> getServerList() {
        return serverList;
    }

    public void setServerList(List<ShowStatusServiceResponseBodyServerList> serverList) {
        this.serverList = serverList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusServiceResponse that = (ShowStatusServiceResponse) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.serverList, that.serverList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, serverList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusServiceResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    serverList: ").append(toIndentedString(serverList)).append("\n");
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
