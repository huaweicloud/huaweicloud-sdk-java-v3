package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListAssetsNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<AssetResponse> assets = null;

    public ListAssetsNewResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /** 总数
     * 
     * @return count */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListAssetsNewResponse withAssets(List<AssetResponse> assets) {
        this.assets = assets;
        return this;
    }

    public ListAssetsNewResponse addAssetsItem(AssetResponse assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ListAssetsNewResponse withAssets(Consumer<List<AssetResponse>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /** 资产集，数量不超过limit
     * 
     * @return assets */
    public List<AssetResponse> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetResponse> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAssetsNewResponse listAssetsNewResponse = (ListAssetsNewResponse) o;
        return Objects.equals(this.count, listAssetsNewResponse.count)
            && Objects.equals(this.assets, listAssetsNewResponse.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetsNewResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
