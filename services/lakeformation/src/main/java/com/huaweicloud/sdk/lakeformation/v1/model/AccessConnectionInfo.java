package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 接入连接信息
 */
public class AccessConnectionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcep_id")

    private String vpcepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public AccessConnectionInfo withVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
        return this;
    }

    /**
     * 虚拟私有云终端节点ID。在 接入管理-创建客户端-前往VPC创建-VPC终端节点 创建和查看。
     * @return vpcepId
     */
    public String getVpcepId() {
        return vpcepId;
    }

    public void setVpcepId(String vpcepId) {
        this.vpcepId = vpcepId;
    }

    public AccessConnectionInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 接入IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public AccessConnectionInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 拥有者
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AccessConnectionInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 接入域名，通过IP接入访问Lakeformation API时，需在请求头中添加HOST参数并传入该域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConnectionInfo that = (AccessConnectionInfo) obj;
        return Objects.equals(this.vpcepId, that.vpcepId) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcepId, ip, owner, domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConnectionInfo {\n");
        sb.append("    vpcepId: ").append(toIndentedString(vpcepId)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
