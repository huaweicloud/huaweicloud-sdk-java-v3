package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 部署参数配置
 */
public class CreateAppsInDeploymentV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private PodRequest template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Annotations annotations;

    public CreateAppsInDeploymentV3 withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * 副本数量
     * @return replicas
     */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public CreateAppsInDeploymentV3 withTemplate(PodRequest template) {
        this.template = template;
        return this;
    }

    public CreateAppsInDeploymentV3 withTemplate(Consumer<PodRequest> templateSetter) {
        if (this.template == null) {
            this.template = new PodRequest();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public PodRequest getTemplate() {
        return template;
    }

    public void setTemplate(PodRequest template) {
        this.template = template;
    }

    public CreateAppsInDeploymentV3 withAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public CreateAppsInDeploymentV3 withAnnotations(Consumer<Annotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new Annotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotations annotations) {
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
        CreateAppsInDeploymentV3 that = (CreateAppsInDeploymentV3) obj;
        return Objects.equals(this.replicas, that.replicas) && Objects.equals(this.template, that.template)
            && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicas, template, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppsInDeploymentV3 {\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
