package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用部署全量替换修改，应用更新时调用
 */
public class UpdatePodDeployment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private PodRequest template;

    public UpdatePodDeployment withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * 应用部署副本数
     * @return replicas
     */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public UpdatePodDeployment withTemplate(PodRequest template) {
        this.template = template;
        return this;
    }

    public UpdatePodDeployment withTemplate(Consumer<PodRequest> templateSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePodDeployment updatePodDeployment = (UpdatePodDeployment) o;
        return Objects.equals(this.replicas, updatePodDeployment.replicas)
            && Objects.equals(this.template, updatePodDeployment.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicas, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePodDeployment {\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
