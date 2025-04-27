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
public class ListPublicZoneLinesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private PageLink links;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lines")

    private List<PublicZoneLines> lines = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    public ListPublicZoneLinesResponse withLinks(PageLink links) {
        this.links = links;
        return this;
    }

    public ListPublicZoneLinesResponse withLinks(Consumer<PageLink> linksSetter) {
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

    public ListPublicZoneLinesResponse withLines(List<PublicZoneLines> lines) {
        this.lines = lines;
        return this;
    }

    public ListPublicZoneLinesResponse addLinesItem(PublicZoneLines linesItem) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    public ListPublicZoneLinesResponse withLines(Consumer<List<PublicZoneLines>> linesSetter) {
        if (this.lines == null) {
            this.lines = new ArrayList<>();
        }
        linesSetter.accept(this.lines);
        return this;
    }

    /**
     * 查询公网域名的线路列表响应。
     * @return lines
     */
    public List<PublicZoneLines> getLines() {
        return lines;
    }

    public void setLines(List<PublicZoneLines> lines) {
        this.lines = lines;
    }

    public ListPublicZoneLinesResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListPublicZoneLinesResponse withMetadata(Consumer<Metadata> metadataSetter) {
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
        ListPublicZoneLinesResponse that = (ListPublicZoneLinesResponse) obj;
        return Objects.equals(this.links, that.links) && Objects.equals(this.lines, that.lines)
            && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, lines, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPublicZoneLinesResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
