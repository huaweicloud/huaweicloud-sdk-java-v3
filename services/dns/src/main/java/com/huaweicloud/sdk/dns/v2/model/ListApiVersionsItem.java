package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListApiVersionsItem
 */
public class ListApiVersionsItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinksItem> links = null;

    public ListApiVersionsItem withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 版本状态。 **取值范围：** - CURRENT：表示该版本为主推版本。 - SUPPORTED：表示为老版本，但是现在还在继续支持。 - DEPRECATED：表示为废弃版本，存在后续删除的可能。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListApiVersionsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 版本号。 **取值范围：** v2。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListApiVersionsItem withLinks(List<LinksItem> links) {
        this.links = links;
        return this;
    }

    public ListApiVersionsItem addLinksItem(LinksItem linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ListApiVersionsItem withLinks(Consumer<List<LinksItem>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * **参数解释：** 指向当前版本的URL。 **取值范围：** 不涉及。
     * @return links
     */
    public List<LinksItem> getLinks() {
        return links;
    }

    public void setLinks(List<LinksItem> links) {
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
        ListApiVersionsItem that = (ListApiVersionsItem) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.id, that.id)
            && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, id, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApiVersionsItem {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
