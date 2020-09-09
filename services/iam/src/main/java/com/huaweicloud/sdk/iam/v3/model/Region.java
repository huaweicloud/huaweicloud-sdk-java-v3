package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LinksSelf;
import com.huaweicloud.sdk.iam.v3.model.RegionLocales;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class Region  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parent_region_id")
    
    private String parentRegionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private LinksSelf links = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locales")
    
    private RegionLocales locales = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public Region withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 区域描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Region withParentRegionId(String parentRegionId) {
        this.parentRegionId = parentRegionId;
        return this;
    }

    


    /**
     * null.
     * @return parentRegionId
     */
    public String getParentRegionId() {
        return parentRegionId;
    }

    public void setParentRegionId(String parentRegionId) {
        this.parentRegionId = parentRegionId;
    }

    public Region withLinks(LinksSelf links) {
        this.links = links;
        return this;
    }

    public Region withLinks(Consumer<LinksSelf> linksSetter) {
        if(this.links == null ){
            this.links = new LinksSelf();
            linksSetter.accept(this.links);
        }
        
        return this;
    }


    /**
     * Get links
     * @return links
     */
    public LinksSelf getLinks() {
        return links;
    }

    public void setLinks(LinksSelf links) {
        this.links = links;
    }

    public Region withLocales(RegionLocales locales) {
        this.locales = locales;
        return this;
    }

    public Region withLocales(Consumer<RegionLocales> localesSetter) {
        if(this.locales == null ){
            this.locales = new RegionLocales();
            localesSetter.accept(this.locales);
        }
        
        return this;
    }


    /**
     * Get locales
     * @return locales
     */
    public RegionLocales getLocales() {
        return locales;
    }

    public void setLocales(RegionLocales locales) {
        this.locales = locales;
    }

    public Region withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 区域ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Region withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 区域类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Region region = (Region) o;
        return Objects.equals(this.description, region.description) &&
            Objects.equals(this.parentRegionId, region.parentRegionId) &&
            Objects.equals(this.links, region.links) &&
            Objects.equals(this.locales, region.locales) &&
            Objects.equals(this.id, region.id) &&
            Objects.equals(this.type, region.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(description, parentRegionId, links, locales, id, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Region {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentRegionId: ").append(toIndentedString(parentRegionId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

