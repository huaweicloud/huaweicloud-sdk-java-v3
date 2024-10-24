package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgentImportParamNew
 */
public class AgentImportParamNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coc_cmdb_id")

    private String cocCmdbId;

    public AgentImportParamNew withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 机器登录密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AgentImportParamNew withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agent唯一值，重复导入时需要传递。
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AgentImportParamNew withInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }

    /**
     * 机器IP。
     * @return innerIp
     */
    public String getInnerIp() {
        return innerIp;
    }

    public void setInnerIp(String innerIp) {
        this.innerIp = innerIp;
    }

    public AgentImportParamNew withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 机器登录端口，默认22。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public AgentImportParamNew withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 机器ssh账号。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AgentImportParamNew withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 机器操作系统类型。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public AgentImportParamNew withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 机器所属VPC ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public AgentImportParamNew withCocCmdbId(String cocCmdbId) {
        this.cocCmdbId = cocCmdbId;
        return this;
    }

    /**
     * 外来唯一标识，COC用。
     * @return cocCmdbId
     */
    public String getCocCmdbId() {
        return cocCmdbId;
    }

    public void setCocCmdbId(String cocCmdbId) {
        this.cocCmdbId = cocCmdbId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentImportParamNew that = (AgentImportParamNew) obj;
        return Objects.equals(this.password, that.password) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.innerIp, that.innerIp) && Objects.equals(this.port, that.port)
            && Objects.equals(this.account, that.account) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.cocCmdbId, that.cocCmdbId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, agentId, innerIp, port, account, osType, vpcId, cocCmdbId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentImportParamNew {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    cocCmdbId: ").append(toIndentedString(cocCmdbId)).append("\n");
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
