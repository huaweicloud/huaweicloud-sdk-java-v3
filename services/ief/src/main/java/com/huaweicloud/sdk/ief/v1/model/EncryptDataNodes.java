package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EncryptDataNodes
 */
public class EncryptDataNodes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ips")

    private List<String> hostIps = null;

    public EncryptDataNodes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘节点ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EncryptDataNodes withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 边缘节点状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EncryptDataNodes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EncryptDataNodes withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 边缘节点主机名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public EncryptDataNodes withHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
        return this;
    }

    public EncryptDataNodes addHostIpsItem(String hostIpsItem) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        this.hostIps.add(hostIpsItem);
        return this;
    }

    public EncryptDataNodes withHostIps(Consumer<List<String>> hostIpsSetter) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        hostIpsSetter.accept(this.hostIps);
        return this;
    }

    /**
     * 边缘节点主机IP地址列表
     * @return hostIps
     */
    public List<String> getHostIps() {
        return hostIps;
    }

    public void setHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncryptDataNodes that = (EncryptDataNodes) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.state, that.state)
            && Objects.equals(this.name, that.name) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIps, that.hostIps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, name, hostName, hostIps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncryptDataNodes {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIps: ").append(toIndentedString(hostIps)).append("\n");
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
