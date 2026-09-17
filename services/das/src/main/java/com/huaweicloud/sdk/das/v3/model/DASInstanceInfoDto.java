package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DAS实例信息
 */
public class DASInstanceInfoDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private Integer mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login_flag")

    private Boolean loginFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_flag")

    private Boolean slowSqlFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_flag")

    private Boolean deadLockFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_blocking_flag")

    private Boolean lockBlockingFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_flag")

    private Boolean chargeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_sql_flag")

    private Boolean fullSqlFlag;

    public DASInstanceInfoDto withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DASInstanceInfoDto withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public DASInstanceInfoDto withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 实例状态
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public DASInstanceInfoDto withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 实例版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DASInstanceInfoDto withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public DASInstanceInfoDto withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 客户端IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public DASInstanceInfoDto withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 客户端端口号
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public DASInstanceInfoDto withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 实例cpu核数
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public DASInstanceInfoDto withMem(Integer mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 实例内存大小
     * @return mem
     */
    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public DASInstanceInfoDto withLoginFlag(Boolean loginFlag) {
        this.loginFlag = loginFlag;
        return this;
    }

    /**
     * 实例登录是否启用
     * @return loginFlag
     */
    public Boolean getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(Boolean loginFlag) {
        this.loginFlag = loginFlag;
    }

    public DASInstanceInfoDto withSlowSqlFlag(Boolean slowSqlFlag) {
        this.slowSqlFlag = slowSqlFlag;
        return this;
    }

    /**
     * 慢sql是否启用
     * @return slowSqlFlag
     */
    public Boolean getSlowSqlFlag() {
        return slowSqlFlag;
    }

    public void setSlowSqlFlag(Boolean slowSqlFlag) {
        this.slowSqlFlag = slowSqlFlag;
    }

    public DASInstanceInfoDto withDeadLockFlag(Boolean deadLockFlag) {
        this.deadLockFlag = deadLockFlag;
        return this;
    }

    /**
     * 死锁分析是否启用
     * @return deadLockFlag
     */
    public Boolean getDeadLockFlag() {
        return deadLockFlag;
    }

    public void setDeadLockFlag(Boolean deadLockFlag) {
        this.deadLockFlag = deadLockFlag;
    }

    public DASInstanceInfoDto withLockBlockingFlag(Boolean lockBlockingFlag) {
        this.lockBlockingFlag = lockBlockingFlag;
        return this;
    }

    /**
     * 锁阻塞是否启用
     * @return lockBlockingFlag
     */
    public Boolean getLockBlockingFlag() {
        return lockBlockingFlag;
    }

    public void setLockBlockingFlag(Boolean lockBlockingFlag) {
        this.lockBlockingFlag = lockBlockingFlag;
    }

    public DASInstanceInfoDto withChargeFlag(Boolean chargeFlag) {
        this.chargeFlag = chargeFlag;
        return this;
    }

    /**
     * 当前实例是否计费
     * @return chargeFlag
     */
    public Boolean getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(Boolean chargeFlag) {
        this.chargeFlag = chargeFlag;
    }

    public DASInstanceInfoDto withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 实例类型
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public DASInstanceInfoDto withFullSqlFlag(Boolean fullSqlFlag) {
        this.fullSqlFlag = fullSqlFlag;
        return this;
    }

    /**
     * 全量sql是否启用
     * @return fullSqlFlag
     */
    public Boolean getFullSqlFlag() {
        return fullSqlFlag;
    }

    public void setFullSqlFlag(Boolean fullSqlFlag) {
        this.fullSqlFlag = fullSqlFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DASInstanceInfoDto that = (DASInstanceInfoDto) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceStatus, that.instanceStatus) && Objects.equals(this.version, that.version)
            && Objects.equals(this.engineType, that.engineType) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.port, that.port) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.mem, that.mem) && Objects.equals(this.loginFlag, that.loginFlag)
            && Objects.equals(this.slowSqlFlag, that.slowSqlFlag)
            && Objects.equals(this.deadLockFlag, that.deadLockFlag)
            && Objects.equals(this.lockBlockingFlag, that.lockBlockingFlag)
            && Objects.equals(this.chargeFlag, that.chargeFlag) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.fullSqlFlag, that.fullSqlFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            instanceName,
            instanceStatus,
            version,
            engineType,
            ip,
            port,
            cpu,
            mem,
            loginFlag,
            slowSqlFlag,
            deadLockFlag,
            lockBlockingFlag,
            chargeFlag,
            instanceType,
            fullSqlFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DASInstanceInfoDto {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    loginFlag: ").append(toIndentedString(loginFlag)).append("\n");
        sb.append("    slowSqlFlag: ").append(toIndentedString(slowSqlFlag)).append("\n");
        sb.append("    deadLockFlag: ").append(toIndentedString(deadLockFlag)).append("\n");
        sb.append("    lockBlockingFlag: ").append(toIndentedString(lockBlockingFlag)).append("\n");
        sb.append("    chargeFlag: ").append(toIndentedString(chargeFlag)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    fullSqlFlag: ").append(toIndentedString(fullSqlFlag)).append("\n");
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
