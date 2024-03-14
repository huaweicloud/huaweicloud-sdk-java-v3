package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产复制信息
 */
public class ReplicationAssetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_info")

    private String assetInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_info")

    private ReplicationEncInfo encryptionInfo;

    public ReplicationAssetInfo withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * 资产ID。
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public ReplicationAssetInfo withAssetInfo(String assetInfo) {
        this.assetInfo = assetInfo;
        return this;
    }

    /**
     * 加密后的资产信息。
     * @return assetInfo
     */
    public String getAssetInfo() {
        return assetInfo;
    }

    public void setAssetInfo(String assetInfo) {
        this.assetInfo = assetInfo;
    }

    public ReplicationAssetInfo withEncryptionInfo(ReplicationEncInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
        return this;
    }

    public ReplicationAssetInfo withEncryptionInfo(Consumer<ReplicationEncInfo> encryptionInfoSetter) {
        if (this.encryptionInfo == null) {
            this.encryptionInfo = new ReplicationEncInfo();
            encryptionInfoSetter.accept(this.encryptionInfo);
        }

        return this;
    }

    /**
     * Get encryptionInfo
     * @return encryptionInfo
     */
    public ReplicationEncInfo getEncryptionInfo() {
        return encryptionInfo;
    }

    public void setEncryptionInfo(ReplicationEncInfo encryptionInfo) {
        this.encryptionInfo = encryptionInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplicationAssetInfo that = (ReplicationAssetInfo) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetInfo, that.assetInfo)
            && Objects.equals(this.encryptionInfo, that.encryptionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetInfo, encryptionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplicationAssetInfo {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetInfo: ").append(toIndentedString(assetInfo)).append("\n");
        sb.append("    encryptionInfo: ").append(toIndentedString(encryptionInfo)).append("\n");
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
