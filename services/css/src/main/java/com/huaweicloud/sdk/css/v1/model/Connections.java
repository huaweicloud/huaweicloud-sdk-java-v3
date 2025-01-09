package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接信息。
 */
public class Connections {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxSession")

    private String maxSession;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specificationName")

    private String specificationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcepIp")

    private String vpcepIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcepIpv6Address")

    private String vpcepIpv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcepDnsName")

    private String vpcepDnsName;

    public Connections withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 终端节点ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Connections withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 终端节点状态。 - accepted：允许该终端节点连接。 - rejected：拒绝该终端节点连接。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Connections withMaxSession(String maxSession) {
        this.maxSession = maxSession;
        return this;
    }

    /**
     * 最大连接数。
     * @return maxSession
     */
    public String getMaxSession() {
        return maxSession;
    }

    public void setMaxSession(String maxSession) {
        this.maxSession = maxSession;
    }

    public Connections withSpecificationName(String specificationName) {
        this.specificationName = specificationName;
        return this;
    }

    /**
     * 终端节点名称。
     * @return specificationName
     */
    public String getSpecificationName() {
        return specificationName;
    }

    public void setSpecificationName(String specificationName) {
        this.specificationName = specificationName;
    }

    public Connections withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，格式为ISO8601：CCYY-MM-DDThh:mm:ss。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Connections withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 更新时间。默认为null。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public Connections withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 拥有者。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Connections withVpcepIp(String vpcepIp) {
        this.vpcepIp = vpcepIp;
        return this;
    }

    /**
     * 终端节点IPv4。
     * @return vpcepIp
     */
    public String getVpcepIp() {
        return vpcepIp;
    }

    public void setVpcepIp(String vpcepIp) {
        this.vpcepIp = vpcepIp;
    }

    public Connections withVpcepIpv6Address(String vpcepIpv6Address) {
        this.vpcepIpv6Address = vpcepIpv6Address;
        return this;
    }

    /**
     * 终端节点IPv6。
     * @return vpcepIpv6Address
     */
    public String getVpcepIpv6Address() {
        return vpcepIpv6Address;
    }

    public void setVpcepIpv6Address(String vpcepIpv6Address) {
        this.vpcepIpv6Address = vpcepIpv6Address;
    }

    public Connections withVpcepDnsName(String vpcepDnsName) {
        this.vpcepDnsName = vpcepDnsName;
        return this;
    }

    /**
     * 终端节点内网域名。
     * @return vpcepDnsName
     */
    public String getVpcepDnsName() {
        return vpcepDnsName;
    }

    public void setVpcepDnsName(String vpcepDnsName) {
        this.vpcepDnsName = vpcepDnsName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Connections that = (Connections) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.maxSession, that.maxSession)
            && Objects.equals(this.specificationName, that.specificationName)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updateAt, that.updateAt)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.vpcepIp, that.vpcepIp)
            && Objects.equals(this.vpcepIpv6Address, that.vpcepIpv6Address)
            && Objects.equals(this.vpcepDnsName, that.vpcepDnsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            maxSession,
            specificationName,
            createdAt,
            updateAt,
            domainId,
            vpcepIp,
            vpcepIpv6Address,
            vpcepDnsName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Connections {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    maxSession: ").append(toIndentedString(maxSession)).append("\n");
        sb.append("    specificationName: ").append(toIndentedString(specificationName)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    vpcepIp: ").append(toIndentedString(vpcepIp)).append("\n");
        sb.append("    vpcepIpv6Address: ").append(toIndentedString(vpcepIpv6Address)).append("\n");
        sb.append("    vpcepDnsName: ").append(toIndentedString(vpcepDnsName)).append("\n");
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
