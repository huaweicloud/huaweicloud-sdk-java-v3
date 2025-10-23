package com.huaweicloud.sdk.bcc.v1.model;

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
public class ShowResourcesSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "counts")

    private List<ResourceCountItem> counts = null;

    public ShowResourcesSummaryResponse withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目ID
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public ShowResourcesSummaryResponse withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务类型
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ShowResourcesSummaryResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowResourcesSummaryResponse withCounts(List<ResourceCountItem> counts) {
        this.counts = counts;
        return this;
    }

    public ShowResourcesSummaryResponse addCountsItem(ResourceCountItem countsItem) {
        if (this.counts == null) {
            this.counts = new ArrayList<>();
        }
        this.counts.add(countsItem);
        return this;
    }

    public ShowResourcesSummaryResponse withCounts(Consumer<List<ResourceCountItem>> countsSetter) {
        if (this.counts == null) {
            this.counts = new ArrayList<>();
        }
        countsSetter.accept(this.counts);
        return this;
    }

    /**
     * 统计体
     * @return counts
     */
    public List<ResourceCountItem> getCounts() {
        return counts;
    }

    public void setCounts(List<ResourceCountItem> counts) {
        this.counts = counts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourcesSummaryResponse that = (ShowResourcesSummaryResponse) obj;
        return Objects.equals(this.epId, that.epId) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.counts, that.counts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(epId, provider, regionId, counts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourcesSummaryResponse {\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
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
