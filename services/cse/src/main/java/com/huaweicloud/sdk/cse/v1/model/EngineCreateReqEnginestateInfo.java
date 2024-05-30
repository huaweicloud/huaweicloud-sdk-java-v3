package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 引擎状态信息
 */
public class EngineCreateReqEnginestateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private Boolean cluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "twinClusters")

    private Boolean twinClusters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "singleEngine")

    private Boolean singleEngine;

    public EngineCreateReqEnginestateInfo withCluster(Boolean cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * 集群
     * @return cluster
     */
    public Boolean getCluster() {
        return cluster;
    }

    public void setCluster(Boolean cluster) {
        this.cluster = cluster;
    }

    public EngineCreateReqEnginestateInfo withTwinClusters(Boolean twinClusters) {
        this.twinClusters = twinClusters;
        return this;
    }

    /**
     * 双子集群
     * @return twinClusters
     */
    public Boolean getTwinClusters() {
        return twinClusters;
    }

    public void setTwinClusters(Boolean twinClusters) {
        this.twinClusters = twinClusters;
    }

    public EngineCreateReqEnginestateInfo withSingleEngine(Boolean singleEngine) {
        this.singleEngine = singleEngine;
        return this;
    }

    /**
     * 单引擎
     * @return singleEngine
     */
    public Boolean getSingleEngine() {
        return singleEngine;
    }

    public void setSingleEngine(Boolean singleEngine) {
        this.singleEngine = singleEngine;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EngineCreateReqEnginestateInfo that = (EngineCreateReqEnginestateInfo) obj;
        return Objects.equals(this.cluster, that.cluster) && Objects.equals(this.twinClusters, that.twinClusters)
            && Objects.equals(this.singleEngine, that.singleEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster, twinClusters, singleEngine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EngineCreateReqEnginestateInfo {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    twinClusters: ").append(toIndentedString(twinClusters)).append("\n");
        sb.append("    singleEngine: ").append(toIndentedString(singleEngine)).append("\n");
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
