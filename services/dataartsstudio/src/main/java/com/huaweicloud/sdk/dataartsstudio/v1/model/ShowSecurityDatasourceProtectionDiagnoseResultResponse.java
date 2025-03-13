package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityDatasourceProtectionDiagnoseResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scanning")

    private Boolean scanning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_time")

    private Long checkTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kerberos")

    private SecurityCertification kerberos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_network_access")

    private PublicNetworkAccess publicNetworkAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group")

    private SecurityGroupResult securityGroup;

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 诊断任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withScanning(Boolean scanning) {
        this.scanning = scanning;
        return this;
    }

    /**
     * 是否正在扫描
     * @return scanning
     */
    public Boolean getScanning() {
        return scanning;
    }

    public void setScanning(Boolean scanning) {
        this.scanning = scanning;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withCheckTime(Long checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    /**
     * 最新检测时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return checkTime
     */
    public Long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withKerberos(SecurityCertification kerberos) {
        this.kerberos = kerberos;
        return this;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withKerberos(
        Consumer<SecurityCertification> kerberosSetter) {
        if (this.kerberos == null) {
            this.kerberos = new SecurityCertification();
            kerberosSetter.accept(this.kerberos);
        }

        return this;
    }

    /**
     * Get kerberos
     * @return kerberos
     */
    public SecurityCertification getKerberos() {
        return kerberos;
    }

    public void setKerberos(SecurityCertification kerberos) {
        this.kerberos = kerberos;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withPublicNetworkAccess(
        PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withPublicNetworkAccess(
        Consumer<PublicNetworkAccess> publicNetworkAccessSetter) {
        if (this.publicNetworkAccess == null) {
            this.publicNetworkAccess = new PublicNetworkAccess();
            publicNetworkAccessSetter.accept(this.publicNetworkAccess);
        }

        return this;
    }

    /**
     * Get publicNetworkAccess
     * @return publicNetworkAccess
     */
    public PublicNetworkAccess getPublicNetworkAccess() {
        return publicNetworkAccess;
    }

    public void setPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withSecurityGroup(SecurityGroupResult securityGroup) {
        this.securityGroup = securityGroup;
        return this;
    }

    public ShowSecurityDatasourceProtectionDiagnoseResultResponse withSecurityGroup(
        Consumer<SecurityGroupResult> securityGroupSetter) {
        if (this.securityGroup == null) {
            this.securityGroup = new SecurityGroupResult();
            securityGroupSetter.accept(this.securityGroup);
        }

        return this;
    }

    /**
     * Get securityGroup
     * @return securityGroup
     */
    public SecurityGroupResult getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroupResult securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityDatasourceProtectionDiagnoseResultResponse that =
            (ShowSecurityDatasourceProtectionDiagnoseResultResponse) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.scanning, that.scanning)
            && Objects.equals(this.checkTime, that.checkTime) && Objects.equals(this.kerberos, that.kerberos)
            && Objects.equals(this.publicNetworkAccess, that.publicNetworkAccess)
            && Objects.equals(this.securityGroup, that.securityGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, scanning, checkTime, kerberos, publicNetworkAccess, securityGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityDatasourceProtectionDiagnoseResultResponse {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    scanning: ").append(toIndentedString(scanning)).append("\n");
        sb.append("    checkTime: ").append(toIndentedString(checkTime)).append("\n");
        sb.append("    kerberos: ").append(toIndentedString(kerberos)).append("\n");
        sb.append("    publicNetworkAccess: ").append(toIndentedString(publicNetworkAccess)).append("\n");
        sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
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
