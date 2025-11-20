package com.huaweicloud.sdk.cce.v3.model;

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
public class CreateKubernetesClusterCertResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferences")

    private Object preferences;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<Clusters> clusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<Users> users = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contexts")

    private List<Contexts> contexts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current-context")

    private String currentContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Port-ID")

    private String portID;

    public CreateKubernetesClusterCertResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型 **约束限制**： 该值不可修改 **取值范围**： 不涉及 **默认取值**： Config 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreateKubernetesClusterCertResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本 **约束限制**： 该值不可修改 **取值范围**： 不涉及 **默认取值**： v1 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateKubernetesClusterCertResponse withPreferences(Object preferences) {
        this.preferences = preferences;
        return this;
    }

    /**
     * **参数解释**： 当前未使用该字段 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 默认为空 
     * @return preferences
     */
    public Object getPreferences() {
        return preferences;
    }

    public void setPreferences(Object preferences) {
        this.preferences = preferences;
    }

    public CreateKubernetesClusterCertResponse withClusters(List<Clusters> clusters) {
        this.clusters = clusters;
        return this;
    }

    public CreateKubernetesClusterCertResponse addClustersItem(Clusters clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public CreateKubernetesClusterCertResponse withClusters(Consumer<List<Clusters>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * **参数解释**： 集群列表。 **约束限制**： 不涉及 
     * @return clusters
     */
    public List<Clusters> getClusters() {
        return clusters;
    }

    public void setClusters(List<Clusters> clusters) {
        this.clusters = clusters;
    }

    public CreateKubernetesClusterCertResponse withUsers(List<Users> users) {
        this.users = users;
        return this;
    }

    public CreateKubernetesClusterCertResponse addUsersItem(Users usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CreateKubernetesClusterCertResponse withUsers(Consumer<List<Users>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * **参数解释**： 存放了指定用户的一些证书信息和ClientKey信息。 **约束限制**： 不涉及 
     * @return users
     */
    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public CreateKubernetesClusterCertResponse withContexts(List<Contexts> contexts) {
        this.contexts = contexts;
        return this;
    }

    public CreateKubernetesClusterCertResponse addContextsItem(Contexts contextsItem) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        this.contexts.add(contextsItem);
        return this;
    }

    public CreateKubernetesClusterCertResponse withContexts(Consumer<List<Contexts>> contextsSetter) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        contextsSetter.accept(this.contexts);
        return this;
    }

    /**
     * **参数解释**： 上下文列表。 **约束限制**： 不涉及 
     * @return contexts
     */
    public List<Contexts> getContexts() {
        return contexts;
    }

    public void setContexts(List<Contexts> contexts) {
        this.contexts = contexts;
    }

    public CreateKubernetesClusterCertResponse withCurrentContext(String currentContext) {
        this.currentContext = currentContext;
        return this;
    }

    /**
     * **参数解释**： 当前上下文 **约束限制**： 不涉及 **取值范围**： - external：公网访问  - internal：私网访问  **默认取值**： - 若存在publicIp（虚拟机弹性IP）时为 external。 - 若不存在publicIp为 internal。 
     * @return currentContext
     */
    public String getCurrentContext() {
        return currentContext;
    }

    public void setCurrentContext(String currentContext) {
        this.currentContext = currentContext;
    }

    public CreateKubernetesClusterCertResponse withPortID(String portID) {
        this.portID = portID;
        return this;
    }

    /**
     * Get portID
     * @return portID
     */
    public String getPortID() {
        return portID;
    }

    public void setPortID(String portID) {
        this.portID = portID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateKubernetesClusterCertResponse that = (CreateKubernetesClusterCertResponse) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.preferences, that.preferences) && Objects.equals(this.clusters, that.clusters)
            && Objects.equals(this.users, that.users) && Objects.equals(this.contexts, that.contexts)
            && Objects.equals(this.currentContext, that.currentContext) && Objects.equals(this.portID, that.portID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, preferences, clusters, users, contexts, currentContext, portID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateKubernetesClusterCertResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
        sb.append("    currentContext: ").append(toIndentedString(currentContext)).append("\n");
        sb.append("    portID: ").append(toIndentedString(portID)).append("\n");
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
