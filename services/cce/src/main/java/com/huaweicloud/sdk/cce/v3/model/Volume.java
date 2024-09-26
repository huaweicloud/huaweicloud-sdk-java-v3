package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Volume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumetype")

    private String volumetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throughput")

    private Integer throughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private Map<String, Object> extendParam = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private String clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw:passthrough")

    private Boolean hwPassthrough;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private VolumeMetadata metadata;

    public Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小，单位为GB  - 系统盘取值范围：40~1024 [- 数据盘取值范围：100~32768](tag:sbc,hk_sbc,ctc,cmcc,g42,tm,hk_tm,hk_g42,hcso) [- 第一块数据盘取值范围：20~32768(当缺省磁盘初始化配置管理参数storage时，数据盘取值范围：100-32768)](tag:hws,hws_hk) [- 第一块数据盘取值范围：100~32768](tag:hcs) [- 其他数据盘取值范围：10~32768(当缺省磁盘初始化配置管理参数storage时，数据盘取值范围：100-32768)](tag:hws,hws_hk,hcs)
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Volume withVolumetype(String volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    /**
     * 磁盘类型，取值请参见创建云服务器 中“root_volume字段数据结构说明”。  - SAS：高IO，是指由SAS存储提供资源的磁盘类型。 - SSD：超高IO，是指由SSD存储提供资源的磁盘类型。 - SATA：普通IO，是指由SATA存储提供资源的磁盘类型。EVS已下线SATA磁盘，仅存量节点有此类型的磁盘。 [- ESSD：通用型SSD云硬盘，是指由SSD存储提供资源的磁盘类型。](tag:hws) [- GPSDD：通用型SSD云硬盘，是指由SSD存储提供资源的磁盘类型。](tag:hws) [- ESSD2：极速型SSD V2云硬盘，是指由极速型SSD V2存储提供资源的磁盘类型。](tag:hws) [- GPSSD2：通用型SSD V2云硬盘，是指由通用型SSD V2存储提供资源的磁盘类型。](tag:hws) [> 了解不同磁盘类型的详细信息，链接请参见[创建云服务器](https://support.huaweicloud.com/productdesc-evs/zh-cn_topic_0044524691.html)。](tag:hws)
     * @return volumetype
     */
    public String getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(String volumetype) {
        this.volumetype = volumetype;
    }

    public Volume withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * 给云硬盘配置iops，购买GPSSD2、ESSD2类型的云硬盘时必填，其他类型不能设置。 > - 只支持按需计费。 > - 了解GPSSD2、ESSD2类型的iops大小范围，请参见[云硬盘类型及性能介绍里面的云硬盘性能数据表](https://support.huaweicloud.com/productdesc-evs/zh-cn_topic_0044524691.html)。
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public Volume withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * 给云硬盘配置吞吐量，单位是MiB/s，购买GPSSD2类型云硬盘时必填，其他类型不能设置。 > - 只支持按需计费。 > - 了解GPSSD2类型的吞吐量大小范围，请参见[云硬盘类型及性能介绍里面的云硬盘性能数据表](https://support.huaweicloud.com/productdesc-evs/zh-cn_topic_0044524691.html)。
     * @return throughput
     */
    public Integer getThroughput() {
        return throughput;
    }

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    public Volume withExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public Volume putExtendParamItem(String key, Object extendParamItem) {
        if (this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        this.extendParam.put(key, extendParamItem);
        return this;
    }

    public Volume withExtendParam(Consumer<Map<String, Object>> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        extendParamSetter.accept(this.extendParam);
        return this;
    }

    /**
     * 磁盘扩展参数，取值请参见创建云服务器中“extendparam”参数的描述。 [链接请参见[创建云服务器](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0020212668.html)](tag:hws) [链接请参见[创建云服务器](https://support.huaweicloud.com/intl/zh-cn/api-ecs/zh-cn_topic_0020212668.html)](tag:hws_hk) 
     * @return extendParam
     */
    public Map<String, Object> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
    }

    public Volume withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 云服务器系统盘对应的存储池的ID。仅用作专属云集群，专属分布式存储DSS的存储池ID，即dssPoolID。  [获取方法请参见[获取单个专属分布式存储池详情](https://support.huaweicloud.com/api-dss/dss_02_1001.html)中“表3 响应参数”的ID字段。](tag:hws) [获取方法请参见[获取单个专属分布式存储池详情](https://support.huaweicloud.com/intl/zh-cn/api-dss/dss_02_1001.html)中“表3 响应参数”的ID字段。](tag:hws_hk)
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Volume withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 云服务器系统盘对应的磁盘存储类型。仅用作专属云集群，固定取值为dss。  
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    public Volume withHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    /**
     * - 使用SDI规格创建虚拟机时请关注该参数，如果该参数值为true，说明创建的为SCSI类型的卷 - 节点池类型为ElasticBMS时，此参数必须填写为true - 如存在节点规格涉及本地盘并同时使用云硬盘场景时，请设置磁盘初始化配置管理参数，参见[节点磁盘挂载](node_storage_example.xml)。 
     * @return hwPassthrough
     */
    public Boolean getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    public Volume withMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Volume withMetadata(Consumer<VolumeMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new VolumeMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public VolumeMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Volume that = (Volume) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.volumetype, that.volumetype)
            && Objects.equals(this.iops, that.iops) && Objects.equals(this.throughput, that.throughput)
            && Objects.equals(this.extendParam, that.extendParam) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.hwPassthrough, that.hwPassthrough) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(size, volumetype, iops, throughput, extendParam, clusterId, clusterType, hwPassthrough, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    hwPassthrough: ").append(toIndentedString(hwPassthrough)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
