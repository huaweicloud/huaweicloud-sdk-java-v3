package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListQuotaResult
 */
public class ListQuotaResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_eps_quota")

    private Integer instanceEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus_eps_quota")

    private Integer vcpusEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram_eps_quota")

    private Integer ramEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_eps_quota")

    private Integer volumeEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_used")

    private Integer instanceUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus_used")

    private Integer vcpusUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram_used")

    private Integer ramUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_used")

    private Integer volumeUsed;

    public ListQuotaResult withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListQuotaResult withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ListQuotaResult withInstanceEpsQuota(Integer instanceEpsQuota) {
        this.instanceEpsQuota = instanceEpsQuota;
        return this;
    }

    /**
     * EPS实例资源配额数量，值为-1时表示配额无限制。
     * @return instanceEpsQuota
     */
    public Integer getInstanceEpsQuota() {
        return instanceEpsQuota;
    }

    public void setInstanceEpsQuota(Integer instanceEpsQuota) {
        this.instanceEpsQuota = instanceEpsQuota;
    }

    public ListQuotaResult withVcpusEpsQuota(Integer vcpusEpsQuota) {
        this.vcpusEpsQuota = vcpusEpsQuota;
        return this;
    }

    /**
     * EPS计算资源配额数量，值为-1时表示配额无限制。
     * @return vcpusEpsQuota
     */
    public Integer getVcpusEpsQuota() {
        return vcpusEpsQuota;
    }

    public void setVcpusEpsQuota(Integer vcpusEpsQuota) {
        this.vcpusEpsQuota = vcpusEpsQuota;
    }

    public ListQuotaResult withRamEpsQuota(Integer ramEpsQuota) {
        this.ramEpsQuota = ramEpsQuota;
        return this;
    }

    /**
     * EPS内存资源配额量，单位为GB，值为-1时表示配额无限制。
     * @return ramEpsQuota
     */
    public Integer getRamEpsQuota() {
        return ramEpsQuota;
    }

    public void setRamEpsQuota(Integer ramEpsQuota) {
        this.ramEpsQuota = ramEpsQuota;
    }

    public ListQuotaResult withVolumeEpsQuota(Integer volumeEpsQuota) {
        this.volumeEpsQuota = volumeEpsQuota;
        return this;
    }

    /**
     * EPS磁盘资源配额量，单位为GB，值为-1时表示配额无限制。
     * @return volumeEpsQuota
     */
    public Integer getVolumeEpsQuota() {
        return volumeEpsQuota;
    }

    public void setVolumeEpsQuota(Integer volumeEpsQuota) {
        this.volumeEpsQuota = volumeEpsQuota;
    }

    public ListQuotaResult withInstanceUsed(Integer instanceUsed) {
        this.instanceUsed = instanceUsed;
        return this;
    }

    /**
     * EPS实例使用数量。
     * @return instanceUsed
     */
    public Integer getInstanceUsed() {
        return instanceUsed;
    }

    public void setInstanceUsed(Integer instanceUsed) {
        this.instanceUsed = instanceUsed;
    }

    public ListQuotaResult withVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
        return this;
    }

    /**
     * EPS计算资源使用数量。
     * @return vcpusUsed
     */
    public Integer getVcpusUsed() {
        return vcpusUsed;
    }

    public void setVcpusUsed(Integer vcpusUsed) {
        this.vcpusUsed = vcpusUsed;
    }

    public ListQuotaResult withRamUsed(Integer ramUsed) {
        this.ramUsed = ramUsed;
        return this;
    }

    /**
     * EPS内存使用配额量，单位为GB。
     * @return ramUsed
     */
    public Integer getRamUsed() {
        return ramUsed;
    }

    public void setRamUsed(Integer ramUsed) {
        this.ramUsed = ramUsed;
    }

    public ListQuotaResult withVolumeUsed(Integer volumeUsed) {
        this.volumeUsed = volumeUsed;
        return this;
    }

    /**
     * EPS磁盘使用配额量，单位为GB。
     * @return volumeUsed
     */
    public Integer getVolumeUsed() {
        return volumeUsed;
    }

    public void setVolumeUsed(Integer volumeUsed) {
        this.volumeUsed = volumeUsed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListQuotaResult that = (ListQuotaResult) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.instanceEpsQuota, that.instanceEpsQuota)
            && Objects.equals(this.vcpusEpsQuota, that.vcpusEpsQuota)
            && Objects.equals(this.ramEpsQuota, that.ramEpsQuota)
            && Objects.equals(this.volumeEpsQuota, that.volumeEpsQuota)
            && Objects.equals(this.instanceUsed, that.instanceUsed) && Objects.equals(this.vcpusUsed, that.vcpusUsed)
            && Objects.equals(this.ramUsed, that.ramUsed) && Objects.equals(this.volumeUsed, that.volumeUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            enterpriseProjectName,
            instanceEpsQuota,
            vcpusEpsQuota,
            ramEpsQuota,
            volumeEpsQuota,
            instanceUsed,
            vcpusUsed,
            ramUsed,
            volumeUsed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQuotaResult {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    instanceEpsQuota: ").append(toIndentedString(instanceEpsQuota)).append("\n");
        sb.append("    vcpusEpsQuota: ").append(toIndentedString(vcpusEpsQuota)).append("\n");
        sb.append("    ramEpsQuota: ").append(toIndentedString(ramEpsQuota)).append("\n");
        sb.append("    volumeEpsQuota: ").append(toIndentedString(volumeEpsQuota)).append("\n");
        sb.append("    instanceUsed: ").append(toIndentedString(instanceUsed)).append("\n");
        sb.append("    vcpusUsed: ").append(toIndentedString(vcpusUsed)).append("\n");
        sb.append("    ramUsed: ").append(toIndentedString(ramUsed)).append("\n");
        sb.append("    volumeUsed: ").append(toIndentedString(volumeUsed)).append("\n");
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
