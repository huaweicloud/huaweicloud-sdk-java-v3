package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectMeta是Kubernetes中所有持久化资源必须包含的元数据结构
 */
public class ObjectMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generateName")

    private String generateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private String updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceVersion")

    private String resourceVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "generation")

    private String generation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managedFields")

    private List<ManagedFieldsEntry> managedFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownerReferences")

    private List<OwnerReference> ownerReferences = null;

    public ObjectMeta withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * 资源ID
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public ObjectMeta withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectMeta withGenerateName(String generateName) {
        this.generateName = generateName;
        return this;
    }

    /**
     * 当未提供name时，服务器使用的前缀来生成唯一名称
     * @return generateName
     */
    public String getGenerateName() {
        return generateName;
    }

    public void setGenerateName(String generateName) {
        this.generateName = generateName;
    }

    public ObjectMeta withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ObjectMeta withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public ObjectMeta putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public ObjectMeta withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public ObjectMeta withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public ObjectMeta putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public ObjectMeta withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * 注解
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public ObjectMeta withCreationTimestamp(String creationTimestamp) {
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

    public ObjectMeta withUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * 更新时间
     * @return updateTimestamp
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public ObjectMeta withResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * 资源内部版本
     * @return resourceVersion
     */
    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public ObjectMeta withGeneration(String generation) {
        this.generation = generation;
        return this;
    }

    /**
     * 资源期望状态的代数
     * @return generation
     */
    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public ObjectMeta withManagedFields(List<ManagedFieldsEntry> managedFields) {
        this.managedFields = managedFields;
        return this;
    }

    public ObjectMeta addManagedFieldsItem(ManagedFieldsEntry managedFieldsItem) {
        if (this.managedFields == null) {
            this.managedFields = new ArrayList<>();
        }
        this.managedFields.add(managedFieldsItem);
        return this;
    }

    public ObjectMeta withManagedFields(Consumer<List<ManagedFieldsEntry>> managedFieldsSetter) {
        if (this.managedFields == null) {
            this.managedFields = new ArrayList<>();
        }
        managedFieldsSetter.accept(this.managedFields);
        return this;
    }

    /**
     * 记录哪些字段由哪些工作流管理
     * @return managedFields
     */
    public List<ManagedFieldsEntry> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(List<ManagedFieldsEntry> managedFields) {
        this.managedFields = managedFields;
    }

    public ObjectMeta withOwnerReferences(List<OwnerReference> ownerReferences) {
        this.ownerReferences = ownerReferences;
        return this;
    }

    public ObjectMeta addOwnerReferencesItem(OwnerReference ownerReferencesItem) {
        if (this.ownerReferences == null) {
            this.ownerReferences = new ArrayList<>();
        }
        this.ownerReferences.add(ownerReferencesItem);
        return this;
    }

    public ObjectMeta withOwnerReferences(Consumer<List<OwnerReference>> ownerReferencesSetter) {
        if (this.ownerReferences == null) {
            this.ownerReferences = new ArrayList<>();
        }
        ownerReferencesSetter.accept(this.ownerReferences);
        return this;
    }

    /**
     * 用于定义对象间所有权关系，管理对象的依赖关系和垃圾回收机制，支持控制器对资源的管理
     * @return ownerReferences
     */
    public List<OwnerReference> getOwnerReferences() {
        return ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
        this.ownerReferences = ownerReferences;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectMeta that = (ObjectMeta) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.generateName, that.generateName) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.annotations, that.annotations)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp)
            && Objects.equals(this.resourceVersion, that.resourceVersion)
            && Objects.equals(this.generation, that.generation)
            && Objects.equals(this.managedFields, that.managedFields)
            && Objects.equals(this.ownerReferences, that.ownerReferences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid,
            name,
            generateName,
            namespace,
            labels,
            annotations,
            creationTimestamp,
            updateTimestamp,
            resourceVersion,
            generation,
            managedFields,
            ownerReferences);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectMeta {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
        sb.append("    managedFields: ").append(toIndentedString(managedFields)).append("\n");
        sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
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
