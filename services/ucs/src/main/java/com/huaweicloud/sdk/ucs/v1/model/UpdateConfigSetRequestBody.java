package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateConfigSetRequestBody
 */
public class UpdateConfigSetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "helmReleaseSpec")

    private Object helmReleaseSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kustomizationSpec")

    private KustomizationSpec kustomizationSpec;

    public UpdateConfigSetRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 配置集合的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateConfigSetRequestBody withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 所在命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public UpdateConfigSetRequestBody withHelmReleaseSpec(Object helmReleaseSpec) {
        this.helmReleaseSpec = helmReleaseSpec;
        return this;
    }

    /**
     * 基于Helm Chart的部署配置（当前不支持HelmRelease类型）
     * @return helmReleaseSpec
     */
    public Object getHelmReleaseSpec() {
        return helmReleaseSpec;
    }

    public void setHelmReleaseSpec(Object helmReleaseSpec) {
        this.helmReleaseSpec = helmReleaseSpec;
    }

    public UpdateConfigSetRequestBody withKustomizationSpec(KustomizationSpec kustomizationSpec) {
        this.kustomizationSpec = kustomizationSpec;
        return this;
    }

    public UpdateConfigSetRequestBody withKustomizationSpec(Consumer<KustomizationSpec> kustomizationSpecSetter) {
        if (this.kustomizationSpec == null) {
            this.kustomizationSpec = new KustomizationSpec();
            kustomizationSpecSetter.accept(this.kustomizationSpec);
        }

        return this;
    }

    /**
     * Get kustomizationSpec
     * @return kustomizationSpec
     */
    public KustomizationSpec getKustomizationSpec() {
        return kustomizationSpec;
    }

    public void setKustomizationSpec(KustomizationSpec kustomizationSpec) {
        this.kustomizationSpec = kustomizationSpec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConfigSetRequestBody that = (UpdateConfigSetRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.namespace, that.namespace)
            && Objects.equals(this.helmReleaseSpec, that.helmReleaseSpec)
            && Objects.equals(this.kustomizationSpec, that.kustomizationSpec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, namespace, helmReleaseSpec, kustomizationSpec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConfigSetRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    helmReleaseSpec: ").append(toIndentedString(helmReleaseSpec)).append("\n");
        sb.append("    kustomizationSpec: ").append(toIndentedString(kustomizationSpec)).append("\n");
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
