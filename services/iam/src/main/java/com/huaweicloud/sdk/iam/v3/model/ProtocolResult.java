package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ProtocolResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapping_id")

    private String mappingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private ProtocolLinks links;

    public ProtocolResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 协议ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProtocolResult withMappingId(String mappingId) {
        this.mappingId = mappingId;
        return this;
    }

    /**
     * 映射ID。
     * @return mappingId
     */
    public String getMappingId() {
        return mappingId;
    }

    public void setMappingId(String mappingId) {
        this.mappingId = mappingId;
    }

    public ProtocolResult withLinks(ProtocolLinks links) {
        this.links = links;
        return this;
    }

    public ProtocolResult withLinks(Consumer<ProtocolLinks> linksSetter) {
        if (this.links == null) {
            this.links = new ProtocolLinks();
            linksSetter.accept(this.links);
        }

        return this;
    }

    /**
     * Get links
     * @return links
     */
    public ProtocolLinks getLinks() {
        return links;
    }

    public void setLinks(ProtocolLinks links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtocolResult protocolResult = (ProtocolResult) o;
        return Objects.equals(this.id, protocolResult.id) && Objects.equals(this.mappingId, protocolResult.mappingId)
            && Objects.equals(this.links, protocolResult.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mappingId, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtocolResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mappingId: ").append(toIndentedString(mappingId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
