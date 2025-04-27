package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EndpointResp
 */
public class EndpointResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private String direction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipaddress_count")

    private Integer ipaddressCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolver_rule_count")

    private Integer resolverRuleCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public EndpointResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点的ID，UUID形式的一个资源标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EndpointResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 终端节点的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EndpointResp withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 终端节点方向。 取值： inbound，表示入站终端节点。 outbound，表示出站终端节点。
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public EndpointResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源状态。 取值范围：PENDING_CREATE, ACTIVE, PENDING_DELETE, ERROR。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EndpointResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 终端节点所属的VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EndpointResp withIpaddressCount(Integer ipaddressCount) {
        this.ipaddressCount = ipaddressCount;
        return this;
    }

    /**
     * 该终端节点下的IP地址数量。
     * @return ipaddressCount
     */
    public Integer getIpaddressCount() {
        return ipaddressCount;
    }

    public void setIpaddressCount(Integer ipaddressCount) {
        this.ipaddressCount = ipaddressCount;
    }

    public EndpointResp withResolverRuleCount(Integer resolverRuleCount) {
        this.resolverRuleCount = resolverRuleCount;
        return this;
    }

    /**
     * 该终端节点下的转发规则数量。 仅创建出站终端节点时返回该参数。
     * @return resolverRuleCount
     */
    public Integer getResolverRuleCount() {
        return resolverRuleCount;
    }

    public void setResolverRuleCount(Integer resolverRuleCount) {
        this.resolverRuleCount = resolverRuleCount;
    }

    public EndpointResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public EndpointResp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。 格式：yyyy-MM-dd'T'HH:mm:ss.SSS。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointResp that = (EndpointResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.status, that.status)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.ipaddressCount, that.ipaddressCount)
            && Objects.equals(this.resolverRuleCount, that.resolverRuleCount)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, direction, status, vpcId, ipaddressCount, resolverRuleCount, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    ipaddressCount: ").append(toIndentedString(ipaddressCount)).append("\n");
        sb.append("    resolverRuleCount: ").append(toIndentedString(resolverRuleCount)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
