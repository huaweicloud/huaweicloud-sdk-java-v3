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
public class ListAssetSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_list")

    private List<DigitalAssetSummary> assetList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListAssetSummaryResponse withAssetList(List<DigitalAssetSummary> assetList) {
        this.assetList = assetList;
        return this;
    }

    public ListAssetSummaryResponse addAssetListItem(DigitalAssetSummary assetListItem) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        this.assetList.add(assetListItem);
        return this;
    }

    public ListAssetSummaryResponse withAssetList(Consumer<List<DigitalAssetSummary>> assetListSetter) {
        if (this.assetList == null) {
            this.assetList = new ArrayList<>();
        }
        assetListSetter.accept(this.assetList);
        return this;
    }

    /**
     * 资产列表。
     * @return assetList
     */
    public List<DigitalAssetSummary> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<DigitalAssetSummary> assetList) {
        this.assetList = assetList;
    }

    public ListAssetSummaryResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAssetSummaryResponse that = (ListAssetSummaryResponse) obj;
        return Objects.equals(this.assetList, that.assetList) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAssetSummaryResponse {\n");
        sb.append("    assetList: ").append(toIndentedString(assetList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
