package com.huaweicloud.sdk.ges.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.EdgesetPath1;
import com.huaweicloud.sdk.ges.v1.model.SchemaPath1;
import com.huaweicloud.sdk.ges.v1.model.VertexsetPath1;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Graph1
 */
public class Graph1  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="createdBy")
    

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isMultiAz")
    

    private String isMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regionCode")
    

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="azCode")
    

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaPath")
    
    private List<SchemaPath1> schemaPath = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetPath")
    
    private List<EdgesetPath1> edgesetPath = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetFormat")
    

    private String edgesetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edgesetDefaultLabel")
    

    private String edgesetDefaultLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetPath")
    
    private List<VertexsetPath1> vertexsetPath = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetFormat")
    

    private String vertexsetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vertexsetDefaultLabel")
    

    private String vertexsetDefaultLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dataStoreVersion")
    

    private String dataStoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<String> sysTags = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="actionProgress")
    

    private String actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graphSizeTypeIndex")
    

    private String graphSizeTypeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpcId")
    

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnetId")
    

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="securityGroupId")
    

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replication")
    

    private Integer replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privateIp")
    

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicIp")
    

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="encrypted")
    

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterKeyId")
    

    private String masterKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="masterKeyName")
    

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableRBAC")
    

    private Boolean enableRBAC;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableFulltextIndex")
    

    private Boolean enableFulltextIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableHyG")
    

    private Boolean enableHyG;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trafficIpList")
    
    private List<String> trafficIpList = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cryptAlgorithm")
    

    private String cryptAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enableHttps")
    

    private Boolean enableHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<Object> tags = null;
    
    public Graph1 withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 图ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public Graph1 withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 图名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Graph1 withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    


    /**
     * 图的创建人账号。
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    

    public Graph1 withIsMultiAz(String isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    


    /**
     * 是否支持跨AZ高可用。
     * @return isMultiAz
     */
    public String getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(String isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    

    public Graph1 withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * 域编码。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    

    public Graph1 withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    


    /**
     * 可用区编码。
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    

    public Graph1 withSchemaPath(List<SchemaPath1> schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    
    public Graph1 addSchemaPathItem(SchemaPath1 schemaPathItem) {
        if(this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        this.schemaPath.add(schemaPathItem);
        return this;
    }

    public Graph1 withSchemaPath(Consumer<List<SchemaPath1>> schemaPathSetter) {
        if(this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        schemaPathSetter.accept(this.schemaPath);
        return this;
    }

    /**
     * 元数据文件路径。
     * @return schemaPath
     */
    public List<SchemaPath1> getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(List<SchemaPath1> schemaPath) {
        this.schemaPath = schemaPath;
    }

    

    public Graph1 withEdgesetPath(List<EdgesetPath1> edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    
    public Graph1 addEdgesetPathItem(EdgesetPath1 edgesetPathItem) {
        if(this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        this.edgesetPath.add(edgesetPathItem);
        return this;
    }

    public Graph1 withEdgesetPath(Consumer<List<EdgesetPath1>> edgesetPathSetter) {
        if(this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        edgesetPathSetter.accept(this.edgesetPath);
        return this;
    }

    /**
     * 边数据集OBS路径。
     * @return edgesetPath
     */
    public List<EdgesetPath1> getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(List<EdgesetPath1> edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    

    public Graph1 withEdgesetFormat(String edgesetFormat) {
        this.edgesetFormat = edgesetFormat;
        return this;
    }

    


    /**
     * 边数据集文件格式。
     * @return edgesetFormat
     */
    public String getEdgesetFormat() {
        return edgesetFormat;
    }

    public void setEdgesetFormat(String edgesetFormat) {
        this.edgesetFormat = edgesetFormat;
    }

    

    public Graph1 withEdgesetDefaultLabel(String edgesetDefaultLabel) {
        this.edgesetDefaultLabel = edgesetDefaultLabel;
        return this;
    }

    


    /**
     * 边数据集文件默认Label。
     * @return edgesetDefaultLabel
     */
    public String getEdgesetDefaultLabel() {
        return edgesetDefaultLabel;
    }

    public void setEdgesetDefaultLabel(String edgesetDefaultLabel) {
        this.edgesetDefaultLabel = edgesetDefaultLabel;
    }

    

    public Graph1 withVertexsetPath(List<VertexsetPath1> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    
    public Graph1 addVertexsetPathItem(VertexsetPath1 vertexsetPathItem) {
        if(this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        this.vertexsetPath.add(vertexsetPathItem);
        return this;
    }

    public Graph1 withVertexsetPath(Consumer<List<VertexsetPath1>> vertexsetPathSetter) {
        if(this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        vertexsetPathSetter.accept(this.vertexsetPath);
        return this;
    }

    /**
     * 点数据集OBS路径。
     * @return vertexsetPath
     */
    public List<VertexsetPath1> getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(List<VertexsetPath1> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
    }

    

    public Graph1 withVertexsetFormat(String vertexsetFormat) {
        this.vertexsetFormat = vertexsetFormat;
        return this;
    }

    


    /**
     * 点数据集文件格式。
     * @return vertexsetFormat
     */
    public String getVertexsetFormat() {
        return vertexsetFormat;
    }

    public void setVertexsetFormat(String vertexsetFormat) {
        this.vertexsetFormat = vertexsetFormat;
    }

    

    public Graph1 withVertexsetDefaultLabel(String vertexsetDefaultLabel) {
        this.vertexsetDefaultLabel = vertexsetDefaultLabel;
        return this;
    }

    


    /**
     * 点数据集文件默认Label。
     * @return vertexsetDefaultLabel
     */
    public String getVertexsetDefaultLabel() {
        return vertexsetDefaultLabel;
    }

    public void setVertexsetDefaultLabel(String vertexsetDefaultLabel) {
        this.vertexsetDefaultLabel = vertexsetDefaultLabel;
    }

    

    public Graph1 withDataStoreVersion(String dataStoreVersion) {
        this.dataStoreVersion = dataStoreVersion;
        return this;
    }

    


    /**
     * 图版本。
     * @return dataStoreVersion
     */
    public String getDataStoreVersion() {
        return dataStoreVersion;
    }

    public void setDataStoreVersion(String dataStoreVersion) {
        this.dataStoreVersion = dataStoreVersion;
    }

    

    public Graph1 withSysTags(List<String> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public Graph1 addSysTagsItem(String sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public Graph1 withSysTags(Consumer<List<String>> sysTagsSetter) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 企业项目信息，如果未指定则不开启，默认不开启。
     * @return sysTags
     */
    public List<String> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<String> sysTags) {
        this.sysTags = sysTags;
    }

    

    public Graph1 withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 图的状态码。  - 100：准备中 - 200：运行中 - 201：升级中 - 202：导入中 - 203：回滚中 - 204：导出中 - 205：清空中 - 206：扩容准备中 - 207：扩容中 - 208：扩容回退中 - 300：故障 - 303：创建失败 - 400：被删除 - 800：已冻结 - 900：停止 - 901：停止中 - 920：启动中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public Graph1 withActionProgress(String actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    


    /**
     * 图创建进度百分比。 >只有图状态码为100时返回该字段。
     * @return actionProgress
     */
    public String getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(String actionProgress) {
        this.actionProgress = actionProgress;
    }

    

    public Graph1 withGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    


    /**
     * 图规模类型索引。  - 0：一万边 - 1：百万边 - 2：千万边 - 3：一亿边 - 4：十亿边 - 5：百亿边 - 6：千亿边
     * @return graphSizeTypeIndex
     */
    public String getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    

    public Graph1 withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    

    public Graph1 withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 指定虚拟私有云下的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public Graph1 withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    

    public Graph1 withReplication(Integer replication) {
        this.replication = replication;
        return this;
    }

    


    /**
     * 副本个数，默认为1。
     * @return replication
     */
    public Integer getReplication() {
        return replication;
    }

    public void setReplication(Integer replication) {
        this.replication = replication;
    }

    

    public Graph1 withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 图创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public Graph1 withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 图更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public Graph1 withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    


    /**
     * 图实例私有网络访问地址，通过该IP用户可以通过私有网络中已部署的弹性云服务器对图实例进行访问。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    

    public Graph1 withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * 图实例公网访问地址，通过该IP用户可以从互联网对图实例进行访问。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    

    public Graph1 withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 图实例CPU架构类型，取值为x86_64和aarch64。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public Graph1 withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    


    /**
     * 是否加密。默认值为“false”，默认不加密。
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    

    public Graph1 withMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
        return this;
    }

    


    /**
     * 用户主密钥ID。
     * @return masterKeyId
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    public void setMasterKeyId(String masterKeyId) {
        this.masterKeyId = masterKeyId;
    }

    

    public Graph1 withMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
        return this;
    }

    


    /**
     * 用户主密钥名称。
     * @return masterKeyName
     */
    public String getMasterKeyName() {
        return masterKeyName;
    }

    public void setMasterKeyName(String masterKeyName) {
        this.masterKeyName = masterKeyName;
    }

    

    public Graph1 withEnableRBAC(Boolean enableRBAC) {
        this.enableRBAC = enableRBAC;
        return this;
    }

    


    /**
     * 是否启用细粒度权限控制。
     * @return enableRBAC
     */
    public Boolean getEnableRBAC() {
        return enableRBAC;
    }

    public void setEnableRBAC(Boolean enableRBAC) {
        this.enableRBAC = enableRBAC;
    }

    

    public Graph1 withEnableFulltextIndex(Boolean enableFulltextIndex) {
        this.enableFulltextIndex = enableFulltextIndex;
        return this;
    }

    


    /**
     * 是否启用全文索引。
     * @return enableFulltextIndex
     */
    public Boolean getEnableFulltextIndex() {
        return enableFulltextIndex;
    }

    public void setEnableFulltextIndex(Boolean enableFulltextIndex) {
        this.enableFulltextIndex = enableFulltextIndex;
    }

    

    public Graph1 withEnableHyG(Boolean enableHyG) {
        this.enableHyG = enableHyG;
        return this;
    }

    


    /**
     * 是否启用HyG，该参数只对千亿规格图生效
     * @return enableHyG
     */
    public Boolean getEnableHyG() {
        return enableHyG;
    }

    public void setEnableHyG(Boolean enableHyG) {
        this.enableHyG = enableHyG;
    }

    

    public Graph1 withTrafficIpList(List<String> trafficIpList) {
        this.trafficIpList = trafficIpList;
        return this;
    }

    
    public Graph1 addTrafficIpListItem(String trafficIpListItem) {
        if(this.trafficIpList == null) {
            this.trafficIpList = new ArrayList<>();
        }
        this.trafficIpList.add(trafficIpListItem);
        return this;
    }

    public Graph1 withTrafficIpList(Consumer<List<String>> trafficIpListSetter) {
        if(this.trafficIpList == null) {
            this.trafficIpList = new ArrayList<>();
        }
        trafficIpListSetter.accept(this.trafficIpList);
        return this;
    }

    /**
     * 图实例私有网络访问物理地址列表。为了防止浮动IP切换造成业务闪断，我们推荐您通过轮询的方式使用物理IP访问图实例。
     * @return trafficIpList
     */
    public List<String> getTrafficIpList() {
        return trafficIpList;
    }

    public void setTrafficIpList(List<String> trafficIpList) {
        this.trafficIpList = trafficIpList;
    }

    

    public Graph1 withCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
        return this;
    }

    


    /**
     * 图实例加密算法，取值为：  - generalCipher：国际算法 - SMcompatible：商密算法（兼容国际）
     * @return cryptAlgorithm
     */
    public String getCryptAlgorithm() {
        return cryptAlgorithm;
    }

    public void setCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
    }

    

    public Graph1 withEnableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
        return this;
    }

    


    /**
     * 是否开启安全模式，开启安全模式会对性能有较大影响。
     * @return enableHttps
     */
    public Boolean getEnableHttps() {
        return enableHttps;
    }

    public void setEnableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
    }

    

    public Graph1 withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    
    public Graph1 addTagsItem(Object tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Graph1 withTags(Consumer<List<Object>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，每个标签用<key,value>键值对表示。
     * @return tags
     */
    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Graph1 graph1 = (Graph1) o;
        return Objects.equals(this.id, graph1.id) &&
            Objects.equals(this.name, graph1.name) &&
            Objects.equals(this.createdBy, graph1.createdBy) &&
            Objects.equals(this.isMultiAz, graph1.isMultiAz) &&
            Objects.equals(this.regionCode, graph1.regionCode) &&
            Objects.equals(this.azCode, graph1.azCode) &&
            Objects.equals(this.schemaPath, graph1.schemaPath) &&
            Objects.equals(this.edgesetPath, graph1.edgesetPath) &&
            Objects.equals(this.edgesetFormat, graph1.edgesetFormat) &&
            Objects.equals(this.edgesetDefaultLabel, graph1.edgesetDefaultLabel) &&
            Objects.equals(this.vertexsetPath, graph1.vertexsetPath) &&
            Objects.equals(this.vertexsetFormat, graph1.vertexsetFormat) &&
            Objects.equals(this.vertexsetDefaultLabel, graph1.vertexsetDefaultLabel) &&
            Objects.equals(this.dataStoreVersion, graph1.dataStoreVersion) &&
            Objects.equals(this.sysTags, graph1.sysTags) &&
            Objects.equals(this.status, graph1.status) &&
            Objects.equals(this.actionProgress, graph1.actionProgress) &&
            Objects.equals(this.graphSizeTypeIndex, graph1.graphSizeTypeIndex) &&
            Objects.equals(this.vpcId, graph1.vpcId) &&
            Objects.equals(this.subnetId, graph1.subnetId) &&
            Objects.equals(this.securityGroupId, graph1.securityGroupId) &&
            Objects.equals(this.replication, graph1.replication) &&
            Objects.equals(this.created, graph1.created) &&
            Objects.equals(this.updated, graph1.updated) &&
            Objects.equals(this.privateIp, graph1.privateIp) &&
            Objects.equals(this.publicIp, graph1.publicIp) &&
            Objects.equals(this.arch, graph1.arch) &&
            Objects.equals(this.encrypted, graph1.encrypted) &&
            Objects.equals(this.masterKeyId, graph1.masterKeyId) &&
            Objects.equals(this.masterKeyName, graph1.masterKeyName) &&
            Objects.equals(this.enableRBAC, graph1.enableRBAC) &&
            Objects.equals(this.enableFulltextIndex, graph1.enableFulltextIndex) &&
            Objects.equals(this.enableHyG, graph1.enableHyG) &&
            Objects.equals(this.trafficIpList, graph1.trafficIpList) &&
            Objects.equals(this.cryptAlgorithm, graph1.cryptAlgorithm) &&
            Objects.equals(this.enableHttps, graph1.enableHttps) &&
            Objects.equals(this.tags, graph1.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, createdBy, isMultiAz, regionCode, azCode, schemaPath, edgesetPath, edgesetFormat, edgesetDefaultLabel, vertexsetPath, vertexsetFormat, vertexsetDefaultLabel, dataStoreVersion, sysTags, status, actionProgress, graphSizeTypeIndex, vpcId, subnetId, securityGroupId, replication, created, updated, privateIp, publicIp, arch, encrypted, masterKeyId, masterKeyName, enableRBAC, enableFulltextIndex, enableHyG, trafficIpList, cryptAlgorithm, enableHttps, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Graph1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    edgesetPath: ").append(toIndentedString(edgesetPath)).append("\n");
        sb.append("    edgesetFormat: ").append(toIndentedString(edgesetFormat)).append("\n");
        sb.append("    edgesetDefaultLabel: ").append(toIndentedString(edgesetDefaultLabel)).append("\n");
        sb.append("    vertexsetPath: ").append(toIndentedString(vertexsetPath)).append("\n");
        sb.append("    vertexsetFormat: ").append(toIndentedString(vertexsetFormat)).append("\n");
        sb.append("    vertexsetDefaultLabel: ").append(toIndentedString(vertexsetDefaultLabel)).append("\n");
        sb.append("    dataStoreVersion: ").append(toIndentedString(dataStoreVersion)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actionProgress: ").append(toIndentedString(actionProgress)).append("\n");
        sb.append("    graphSizeTypeIndex: ").append(toIndentedString(graphSizeTypeIndex)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    encrypted: ").append(toIndentedString(encrypted)).append("\n");
        sb.append("    masterKeyId: ").append(toIndentedString(masterKeyId)).append("\n");
        sb.append("    masterKeyName: ").append(toIndentedString(masterKeyName)).append("\n");
        sb.append("    enableRBAC: ").append(toIndentedString(enableRBAC)).append("\n");
        sb.append("    enableFulltextIndex: ").append(toIndentedString(enableFulltextIndex)).append("\n");
        sb.append("    enableHyG: ").append(toIndentedString(enableHyG)).append("\n");
        sb.append("    trafficIpList: ").append(toIndentedString(trafficIpList)).append("\n");
        sb.append("    cryptAlgorithm: ").append(toIndentedString(cryptAlgorithm)).append("\n");
        sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

