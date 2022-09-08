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
     * 扩展类型。当前有效值为bandwidth，即创建增强型的文件系统。
     * @return expandType
     */
    public String getExpandType() {
        return expandType;
    }

    public void setExpandType(String expandType) {
        this.expandType = expandType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) o;
        return Objects.equals(this.cryptKeyId, metadata.cryptKeyId)
            && Objects.equals(this.dedicatedFlavor, metadata.dedicatedFlavor)
            && Objects.equals(this.dedicatedStorageId, metadata.dedicatedStorageId)
            && Objects.equals(this.expandType, metadata.expandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cryptKeyId, dedicatedFlavor, dedicatedStorageId, expandType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    cryptKeyId: ").append(toIndentedString(cryptKeyId)).append("\n");
        sb.append("    dedicatedFlavor: ").append(toIndentedString(dedicatedFlavor)).append("\n");
        sb.append("    dedicatedStorageId: ").append(toIndentedString(dedicatedStorageId)).append("\n");
        sb.append("    expandType: ").append(toIndentedString(expandType)).append("\n");
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
