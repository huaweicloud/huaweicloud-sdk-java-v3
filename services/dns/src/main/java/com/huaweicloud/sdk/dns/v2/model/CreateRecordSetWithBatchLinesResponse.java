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
public class CreateRecordSetWithBatchLinesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recordsets")

    private List<QueryRecordSetWithLineResp> recordsets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public CreateRecordSetWithBatchLinesResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public CreateRecordSetWithBatchLinesResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public CreateRecordSetWithBatchLinesResponse withRecordsets(List<QueryRecordSetWithLineResp> recordsets) {
        this.recordsets = recordsets;
        return this;
    }

    public CreateRecordSetWithBatchLinesResponse addRecordsetsItem(QueryRecordSetWithLineResp recordsetsItem) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        this.recordsets.add(recordsetsItem);
        return this;
    }

    public CreateRecordSetWithBatchLinesResponse withRecordsets(
        Consumer<List<QueryRecordSetWithLineResp>> recordsetsSetter) {
        if (this.recordsets == null) {
            this.recordsets = new ArrayList<>();
        }
        recordsetsSetter.accept(this.recordsets);
        return this;
    }

    /**
     * recordset的列表信息。
     * @return recordsets
     */
    public List<QueryRecordSetWithLineResp> getRecordsets() {
        return recordsets;
    }

    public void setRecordsets(List<QueryRecordSetWithLineResp> recordsets) {
        this.recordsets = recordsets;
    }

    public CreateRecordSetWithBatchLinesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateRecordSetWithBatchLinesResponse withMetadata(Consumer<Metadata> metadataSetter) {
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
        CreateRecordSetWithBatchLinesResponse that = (CreateRecordSetWithBatchLinesResponse) obj;
        return Objects.equals(this.links, that.links) && Objects.equals(this.recordsets, that.recordsets)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, recordsets, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRecordSetWithBatchLinesResponse {\n");
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
