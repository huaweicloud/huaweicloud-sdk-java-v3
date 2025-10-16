package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 鉴权范围
 */
public class AuthObjectScope {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private AuthObjectScopeCluster cluster;

    public AuthObjectScope withCluster(AuthObjectScopeCluster cluster) {
        this.cluster = cluster;
        return this;
    }

    public AuthObjectScope withCluster(Consumer<AuthObjectScopeCluster> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new AuthObjectScopeCluster();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    public AuthObjectScopeCluster getCluster() {
        return cluster;
    }

    public void setCluster(AuthObjectScopeCluster cluster) {
        this.cluster = cluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthObjectScope that = (AuthObjectScope) obj;
        return Objects.equals(this.cluster, that.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthObjectScope {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
