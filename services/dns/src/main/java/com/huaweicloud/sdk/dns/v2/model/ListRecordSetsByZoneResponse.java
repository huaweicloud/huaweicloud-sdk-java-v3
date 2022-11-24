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
public class ListRecordSetsByZoneResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordsets")

    private List<ListRecordSets> recordsets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metedata metadata;

    public ListRecordSetsByZoneResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListRecordSetsByZoneResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public ListRecordSetsByZoneResponse withRecordsets(List<ListRecordSets> recordsets) {
        this.recordsets = recordsets;
        return this;
    }

    public ListRecordSetsByZoneResponse addRecordsetsItem(ListRecordSets recordsetsItem) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        this.recordsets.add(recordsetsItem);
        return this;
    }

    public ListRecordSetsByZoneResponse withRecordsets(Consumer<List<ListRecordSets>> recordsetsSetter) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        recordsetsSetter.accept(this.recordsets);
        return this;
    }

    /**
     * Get recordsets
     * @return recordsets
     */
    public List<ListRecordSets> getRecordsets() {
        return recordsets;
    }

    public void setRecordsets(List<ListRecordSets> recordsets) {
        this.recordsets = recordsets;
    }

    public ListRecordSetsByZoneResponse withMetadata(Metedata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListRecordSetsByZoneResponse withMetadata(Consumer<Metedata> metadataSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordSetsByZoneResponse listRecordSetsByZoneResponse = (ListRecordSetsByZoneResponse) o;
        return Objects.equals(this.links, listRecordSetsByZoneResponse.links)
            && Objects.equals(this.recordsets, listRecordSetsByZoneResponse.recordsets)
            && Objects.equals(this.metadata, listRecordSetsByZoneResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, recordsets, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordSetsByZoneResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    recordsets: ").append(toIndentedString(recordsets)).append("\n");
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
