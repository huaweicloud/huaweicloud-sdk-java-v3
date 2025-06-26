package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateInstanceNamespaceRequestBody
 */
public class CreateInstanceNamespaceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace_name")

    private String namespaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NamespaceMetadata metadata;

    public CreateInstanceNamespaceRequestBody withNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * 命名空间名称，小写字母或数字开头，后面跟小写字母、数字、点、下划线或中划线（其中点、下划线、中划线不能直接连续），小写字母或数字结尾，1-64个字符。
     * @return namespaceName
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    public CreateInstanceNamespaceRequestBody withMetadata(NamespaceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateInstanceNamespaceRequestBody withMetadata(Consumer<NamespaceMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NamespaceMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NamespaceMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NamespaceMetadata metadata) {
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
        CreateInstanceNamespaceRequestBody that = (CreateInstanceNamespaceRequestBody) obj;
        return Objects.equals(this.namespaceName, that.namespaceName) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaceName, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceNamespaceRequestBody {\n");
        sb.append("    namespaceName: ").append(toIndentedString(namespaceName)).append("\n");
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
