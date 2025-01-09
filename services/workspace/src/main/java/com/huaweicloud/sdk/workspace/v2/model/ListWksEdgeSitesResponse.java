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
public class ListWksEdgeSitesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wks_edge_sites")

    private List<WksEdgeSiteDetail> wksEdgeSites = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListWksEdgeSitesResponse withWksEdgeSites(List<WksEdgeSiteDetail> wksEdgeSites) {
        this.wksEdgeSites = wksEdgeSites;
        return this;
    }

    public ListWksEdgeSitesResponse addWksEdgeSitesItem(WksEdgeSiteDetail wksEdgeSitesItem) {
        if (this.wksEdgeSites == null) {
            this.wksEdgeSites = new ArrayList<>();
        }
        this.wksEdgeSites.add(wksEdgeSitesItem);
        return this;
    }

    public ListWksEdgeSitesResponse withWksEdgeSites(Consumer<List<WksEdgeSiteDetail>> wksEdgeSitesSetter) {
        if (this.wksEdgeSites == null) {
            this.wksEdgeSites = new ArrayList<>();
        }
        wksEdgeSitesSetter.accept(this.wksEdgeSites);
        return this;
    }

    /**
     * 边缘小站列表。
     * @return wksEdgeSites
     */
    public List<WksEdgeSiteDetail> getWksEdgeSites() {
        return wksEdgeSites;
    }

    public void setWksEdgeSites(List<WksEdgeSiteDetail> wksEdgeSites) {
        this.wksEdgeSites = wksEdgeSites;
    }

    public ListWksEdgeSitesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 站点总数。
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
        ListWksEdgeSitesResponse that = (ListWksEdgeSitesResponse) obj;
        return Objects.equals(this.wksEdgeSites, that.wksEdgeSites) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wksEdgeSites, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWksEdgeSitesResponse {\n");
        sb.append("    wksEdgeSites: ").append(toIndentedString(wksEdgeSites)).append("\n");
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
