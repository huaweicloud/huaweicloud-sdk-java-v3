package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * GitRepositorySpec
 */
public class GitRepositorySpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref")

    private GitRepositoryRef ref;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secretRef")

    private LocalObjectReference secretRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private String interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private String timeout;

    public GitRepositorySpec withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Git仓库地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GitRepositorySpec withRef(GitRepositoryRef ref) {
        this.ref = ref;
        return this;
    }

    public GitRepositorySpec withRef(Consumer<GitRepositoryRef> refSetter) {
        if (this.ref == null) {
            this.ref = new GitRepositoryRef();
            refSetter.accept(this.ref);
        }

        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    public GitRepositoryRef getRef() {
        return ref;
    }

    public void setRef(GitRepositoryRef ref) {
        this.ref = ref;
    }

    public GitRepositorySpec withSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    public GitRepositorySpec withSecretRef(Consumer<LocalObjectReference> secretRefSetter) {
        if (this.secretRef == null) {
            this.secretRef = new LocalObjectReference();
            secretRefSetter.accept(this.secretRef);
        }

        return this;
    }

    /**
     * Get secretRef
     * @return secretRef
     */
    public LocalObjectReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(LocalObjectReference secretRef) {
        this.secretRef = secretRef;
    }

    public GitRepositorySpec withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 周期性检查仓库更新的时间间隔，格式如 \"1m\" 表示1分钟
     * @return interval
     */
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public GitRepositorySpec withTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Git 操作（如克隆）的超时时间，默认60秒
     * @return timeout
     */
    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GitRepositorySpec that = (GitRepositorySpec) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.ref, that.ref)
            && Objects.equals(this.secretRef, that.secretRef) && Objects.equals(this.interval, that.interval)
            && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, ref, secretRef, interval, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitRepositorySpec {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
