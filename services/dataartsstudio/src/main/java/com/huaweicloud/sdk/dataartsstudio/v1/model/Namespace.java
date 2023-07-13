package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Namespace
 */
public class Namespace {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_guid")

    private String namespaceGuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_qualified_name")

    private String namespaceQualifiedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_count")

    private Integer tableCount;

    public Namespace withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间的名称
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public Namespace withNamespaceGuid(String namespaceGuid) {
        this.namespaceGuid = namespaceGuid;
        return this;
    }

    /**
     * 命名空间的guid
     * @return namespaceGuid
     */
    public String getNamespaceGuid() {
        return namespaceGuid;
    }

    public void setNamespaceGuid(String namespaceGuid) {
        this.namespaceGuid = namespaceGuid;
    }

    public Namespace withNamespaceQualifiedName(String namespaceQualifiedName) {
        this.namespaceQualifiedName = namespaceQualifiedName;
        return this;
    }

    /**
     * 命名空间的唯一标识名称
     * @return namespaceQualifiedName
     */
    public String getNamespaceQualifiedName() {
        return namespaceQualifiedName;
    }

    public void setNamespaceQualifiedName(String namespaceQualifiedName) {
        this.namespaceQualifiedName = namespaceQualifiedName;
    }

    public Namespace withTableCount(Integer tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * 命名空间下的表总数
     * @return tableCount
     */
    public Integer getTableCount() {
        return tableCount;
    }

    public void setTableCount(Integer tableCount) {
        this.tableCount = tableCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Namespace that = (Namespace) obj;
        return Objects.equals(this.namespaceName, that.namespaceName)
            && Objects.equals(this.namespaceGuid, that.namespaceGuid)
            && Objects.equals(this.namespaceQualifiedName, that.namespaceQualifiedName)
            && Objects.equals(this.tableCount, that.tableCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaceName, namespaceGuid, namespaceQualifiedName, tableCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Namespace {\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
        sb.append("    namespaceGuid: ").append(toIndentedString(namespaceGuid)).append("\n");
        sb.append("    namespaceQualifiedName: ").append(toIndentedString(namespaceQualifiedName)).append("\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
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
