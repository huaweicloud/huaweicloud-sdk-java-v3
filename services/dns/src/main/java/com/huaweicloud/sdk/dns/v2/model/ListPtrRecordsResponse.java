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
public class ListPtrRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingips")

    private List<ListPtrRecordsFloatingResp> floatingips = null;

    public ListPtrRecordsResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListPtrRecordsResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public ListPtrRecordsResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListPtrRecordsResponse withMetadata(Consumer<Metadata> metadataSetter) {
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

    public ListPtrRecordsResponse withFloatingips(List<ListPtrRecordsFloatingResp> floatingips) {
        this.floatingips = floatingips;
        return this;
    }

    public ListPtrRecordsResponse addFloatingipsItem(ListPtrRecordsFloatingResp floatingipsItem) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        this.floatingips.add(floatingipsItem);
        return this;
    }

    public ListPtrRecordsResponse withFloatingips(Consumer<List<ListPtrRecordsFloatingResp>> floatingipsSetter) {
        if (this.floatingips == null) {
            this.floatingips = new ArrayList<>();
        }
        floatingipsSetter.accept(this.floatingips);
        return this;
    }

    /**
     * 弹性公网IP的反向解析记录ID列表信息。
     * @return floatingips
     */
    public List<ListPtrRecordsFloatingResp> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<ListPtrRecordsFloatingResp> floatingips) {
        this.floatingips = floatingips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPtrRecordsResponse that = (ListPtrRecordsResponse) obj;
        return Objects.equals(this.links, that.links) && Objects.equals(this.metadata, that.metadata)
            && Objects.equals(this.floatingips, that.floatingips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, metadata, floatingips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPtrRecordsResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    floatingips: ").append(toIndentedString(floatingips)).append("\n");
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
