package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Quota
 */
public class Quota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_quota")

    private Integer instanceQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus_quota")

    private Integer vcpusQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram_quota")

    private Integer ramQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_instance_quota")

    private Integer availabilityInstanceQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_vcpus_quota")

    private Integer availabilityVcpusQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_ram_quota")

    private Integer availabilityRamQuota;

    public Quota withEnterpriseProjectId(String enterpriseProjectId) {
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

    public Quota withEnterpriseProjectName(String enterpriseProjectName) {
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

    public Quota withInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
        return this;
    }

    /**
     * 实例个数配额。
     * @return instanceQuota
     */
    public Integer getInstanceQuota() {
        return instanceQuota;
    }

    public void setInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
    }

    public Quota withVcpusQuota(Integer vcpusQuota) {
        this.vcpusQuota = vcpusQuota;
        return this;
    }

    /**
     * CPU核数配额。
     * @return vcpusQuota
     */
    public Integer getVcpusQuota() {
        return vcpusQuota;
    }

    public void setVcpusQuota(Integer vcpusQuota) {
        this.vcpusQuota = vcpusQuota;
    }

    public Quota withRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
        return this;
    }

    /**
     * 内存使用配额，单位为GB。
     * @return ramQuota
     */
    public Integer getRamQuota() {
        return ramQuota;
    }

    public void setRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
    }

    public Quota withAvailabilityInstanceQuota(Integer availabilityInstanceQuota) {
        this.availabilityInstanceQuota = availabilityInstanceQuota;
        return this;
    }

    /**
     * 实例剩余配额。
     * @return availabilityInstanceQuota
     */
    public Integer getAvailabilityInstanceQuota() {
        return availabilityInstanceQuota;
    }

    public void setAvailabilityInstanceQuota(Integer availabilityInstanceQuota) {
        this.availabilityInstanceQuota = availabilityInstanceQuota;
    }

    public Quota withAvailabilityVcpusQuota(Integer availabilityVcpusQuota) {
        this.availabilityVcpusQuota = availabilityVcpusQuota;
        return this;
    }

    /**
     * CPU核数剩余配额。
     * @return availabilityVcpusQuota
     */
    public Integer getAvailabilityVcpusQuota() {
        return availabilityVcpusQuota;
    }

    public void setAvailabilityVcpusQuota(Integer availabilityVcpusQuota) {
        this.availabilityVcpusQuota = availabilityVcpusQuota;
    }

    public Quota withAvailabilityRamQuota(Integer availabilityRamQuota) {
        this.availabilityRamQuota = availabilityRamQuota;
        return this;
    }

    /**
     * 内存剩余配额。
     * @return availabilityRamQuota
     */
    public Integer getAvailabilityRamQuota() {
        return availabilityRamQuota;
    }

    public void setAvailabilityRamQuota(Integer availabilityRamQuota) {
        this.availabilityRamQuota = availabilityRamQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quota that = (Quota) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.instanceQuota, that.instanceQuota)
            && Objects.equals(this.vcpusQuota, that.vcpusQuota) && Objects.equals(this.ramQuota, that.ramQuota)
            && Objects.equals(this.availabilityInstanceQuota, that.availabilityInstanceQuota)
            && Objects.equals(this.availabilityVcpusQuota, that.availabilityVcpusQuota)
            && Objects.equals(this.availabilityRamQuota, that.availabilityRamQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            enterpriseProjectName,
            instanceQuota,
            vcpusQuota,
            ramQuota,
            availabilityInstanceQuota,
            availabilityVcpusQuota,
            availabilityRamQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quota {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    instanceQuota: ").append(toIndentedString(instanceQuota)).append("\n");
        sb.append("    vcpusQuota: ").append(toIndentedString(vcpusQuota)).append("\n");
        sb.append("    ramQuota: ").append(toIndentedString(ramQuota)).append("\n");
        sb.append("    availabilityInstanceQuota: ").append(toIndentedString(availabilityInstanceQuota)).append("\n");
        sb.append("    availabilityVcpusQuota: ").append(toIndentedString(availabilityVcpusQuota)).append("\n");
        sb.append("    availabilityRamQuota: ").append(toIndentedString(availabilityRamQuota)).append("\n");
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
