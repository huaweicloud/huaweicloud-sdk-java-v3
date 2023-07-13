package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户自定义键值对
 */
public class EipMetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_bandwidth_share_type")

    private String metadataBandwidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_eip_id")

    private String metadataEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadataeip_address")

    private String metadataeipAddress;

    public EipMetaData withMetadataBandwidthShareType(String metadataBandwidthShareType) {
        this.metadataBandwidthShareType = metadataBandwidthShareType;
        return this;
    }

    /**
     * 伸缩带宽策略中带宽对应的共享类型。
     * @return metadataBandwidthShareType
     */
    public String getMetadataBandwidthShareType() {
        return metadataBandwidthShareType;
    }

    public void setMetadataBandwidthShareType(String metadataBandwidthShareType) {
        this.metadataBandwidthShareType = metadataBandwidthShareType;
    }

    public EipMetaData withMetadataEipId(String metadataEipId) {
        this.metadataEipId = metadataEipId;
        return this;
    }

    /**
     * 伸缩带宽策略中带宽对应的EIP的ID。
     * @return metadataEipId
     */
    public String getMetadataEipId() {
        return metadataEipId;
    }

    public void setMetadataEipId(String metadataEipId) {
        this.metadataEipId = metadataEipId;
    }

    public EipMetaData withMetadataeipAddress(String metadataeipAddress) {
        this.metadataeipAddress = metadataeipAddress;
        return this;
    }

    /**
     * 伸缩带宽策略中带宽对应的EIP地址。
     * @return metadataeipAddress
     */
    public String getMetadataeipAddress() {
        return metadataeipAddress;
    }

    public void setMetadataeipAddress(String metadataeipAddress) {
        this.metadataeipAddress = metadataeipAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipMetaData that = (EipMetaData) obj;
        return Objects.equals(this.metadataBandwidthShareType, that.metadataBandwidthShareType)
            && Objects.equals(this.metadataEipId, that.metadataEipId)
            && Objects.equals(this.metadataeipAddress, that.metadataeipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataBandwidthShareType, metadataEipId, metadataeipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipMetaData {\n");
        sb.append("    metadataBandwidthShareType: ").append(toIndentedString(metadataBandwidthShareType)).append("\n");
        sb.append("    metadataEipId: ").append(toIndentedString(metadataEipId)).append("\n");
        sb.append("    metadataeipAddress: ").append(toIndentedString(metadataeipAddress)).append("\n");
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
