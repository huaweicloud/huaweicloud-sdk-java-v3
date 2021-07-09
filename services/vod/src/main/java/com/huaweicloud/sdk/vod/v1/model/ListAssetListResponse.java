package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.AssetSummary;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAssetListResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assets")
    
    private List<AssetSummary> assets = null;
    
    public ListAssetListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 媒资总数  > 暂只能统计2万个媒资，若您需要查询具体的媒资总数，请提交工单申请。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListAssetListResponse withAssets(List<AssetSummary> assets) {
        this.assets = assets;
        return this;
    }

    
    public ListAssetListResponse addAssetsItem(AssetSummary assetsItem) {
        if(this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    public ListAssetListResponse withAssets(Consumer<List<AssetSummary>> assetsSetter) {
        if(this.assets == null) {
            this.assets = new ArrayList<>();
        }
        assetsSetter.accept(this.assets);
        return this;
    }

    /**
     * 媒资列表
     * @return assets
     */
    public List<AssetSummary> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetSummary> assets) {
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
        ListAssetListResponse listAssetListResponse = (ListAssetListResponse) o;
        return Objects.equals(this.total, listAssetListResponse.total) &&
            Objects.equals(this.assets, listAssetListResponse.assets);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, assets);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetListResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

