package com.huaweicloud.sdk.cgs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListContainerNodesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    @JacksonXmlProperty(localName = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    @JacksonXmlProperty(localName = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    public ListContainerNodesRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 节点（服务器）名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListContainerNodesRequest withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent状态，包含如下3种。   - not_installed ：未安装   - online ：在线   - offline ：离线
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ListContainerNodesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回查询容器节点列表当前页面的数，量默认10
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListContainerNodesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询游标，初始传入0
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListContainerNodesRequest listContainerNodesRequest = (ListContainerNodesRequest) o;
        return Objects.equals(this.hostName, listContainerNodesRequest.hostName)
            && Objects.equals(this.agentStatus, listContainerNodesRequest.agentStatus)
            && Objects.equals(this.limit, listContainerNodesRequest.limit)
            && Objects.equals(this.offset, listContainerNodesRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, agentStatus, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListContainerNodesRequest {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
