package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Match
 */
public class Match {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kinds")

    private List<ResourceKinds> kinds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<String> namespaces = null;

    public Match withKinds(List<ResourceKinds> kinds) {
        this.kinds = kinds;
        return this;
    }

    public Match addKindsItem(ResourceKinds kindsItem) {
        if (this.kinds == null) {
            this.kinds = new ArrayList<>();
        }
        this.kinds.add(kindsItem);
        return this;
    }

    public Match withKinds(Consumer<List<ResourceKinds>> kindsSetter) {
        if (this.kinds == null) {
            this.kinds = new ArrayList<>();
        }
        kindsSetter.accept(this.kinds);
        return this;
    }

    /**
     * 生效类型，当前预置，填写不会生效
     * @return kinds
     */
    public List<ResourceKinds> getKinds() {
        return kinds;
    }

    public void setKinds(List<ResourceKinds> kinds) {
        this.kinds = kinds;
    }

    public Match withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public Match addNamespacesItem(String namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public Match withNamespaces(Consumer<List<String>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 生效的命名空间
     * @return namespaces
     */
    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Match that = (Match) obj;
        return Objects.equals(this.kinds, that.kinds) && Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kinds, namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Match {\n");
        sb.append("    kinds: ").append(toIndentedString(kinds)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
