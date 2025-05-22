package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 参数组信息。 **取值范围**： 不涉及。
 */
public class CompatibleConfigurationResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links")

    private List<LinkResp> links = null;

    public CompatibleConfigurationResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 参数组ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CompatibleConfigurationResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 参数组名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CompatibleConfigurationResp withLinks(List<LinkResp> links) {
        this.links = links;
        return this;
    }

    public CompatibleConfigurationResp addLinksItem(LinkResp linksItem) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public CompatibleConfigurationResp withLinks(Consumer<List<LinkResp>> linksSetter) {
        if (this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * **参数解释**： 连接信息。 **取值范围**： 不涉及。
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
        CompatibleConfigurationResp that = (CompatibleConfigurationResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.links, that.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompatibleConfigurationResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
