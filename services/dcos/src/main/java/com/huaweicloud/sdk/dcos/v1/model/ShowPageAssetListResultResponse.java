package com.huaweicloud.sdk.dcos.v1.model;

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
public class ShowPageAssetListResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assets")

    private List<Asset> assets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagination")

    private Pagination pagination;

    public ShowPageAssetListResultResponse withAssets(List<Asset> assets) {
        this.assets = assets;
        return this;
    }

    public ShowPageAssetListResultResponse addAssetsItem(Asset assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ShowPageAssetListResultResponse withAssets(Consumer<List<Asset>> assetsSetter) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 资产详情
     * @return assets
     */
    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public ShowPageAssetListResultResponse withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    public ShowPageAssetListResultResponse withPagination(Consumer<Pagination> paginationSetter) {
        if (this.pagination == null) {
            this.pagination = new Pagination();
            paginationSetter.accept(this.pagination);
        }

        return this;
    }

    /**
     * Get pagination
     * @return pagination
     */
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPageAssetListResultResponse that = (ShowPageAssetListResultResponse) obj;
        return Objects.equals(this.assets, that.assets) && Objects.equals(this.pagination, that.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assets, pagination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPageAssetListResultResponse {\n");
        sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
