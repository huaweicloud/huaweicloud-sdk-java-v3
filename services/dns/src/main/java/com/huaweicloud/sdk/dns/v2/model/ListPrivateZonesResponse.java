package com.huaweicloud.sdk.dns.v2.model;

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
public class ListPrivateZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zones")

    private List<PrivateZoneResp> zones = null;

    public ListPrivateZonesResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListPrivateZonesResponse withLinks(Consumer<PageLink> linksSetter) {
        if (this.links == null) {
            this.links = new PageLink();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public PageLink getLinks() {
        return links;
    }

    public void setLinks(PageLink links) {
        this.links = links;
    }

    public ListPrivateZonesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListPrivateZonesResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ListPrivateZonesResponse withZones(List<PrivateZoneResp> zones) {
        this.zones = zones;
        return this;
    }

    public ListPrivateZonesResponse addZonesItem(PrivateZoneResp zonesItem) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        this.zones.add(zonesItem);
        return this;
    }

    public ListPrivateZonesResponse withZones(Consumer<List<PrivateZoneResp>> zonesSetter) {
        if (this.zones == null) {
            this.zones = new ArrayList<>();
        }
        zonesSetter.accept(this.zones);
        return this;
    }

    /**
     * 域名列表信息。
     * @return zones
     */
    public List<PrivateZoneResp> getZones() {
        return zones;
    }

    public void setZones(List<PrivateZoneResp> zones) {
        this.zones = zones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPrivateZonesResponse that = (ListPrivateZonesResponse) obj;
        return Objects.equals(this.links, that.links) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.zones, that.zones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, metadata, zones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateZonesResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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
