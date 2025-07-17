package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SkuSpecBaseResponseSkuSpecResponseList
 */
public class SkuSpecBaseResponseSkuSpecResponseList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skuResponses")

    private List<SkuSpecBaseResponseSkuResponses> skuResponses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regionId")

    private String regionId;

    public SkuSpecBaseResponseSkuSpecResponseList withSkuResponses(List<SkuSpecBaseResponseSkuResponses> skuResponses) {
        this.skuResponses = skuResponses;
        return this;
    }

    public SkuSpecBaseResponseSkuSpecResponseList addSkuResponsesItem(
        SkuSpecBaseResponseSkuResponses skuResponsesItem) {
        if (this.skuResponses == null) {
            this.skuResponses = new ArrayList<>();
        }
        this.skuResponses.add(skuResponsesItem);
        return this;
    }

    public SkuSpecBaseResponseSkuSpecResponseList withSkuResponses(
        Consumer<List<SkuSpecBaseResponseSkuResponses>> skuResponsesSetter) {
        if (this.skuResponses == null) {
            this.skuResponses = new ArrayList<>();
        }
        skuResponsesSetter.accept(this.skuResponses);
        return this;
    }

    /**
     * 实例规格信息
     * @return skuResponses
     */
    public List<SkuSpecBaseResponseSkuResponses> getSkuResponses() {
        return skuResponses;
    }

    public void setSkuResponses(List<SkuSpecBaseResponseSkuResponses> skuResponses) {
        this.skuResponses = skuResponses;
    }

    public SkuSpecBaseResponseSkuSpecResponseList withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponseSkuSpecResponseList that = (SkuSpecBaseResponseSkuSpecResponseList) obj;
        return Objects.equals(this.skuResponses, that.skuResponses) && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skuResponses, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponseSkuSpecResponseList {\n");
        sb.append("    skuResponses: ").append(toIndentedString(skuResponses)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
