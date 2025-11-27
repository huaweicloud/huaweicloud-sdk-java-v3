package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MutiWorkload
 */
public class MutiWorkload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ObjectMeta metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private Object template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "propagationPolicy")

    private PropagationPolicy propagationPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overridePolicy")

    private OverridePolicy overridePolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceBinding")

    private ResourceBinding resourceBinding;

    public MutiWorkload withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型，有以下取值： - Deployment：用于管理无状态应用 - Service：实现服务发现和负载均衡 - Ingress：管理对集群内服务的外部 HTTP/HTTPS 访问 - ConfigMap：用于存储非敏感的配置数据 - Secret：用于存储敏感信息 - Job：用于运行一次性任务的资源 - StatefulSet：用于管理有状态应用 - DaemonSet：用于在每个节点上运行一个 Pod 的资源 - PersistentVolumeClaim：用于请求和使用持久化存储资源的资源
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public MutiWorkload withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public MutiWorkload withMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public MutiWorkload withMetadata(Consumer<ObjectMeta> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ObjectMeta();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public MutiWorkload withTemplate(Object template) {
        this.template = template;
        return this;
    }

    /**
     * 要部署的应用模板
     * @return template
     */
    public Object getTemplate() {
        return template;
    }

    public void setTemplate(Object template) {
        this.template = template;
    }

    public MutiWorkload withPropagationPolicy(PropagationPolicy propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
        return this;
    }

    public MutiWorkload withPropagationPolicy(Consumer<PropagationPolicy> propagationPolicySetter) {
        if (this.propagationPolicy == null) {
            this.propagationPolicy = new PropagationPolicy();
            propagationPolicySetter.accept(this.propagationPolicy);
        }

        return this;
    }

    /**
     * Get propagationPolicy
     * @return propagationPolicy
     */
    public PropagationPolicy getPropagationPolicy() {
        return propagationPolicy;
    }

    public void setPropagationPolicy(PropagationPolicy propagationPolicy) {
        this.propagationPolicy = propagationPolicy;
    }

    public MutiWorkload withOverridePolicy(OverridePolicy overridePolicy) {
        this.overridePolicy = overridePolicy;
        return this;
    }

    public MutiWorkload withOverridePolicy(Consumer<OverridePolicy> overridePolicySetter) {
        if (this.overridePolicy == null) {
            this.overridePolicy = new OverridePolicy();
            overridePolicySetter.accept(this.overridePolicy);
        }

        return this;
    }

    /**
     * Get overridePolicy
     * @return overridePolicy
     */
    public OverridePolicy getOverridePolicy() {
        return overridePolicy;
    }

    public void setOverridePolicy(OverridePolicy overridePolicy) {
        this.overridePolicy = overridePolicy;
    }

    public MutiWorkload withResourceBinding(ResourceBinding resourceBinding) {
        this.resourceBinding = resourceBinding;
        return this;
    }

    public MutiWorkload withResourceBinding(Consumer<ResourceBinding> resourceBindingSetter) {
        if (this.resourceBinding == null) {
            this.resourceBinding = new ResourceBinding();
            resourceBindingSetter.accept(this.resourceBinding);
        }

        return this;
    }

    /**
     * Get resourceBinding
     * @return resourceBinding
     */
    public ResourceBinding getResourceBinding() {
        return resourceBinding;
    }

    public void setResourceBinding(ResourceBinding resourceBinding) {
        this.resourceBinding = resourceBinding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MutiWorkload that = (MutiWorkload) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.template, that.template)
            && Objects.equals(this.propagationPolicy, that.propagationPolicy)
            && Objects.equals(this.overridePolicy, that.overridePolicy)
            && Objects.equals(this.resourceBinding, that.resourceBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, template, propagationPolicy, overridePolicy, resourceBinding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MutiWorkload {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
        sb.append("    overridePolicy: ").append(toIndentedString(overridePolicy)).append("\n");
        sb.append("    resourceBinding: ").append(toIndentedString(resourceBinding)).append("\n");
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
