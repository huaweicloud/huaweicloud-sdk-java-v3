package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CcspServiceInfo
 */
public class CcspServiceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_num")

    private Integer clusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_quota")

    private Integer instanceQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_distribution")

    private InstanceDistribution instanceDistribution;

    public CcspServiceInfo withClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    /**
     * 当前租户拥有的密码服务集群数量
     * @return clusterNum
     */
    public Integer getClusterNum() {
        return clusterNum;
    }

    public void setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
    }

    public CcspServiceInfo withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 当前租户拥有的密码服务实例数量
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public CcspServiceInfo withInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
        return this;
    }

    /**
     * 当前租户的可创建的密码服务实例配额数
     * @return instanceQuota
     */
    public Integer getInstanceQuota() {
        return instanceQuota;
    }

    public void setInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
    }

    public CcspServiceInfo withInstanceDistribution(InstanceDistribution instanceDistribution) {
        this.instanceDistribution = instanceDistribution;
        return this;
    }

    public CcspServiceInfo withInstanceDistribution(Consumer<InstanceDistribution> instanceDistributionSetter) {
        if (this.instanceDistribution == null) {
            this.instanceDistribution = new InstanceDistribution();
            instanceDistributionSetter.accept(this.instanceDistribution);
        }

        return this;
    }

    /**
     * Get instanceDistribution
     * @return instanceDistribution
     */
    public InstanceDistribution getInstanceDistribution() {
        return instanceDistribution;
    }

    public void setInstanceDistribution(InstanceDistribution instanceDistribution) {
        this.instanceDistribution = instanceDistribution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CcspServiceInfo that = (CcspServiceInfo) obj;
        return Objects.equals(this.clusterNum, that.clusterNum) && Objects.equals(this.instanceNum, that.instanceNum)
            && Objects.equals(this.instanceQuota, that.instanceQuota)
            && Objects.equals(this.instanceDistribution, that.instanceDistribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterNum, instanceNum, instanceQuota, instanceDistribution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CcspServiceInfo {\n");
        sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    instanceQuota: ").append(toIndentedString(instanceQuota)).append("\n");
        sb.append("    instanceDistribution: ").append(toIndentedString(instanceDistribution)).append("\n");
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
