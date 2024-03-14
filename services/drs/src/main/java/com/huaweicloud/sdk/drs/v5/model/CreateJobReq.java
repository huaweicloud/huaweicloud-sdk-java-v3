package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建单个任务请求体。
 */
public class CreateJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private JobBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint")

    private List<JobEndpointInfo> sourceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private List<JobEndpointInfo> targetEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_order")

    private PeriodOrderInfo periodOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_info")

    private JobNodeInfo nodeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_list")

    private List<PublicIpConfig> publicIpList = null;

    public CreateJobReq withBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public CreateJobReq withBaseInfo(Consumer<JobBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new JobBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public JobBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public CreateJobReq withSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public CreateJobReq addSourceEndpointItem(JobEndpointInfo sourceEndpointItem) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        this.sourceEndpoint.add(sourceEndpointItem);
        return this;
    }

    public CreateJobReq withSourceEndpoint(Consumer<List<JobEndpointInfo>> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        sourceEndpointSetter.accept(this.sourceEndpoint);
        return this;
    }

    /**
     * 创建任务数据库信息体。
     * @return sourceEndpoint
     */
    public List<JobEndpointInfo> getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public CreateJobReq withTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public CreateJobReq addTargetEndpointItem(JobEndpointInfo targetEndpointItem) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        this.targetEndpoint.add(targetEndpointItem);
        return this;
    }

    public CreateJobReq withTargetEndpoint(Consumer<List<JobEndpointInfo>> targetEndpointSetter) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        targetEndpointSetter.accept(this.targetEndpoint);
        return this;
    }

    /**
     * 创建任务数据库信息体。
     * @return targetEndpoint
     */
    public List<JobEndpointInfo> getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public CreateJobReq withPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
        return this;
    }

    public CreateJobReq withPeriodOrder(Consumer<PeriodOrderInfo> periodOrderSetter) {
        if (this.periodOrder == null) {
            this.periodOrder = new PeriodOrderInfo();
            periodOrderSetter.accept(this.periodOrder);
        }

        return this;
    }

    /**
     * Get periodOrder
     * @return periodOrder
     */
    public PeriodOrderInfo getPeriodOrder() {
        return periodOrder;
    }

    public void setPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
    }

    public CreateJobReq withNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public CreateJobReq withNodeInfo(Consumer<JobNodeInfo> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new JobNodeInfo();
            nodeInfoSetter.accept(this.nodeInfo);
        }

        return this;
    }

    /**
     * Get nodeInfo
     * @return nodeInfo
     */
    public JobNodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public CreateJobReq withPublicIpList(List<PublicIpConfig> publicIpList) {
        this.publicIpList = publicIpList;
        return this;
    }

    public CreateJobReq addPublicIpListItem(PublicIpConfig publicIpListItem) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        this.publicIpList.add(publicIpListItem);
        return this;
    }

    public CreateJobReq withPublicIpList(Consumer<List<PublicIpConfig>> publicIpListSetter) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        publicIpListSetter.accept(this.publicIpList);
        return this;
    }

    /**
     * 指定公网IP的信息
     * @return publicIpList
     */
    public List<PublicIpConfig> getPublicIpList() {
        return publicIpList;
    }

    public void setPublicIpList(List<PublicIpConfig> publicIpList) {
        this.publicIpList = publicIpList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateJobReq that = (CreateJobReq) obj;
        return Objects.equals(this.baseInfo, that.baseInfo) && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.targetEndpoint, that.targetEndpoint)
            && Objects.equals(this.periodOrder, that.periodOrder) && Objects.equals(this.nodeInfo, that.nodeInfo)
            && Objects.equals(this.publicIpList, that.publicIpList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseInfo, sourceEndpoint, targetEndpoint, periodOrder, nodeInfo, publicIpList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateJobReq {\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    periodOrder: ").append(toIndentedString(periodOrder)).append("\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
        sb.append("    publicIpList: ").append(toIndentedString(publicIpList)).append("\n");
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
