package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群注入信息
 */
public class InjectionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restartPod")

    private Boolean restartPod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private Selector namespaces;

    public InjectionConfig withRestartPod(Boolean restartPod) {
        this.restartPod = restartPod;
        return this;
    }

    /**
     * 是否重启pod
     * @return restartPod
     */
    public Boolean getRestartPod() {
        return restartPod;
    }

    public void setRestartPod(Boolean restartPod) {
        this.restartPod = restartPod;
    }

    public InjectionConfig withNamespaces(Selector namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public InjectionConfig withNamespaces(Consumer<Selector> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new Selector();
            namespacesSetter.accept(this.namespaces);
        }

        return this;
    }

    /**
     * Get namespaces
     * @return namespaces
     */
    public Selector getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(Selector namespaces) {
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
        InjectionConfig that = (InjectionConfig) obj;
        return Objects.equals(this.restartPod, that.restartPod) && Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restartPod, namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InjectionConfig {\n");
        sb.append("    restartPod: ").append(toIndentedString(restartPod)).append("\n");
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
