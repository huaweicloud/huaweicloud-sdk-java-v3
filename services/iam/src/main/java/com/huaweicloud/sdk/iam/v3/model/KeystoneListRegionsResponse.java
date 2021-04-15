package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.Links;
import com.huaweicloud.sdk.iam.v3.model.Region;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class KeystoneListRegionsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private Links links;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regions")
    
    private List<Region> regions = null;
    
    public KeystoneListRegionsResponse withLinks(Links links) {
        this.links = links;
        return this;
    }

    public KeystoneListRegionsResponse withLinks(Consumer<Links> linksSetter) {
        if(this.links == null ){
            this.links = new Links();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    

    public KeystoneListRegionsResponse withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

    
    public KeystoneListRegionsResponse addRegionsItem(Region regionsItem) {
        if(this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public KeystoneListRegionsResponse withRegions(Consumer<List<Region>> regionsSetter) {
        if(this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 区域信息列表。
     * @return regions
     */
    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListRegionsResponse keystoneListRegionsResponse = (KeystoneListRegionsResponse) o;
        return Objects.equals(this.links, keystoneListRegionsResponse.links) &&
            Objects.equals(this.regions, keystoneListRegionsResponse.regions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(links, regions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListRegionsResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

