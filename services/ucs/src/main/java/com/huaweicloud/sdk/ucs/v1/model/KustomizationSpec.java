package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * KustomizationSpec
 */
public class KustomizationSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private String interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private String timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceRef")

    private SourceRef sourceRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetNamespace")

    private String targetNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prune")

    private Boolean prune;

    public KustomizationSpec withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * kustomization.yaml文件的路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public KustomizationSpec withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 用于指定控制器执行 Kustomization同步与校验的时间间隔
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public KustomizationSpec withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 用于定义验证、应用和健康检查操作的超时
     * @return timeout
     */
    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public KustomizationSpec withSourceRef(SourceRef sourceRef) {
        this.sourceRef = sourceRef;
        return this;
    }

    public KustomizationSpec withSourceRef(Consumer<SourceRef> sourceRefSetter) {
        if (this.sourceRef == null) {
            this.sourceRef = new SourceRef();
            sourceRefSetter.accept(this.sourceRef);
        }

        return this;
    }

    /**
     * Get sourceRef
     * @return sourceRef
     */
    public SourceRef getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(SourceRef sourceRef) {
        this.sourceRef = sourceRef;
    }

    public KustomizationSpec withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * 用于设置或覆盖kustomization.yaml文件中的命名空间
     * @return targetNamespace
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }

    public KustomizationSpec withPrune(Boolean prune) {
        this.prune = prune;
        return this;
    }

    /**
     * 是否启用垃圾回收功能
     * @return prune
     */
    public Boolean getPrune() {
        return prune;
    }

    public void setPrune(Boolean prune) {
        this.prune = prune;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KustomizationSpec that = (KustomizationSpec) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.timeout, that.timeout) && Objects.equals(this.sourceRef, that.sourceRef)
            && Objects.equals(this.targetNamespace, that.targetNamespace) && Objects.equals(this.prune, that.prune);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, interval, timeout, sourceRef, targetNamespace, prune);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KustomizationSpec {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    sourceRef: ").append(toIndentedString(sourceRef)).append("\n");
        sb.append("    targetNamespace: ").append(toIndentedString(targetNamespace)).append("\n");
        sb.append("    prune: ").append(toIndentedString(prune)).append("\n");
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
