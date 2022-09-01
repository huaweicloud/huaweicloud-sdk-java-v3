package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UnpublishAssetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_info_array")

    @JacksonXmlProperty(localName = "asset_info_array")

    private List<AssetInfo> assetInfoArray = null;

    public UnpublishAssetsResponse withAssetInfoArray(List<AssetInfo> assetInfoArray) {
        this.assetInfoArray = assetInfoArray;
        return this;
    }

    public UnpublishAssetsResponse addAssetInfoArrayItem(AssetInfo assetInfoArrayItem) {
        if (this.assetInfoArray == null) {
            this.assetInfoArray = new ArrayList<>();
        }
        this.assetInfoArray.add(assetInfoArrayItem);
        return this;
    }

    public UnpublishAssetsResponse withAssetInfoArray(Consumer<List<AssetInfo>> assetInfoArraySetter) {
        if (this.assetInfoArray == null) {
            this.assetInfoArray = new ArrayList<>();
        }
        assetInfoArraySetter.accept(this.assetInfoArray);
        return this;
    }

    /**
     * Get assetInfoArray
     * @return assetInfoArray
     */
    public List<AssetInfo> getAssetInfoArray() {
        return assetInfoArray;
    }

    public void setAssetInfoArray(List<AssetInfo> assetInfoArray) {
        this.assetInfoArray = assetInfoArray;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnpublishAssetsResponse unpublishAssetsResponse = (UnpublishAssetsResponse) o;
        return Objects.equals(this.assetInfoArray, unpublishAssetsResponse.assetInfoArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetInfoArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnpublishAssetsResponse {\n");
        sb.append("    assetInfoArray: ").append(toIndentedString(assetInfoArray)).append("\n");
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
