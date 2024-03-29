package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DisassociateConnectionQueueReq
 */
public class DisassociateConnectionQueueReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<String> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pools")

    private List<String> elasticResourcePools = null;

    public DisassociateConnectionQueueReq withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    public DisassociateConnectionQueueReq addQueuesItem(String queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public DisassociateConnectionQueueReq withQueues(Consumer<List<String>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 需要使用跨源的队列名列表。
     * @return queues
     */
    public List<String> getQueues() {
        return queues;
    }

    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    public DisassociateConnectionQueueReq withElasticResourcePools(List<String> elasticResourcePools) {
        this.elasticResourcePools = elasticResourcePools;
        return this;
    }

    public DisassociateConnectionQueueReq addElasticResourcePoolsItem(String elasticResourcePoolsItem) {
        if (this.elasticResourcePools == null) {
            this.elasticResourcePools = new ArrayList<>();
        }
        this.elasticResourcePools.add(elasticResourcePoolsItem);
        return this;
    }

    public DisassociateConnectionQueueReq withElasticResourcePools(Consumer<List<String>> elasticResourcePoolsSetter) {
        if (this.elasticResourcePools == null) {
            this.elasticResourcePools = new ArrayList<>();
        }
        elasticResourcePoolsSetter.accept(this.elasticResourcePools);
        return this;
    }

    /**
     * 需要使用跨源的弹性资源池名列表。
     * @return elasticResourcePools
     */
    public List<String> getElasticResourcePools() {
        return elasticResourcePools;
    }

    public void setElasticResourcePools(List<String> elasticResourcePools) {
        this.elasticResourcePools = elasticResourcePools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateConnectionQueueReq that = (DisassociateConnectionQueueReq) obj;
        return Objects.equals(this.queues, that.queues)
            && Objects.equals(this.elasticResourcePools, that.elasticResourcePools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queues, elasticResourcePools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateConnectionQueueReq {\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    elasticResourcePools: ").append(toIndentedString(elasticResourcePools)).append("\n");
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
