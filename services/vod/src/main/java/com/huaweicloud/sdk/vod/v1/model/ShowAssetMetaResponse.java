package com.huaweicloud.sdk.vod.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vod.v1.model.AssetInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowAssetMetaResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_info_array")
    
    private List<AssetInfo> assetInfoArray = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_truncated")
    
    private Integer isTruncated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ShowAssetMetaResponse withAssetInfoArray(List<AssetInfo> assetInfoArray) {
        this.assetInfoArray = assetInfoArray;
        return this;
    }

    
    public ShowAssetMetaResponse addAssetInfoArrayItem(AssetInfo assetInfoArrayItem) {
        if(this.assetInfoArray == null) {
            this.assetInfoArray = new ArrayList<>();
        }
        this.assetInfoArray.add(assetInfoArrayItem);
        return this;
    }

    public ShowAssetMetaResponse withAssetInfoArray(Consumer<List<AssetInfo>> assetInfoArraySetter) {
        if(this.assetInfoArray == null) {
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

    

    public ShowAssetMetaResponse withIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    


    /**
     * Get isTruncated
     * @return isTruncated
     */
    public Integer getIsTruncated() {
        return isTruncated;
    }

    public void setIsTruncated(Integer isTruncated) {
        this.isTruncated = isTruncated;
    }

    

    public ShowAssetMetaResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetMetaResponse showAssetMetaResponse = (ShowAssetMetaResponse) o;
        return Objects.equals(this.assetInfoArray, showAssetMetaResponse.assetInfoArray) &&
            Objects.equals(this.isTruncated, showAssetMetaResponse.isTruncated) &&
            Objects.equals(this.total, showAssetMetaResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetInfoArray, isTruncated, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetMetaResponse {\n");
        sb.append("    assetInfoArray: ").append(toIndentedString(assetInfoArray)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

