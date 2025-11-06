package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 备集群obs桶。 **取值范围**： 不涉及。
 */
public class CreateDrClusterDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_ip")

    private String gatewayIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ips")

    private String internalIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ips")

    private String privateIps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_admin_pwd")

    private String dbAdminPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_id")

    private String disasterRecoveryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

    public CreateDrClusterDto withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * **参数解释**： 集群名称。 **取值范围**： 不涉及。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateDrClusterDto withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * **参数解释**： 集群ID。 **取值范围**： 不涉及。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateDrClusterDto withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * **参数解释**： 子网的网段。 **取值范围**： 不涉及。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateDrClusterDto withGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * **参数解释**： 子网的网关。 **取值范围**： 不涉及。
     * @return gatewayIp
     */
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public CreateDrClusterDto withInternalIps(String internalIps) {
        this.internalIps = internalIps;
        return this;
    }

    /**
     * **参数解释**： 主网卡IP。 **取值范围**： 不涉及。
     * @return internalIps
     */
    public String getInternalIps() {
        return internalIps;
    }

    public void setInternalIps(String internalIps) {
        this.internalIps = internalIps;
    }

    public CreateDrClusterDto withPrivateIps(String privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    /**
     * **参数解释**： 内网IP。 **取值范围**： 不涉及。
     * @return privateIps
     */
    public String getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(String privateIps) {
        this.privateIps = privateIps;
    }

    public CreateDrClusterDto withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * **参数解释**： 域名。 **取值范围**： 不涉及。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CreateDrClusterDto withDbAdminPwd(String dbAdminPwd) {
        this.dbAdminPwd = dbAdminPwd;
        return this;
    }

    /**
     * **参数解释**： 数据库管理员密码。 **取值范围**： 不涉及。
     * @return dbAdminPwd
     */
    public String getDbAdminPwd() {
        return dbAdminPwd;
    }

    public void setDbAdminPwd(String dbAdminPwd) {
        this.dbAdminPwd = dbAdminPwd;
    }

    public CreateDrClusterDto withDisasterRecoveryId(String disasterRecoveryId) {
        this.disasterRecoveryId = disasterRecoveryId;
        return this;
    }

    /**
     * **参数解释**： 容灾ID。 **取值范围**： 不涉及。
     * @return disasterRecoveryId
     */
    public String getDisasterRecoveryId() {
        return disasterRecoveryId;
    }

    public void setDisasterRecoveryId(String disasterRecoveryId) {
        this.disasterRecoveryId = disasterRecoveryId;
    }

    public CreateDrClusterDto withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * **参数解释**： 内核的版本。 **取值范围**： 不涉及。
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDrClusterDto that = (CreateDrClusterDto) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.gatewayIp, that.gatewayIp)
            && Objects.equals(this.internalIps, that.internalIps) && Objects.equals(this.privateIps, that.privateIps)
            && Objects.equals(this.endpoint, that.endpoint) && Objects.equals(this.dbAdminPwd, that.dbAdminPwd)
            && Objects.equals(this.disasterRecoveryId, that.disasterRecoveryId)
            && Objects.equals(this.kernelVersion, that.kernelVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName,
            clusterId,
            cidr,
            gatewayIp,
            internalIps,
            privateIps,
            endpoint,
            dbAdminPwd,
            disasterRecoveryId,
            kernelVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDrClusterDto {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    internalIps: ").append(toIndentedString(internalIps)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    dbAdminPwd: ").append(toIndentedString(dbAdminPwd)).append("\n");
        sb.append("    disasterRecoveryId: ").append(toIndentedString(disasterRecoveryId)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
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
