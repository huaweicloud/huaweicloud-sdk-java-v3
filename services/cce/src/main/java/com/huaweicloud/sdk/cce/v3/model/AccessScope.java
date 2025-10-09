package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccessScope
 */
public class AccessScope {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<String> namespaces = null;

    public AccessScope withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public AccessScope addNamespacesItem(String namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public AccessScope withNamespaces(Consumer<List<String>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * **参数解释：** 集群命名空间的列表，允许使用通配符（“\\*”），表示所有命名空间。当选择了不同集群时，命名空间的列表可以为多个集群的集合，在转化成RBAC策略时，会自动判断集群下的命名空间是否存在。 **约束限制：** 当前最多支持同时授权500个命名空间。 **取值范围：** \\[\"\\*\"\\]或者集群命名空间列表。 **默认取值：** 不涉及
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
        AccessScope that = (AccessScope) obj;
        return Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessScope {\n");
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
