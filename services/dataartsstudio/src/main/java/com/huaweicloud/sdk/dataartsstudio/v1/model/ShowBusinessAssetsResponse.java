package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowBusinessAssetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<OpenEntity> assets = null;

    public ShowBusinessAssetsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 业务资产总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowBusinessAssetsResponse withAssets(List<OpenEntity> assets) {
        this.assets = assets;
        return this;
    }

    public ShowBusinessAssetsResponse addAssetsItem(OpenEntity assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ShowBusinessAssetsResponse withAssets(Consumer<List<OpenEntity>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 业务资产列表
     * @return assets
     */
    public List<OpenEntity> getAssets() {
        return assets;
    }

    public void setAssets(List<OpenEntity> assets) {
        this.assets = assets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBusinessAssetsResponse that = (ShowBusinessAssetsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.assets, that.assets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, assets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBusinessAssetsResponse {\n");
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
