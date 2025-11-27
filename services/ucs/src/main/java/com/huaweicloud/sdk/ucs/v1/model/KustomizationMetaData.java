package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * KustomizationMetaData
 */
public class KustomizationMetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceVersion")

    private String resourceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generation")

    private Integer generation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finalizers")

    private List<String> finalizers = null;

    public KustomizationMetaData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Kustomization名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KustomizationMetaData withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 所属命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public KustomizationMetaData withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 唯一标识符
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public KustomizationMetaData withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * 资源的内部版本标识，用于并发控制
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public KustomizationMetaData withGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }

    /**
     * 资源的期望状态的代数，每次修改spec会自增
     * @return generation
     */
    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public KustomizationMetaData withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * 创建时间
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public KustomizationMetaData withFinalizers(List<String> finalizers) {
        this.finalizers = finalizers;
        return this;
    }

    public KustomizationMetaData addFinalizersItem(String finalizersItem) {
        if (this.finalizers == null) {
            this.finalizers = new ArrayList<>();
        }
        this.finalizers.add(finalizersItem);
        return this;
    }

    public KustomizationMetaData withFinalizers(Consumer<List<String>> finalizersSetter) {
        if (this.finalizers == null) {
            this.finalizers = new ArrayList<>();
        }
        finalizersSetter.accept(this.finalizers);
        return this;
    }

    /**
     * 删除前需要执行的清理操作
     * @return finalizers
     */
    public List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(List<String> finalizers) {
        this.finalizers = finalizers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KustomizationMetaData that = (KustomizationMetaData) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.uid, that.uid) && Objects.equals(this.resourceVersion, that.resourceVersion)
            && Objects.equals(this.generation, that.generation)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.finalizers, that.finalizers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, uid, resourceVersion, generation, creationTimestamp, finalizers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KustomizationMetaData {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
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
