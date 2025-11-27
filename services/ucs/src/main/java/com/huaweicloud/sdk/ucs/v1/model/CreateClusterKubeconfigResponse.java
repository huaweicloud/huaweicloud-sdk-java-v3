package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateClusterKubeconfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<NamedCluster> clusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<NamedAuthInfo> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contexts")

    private List<NamedContext> contexts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-context")

    private String currentContext;

    public CreateClusterKubeconfigResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“Config”，该值不可修改
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateClusterKubeconfigResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v1”，该值不可修改
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateClusterKubeconfigResponse withClusters(List<NamedCluster> clusters) {
        this.clusters = clusters;
        return this;
    }

    public CreateClusterKubeconfigResponse addClustersItem(NamedCluster clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public CreateClusterKubeconfigResponse withClusters(Consumer<List<NamedCluster>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 集群列表
     * @return clusters
     */
    public List<NamedCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<NamedCluster> clusters) {
        this.clusters = clusters;
    }

    public CreateClusterKubeconfigResponse withUsers(List<NamedAuthInfo> users) {
        this.users = users;
        return this;
    }

    public CreateClusterKubeconfigResponse addUsersItem(NamedAuthInfo usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CreateClusterKubeconfigResponse withUsers(Consumer<List<NamedAuthInfo>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 存放了指定用户的一些证书信息和ClientKey信息
     * @return users
     */
    public List<NamedAuthInfo> getUsers() {
        return users;
    }

    public void setUsers(List<NamedAuthInfo> users) {
        this.users = users;
    }

    public CreateClusterKubeconfigResponse withContexts(List<NamedContext> contexts) {
        this.contexts = contexts;
        return this;
    }

    public CreateClusterKubeconfigResponse addContextsItem(NamedContext contextsItem) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        this.contexts.add(contextsItem);
        return this;
    }

    public CreateClusterKubeconfigResponse withContexts(Consumer<List<NamedContext>> contextsSetter) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        contextsSetter.accept(this.contexts);
        return this;
    }

    /**
     * 上下文列表
     * @return contexts
     */
    public List<NamedContext> getContexts() {
        return contexts;
    }

    public void setContexts(List<NamedContext> contexts) {
        this.contexts = contexts;
    }

    public CreateClusterKubeconfigResponse withCurrentContext(String currentContext) {
        this.currentContext = currentContext;
        return this;
    }

    /**
     * 当前上下文
     * @return currentContext
     */
    public String getCurrentContext() {
        return currentContext;
    }

    public void setCurrentContext(String currentContext) {
        this.currentContext = currentContext;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterKubeconfigResponse that = (CreateClusterKubeconfigResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.clusters, that.clusters) && Objects.equals(this.users, that.users)
            && Objects.equals(this.contexts, that.contexts) && Objects.equals(this.currentContext, that.currentContext);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, clusters, users, contexts, currentContext);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterKubeconfigResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
        sb.append("    currentContext: ").append(toIndentedString(currentContext)).append("\n");
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
