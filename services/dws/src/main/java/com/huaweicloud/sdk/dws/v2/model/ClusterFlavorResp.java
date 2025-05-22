package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 规格信息。 **取值范围**： 不涉及。
 */
public class ClusterFlavorResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinkResp> links = null;

    public ClusterFlavorResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 规格ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClusterFlavorResp withLinks(List<LinkResp> links) {
        this.links = links;
        return this;
    }

    public ClusterFlavorResp addLinksItem(LinkResp linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ClusterFlavorResp withLinks(Consumer<List<LinkResp>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * **参数解释**： 链接信息。 **取值范围**： 不涉及。
     * @return links
     */
    public List<LinkResp> getLinks() {
        return links;
    }

    public void setLinks(List<LinkResp> links) {
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
        ClusterFlavorResp that = (ClusterFlavorResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterFlavorResp {\n");
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
