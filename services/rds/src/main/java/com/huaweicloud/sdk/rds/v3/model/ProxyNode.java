package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ProxyNode */
public class ProxyNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_flag")

    private Integer frozenFlag;

    public ProxyNode withId(String id) {
        this.id = id;
        return this;
    }

    /** Proxy节点ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProxyNode withName(String name) {
        this.name = name;
        return this;
    }

    /** Proxy节点名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProxyNode withRole(String role) {
        this.role = role;
        return this;
    }

    /** Proxy节点角色。 - master：主节点。 - slave：备节点。
     * 
     * @return role */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ProxyNode withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /** 可用区。
     * 
     * @return azCode */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public ProxyNode withStatus(String status) {
        this.status = status;
        return this;
    }

    /** Proxy节点状态。 - normal：正常。 - abnormal：异常。 - creating：创建中。 - deleted：已删除。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProxyNode withFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
        return this;
    }

    /** Proxy节点是否被冻结。 - 0：未冻结。 - 1：冻结。 - 2：冻结删除。
     * 
     * @return frozenFlag */
    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProxyNode proxyNode = (ProxyNode) o;
        return Objects.equals(this.id, proxyNode.id) && Objects.equals(this.name, proxyNode.name)
            && Objects.equals(this.role, proxyNode.role) && Objects.equals(this.azCode, proxyNode.azCode)
            && Objects.equals(this.status, proxyNode.status) && Objects.equals(this.frozenFlag, proxyNode.frozenFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, role, azCode, status, frozenFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyNode {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    frozenFlag: ").append(toIndentedString(frozenFlag)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
