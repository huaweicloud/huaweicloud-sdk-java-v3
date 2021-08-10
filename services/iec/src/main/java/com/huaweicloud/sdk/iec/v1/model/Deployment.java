package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 部署计划对象 */
public class Deployment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distribution")

    private List<Distribution> distribution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgecloud")

    private DeploymentEdgecloud edgecloud;

    public Deployment withId(String id) {
        this.id = id;
        return this;
    }

    /** 部署计划ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Deployment withDistribution(List<Distribution> distribution) {
        this.distribution = distribution;
        return this;
    }

    public Deployment addDistributionItem(Distribution distributionItem) {
        if (this.distribution == null) {
            this.distribution = new ArrayList<>();
        }
        this.distribution.add(distributionItem);
        return this;
    }

    public Deployment withDistribution(Consumer<List<Distribution>> distributionSetter) {
        if (this.distribution == null) {
            this.distribution = new ArrayList<>();
        }
        distributionSetter.accept(this.distribution);
        return this;
    }

    /** 部署位置信息列表
     * 
     * @return distribution */
    public List<Distribution> getDistribution() {
        return distribution;
    }

    public void setDistribution(List<Distribution> distribution) {
        this.distribution = distribution;
    }

    public Deployment withEdgecloud(DeploymentEdgecloud edgecloud) {
        this.edgecloud = edgecloud;
        return this;
    }

    public Deployment withEdgecloud(Consumer<DeploymentEdgecloud> edgecloudSetter) {
        if (this.edgecloud == null) {
            this.edgecloud = new DeploymentEdgecloud();
            edgecloudSetter.accept(this.edgecloud);
        }

        return this;
    }

    /** Get edgecloud
     * 
     * @return edgecloud */
    public DeploymentEdgecloud getEdgecloud() {
        return edgecloud;
    }

    public void setEdgecloud(DeploymentEdgecloud edgecloud) {
        this.edgecloud = edgecloud;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Deployment deployment = (Deployment) o;
        return Objects.equals(this.id, deployment.id) && Objects.equals(this.distribution, deployment.distribution)
            && Objects.equals(this.edgecloud, deployment.edgecloud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, distribution, edgecloud);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Deployment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
        sb.append("    edgecloud: ").append(toIndentedString(edgecloud)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
