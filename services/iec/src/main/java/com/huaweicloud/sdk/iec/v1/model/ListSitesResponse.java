package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.Site;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSitesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sites")
    
    private List<Site> sites = null;
    
    public ListSitesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 边缘站点总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListSitesResponse withSites(List<Site> sites) {
        this.sites = sites;
        return this;
    }

    
    public ListSitesResponse addSitesItem(Site sitesItem) {
        if(this.sites == null) {
            this.sites = new ArrayList<>();
        }
        this.sites.add(sitesItem);
        return this;
    }

    public ListSitesResponse withSites(Consumer<List<Site>> sitesSetter) {
        if(this.sites == null) {
            this.sites = new ArrayList<>();
        }
        sitesSetter.accept(this.sites);
        return this;
    }

    /**
     * 站点列表。
     * @return sites
     */
    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSitesResponse listSitesResponse = (ListSitesResponse) o;
        return Objects.equals(this.count, listSitesResponse.count) &&
            Objects.equals(this.sites, listSitesResponse.sites);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, sites);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSitesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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

