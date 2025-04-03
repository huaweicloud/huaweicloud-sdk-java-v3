package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 绑定的资产信息。形象和声音训练完成后，资源会绑定到资产上。
 */
public class BoundAssetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_id")

    private String assetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    public BoundAssetInfo withAssetId(String assetId) {
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

    public BoundAssetInfo withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称。从资产库查询的资产名称
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BoundAssetInfo that = (BoundAssetInfo) obj;
        return Objects.equals(this.assetId, that.assetId) && Objects.equals(this.assetName, that.assetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId, assetName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoundAssetInfo {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
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
