package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点的虚拟机规格，请参见flavor参数说明。
 */
public class CdmQueryClusterInstanceDetailFlavor {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<ClusterLinks> links = null;

    public CdmQueryClusterInstanceDetailFlavor withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 节点虚拟机的规格ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CdmQueryClusterInstanceDetailFlavor withLinks(List<ClusterLinks> links) {
        this.links = links;
        return this;
    }

    public CdmQueryClusterInstanceDetailFlavor addLinksItem(ClusterLinks linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public CdmQueryClusterInstanceDetailFlavor withLinks(Consumer<List<ClusterLinks>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 链接信息
     * @return links
     */
    public List<ClusterLinks> getLinks() {
        return links;
    }

    public void setLinks(List<ClusterLinks> links) {
        this.links = links;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmQueryClusterInstanceDetailFlavor that = (CdmQueryClusterInstanceDetailFlavor) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmQueryClusterInstanceDetailFlavor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
