package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClusterExtendParam
 */
public class ClusterExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterAZ")

    private String clusterAZ;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dssMasterVolumes")

    private String dssMasterVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubeProxyMode")

    private String kubeProxyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterExternalIP")

    private String clusterExternalIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/fixPoolMask")

    private String alphaCceFixPoolMask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decMasterFlavor")

    private String decMasterFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerUmaskMode")

    private String dockerUmaskMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetes.io/cpuManagerPolicy")

    private String kubernetesIoCpuManagerPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderID")

    private String orderID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodType")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodNum")

    private Integer periodNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoRenew")

    private String isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAutoPay")

    private String isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgradefrom")

    private String upgradefrom;

    public ClusterExtendParam withClusterAZ(String clusterAZ) {
        this.clusterAZ = clusterAZ;
        return this;
    }

    /**
     * 集群控制节点可用区配置。  [CCE支持的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/endpoint?CCE)](tag:hws) [CCE支持的可用区请参考[地区和终端节点](https://developer.huaweicloud.com/intl/zh-cn/endpoint?CCE)](tag:hws_hk)    - multi_az：多可用区，可选。仅使用高可用集群时才可以配置多可用区。 - 专属云计算池可用区：用于指定专属云可用区部署集群控制节点。如果需配置专属CCE集群，该字段为必选。 
     * @return clusterAZ
     */
    public String getClusterAZ() {
        return clusterAZ;
    }

    public void setClusterAZ(String clusterAZ) {
        this.clusterAZ = clusterAZ;
    }

    public ClusterExtendParam withDssMasterVolumes(String dssMasterVolumes) {
        this.dssMasterVolumes = dssMasterVolumes;
        return this;
    }

    /**
     * 用于指定控制节点的系统盘和数据盘使用专属分布式存储，未指定或者值为空时，默认使用EVS云硬盘。  如果配置专属CCE集群，该字段为必选，请按照如下格式设置：  ``` <rootVol.dssPoolID>.<rootVol.volType>;<dataVol.dssPoolID>.<dataVol.volType> ```  字段说明： - rootVol为系统盘；dataVol为数据盘； - dssPoolID为专属分布式存储池ID； - volType为专属分布式存储池的存储类型，如SAS、SSD。  样例：c950ee97-587c-4f24-8a74-3367e3da570f.sas;6edbc2f4-1507-44f8-ac0d-eed1d2608d38.ssd  > 非专属CCE集群不支持配置该字段。 
     * @return dssMasterVolumes
     */
    public String getDssMasterVolumes() {
        return dssMasterVolumes;
    }

    public void setDssMasterVolumes(String dssMasterVolumes) {
        this.dssMasterVolumes = dssMasterVolumes;
    }

    public ClusterExtendParam withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 集群所属的企业项目ID。 >   - 需要开通企业项目功能后才可配置企业项目。 >   - 集群所属的企业项目与集群下所关联的其他云服务资源所属的企业项目必须保持一致。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ClusterExtendParam withKubeProxyMode(String kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
        return this;
    }

    /**
     * 服务转发模式，支持以下两种实现：  - iptables：社区传统的kube-proxy模式，完全以iptables规则的方式来实现service负载均衡。该方式最主要的问题是在服务多的时候产生太多的iptables规则，非增量式更新会引入一定的时延，大规模情况下有明显的性能问题 - ipvs：主导开发并在社区获得广泛支持的kube-proxy模式，采用增量式更新，吞吐更高，速度更快，并可以保证service更新期间连接保持不断开，适用于大规模场景。  > 此参数已废弃，若同时指定此参数和ClusterSpec下的kubeProxyMode，以ClusterSpec下的为准。 
     * @return kubeProxyMode
     */
    public String getKubeProxyMode() {
        return kubeProxyMode;
    }

    public void setKubeProxyMode(String kubeProxyMode) {
        this.kubeProxyMode = kubeProxyMode;
    }

    public ClusterExtendParam withClusterExternalIP(String clusterExternalIP) {
        this.clusterExternalIP = clusterExternalIP;
        return this;
    }

    /**
     * **参数解释：** 集群控制节点弹性公网IP，绑定后可以通过该弹性公网IP访问集群管控面API。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return clusterExternalIP
     */
    public String getClusterExternalIP() {
        return clusterExternalIP;
    }

    public void setClusterExternalIP(String clusterExternalIP) {
        this.clusterExternalIP = clusterExternalIP;
    }

    public ClusterExtendParam withAlphaCceFixPoolMask(String alphaCceFixPoolMask) {
        this.alphaCceFixPoolMask = alphaCceFixPoolMask;
        return this;
    }

    /**
     * 容器网络固定IP池掩码位数，仅vpc-router网络支持。  该参数决定节点可分配容器IP数量，与创建节点时设置的maxPods参数共同决定节点最多可以创建多少个Pod， 具体请参见[节点最多可以创建多少Pod](maxPods.xml)。   整数字符传取值范围: 24 ~ 28 
     * @return alphaCceFixPoolMask
     */
    public String getAlphaCceFixPoolMask() {
        return alphaCceFixPoolMask;
    }

    public void setAlphaCceFixPoolMask(String alphaCceFixPoolMask) {
        this.alphaCceFixPoolMask = alphaCceFixPoolMask;
    }

    public ClusterExtendParam withDecMasterFlavor(String decMasterFlavor) {
        this.decMasterFlavor = decMasterFlavor;
        return this;
    }

    /**
     * 专属CCE集群指定可控制节点的规格。
     * @return decMasterFlavor
     */
    public String getDecMasterFlavor() {
        return decMasterFlavor;
    }

    public void setDecMasterFlavor(String decMasterFlavor) {
        this.decMasterFlavor = decMasterFlavor;
    }

    public ClusterExtendParam withDockerUmaskMode(String dockerUmaskMode) {
        this.dockerUmaskMode = dockerUmaskMode;
        return this;
    }

    /**
     * 集群默认Docker的UmaskMode配置，可取值为secure或normal，不指定时默认为normal。 
     * @return dockerUmaskMode
     */
    public String getDockerUmaskMode() {
        return dockerUmaskMode;
    }

    public void setDockerUmaskMode(String dockerUmaskMode) {
        this.dockerUmaskMode = dockerUmaskMode;
    }

    public ClusterExtendParam withKubernetesIoCpuManagerPolicy(String kubernetesIoCpuManagerPolicy) {
        this.kubernetesIoCpuManagerPolicy = kubernetesIoCpuManagerPolicy;
        return this;
    }

    /**
     * 集群CPU管理策略。取值为none（或空值）或static，默认为none（或空值）。 - none(或空值)：关闭工作负载实例独占CPU核的功能，优点是CPU共享池的可分配核数较多 - static：支持给节点上的工作负载实例配置CPU独占，适用于对CPU缓存和调度延迟敏感的工作负载[，Turbo集群下仅对普通容器节点有效，安全容器节点无效](tag:hws,hws_hk,dt,g42,sbc)。 
     * @return kubernetesIoCpuManagerPolicy
     */
    public String getKubernetesIoCpuManagerPolicy() {
        return kubernetesIoCpuManagerPolicy;
    }

    public void setKubernetesIoCpuManagerPolicy(String kubernetesIoCpuManagerPolicy) {
        this.kubernetesIoCpuManagerPolicy = kubernetesIoCpuManagerPolicy;
    }

    public ClusterExtendParam withOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }

    /**
     * 订单ID，集群付费类型为自动付费包周期类型时，响应中会返回此字段(仅创建场景涉及)。
     * @return orderID
     */
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public ClusterExtendParam withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * - month：月 - year：年 > 作为请求参数，billingMode为1（包周期）时生效，且为必选。 > 作为响应参数，仅在创建包周期集群时返回。 
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ClusterExtendParam withPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
        return this;
    }

    /**
     * 订购周期数，取值范围： - periodType=month（周期类型为月）时，取值为[1-9]。 - periodType=year（周期类型为年）时，取值为1-3。 > 作为请求参数，billingMode为1时生效，且为必选。 > 作为响应参数，仅在创建包周期集群时返回。 
     * @return periodNum
     */
    public Integer getPeriodNum() {
        return periodNum;
    }

    public void setPeriodNum(Integer periodNum) {
        this.periodNum = periodNum;
    }

    public ClusterExtendParam withIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 是否自动续订 - “true”：自动续订 - “false”：不自动续订 > billingMode为1时生效，不填写此参数时默认不会自动续费。 
     * @return isAutoRenew
     */
    public String getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(String isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ClusterExtendParam withIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否自动扣款 - “true”：自动扣款 - “false”：不自动扣款 > billingMode为1时生效，不填写此参数时默认不会自动扣款。 
     * @return isAutoPay
     */
    public String getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(String isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public ClusterExtendParam withUpgradefrom(String upgradefrom) {
        this.upgradefrom = upgradefrom;
        return this;
    }

    /**
     * **参数解释：** 记录集群通过何种升级方式升级到当前版本。 **约束限制：** 仅查询接口返回该字段 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return upgradefrom
     */
    public String getUpgradefrom() {
        return upgradefrom;
    }

    public void setUpgradefrom(String upgradefrom) {
        this.upgradefrom = upgradefrom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterExtendParam that = (ClusterExtendParam) obj;
        return Objects.equals(this.clusterAZ, that.clusterAZ)
            && Objects.equals(this.dssMasterVolumes, that.dssMasterVolumes)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.kubeProxyMode, that.kubeProxyMode)
            && Objects.equals(this.clusterExternalIP, that.clusterExternalIP)
            && Objects.equals(this.alphaCceFixPoolMask, that.alphaCceFixPoolMask)
            && Objects.equals(this.decMasterFlavor, that.decMasterFlavor)
            && Objects.equals(this.dockerUmaskMode, that.dockerUmaskMode)
            && Objects.equals(this.kubernetesIoCpuManagerPolicy, that.kubernetesIoCpuManagerPolicy)
            && Objects.equals(this.orderID, that.orderID) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.periodNum, that.periodNum) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.isAutoPay, that.isAutoPay) && Objects.equals(this.upgradefrom, that.upgradefrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterAZ,
            dssMasterVolumes,
            enterpriseProjectId,
            kubeProxyMode,
            clusterExternalIP,
            alphaCceFixPoolMask,
            decMasterFlavor,
            dockerUmaskMode,
            kubernetesIoCpuManagerPolicy,
            orderID,
            periodType,
            periodNum,
            isAutoRenew,
            isAutoPay,
            upgradefrom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterExtendParam {\n");
        sb.append("    clusterAZ: ").append(toIndentedString(clusterAZ)).append("\n");
        sb.append("    dssMasterVolumes: ").append(toIndentedString(dssMasterVolumes)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    kubeProxyMode: ").append(toIndentedString(kubeProxyMode)).append("\n");
        sb.append("    clusterExternalIP: ").append(toIndentedString(clusterExternalIP)).append("\n");
        sb.append("    alphaCceFixPoolMask: ").append(toIndentedString(alphaCceFixPoolMask)).append("\n");
        sb.append("    decMasterFlavor: ").append(toIndentedString(decMasterFlavor)).append("\n");
        sb.append("    dockerUmaskMode: ").append(toIndentedString(dockerUmaskMode)).append("\n");
        sb.append("    kubernetesIoCpuManagerPolicy: ")
            .append(toIndentedString(kubernetesIoCpuManagerPolicy))
            .append("\n");
        sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    periodNum: ").append(toIndentedString(periodNum)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    upgradefrom: ").append(toIndentedString(upgradefrom)).append("\n");
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
