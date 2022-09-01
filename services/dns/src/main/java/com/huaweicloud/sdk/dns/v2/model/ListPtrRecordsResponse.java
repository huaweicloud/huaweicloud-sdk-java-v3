package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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

    @JacksonXmlProperty(localName = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private Metedata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floatingips")

    @JacksonXmlProperty(localName = "floatingips")

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

    public ListPtrRecordsResponse withMetadata(Metedata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListPtrRecordsResponse withMetadata(Consumer<Metedata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metedata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metedata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metedata metadata) {
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
     * Get floatingips
     * @return floatingips
     */
    public List<ListPtrRecordsFloatingResp> getFloatingips() {
        return floatingips;
    }

    public void setFloatingips(List<ListPtrRecordsFloatingResp> floatingips) {
        this.floatingips = floatingips;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPtrRecordsResponse listPtrRecordsResponse = (ListPtrRecordsResponse) o;
        return Objects.equals(this.links, listPtrRecordsResponse.links)
            && Objects.equals(this.metadata, listPtrRecordsResponse.metadata)
            && Objects.equals(this.floatingips, listPtrRecordsResponse.floatingips);
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
