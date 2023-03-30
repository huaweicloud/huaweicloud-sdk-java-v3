package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListAssetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<DigitalAssetInfo> assets = null;

    public ListAssetsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 资产总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAssetsResponse withAssets(List<DigitalAssetInfo> assets) {
        this.assets = assets;
        return this;
    }

    public ListAssetsResponse addAssetsItem(DigitalAssetInfo assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ListAssetsResponse withAssets(Consumer<List<DigitalAssetInfo>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 资产信息列表。
     * @return assets
     */
    public List<DigitalAssetInfo> getAssets() {
        return assets;
    }

    public void setAssets(List<DigitalAssetInfo> assets) {
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
        ListAssetsResponse listAssetsResponse = (ListAssetsResponse) o;
        return Objects.equals(this.count, listAssetsResponse.count)
            && Objects.equals(this.assets, listAssetsResponse.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetsResponse {\n");
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
