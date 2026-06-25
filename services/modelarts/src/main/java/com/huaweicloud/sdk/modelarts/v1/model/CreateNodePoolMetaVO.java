package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建节点池的metadata信息。
 */
public class CreateNodePoolMetaVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private CreateNodePoolAnnotations annotations;

    public CreateNodePoolMetaVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：节点池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNodePoolMetaVO withAnnotations(CreateNodePoolAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public CreateNodePoolMetaVO withAnnotations(Consumer<CreateNodePoolAnnotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new CreateNodePoolAnnotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public CreateNodePoolAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(CreateNodePoolAnnotations annotations) {
        this.annotations = annotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNodePoolMetaVO that = (CreateNodePoolMetaVO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNodePoolMetaVO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
