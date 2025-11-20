package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 资源描述基本信息，集合类的元素类型，包含一组由不同名称定义的属性。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class Metadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uid")

    private String uid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Map<String, String> annotations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTimestamp")

    private LocalDate updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private LocalDate creationTimestamp;

    public Metadata withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * **参数解释**： 唯一id标识 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Metadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 资源名称 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Metadata withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public Metadata putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public Metadata withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**： 资源标签，key/value对格式，接口保留字段，填写不会生效 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public Metadata withAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
        return this;
    }

    public Metadata putAnnotationsItem(String key, String annotationsItem) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        this.annotations.put(key, annotationsItem);
        return this;
    }

    public Metadata withAnnotations(Consumer<Map<String, String>> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new HashMap<>();
        }
        annotationsSetter.accept(this.annotations);
        return this;
    }

    /**
     * **参数解释**： 资源注解，由key/value组成 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return annotations
     */
    public Map<String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }

    public Metadata withUpdateTimestamp(LocalDate updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * **参数解释**： 更新时间 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return updateTimestamp
     */
    public LocalDate getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(LocalDate updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public Metadata withCreationTimestamp(LocalDate creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**： 创建时间 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return creationTimestamp
     */
    public LocalDate getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(LocalDate creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata that = (Metadata) obj;
        return Objects.equals(this.uid, that.uid) && Objects.equals(this.name, that.name)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.annotations, that.annotations)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp)
            && Objects.equals(this.creationTimestamp, that.creationTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, name, labels, annotations, updateTimestamp, creationTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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
