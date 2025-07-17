package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取实例sku接口返回内容
 */
public class SkuSpecBaseResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandInfo")

    private SkuSpecBaseResponseBandInfo bandInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skuSpecResponseList")

    private List<SkuSpecBaseResponseSkuSpecResponseList> skuSpecResponseList = null;

    public SkuSpecBaseResponse withBandInfo(SkuSpecBaseResponseBandInfo bandInfo) {
        this.bandInfo = bandInfo;
        return this;
    }

    public SkuSpecBaseResponse withBandInfo(Consumer<SkuSpecBaseResponseBandInfo> bandInfoSetter) {
        if (this.bandInfo == null) {
            this.bandInfo = new SkuSpecBaseResponseBandInfo();
            bandInfoSetter.accept(this.bandInfo);
        }

        return this;
    }

    /**
     * Get bandInfo
     * @return bandInfo
     */
    public SkuSpecBaseResponseBandInfo getBandInfo() {
        return bandInfo;
    }

    public void setBandInfo(SkuSpecBaseResponseBandInfo bandInfo) {
        this.bandInfo = bandInfo;
    }

    public SkuSpecBaseResponse withSkuSpecResponseList(
        List<SkuSpecBaseResponseSkuSpecResponseList> skuSpecResponseList) {
        this.skuSpecResponseList = skuSpecResponseList;
        return this;
    }

    public SkuSpecBaseResponse addSkuSpecResponseListItem(
        SkuSpecBaseResponseSkuSpecResponseList skuSpecResponseListItem) {
        if (this.skuSpecResponseList == null) {
            this.skuSpecResponseList = new ArrayList<>();
        }
        this.skuSpecResponseList.add(skuSpecResponseListItem);
        return this;
    }

    public SkuSpecBaseResponse withSkuSpecResponseList(
        Consumer<List<SkuSpecBaseResponseSkuSpecResponseList>> skuSpecResponseListSetter) {
        if (this.skuSpecResponseList == null) {
            this.skuSpecResponseList = new ArrayList<>();
        }
        skuSpecResponseListSetter.accept(this.skuSpecResponseList);
        return this;
    }

    /**
     * 不同大区的实例规格信息列表
     * @return skuSpecResponseList
     */
    public List<SkuSpecBaseResponseSkuSpecResponseList> getSkuSpecResponseList() {
        return skuSpecResponseList;
    }

    public void setSkuSpecResponseList(List<SkuSpecBaseResponseSkuSpecResponseList> skuSpecResponseList) {
        this.skuSpecResponseList = skuSpecResponseList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponse that = (SkuSpecBaseResponse) obj;
        return Objects.equals(this.bandInfo, that.bandInfo)
            && Objects.equals(this.skuSpecResponseList, that.skuSpecResponseList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandInfo, skuSpecResponseList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponse {\n");
        sb.append("    bandInfo: ").append(toIndentedString(bandInfo)).append("\n");
        sb.append("    skuSpecResponseList: ").append(toIndentedString(skuSpecResponseList)).append("\n");
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
