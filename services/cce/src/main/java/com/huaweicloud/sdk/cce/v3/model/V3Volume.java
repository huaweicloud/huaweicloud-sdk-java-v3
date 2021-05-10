package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.VolumeMetadata;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class V3Volume  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volumetype")
    
    private String volumetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendParam")
    
    private Map<String, Object> extendParam = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_type")
    
    private String clusterType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hw:passthrough")
    
    private Boolean hwPassthrough;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private VolumeMetadata metadata;

    public V3Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小，单位为GB  - 系统盘取值范围：40~1024 - 数据盘取值范围：100~32768
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public V3Volume withVolumetype(String volumetype) {
        this.volumetype = volumetype;
        return this;
    }

    


    /**
     * 磁盘类型，取值请参见创建云服务器 中“root_volume字段数据结构说明”。  - SATA：普通IO，是指由SATA存储提供资源的磁盘类型。 - SAS：高IO，是指由SAS存储提供资源的磁盘类型。 - SSD：超高IO，是指由SSD存储提供资源的磁盘类型。
     * @return volumetype
     */
    public String getVolumetype() {
        return volumetype;
    }

    public void setVolumetype(String volumetype) {
        this.volumetype = volumetype;
    }

    

    public V3Volume withExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    

    public V3Volume putExtendParamItem(String key, Object extendParamItem) {
        if(this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        this.extendParam.put(key, extendParamItem);
        return this;
    }

    public V3Volume withExtendParam(Consumer<Map<String, Object>> extendParamSetter) {
        if(this.extendParam == null) {
            this.extendParam = new HashMap<>();
        }
        extendParamSetter.accept(this.extendParam);
        return this;
    }
    /**
     * 磁盘扩展参数，取值请参见[[创建云服务器](https://support.huaweicloud.com/api-ecs/zh-cn_topic_0020212668.html)](tag:hws)[[创建云服务器](https://support.huaweicloud.com/intl/zh-cn/api-ecs/zh-cn_topic_0020212668.html)](tag:hws_hk)中“extendparam”参数的描述。
     * @return extendParam
     */
    public Map<String, Object> getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(Map<String, Object> extendParam) {
        this.extendParam = extendParam;
    }

    

    public V3Volume withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 云服务器系统盘对应的存储池的ID。仅用作专属云集群，专属分布式存储DSS的存储池ID，即dssPoolID。  获取方法请参见获取单个专属分布式存储池详情中“表3 响应参数”的ID字段。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public V3Volume withClusterType(String clusterType) {
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

    

    public V3Volume withHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
        return this;
    }

    


    /**
     * - 使用SDI规格创建虚拟机时请关注该参数，如果该参数值为true，说明创建的为SCSI类型的卷 - 节点池类型为ElasticBMS时，此参数必须填写为true 
     * @return hwPassthrough
     */
    public Boolean getHwPassthrough() {
        return hwPassthrough;
    }

    public void setHwPassthrough(Boolean hwPassthrough) {
        this.hwPassthrough = hwPassthrough;
    }

    

    public V3Volume withMetadata(VolumeMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public V3Volume withMetadata(Consumer<VolumeMetadata> metadataSetter) {
        if(this.metadata == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V3Volume v3Volume = (V3Volume) o;
        return Objects.equals(this.size, v3Volume.size) &&
            Objects.equals(this.volumetype, v3Volume.volumetype) &&
            Objects.equals(this.extendParam, v3Volume.extendParam) &&
            Objects.equals(this.clusterId, v3Volume.clusterId) &&
            Objects.equals(this.clusterType, v3Volume.clusterType) &&
            Objects.equals(this.hwPassthrough, v3Volume.hwPassthrough) &&
            Objects.equals(this.metadata, v3Volume.metadata);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, volumetype, extendParam, clusterId, clusterType, hwPassthrough, metadata);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V3Volume {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    volumetype: ").append(toIndentedString(volumetype)).append("\n");
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

