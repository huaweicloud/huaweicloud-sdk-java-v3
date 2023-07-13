package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Region {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_region_id")

    private String parentRegionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private LinksSelf links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locales")

    private RegionLocales locales;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

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
        if (this.links == null) {
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
        if (this.locales == null) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Region that = (Region) obj;
        return Objects.equals(this.description, that.description)
            && Objects.equals(this.parentRegionId, that.parentRegionId) && Objects.equals(this.links, that.links)
            && Objects.equals(this.locales, that.locales) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type);
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
