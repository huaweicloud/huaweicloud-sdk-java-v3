package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAssetModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_models")

    private List<AssetModelResponse> assetModels = null;

    public ListAssetModelsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListAssetModelsResponse withAssetModels(List<AssetModelResponse> assetModels) {
        this.assetModels = assetModels;
        return this;
    }

    public ListAssetModelsResponse addAssetModelsItem(AssetModelResponse assetModelsItem) {
        if (this.assetModels == null) {
            this.assetModels = new ArrayList<>();
        }
        this.assetModels.add(assetModelsItem);
        return this;
    }

    public ListAssetModelsResponse withAssetModels(Consumer<List<AssetModelResponse>> assetModelsSetter) {
        if (this.assetModels == null) {
            this.assetModels = new ArrayList<>();
        }
        assetModelsSetter.accept(this.assetModels);
        return this;
    }

    /**
     * 模型集，数量不超过limit
     * @return assetModels
     */
    public List<AssetModelResponse> getAssetModels() {
        return assetModels;
    }

    public void setAssetModels(List<AssetModelResponse> assetModels) {
        this.assetModels = assetModels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssetModelsResponse that = (ListAssetModelsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.assetModels, that.assetModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, assetModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetModelsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    assetModels: ").append(toIndentedString(assetModels)).append("\n");
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
