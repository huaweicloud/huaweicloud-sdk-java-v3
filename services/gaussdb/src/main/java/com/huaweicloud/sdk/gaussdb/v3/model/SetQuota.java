package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetQuota
 */
public class SetQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_quota")

    private Integer instanceQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus_quota")

    private Integer vcpusQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram_quota")

    private Integer ramQuota;

    public SetQuota withEnterpriseProjectId(String enterpriseProjectId) {
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

    public SetQuota withInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
        return this;
    }

    /**
     * 实例个数配额。取值范围0~100000。(如果已经存在实例，应该大于已经存在的实例个数)
     * @return instanceQuota
     */
    public Integer getInstanceQuota() {
        return instanceQuota;
    }

    public void setInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
    }

    public SetQuota withVcpusQuota(Integer vcpusQuota) {
        this.vcpusQuota = vcpusQuota;
        return this;
    }

    /**
     * CPU核数配额。取值范围0~2147483646。(如果已经存在实例，应该大于已经占用的cpu个数)
     * @return vcpusQuota
     */
    public Integer getVcpusQuota() {
        return vcpusQuota;
    }

    public void setVcpusQuota(Integer vcpusQuota) {
        this.vcpusQuota = vcpusQuota;
    }

    public SetQuota withRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
        return this;
    }

    /**
     * 内存使用配额，单位为GB。取值范围0~2147483646。(如果已经存在实例，应该大于已经占用的内存数)
     * @return ramQuota
     */
    public Integer getRamQuota() {
        return ramQuota;
    }

    public void setRamQuota(Integer ramQuota) {
        this.ramQuota = ramQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetQuota that = (SetQuota) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.instanceQuota, that.instanceQuota)
            && Objects.equals(this.vcpusQuota, that.vcpusQuota) && Objects.equals(this.ramQuota, that.ramQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, instanceQuota, vcpusQuota, ramQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetQuota {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    instanceQuota: ").append(toIndentedString(instanceQuota)).append("\n");
        sb.append("    vcpusQuota: ").append(toIndentedString(vcpusQuota)).append("\n");
        sb.append("    ramQuota: ").append(toIndentedString(ramQuota)).append("\n");
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
