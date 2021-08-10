package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 附件信息 */
public class ScalingPolicyV2MetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_bandwidth_share_type")

    private String metadataBandwidthShareType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_eip_id")

    private String metadataEipId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata_eip_address")

    private String metadataEipAddress;

    public ScalingPolicyV2MetaData withMetadataBandwidthShareType(String metadataBandwidthShareType) {
        this.metadataBandwidthShareType = metadataBandwidthShareType;
        return this;
    }

    /** 伸缩带宽策略中带宽对应的共享类型
     * 
     * @return metadataBandwidthShareType */
    public String getMetadataBandwidthShareType() {
        return metadataBandwidthShareType;
    }

    public void setMetadataBandwidthShareType(String metadataBandwidthShareType) {
        this.metadataBandwidthShareType = metadataBandwidthShareType;
    }

    public ScalingPolicyV2MetaData withMetadataEipId(String metadataEipId) {
        this.metadataEipId = metadataEipId;
        return this;
    }

    /** 伸缩带宽策略中带宽对应的EIP的ID
     * 
     * @return metadataEipId */
    public String getMetadataEipId() {
        return metadataEipId;
    }

    public void setMetadataEipId(String metadataEipId) {
        this.metadataEipId = metadataEipId;
    }

    public ScalingPolicyV2MetaData withMetadataEipAddress(String metadataEipAddress) {
        this.metadataEipAddress = metadataEipAddress;
        return this;
    }

    /** 伸缩带宽策略中带宽对应的EIP地址
     * 
     * @return metadataEipAddress */
    public String getMetadataEipAddress() {
        return metadataEipAddress;
    }

    public void setMetadataEipAddress(String metadataEipAddress) {
        this.metadataEipAddress = metadataEipAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScalingPolicyV2MetaData scalingPolicyV2MetaData = (ScalingPolicyV2MetaData) o;
        return Objects.equals(this.metadataBandwidthShareType, scalingPolicyV2MetaData.metadataBandwidthShareType)
            && Objects.equals(this.metadataEipId, scalingPolicyV2MetaData.metadataEipId)
            && Objects.equals(this.metadataEipAddress, scalingPolicyV2MetaData.metadataEipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadataBandwidthShareType, metadataEipId, metadataEipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScalingPolicyV2MetaData {\n");
        sb.append("    metadataBandwidthShareType: ").append(toIndentedString(metadataBandwidthShareType)).append("\n");
        sb.append("    metadataEipId: ").append(toIndentedString(metadataEipId)).append("\n");
        sb.append("    metadataEipAddress: ").append(toIndentedString(metadataEipAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
