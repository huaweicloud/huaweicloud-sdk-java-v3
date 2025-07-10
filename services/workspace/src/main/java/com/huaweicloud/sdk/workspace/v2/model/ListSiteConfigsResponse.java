package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListSiteConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_infos")

    private List<SiteInfo> siteInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListSiteConfigsResponse withSiteInfos(List<SiteInfo> siteInfos) {
        this.siteInfos = siteInfos;
        return this;
    }

    public ListSiteConfigsResponse addSiteInfosItem(SiteInfo siteInfosItem) {
        if (this.siteInfos == null) {
            this.siteInfos = new ArrayList<>();
        }
        this.siteInfos.add(siteInfosItem);
        return this;
    }

    public ListSiteConfigsResponse withSiteInfos(Consumer<List<SiteInfo>> siteInfosSetter) {
        if (this.siteInfos == null) {
            this.siteInfos = new ArrayList<>();
        }
        siteInfosSetter.accept(this.siteInfos);
        return this;
    }

    /**
     * 站点信息列表。
     * @return siteInfos
     */
    public List<SiteInfo> getSiteInfos() {
        return siteInfos;
    }

    public void setSiteInfos(List<SiteInfo> siteInfos) {
        this.siteInfos = siteInfos;
    }

    public ListSiteConfigsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 站点总数。
     * minimum: 0
     * maximum: 200000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSiteConfigsResponse that = (ListSiteConfigsResponse) obj;
        return Objects.equals(this.siteInfos, that.siteInfos) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteInfos, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSiteConfigsResponse {\n");
        sb.append("    siteInfos: ").append(toIndentedString(siteInfos)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
