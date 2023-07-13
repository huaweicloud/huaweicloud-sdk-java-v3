package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CN横向扩容/DN分片扩容时必填
 */
public class OpenGaussExpandCluster {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinators")

    private List<OpenGaussCoordinators> coordinators = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard")

    private OpenGaussShard shard;

    public OpenGaussExpandCluster withCoordinators(List<OpenGaussCoordinators> coordinators) {
        this.coordinators = coordinators;
        return this;
    }

    public OpenGaussExpandCluster addCoordinatorsItem(OpenGaussCoordinators coordinatorsItem) {
        if (this.coordinators == null) {
            this.coordinators = new ArrayList<>();
        }
        this.coordinators.add(coordinatorsItem);
        return this;
    }

    public OpenGaussExpandCluster withCoordinators(Consumer<List<OpenGaussCoordinators>> coordinatorsSetter) {
        if (this.coordinators == null) {
            this.coordinators = new ArrayList<>();
        }
        coordinatorsSetter.accept(this.coordinators);
        return this;
    }

    /**
     * CN横向扩容时必填
     * @return coordinators
     */
    public List<OpenGaussCoordinators> getCoordinators() {
        return coordinators;
    }

    public void setCoordinators(List<OpenGaussCoordinators> coordinators) {
        this.coordinators = coordinators;
    }

    public OpenGaussExpandCluster withShard(OpenGaussShard shard) {
        this.shard = shard;
        return this;
    }

    public OpenGaussExpandCluster withShard(Consumer<OpenGaussShard> shardSetter) {
        if (this.shard == null) {
            this.shard = new OpenGaussShard();
            shardSetter.accept(this.shard);
        }

        return this;
    }

    /**
     * Get shard
     * @return shard
     */
    public OpenGaussShard getShard() {
        return shard;
    }

    public void setShard(OpenGaussShard shard) {
        this.shard = shard;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenGaussExpandCluster that = (OpenGaussExpandCluster) obj;
        return Objects.equals(this.coordinators, that.coordinators) && Objects.equals(this.shard, that.shard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinators, shard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenGaussExpandCluster {\n");
        sb.append("    coordinators: ").append(toIndentedString(coordinators)).append("\n");
        sb.append("    shard: ").append(toIndentedString(shard)).append("\n");
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
