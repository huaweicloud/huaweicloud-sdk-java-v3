package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RegisterClusterGroupSpec
 */
public class RegisterClusterGroupSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterIds")

    private List<String> clusterIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RegisterClusterGroupSpec withClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
        return this;
    }

    public RegisterClusterGroupSpec addClusterIdsItem(String clusterIdsItem) {
        if (this.clusterIds == null) {
            this.clusterIds = new ArrayList<>();
        }
        this.clusterIds.add(clusterIdsItem);
        return this;
    }

    public RegisterClusterGroupSpec withClusterIds(Consumer<List<String>> clusterIdsSetter) {
        if (this.clusterIds == null) {
            this.clusterIds = new ArrayList<>();
        }
        clusterIdsSetter.accept(this.clusterIds);
        return this;
    }

    /**
     * 关联的集群id
     * @return clusterIds
     */
    public List<String> getClusterIds() {
        return clusterIds;
    }

    public void setClusterIds(List<String> clusterIds) {
        this.clusterIds = clusterIds;
    }

    public RegisterClusterGroupSpec withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 容器舰队描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterClusterGroupSpec that = (RegisterClusterGroupSpec) obj;
        return Objects.equals(this.clusterIds, that.clusterIds) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterIds, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterClusterGroupSpec {\n");
        sb.append("    clusterIds: ").append(toIndentedString(clusterIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
