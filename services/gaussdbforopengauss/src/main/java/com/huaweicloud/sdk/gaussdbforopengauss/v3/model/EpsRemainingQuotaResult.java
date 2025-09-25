package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EpsRemainingQuotaResult
 */
public class EpsRemainingQuotaResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_tag")

    private String epsTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_eps_quota")

    private Integer instanceEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_eps_quota")

    private Integer cpuEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_eps_quota")

    private Integer memEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_eps_quota")

    private Integer volumeEpsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_eps_remaining_quota")

    private Integer instanceEpsRemainingQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_eps_remaining_quota")

    private Integer cpuEpsRemainingQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_eps_remaining_quota")

    private Integer memEpsRemainingQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_eps_remaining_quota")

    private Integer volumeEpsRemainingQuota;

    public EpsRemainingQuotaResult withEpsTag(String epsTag) {
        this.epsTag = epsTag;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID。 **取值范围**: 不涉及。
     * @return epsTag
     */
    public String getEpsTag() {
        return epsTag;
    }

    public void setEpsTag(String epsTag) {
        this.epsTag = epsTag;
    }

    public EpsRemainingQuotaResult withInstanceEpsQuota(Integer instanceEpsQuota) {
        this.instanceEpsQuota = instanceEpsQuota;
        return this;
    }

    /**
     * **参数解释**: 实例配额。 **取值范围**: 不涉及。
     * @return instanceEpsQuota
     */
    public Integer getInstanceEpsQuota() {
        return instanceEpsQuota;
    }

    public void setInstanceEpsQuota(Integer instanceEpsQuota) {
        this.instanceEpsQuota = instanceEpsQuota;
    }

    public EpsRemainingQuotaResult withCpuEpsQuota(Integer cpuEpsQuota) {
        this.cpuEpsQuota = cpuEpsQuota;
        return this;
    }

    /**
     * **参数解释**: CPU配额。 **取值范围**: 不涉及。
     * @return cpuEpsQuota
     */
    public Integer getCpuEpsQuota() {
        return cpuEpsQuota;
    }

    public void setCpuEpsQuota(Integer cpuEpsQuota) {
        this.cpuEpsQuota = cpuEpsQuota;
    }

    public EpsRemainingQuotaResult withMemEpsQuota(Integer memEpsQuota) {
        this.memEpsQuota = memEpsQuota;
        return this;
    }

    /**
     * **参数解释**: 内存配额。 **取值范围**: 不涉及。
     * @return memEpsQuota
     */
    public Integer getMemEpsQuota() {
        return memEpsQuota;
    }

    public void setMemEpsQuota(Integer memEpsQuota) {
        this.memEpsQuota = memEpsQuota;
    }

    public EpsRemainingQuotaResult withVolumeEpsQuota(Integer volumeEpsQuota) {
        this.volumeEpsQuota = volumeEpsQuota;
        return this;
    }

    /**
     * **参数解释**: 存储空间配额。 **取值范围**: 不涉及。
     * @return volumeEpsQuota
     */
    public Integer getVolumeEpsQuota() {
        return volumeEpsQuota;
    }

    public void setVolumeEpsQuota(Integer volumeEpsQuota) {
        this.volumeEpsQuota = volumeEpsQuota;
    }

    public EpsRemainingQuotaResult withInstanceEpsRemainingQuota(Integer instanceEpsRemainingQuota) {
        this.instanceEpsRemainingQuota = instanceEpsRemainingQuota;
        return this;
    }

    /**
     * **参数解释**: 实例剩余配额。 **取值范围**: 不涉及。
     * @return instanceEpsRemainingQuota
     */
    public Integer getInstanceEpsRemainingQuota() {
        return instanceEpsRemainingQuota;
    }

    public void setInstanceEpsRemainingQuota(Integer instanceEpsRemainingQuota) {
        this.instanceEpsRemainingQuota = instanceEpsRemainingQuota;
    }

    public EpsRemainingQuotaResult withCpuEpsRemainingQuota(Integer cpuEpsRemainingQuota) {
        this.cpuEpsRemainingQuota = cpuEpsRemainingQuota;
        return this;
    }

    /**
     * **参数解释**: CPU剩余配额。 **取值范围**: 不涉及。
     * @return cpuEpsRemainingQuota
     */
    public Integer getCpuEpsRemainingQuota() {
        return cpuEpsRemainingQuota;
    }

    public void setCpuEpsRemainingQuota(Integer cpuEpsRemainingQuota) {
        this.cpuEpsRemainingQuota = cpuEpsRemainingQuota;
    }

    public EpsRemainingQuotaResult withMemEpsRemainingQuota(Integer memEpsRemainingQuota) {
        this.memEpsRemainingQuota = memEpsRemainingQuota;
        return this;
    }

    /**
     * **参数解释**: 内存剩余配额。 **取值范围**: 不涉及。
     * @return memEpsRemainingQuota
     */
    public Integer getMemEpsRemainingQuota() {
        return memEpsRemainingQuota;
    }

    public void setMemEpsRemainingQuota(Integer memEpsRemainingQuota) {
        this.memEpsRemainingQuota = memEpsRemainingQuota;
    }

    public EpsRemainingQuotaResult withVolumeEpsRemainingQuota(Integer volumeEpsRemainingQuota) {
        this.volumeEpsRemainingQuota = volumeEpsRemainingQuota;
        return this;
    }

    /**
     * **参数解释**: 存储空间剩余配额。 **取值范围**: 不涉及。
     * @return volumeEpsRemainingQuota
     */
    public Integer getVolumeEpsRemainingQuota() {
        return volumeEpsRemainingQuota;
    }

    public void setVolumeEpsRemainingQuota(Integer volumeEpsRemainingQuota) {
        this.volumeEpsRemainingQuota = volumeEpsRemainingQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EpsRemainingQuotaResult that = (EpsRemainingQuotaResult) obj;
        return Objects.equals(this.epsTag, that.epsTag) && Objects.equals(this.instanceEpsQuota, that.instanceEpsQuota)
            && Objects.equals(this.cpuEpsQuota, that.cpuEpsQuota) && Objects.equals(this.memEpsQuota, that.memEpsQuota)
            && Objects.equals(this.volumeEpsQuota, that.volumeEpsQuota)
            && Objects.equals(this.instanceEpsRemainingQuota, that.instanceEpsRemainingQuota)
            && Objects.equals(this.cpuEpsRemainingQuota, that.cpuEpsRemainingQuota)
            && Objects.equals(this.memEpsRemainingQuota, that.memEpsRemainingQuota)
            && Objects.equals(this.volumeEpsRemainingQuota, that.volumeEpsRemainingQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epsTag,
            instanceEpsQuota,
            cpuEpsQuota,
            memEpsQuota,
            volumeEpsQuota,
            instanceEpsRemainingQuota,
            cpuEpsRemainingQuota,
            memEpsRemainingQuota,
            volumeEpsRemainingQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EpsRemainingQuotaResult {\n");
        sb.append("    epsTag: ").append(toIndentedString(epsTag)).append("\n");
        sb.append("    instanceEpsQuota: ").append(toIndentedString(instanceEpsQuota)).append("\n");
        sb.append("    cpuEpsQuota: ").append(toIndentedString(cpuEpsQuota)).append("\n");
        sb.append("    memEpsQuota: ").append(toIndentedString(memEpsQuota)).append("\n");
        sb.append("    volumeEpsQuota: ").append(toIndentedString(volumeEpsQuota)).append("\n");
        sb.append("    instanceEpsRemainingQuota: ").append(toIndentedString(instanceEpsRemainingQuota)).append("\n");
        sb.append("    cpuEpsRemainingQuota: ").append(toIndentedString(cpuEpsRemainingQuota)).append("\n");
        sb.append("    memEpsRemainingQuota: ").append(toIndentedString(memEpsRemainingQuota)).append("\n");
        sb.append("    volumeEpsRemainingQuota: ").append(toIndentedString(volumeEpsRemainingQuota)).append("\n");
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
