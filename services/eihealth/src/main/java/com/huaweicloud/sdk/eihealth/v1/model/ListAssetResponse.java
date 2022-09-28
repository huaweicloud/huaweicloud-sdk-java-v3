package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListAssetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<GetAssetRsp> assets = null;

    public ListAssetResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 资产总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAssetResponse withAssets(List<GetAssetRsp> assets) {
        this.assets = assets;
        return this;
    }

    public ListAssetResponse addAssetsItem(GetAssetRsp assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ListAssetResponse withAssets(Consumer<List<GetAssetRsp>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 资产列表
     * @return assets
     */
    public List<GetAssetRsp> getAssets() {
        return assets;
    }

    public void setAssets(List<GetAssetRsp> assets) {
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
        ListAssetResponse listAssetResponse = (ListAssetResponse) o;
        return Objects.equals(this.count, listAssetResponse.count)
            && Objects.equals(this.assets, listAssetResponse.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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
