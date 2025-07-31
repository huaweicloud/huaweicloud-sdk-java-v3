package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetTtscGroupAssetsRequestBody
 */
public class SetTtscGroupAssetsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_ids")

    private List<String> assetIds = null;

    public SetTtscGroupAssetsRequestBody withAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
        return this;
    }

    public SetTtscGroupAssetsRequestBody addAssetIdsItem(String assetIdsItem) {
        if (this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        this.assetIds.add(assetIdsItem);
        return this;
    }

    public SetTtscGroupAssetsRequestBody withAssetIds(Consumer<List<String>> assetIdsSetter) {
        if (this.assetIds == null) {
            this.assetIds = new ArrayList<>();
        }
        assetIdsSetter.accept(this.assetIds);
        return this;
    }

    /**
     * 资产id
     * @return assetIds
     */
    public List<String> getAssetIds() {
        return assetIds;
    }

    public void setAssetIds(List<String> assetIds) {
        this.assetIds = assetIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetTtscGroupAssetsRequestBody that = (SetTtscGroupAssetsRequestBody) obj;
        return Objects.equals(this.assetIds, that.assetIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetTtscGroupAssetsRequestBody {\n");
        sb.append("    assetIds: ").append(toIndentedString(assetIds)).append("\n");
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
