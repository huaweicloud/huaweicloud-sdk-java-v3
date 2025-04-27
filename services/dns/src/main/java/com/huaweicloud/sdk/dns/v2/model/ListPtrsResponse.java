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
public class ListPtrsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingips")

    private List<FloatingIpsPtr> floatingips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public ListPtrsResponse withFloatingips(List<FloatingIpsPtr> floatingips) {
        this.floatingips = floatingips;
        return this;
    }

    public ListPtrsResponse addFloatingipsItem(FloatingIpsPtr floatingipsItem) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        this.floatingips.add(floatingipsItem);
        return this;
    }

    public ListPtrsResponse withFloatingips(Consumer<List<FloatingIpsPtr>> floatingipsSetter) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        floatingipsSetter.accept(this.floatingips);
        return this;
    }

    /**
     * 反向解析列表。
     * @return floatingips
     */
    public List<FloatingIpsPtr> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<FloatingIpsPtr> floatingips) {
        this.floatingips = floatingips;
    }

    public ListPtrsResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListPtrsResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public ListPtrsResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListPtrsResponse withMetadata(Consumer<Metadata> metadataSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPtrsResponse that = (ListPtrsResponse) obj;
        return Objects.equals(this.floatingips, that.floatingips) && Objects.equals(this.links, that.links)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingips, links, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPtrsResponse {\n");
        sb.append("    floatingips: ").append(toIndentedString(floatingips)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
