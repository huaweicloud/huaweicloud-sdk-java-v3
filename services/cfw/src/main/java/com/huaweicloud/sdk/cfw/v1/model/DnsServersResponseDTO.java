package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DnsServersResponseDTO
 */
public class DnsServersResponseDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_applied")

    private Integer isApplied;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_customized")

    private Integer isCustomized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check_domain_name")

    private String healthCheckDomainName;

    public DnsServersResponseDTO withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 域名服务器id **取值范围**： 不涉及
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DnsServersResponseDTO withIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
        return this;
    }

    /**
     * **参数解释**： 域名服务器是否应用 **取值范围**： - 0：否 - 1：是
     * @return isApplied
     */
    public Integer getIsApplied() {
        return isApplied;
    }

    public void setIsApplied(Integer isApplied) {
        this.isApplied = isApplied;
    }

    public DnsServersResponseDTO withIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
        return this;
    }

    /**
     * **参数解释**： 域名服务器是否是用户自定义的dns服务器 **取值范围**： - 0：否 - 1：是
     * @return isCustomized
     */
    public Integer getIsCustomized() {
        return isCustomized;
    }

    public void setIsCustomized(Integer isCustomized) {
        this.isCustomized = isCustomized;
    }

    public DnsServersResponseDTO withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * **参数解释**： DNS服务器IP **取值范围**： 不涉及
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public DnsServersResponseDTO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： dns服务器解析状态 **取值范围**： 0：解析域名的频率正常 1：解析域名的频率缓慢 2：解析域名异常 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DnsServersResponseDTO withHealthCheckDomainName(String healthCheckDomainName) {
        this.healthCheckDomainName = healthCheckDomainName;
        return this;
    }

    /**
     * **参数解释**： 健康检查域名 **取值范围**： 不涉及
     * @return healthCheckDomainName
     */
    public String getHealthCheckDomainName() {
        return healthCheckDomainName;
    }

    public void setHealthCheckDomainName(String healthCheckDomainName) {
        this.healthCheckDomainName = healthCheckDomainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DnsServersResponseDTO that = (DnsServersResponseDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.isApplied, that.isApplied)
            && Objects.equals(this.isCustomized, that.isCustomized) && Objects.equals(this.serverIp, that.serverIp)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.healthCheckDomainName, that.healthCheckDomainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isApplied, isCustomized, serverIp, status, healthCheckDomainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DnsServersResponseDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isApplied: ").append(toIndentedString(isApplied)).append("\n");
        sb.append("    isCustomized: ").append(toIndentedString(isCustomized)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    healthCheckDomainName: ").append(toIndentedString(healthCheckDomainName)).append("\n");
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
