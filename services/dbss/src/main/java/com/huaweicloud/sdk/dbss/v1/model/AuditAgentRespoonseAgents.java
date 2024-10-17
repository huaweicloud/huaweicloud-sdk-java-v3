package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditAgentRespoonseAgents
 */
public class AuditAgentRespoonseAgents {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_os")

    private String agentOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ip")

    private String agentIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_threshold")

    private Integer memThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_threshold")

    private Integer cpuThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_nic")

    private String agentNic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datacap_status")

    private Integer datacapStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_url")

    private String agentUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "universal")

    private Boolean universal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha256")

    private String sha256;

    public AuditAgentRespoonseAgents withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AuditAgentRespoonseAgents withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * agent 类型
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public AuditAgentRespoonseAgents withAgentOs(String agentOs) {
        this.agentOs = agentOs;
        return this;
    }

    /**
     * agent OS
     * @return agentOs
     */
    public String getAgentOs() {
        return agentOs;
    }

    public void setAgentOs(String agentOs) {
        this.agentOs = agentOs;
    }

    public AuditAgentRespoonseAgents withAgentIp(String agentIp) {
        this.agentIp = agentIp;
        return this;
    }

    /**
     * agent安装节点IP
     * @return agentIp
     */
    public String getAgentIp() {
        return agentIp;
    }

    public void setAgentIp(String agentIp) {
        this.agentIp = agentIp;
    }

    public AuditAgentRespoonseAgents withMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
        return this;
    }

    /**
     * 内存阈值
     * @return memThreshold
     */
    public Integer getMemThreshold() {
        return memThreshold;
    }

    public void setMemThreshold(Integer memThreshold) {
        this.memThreshold = memThreshold;
    }

    public AuditAgentRespoonseAgents withCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
        return this;
    }

    /**
     * cpu阈值
     * @return cpuThreshold
     */
    public Integer getCpuThreshold() {
        return cpuThreshold;
    }

    public void setCpuThreshold(Integer cpuThreshold) {
        this.cpuThreshold = cpuThreshold;
    }

    public AuditAgentRespoonseAgents withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * agent状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AuditAgentRespoonseAgents withAgentNic(String agentNic) {
        this.agentNic = agentNic;
        return this;
    }

    /**
     * agent网卡
     * @return agentNic
     */
    public String getAgentNic() {
        return agentNic;
    }

    public void setAgentNic(String agentNic) {
        this.agentNic = agentNic;
    }

    public AuditAgentRespoonseAgents withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public AuditAgentRespoonseAgents withDatacapStatus(Integer datacapStatus) {
        this.datacapStatus = datacapStatus;
        return this;
    }

    /**
     * 数据流量抓取状态
     * @return datacapStatus
     */
    public Integer getDatacapStatus() {
        return datacapStatus;
    }

    public void setDatacapStatus(Integer datacapStatus) {
        this.datacapStatus = datacapStatus;
    }

    public AuditAgentRespoonseAgents withAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
        return this;
    }

    /**
     * agent安装地址
     * @return agentUrl
     */
    public String getAgentUrl() {
        return agentUrl;
    }

    public void setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
    }

    public AuditAgentRespoonseAgents withUniversal(Boolean universal) {
        this.universal = universal;
        return this;
    }

    /**
     * 是否CCE场景
     * @return universal
     */
    public Boolean getUniversal() {
        return universal;
    }

    public void setUniversal(Boolean universal) {
        this.universal = universal;
    }

    public AuditAgentRespoonseAgents withSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * sha256值
     * @return sha256
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditAgentRespoonseAgents that = (AuditAgentRespoonseAgents) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.agentType, that.agentType)
            && Objects.equals(this.agentOs, that.agentOs) && Objects.equals(this.agentIp, that.agentIp)
            && Objects.equals(this.memThreshold, that.memThreshold)
            && Objects.equals(this.cpuThreshold, that.cpuThreshold) && Objects.equals(this.status, that.status)
            && Objects.equals(this.agentNic, that.agentNic) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.datacapStatus, that.datacapStatus) && Objects.equals(this.agentUrl, that.agentUrl)
            && Objects.equals(this.universal, that.universal) && Objects.equals(this.sha256, that.sha256);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId,
            agentType,
            agentOs,
            agentIp,
            memThreshold,
            cpuThreshold,
            status,
            agentNic,
            dbName,
            datacapStatus,
            agentUrl,
            universal,
            sha256);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditAgentRespoonseAgents {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    agentOs: ").append(toIndentedString(agentOs)).append("\n");
        sb.append("    agentIp: ").append(toIndentedString(agentIp)).append("\n");
        sb.append("    memThreshold: ").append(toIndentedString(memThreshold)).append("\n");
        sb.append("    cpuThreshold: ").append(toIndentedString(cpuThreshold)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    agentNic: ").append(toIndentedString(agentNic)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    datacapStatus: ").append(toIndentedString(datacapStatus)).append("\n");
        sb.append("    agentUrl: ").append(toIndentedString(agentUrl)).append("\n");
        sb.append("    universal: ").append(toIndentedString(universal)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
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
