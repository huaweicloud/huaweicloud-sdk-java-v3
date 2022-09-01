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
public class ShowAssetMetaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_info_array")

    @JacksonXmlProperty(localName = "asset_info_array")

    private List<AssetInfo> assetInfoArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_truncated")

    @JacksonXmlProperty(localName = "is_truncated")

    private Integer isTruncated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public ShowAssetMetaResponse withAssetInfoArray(List<AssetInfo> assetInfoArray) {
        this.assetInfoArray = assetInfoArray;
        return this;
    }

    public ShowAssetMetaResponse addAssetInfoArrayItem(AssetInfo assetInfoArrayItem) {
        if (this.assetInfoArray == null) {
            this.assetInfoArray = new ArrayList<>();
        }
        this.assetInfoArray.add(assetInfoArrayItem);
        return this;
    }

    public ShowAssetMetaResponse withAssetInfoArray(Consumer<List<AssetInfo>> assetInfoArraySetter) {
        if (this.assetInfoArray == null) {
            this.assetInfoArray = new ArrayList<>();
        }
        assetInfoArraySetter.accept(this.assetInfoArray);
        return this;
    }

    /**
     * 媒资信息列表。
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
     * 列表是否被截断。  取值如下： - 1：表示本次查询未返回全部结果。 - 0：表示本次查询已经返回了全部结果。
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
     * 查询媒资总数。  > 暂只能统计2万个媒资，若您需要查询具体的媒资总数，请[提交工单](https://console.huaweicloud.com/ticket/?#/ticketindex/business?productTypeId=462902cc39a04ab3a429df872021f970)申请。
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
        return Objects.equals(this.assetInfoArray, showAssetMetaResponse.assetInfoArray)
            && Objects.equals(this.isTruncated, showAssetMetaResponse.isTruncated)
            && Objects.equals(this.total, showAssetMetaResponse.total);
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
