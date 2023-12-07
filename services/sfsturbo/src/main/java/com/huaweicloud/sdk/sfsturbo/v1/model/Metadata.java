package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * metadata参数详情
 */
public class Metadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crypt_key_id")

    private String cryptKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_flavor")

    private String dedicatedFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dedicated_storage_id")

    private String dedicatedStorageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_type")

    private String expandType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hpc_bw")

    private String hpcBw;

    public Metadata withCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
        return this;
    }

    /**
     * 要创加密文件系统，该字段传KMS服务专业版密钥的ID。
     * @return cryptKeyId
     */
    public String getCryptKeyId() {
        return cryptKeyId;
    }

    public void setCryptKeyId(String cryptKeyId) {
        this.cryptKeyId = cryptKeyId;
    }

    public Metadata withDedicatedFlavor(String dedicatedFlavor) {
        this.dedicatedFlavor = dedicatedFlavor;
        return this;
    }

    /**
     * 创专属文件系统，要创建的虚拟机的规格。
     * @return dedicatedFlavor
     */
    public String getDedicatedFlavor() {
        return dedicatedFlavor;
    }

    public void setDedicatedFlavor(String dedicatedFlavor) {
        this.dedicatedFlavor = dedicatedFlavor;
    }

    public Metadata withDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
        return this;
    }

    /**
     * 创专属文件系统，要指定一个专属分布式存储的ID。
     * @return dedicatedStorageId
     */
    public String getDedicatedStorageId() {
        return dedicatedStorageId;
    }

    public void setDedicatedStorageId(String dedicatedStorageId) {
        this.dedicatedStorageId = dedicatedStorageId;
    }

    public Metadata withExpandType(String expandType) {
        this.expandType = expandType;
        return this;
    }

    /**
     * 扩展类型。创建增强型/HPC型/HPC缓存型文件系统时，该参数必填。 创建增强型的文件系统，包括标准型-增强版和性能型-增强版，需要填写\"bandwidth\"。 创建HPC型文件系统，需要填写\"hpc\"。 创建HPC缓存型，需要填写\"hpc_cache\"。 
     * @return expandType
     */
    public String getExpandType() {
        return expandType;
    }

    public void setExpandType(String expandType) {
        this.expandType = expandType;
    }

    public Metadata withHpcBw(String hpcBw) {
        this.hpcBw = hpcBw;
        return this;
    }

    /**
     * 文件系统的带宽规格。创建HPC型/HPC缓存型文件系统时，该参数必填。 HPC型，可以填写\"20M\"、\"40M\"、\"125M\"、\"250M\"、\"500M\"、\"1000M\"。 HPC缓存型，可以填写\"2G\"、\"4G\"、\"8G\"、\"16G\"、\"24G\"、\"32G\"、\"48G\"。 
     * @return hpcBw
     */
    public String getHpcBw() {
        return hpcBw;
    }

    public void setHpcBw(String hpcBw) {
        this.hpcBw = hpcBw;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata that = (Metadata) obj;
        return Objects.equals(this.cryptKeyId, that.cryptKeyId)
            && Objects.equals(this.dedicatedFlavor, that.dedicatedFlavor)
            && Objects.equals(this.dedicatedStorageId, that.dedicatedStorageId)
            && Objects.equals(this.expandType, that.expandType) && Objects.equals(this.hpcBw, that.hpcBw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cryptKeyId, dedicatedFlavor, dedicatedStorageId, expandType, hpcBw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    cryptKeyId: ").append(toIndentedString(cryptKeyId)).append("\n");
        sb.append("    dedicatedFlavor: ").append(toIndentedString(dedicatedFlavor)).append("\n");
        sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
        sb.append("    expandType: ").append(toIndentedString(expandType)).append("\n");
        sb.append("    hpcBw: ").append(toIndentedString(hpcBw)).append("\n");
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
