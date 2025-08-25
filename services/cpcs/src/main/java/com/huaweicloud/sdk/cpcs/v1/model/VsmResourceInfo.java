package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VsmResourceInfo
 */
public class VsmResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_num")

    private Integer clusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpcs_cluster_num")

    private Integer cpcsClusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_num")

    private Integer instanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpcs_instance_num")

    private Integer cpcsInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_quota")

    private Integer instanceQuota;

    public VsmResourceInfo withClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    /**
     * 当前租户拥有的vsm集群数量
     * @return clusterNum
     */
    public Integer getClusterNum() {
        return clusterNum;
    }

    public void setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
    }

    public VsmResourceInfo withCpcsClusterNum(Integer cpcsClusterNum) {
        this.cpcsClusterNum = cpcsClusterNum;
        return this;
    }

    /**
     * 当前租户名下由cpcs代创建和管理的vsm集群数量
     * @return cpcsClusterNum
     */
    public Integer getCpcsClusterNum() {
        return cpcsClusterNum;
    }

    public void setCpcsClusterNum(Integer cpcsClusterNum) {
        this.cpcsClusterNum = cpcsClusterNum;
    }

    public VsmResourceInfo withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    /**
     * 当前租户拥有的vsm实例总数
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public VsmResourceInfo withCpcsInstanceNum(Integer cpcsInstanceNum) {
        this.cpcsInstanceNum = cpcsInstanceNum;
        return this;
    }

    /**
     * 当前租户名下由cpcs代创建和管理的vsm实例总数
     * @return cpcsInstanceNum
     */
    public Integer getCpcsInstanceNum() {
        return cpcsInstanceNum;
    }

    public void setCpcsInstanceNum(Integer cpcsInstanceNum) {
        this.cpcsInstanceNum = cpcsInstanceNum;
    }

    public VsmResourceInfo withInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
        return this;
    }

    /**
     * 当前租户被分配的vsm实例配额数
     * @return instanceQuota
     */
    public Integer getInstanceQuota() {
        return instanceQuota;
    }

    public void setInstanceQuota(Integer instanceQuota) {
        this.instanceQuota = instanceQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VsmResourceInfo that = (VsmResourceInfo) obj;
        return Objects.equals(this.clusterNum, that.clusterNum)
            && Objects.equals(this.cpcsClusterNum, that.cpcsClusterNum)
            && Objects.equals(this.instanceNum, that.instanceNum)
            && Objects.equals(this.cpcsInstanceNum, that.cpcsInstanceNum)
            && Objects.equals(this.instanceQuota, that.instanceQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterNum, cpcsClusterNum, instanceNum, cpcsInstanceNum, instanceQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VsmResourceInfo {\n");
        sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
        sb.append("    cpcsClusterNum: ").append(toIndentedString(cpcsClusterNum)).append("\n");
        sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
        sb.append("    cpcsInstanceNum: ").append(toIndentedString(cpcsInstanceNum)).append("\n");
        sb.append("    instanceQuota: ").append(toIndentedString(instanceQuota)).append("\n");
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
