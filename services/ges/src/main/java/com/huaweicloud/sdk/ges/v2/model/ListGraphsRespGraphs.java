package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListGraphsRespGraphs
 */
public class ListGraphsRespGraphs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private String isMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_path")

    private List<ListGraphsRespSchemaPath> schemaPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgeset_path")

    private List<ListGraphsRespSchemaPath> edgesetPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertexset_path")

    private List<ListGraphsRespSchemaPath> vertexsetPath = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgeset_format")

    private String edgesetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edgeset_default_label")

    private String edgesetDefaultLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertexset_format")

    private String vertexsetFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertexset_default_label")

    private String vertexsetDefaultLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_version")

    private String dataStoreVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<String> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_progress")

    private String actionProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_size_type_index")

    private String graphSizeTypeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private Integer replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypted")

    private Boolean encrypted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_id")

    private String masterKeyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_key_name")

    private String masterKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_rbac")

    private Boolean enableRbac;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_full_text_index")

    private Boolean enableFullTextIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_hyg")

    private Boolean enableHyg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_ip_list")

    private List<String> trafficIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crypt_algorithm")

    private String cryptAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_https")

    private Boolean enableHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ListGraphsRespTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_type")

    private String productType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vertex_id_type")

    private ListGraphsRespVertexIdType vertexIdType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_graph_size_type_index")

    private String originGraphSizeTypeIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand_time")

    private String expandTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_time")

    private String resizeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_multi_label")

    private Boolean enableMultiLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_ratio")

    private Integer capacityRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key_type")

    private String sortKeyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_lts")

    private Boolean enableLts;

    public ListGraphsRespGraphs withId(String id) {
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

    public ListGraphsRespGraphs withName(String name) {
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

    public ListGraphsRespGraphs withCreatedBy(String createdBy) {
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

    public ListGraphsRespGraphs withIsMultiAz(String isMultiAz) {
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

    public ListGraphsRespGraphs withRegionCode(String regionCode) {
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

    public ListGraphsRespGraphs withAzCode(String azCode) {
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

    public ListGraphsRespGraphs withSchemaPath(List<ListGraphsRespSchemaPath> schemaPath) {
        this.schemaPath = schemaPath;
        return this;
    }

    public ListGraphsRespGraphs addSchemaPathItem(ListGraphsRespSchemaPath schemaPathItem) {
        if (this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        this.schemaPath.add(schemaPathItem);
        return this;
    }

    public ListGraphsRespGraphs withSchemaPath(Consumer<List<ListGraphsRespSchemaPath>> schemaPathSetter) {
        if (this.schemaPath == null) {
            this.schemaPath = new ArrayList<>();
        }
        schemaPathSetter.accept(this.schemaPath);
        return this;
    }

    /**
     * 元数据文件路径。
     * @return schemaPath
     */
    public List<ListGraphsRespSchemaPath> getSchemaPath() {
        return schemaPath;
    }

    public void setSchemaPath(List<ListGraphsRespSchemaPath> schemaPath) {
        this.schemaPath = schemaPath;
    }

    public ListGraphsRespGraphs withEdgesetPath(List<ListGraphsRespSchemaPath> edgesetPath) {
        this.edgesetPath = edgesetPath;
        return this;
    }

    public ListGraphsRespGraphs addEdgesetPathItem(ListGraphsRespSchemaPath edgesetPathItem) {
        if (this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        this.edgesetPath.add(edgesetPathItem);
        return this;
    }

    public ListGraphsRespGraphs withEdgesetPath(Consumer<List<ListGraphsRespSchemaPath>> edgesetPathSetter) {
        if (this.edgesetPath == null) {
            this.edgesetPath = new ArrayList<>();
        }
        edgesetPathSetter.accept(this.edgesetPath);
        return this;
    }

    /**
     * 边数据集OBS路径。
     * @return edgesetPath
     */
    public List<ListGraphsRespSchemaPath> getEdgesetPath() {
        return edgesetPath;
    }

    public void setEdgesetPath(List<ListGraphsRespSchemaPath> edgesetPath) {
        this.edgesetPath = edgesetPath;
    }

    public ListGraphsRespGraphs withVertexsetPath(List<ListGraphsRespSchemaPath> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
        return this;
    }

    public ListGraphsRespGraphs addVertexsetPathItem(ListGraphsRespSchemaPath vertexsetPathItem) {
        if (this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        this.vertexsetPath.add(vertexsetPathItem);
        return this;
    }

    public ListGraphsRespGraphs withVertexsetPath(Consumer<List<ListGraphsRespSchemaPath>> vertexsetPathSetter) {
        if (this.vertexsetPath == null) {
            this.vertexsetPath = new ArrayList<>();
        }
        vertexsetPathSetter.accept(this.vertexsetPath);
        return this;
    }

    /**
     * 点数据集OBS路径。
     * @return vertexsetPath
     */
    public List<ListGraphsRespSchemaPath> getVertexsetPath() {
        return vertexsetPath;
    }

    public void setVertexsetPath(List<ListGraphsRespSchemaPath> vertexsetPath) {
        this.vertexsetPath = vertexsetPath;
    }

    public ListGraphsRespGraphs withEdgesetFormat(String edgesetFormat) {
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

    public ListGraphsRespGraphs withEdgesetDefaultLabel(String edgesetDefaultLabel) {
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

    public ListGraphsRespGraphs withVertexsetFormat(String vertexsetFormat) {
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

    public ListGraphsRespGraphs withVertexsetDefaultLabel(String vertexsetDefaultLabel) {
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

    public ListGraphsRespGraphs withDataStoreVersion(String dataStoreVersion) {
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

    public ListGraphsRespGraphs withSysTags(List<String> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListGraphsRespGraphs addSysTagsItem(String sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListGraphsRespGraphs withSysTags(Consumer<List<String>> sysTagsSetter) {
        if (this.sysTags == null) {
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

    public ListGraphsRespGraphs withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 图的状态码。  - 100：准备中 - 200：运行中 - 201：升级中 - 202：导入中 - 203：回滚中 - 204：导出中 - 205：清空中 - 206：扩容准备中 - 207：扩容中 - 208：扩容回退中 - 210：扩副本准备中 - 211：扩副本中 - 300：故障 - 303：创建失败 - 400：被删除 - 800：已冻结 - 900：停止 - 901：停止中 - 920：启动中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListGraphsRespGraphs withActionProgress(String actionProgress) {
        this.actionProgress = actionProgress;
        return this;
    }

    /**
     * 图创建进度百分比。 > 只有图状态码为100时返回该字段。
     * @return actionProgress
     */
    public String getActionProgress() {
        return actionProgress;
    }

    public void setActionProgress(String actionProgress) {
        this.actionProgress = actionProgress;
    }

    public ListGraphsRespGraphs withGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
        return this;
    }

    /**
     * 图规模类型索引。  - 0：一万边 - 1：百万边 - 2：千万边 - 3：一亿边 - 4：十亿边 - 5：百亿边 - 6：千亿边 - 401：十亿增强边
     * @return graphSizeTypeIndex
     */
    public String getGraphSizeTypeIndex() {
        return graphSizeTypeIndex;
    }

    public void setGraphSizeTypeIndex(String graphSizeTypeIndex) {
        this.graphSizeTypeIndex = graphSizeTypeIndex;
    }

    public ListGraphsRespGraphs withVpcId(String vpcId) {
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

    public ListGraphsRespGraphs withSubnetId(String subnetId) {
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

    public ListGraphsRespGraphs withSecurityGroupId(String securityGroupId) {
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

    public ListGraphsRespGraphs withReplication(Integer replication) {
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

    public ListGraphsRespGraphs withCreated(String created) {
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

    public ListGraphsRespGraphs withUpdated(String updated) {
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

    public ListGraphsRespGraphs withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 图实例私有网络访问浮动IP地址，通过该IP用户可以通过私有网络中已部署的弹性云服务器对图实例进行访问。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ListGraphsRespGraphs withPublicIp(String publicIp) {
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

    public ListGraphsRespGraphs withArch(String arch) {
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

    public ListGraphsRespGraphs withEncrypted(Boolean encrypted) {
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

    public ListGraphsRespGraphs withMasterKeyId(String masterKeyId) {
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

    public ListGraphsRespGraphs withMasterKeyName(String masterKeyName) {
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

    public ListGraphsRespGraphs withEnableRbac(Boolean enableRbac) {
        this.enableRbac = enableRbac;
        return this;
    }

    /**
     * 是否启用细粒度权限控制。
     * @return enableRbac
     */
    public Boolean getEnableRbac() {
        return enableRbac;
    }

    public void setEnableRbac(Boolean enableRbac) {
        this.enableRbac = enableRbac;
    }

    public ListGraphsRespGraphs withEnableFullTextIndex(Boolean enableFullTextIndex) {
        this.enableFullTextIndex = enableFullTextIndex;
        return this;
    }

    /**
     * 是否启用全文索引。
     * @return enableFullTextIndex
     */
    public Boolean getEnableFullTextIndex() {
        return enableFullTextIndex;
    }

    public void setEnableFullTextIndex(Boolean enableFullTextIndex) {
        this.enableFullTextIndex = enableFullTextIndex;
    }

    public ListGraphsRespGraphs withEnableHyg(Boolean enableHyg) {
        this.enableHyg = enableHyg;
        return this;
    }

    /**
     * 是否启用HyG，该参数只对千亿规格图生效。
     * @return enableHyg
     */
    public Boolean getEnableHyg() {
        return enableHyg;
    }

    public void setEnableHyg(Boolean enableHyg) {
        this.enableHyg = enableHyg;
    }

    public ListGraphsRespGraphs withTrafficIpList(List<String> trafficIpList) {
        this.trafficIpList = trafficIpList;
        return this;
    }

    public ListGraphsRespGraphs addTrafficIpListItem(String trafficIpListItem) {
        if (this.trafficIpList == null) {
            this.trafficIpList = new ArrayList<>();
        }
        this.trafficIpList.add(trafficIpListItem);
        return this;
    }

    public ListGraphsRespGraphs withTrafficIpList(Consumer<List<String>> trafficIpListSetter) {
        if (this.trafficIpList == null) {
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

    public ListGraphsRespGraphs withCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
        return this;
    }

    /**
     * 图实例加密算法，取值为：  - generalCipher：国密算法 - SMcompatible：商密算法（兼容国际）
     * @return cryptAlgorithm
     */
    public String getCryptAlgorithm() {
        return cryptAlgorithm;
    }

    public void setCryptAlgorithm(String cryptAlgorithm) {
        this.cryptAlgorithm = cryptAlgorithm;
    }

    public ListGraphsRespGraphs withEnableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
        return this;
    }

    /**
     * 是否开启安全模式，开启安全模式会对性能有较大影响
     * @return enableHttps
     */
    public Boolean getEnableHttps() {
        return enableHttps;
    }

    public void setEnableHttps(Boolean enableHttps) {
        this.enableHttps = enableHttps;
    }

    public ListGraphsRespGraphs withTags(List<ListGraphsRespTags> tags) {
        this.tags = tags;
        return this;
    }

    public ListGraphsRespGraphs addTagsItem(ListGraphsRespTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListGraphsRespGraphs withTags(Consumer<List<ListGraphsRespTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，每个标签用<key,value>键值对表示。
     * @return tags
     */
    public List<ListGraphsRespTags> getTags() {
        return tags;
    }

    public void setTags(List<ListGraphsRespTags> tags) {
        this.tags = tags;
    }

    public ListGraphsRespGraphs withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * 图产品类型，取值为InMemory和Persistence，默认为InMemory，当graph_size_type_index取值为\"6\"时，默认为Persistence。  - InMemory：内存版 - Persistence：持久化版
     * @return productType
     */
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ListGraphsRespGraphs withVertexIdType(ListGraphsRespVertexIdType vertexIdType) {
        this.vertexIdType = vertexIdType;
        return this;
    }

    public ListGraphsRespGraphs withVertexIdType(Consumer<ListGraphsRespVertexIdType> vertexIdTypeSetter) {
        if (this.vertexIdType == null) {
            this.vertexIdType = new ListGraphsRespVertexIdType();
            vertexIdTypeSetter.accept(this.vertexIdType);
        }

        return this;
    }

    /**
     * Get vertexIdType
     * @return vertexIdType
     */
    public ListGraphsRespVertexIdType getVertexIdType() {
        return vertexIdType;
    }

    public void setVertexIdType(ListGraphsRespVertexIdType vertexIdType) {
        this.vertexIdType = vertexIdType;
    }

    public ListGraphsRespGraphs withOriginGraphSizeTypeIndex(String originGraphSizeTypeIndex) {
        this.originGraphSizeTypeIndex = originGraphSizeTypeIndex;
        return this;
    }

    /**
     * 图的初始规格。该参数从2.3.15版本后开始支持。
     * @return originGraphSizeTypeIndex
     */
    public String getOriginGraphSizeTypeIndex() {
        return originGraphSizeTypeIndex;
    }

    public void setOriginGraphSizeTypeIndex(String originGraphSizeTypeIndex) {
        this.originGraphSizeTypeIndex = originGraphSizeTypeIndex;
    }

    public ListGraphsRespGraphs withExpandTime(String expandTime) {
        this.expandTime = expandTime;
        return this;
    }

    /**
     * 图扩副本的时间。
     * @return expandTime
     */
    public String getExpandTime() {
        return expandTime;
    }

    public void setExpandTime(String expandTime) {
        this.expandTime = expandTime;
    }

    public ListGraphsRespGraphs withResizeTime(String resizeTime) {
        this.resizeTime = resizeTime;
        return this;
    }

    /**
     * 图扩容的时间。
     * @return resizeTime
     */
    public String getResizeTime() {
        return resizeTime;
    }

    public void setResizeTime(String resizeTime) {
        this.resizeTime = resizeTime;
    }

    public ListGraphsRespGraphs withEnableMultiLabel(Boolean enableMultiLabel) {
        this.enableMultiLabel = enableMultiLabel;
        return this;
    }

    /**
     * 是否启用多标签。
     * @return enableMultiLabel
     */
    public Boolean getEnableMultiLabel() {
        return enableMultiLabel;
    }

    public void setEnableMultiLabel(Boolean enableMultiLabel) {
        this.enableMultiLabel = enableMultiLabel;
    }

    public ListGraphsRespGraphs withCapacityRatio(Integer capacityRatio) {
        this.capacityRatio = capacityRatio;
        return this;
    }

    /**
     * 图的容量倍率。只有持久化版百亿规格图支持该参数，该参数从2.3.18版本后开始支持。
     * @return capacityRatio
     */
    public Integer getCapacityRatio() {
        return capacityRatio;
    }

    public void setCapacityRatio(Integer capacityRatio) {
        this.capacityRatio = capacityRatio;
    }

    public ListGraphsRespGraphs withSortKeyType(String sortKeyType) {
        this.sortKeyType = sortKeyType;
        return this;
    }

    /**
     * 图的sortKey类型，内存版图无此值。
     * @return sortKeyType
     */
    public String getSortKeyType() {
        return sortKeyType;
    }

    public void setSortKeyType(String sortKeyType) {
        this.sortKeyType = sortKeyType;
    }

    public ListGraphsRespGraphs withEnableLts(Boolean enableLts) {
        this.enableLts = enableLts;
        return this;
    }

    /**
     * 对接云服务LTS日志开启状态。  - true：日志对接开启中。 - false：日志对接关闭中。
     * @return enableLts
     */
    public Boolean getEnableLts() {
        return enableLts;
    }

    public void setEnableLts(Boolean enableLts) {
        this.enableLts = enableLts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListGraphsRespGraphs that = (ListGraphsRespGraphs) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.createdBy, that.createdBy) && Objects.equals(this.isMultiAz, that.isMultiAz)
            && Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.azCode, that.azCode)
            && Objects.equals(this.schemaPath, that.schemaPath) && Objects.equals(this.edgesetPath, that.edgesetPath)
            && Objects.equals(this.vertexsetPath, that.vertexsetPath)
            && Objects.equals(this.edgesetFormat, that.edgesetFormat)
            && Objects.equals(this.edgesetDefaultLabel, that.edgesetDefaultLabel)
            && Objects.equals(this.vertexsetFormat, that.vertexsetFormat)
            && Objects.equals(this.vertexsetDefaultLabel, that.vertexsetDefaultLabel)
            && Objects.equals(this.dataStoreVersion, that.dataStoreVersion)
            && Objects.equals(this.sysTags, that.sysTags) && Objects.equals(this.status, that.status)
            && Objects.equals(this.actionProgress, that.actionProgress)
            && Objects.equals(this.graphSizeTypeIndex, that.graphSizeTypeIndex)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId)
            && Objects.equals(this.replication, that.replication) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.encrypted, that.encrypted) && Objects.equals(this.masterKeyId, that.masterKeyId)
            && Objects.equals(this.masterKeyName, that.masterKeyName)
            && Objects.equals(this.enableRbac, that.enableRbac)
            && Objects.equals(this.enableFullTextIndex, that.enableFullTextIndex)
            && Objects.equals(this.enableHyg, that.enableHyg) && Objects.equals(this.trafficIpList, that.trafficIpList)
            && Objects.equals(this.cryptAlgorithm, that.cryptAlgorithm)
            && Objects.equals(this.enableHttps, that.enableHttps) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.productType, that.productType)
            && Objects.equals(this.vertexIdType, that.vertexIdType)
            && Objects.equals(this.originGraphSizeTypeIndex, that.originGraphSizeTypeIndex)
            && Objects.equals(this.expandTime, that.expandTime) && Objects.equals(this.resizeTime, that.resizeTime)
            && Objects.equals(this.enableMultiLabel, that.enableMultiLabel)
            && Objects.equals(this.capacityRatio, that.capacityRatio)
            && Objects.equals(this.sortKeyType, that.sortKeyType) && Objects.equals(this.enableLts, that.enableLts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            createdBy,
            isMultiAz,
            regionCode,
            azCode,
            schemaPath,
            edgesetPath,
            vertexsetPath,
            edgesetFormat,
            edgesetDefaultLabel,
            vertexsetFormat,
            vertexsetDefaultLabel,
            dataStoreVersion,
            sysTags,
            status,
            actionProgress,
            graphSizeTypeIndex,
            vpcId,
            subnetId,
            securityGroupId,
            replication,
            created,
            updated,
            privateIp,
            publicIp,
            arch,
            encrypted,
            masterKeyId,
            masterKeyName,
            enableRbac,
            enableFullTextIndex,
            enableHyg,
            trafficIpList,
            cryptAlgorithm,
            enableHttps,
            tags,
            productType,
            vertexIdType,
            originGraphSizeTypeIndex,
            expandTime,
            resizeTime,
            enableMultiLabel,
            capacityRatio,
            sortKeyType,
            enableLts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGraphsRespGraphs {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    schemaPath: ").append(toIndentedString(schemaPath)).append("\n");
        sb.append("    edgesetPath: ").append(toIndentedString(edgesetPath)).append("\n");
        sb.append("    vertexsetPath: ").append(toIndentedString(vertexsetPath)).append("\n");
        sb.append("    edgesetFormat: ").append(toIndentedString(edgesetFormat)).append("\n");
        sb.append("    edgesetDefaultLabel: ").append(toIndentedString(edgesetDefaultLabel)).append("\n");
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
        sb.append("    enableRbac: ").append(toIndentedString(enableRbac)).append("\n");
        sb.append("    enableFullTextIndex: ").append(toIndentedString(enableFullTextIndex)).append("\n");
        sb.append("    enableHyg: ").append(toIndentedString(enableHyg)).append("\n");
        sb.append("    trafficIpList: ").append(toIndentedString(trafficIpList)).append("\n");
        sb.append("    cryptAlgorithm: ").append(toIndentedString(cryptAlgorithm)).append("\n");
        sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
        sb.append("    vertexIdType: ").append(toIndentedString(vertexIdType)).append("\n");
        sb.append("    originGraphSizeTypeIndex: ").append(toIndentedString(originGraphSizeTypeIndex)).append("\n");
        sb.append("    expandTime: ").append(toIndentedString(expandTime)).append("\n");
        sb.append("    resizeTime: ").append(toIndentedString(resizeTime)).append("\n");
        sb.append("    enableMultiLabel: ").append(toIndentedString(enableMultiLabel)).append("\n");
        sb.append("    capacityRatio: ").append(toIndentedString(capacityRatio)).append("\n");
        sb.append("    sortKeyType: ").append(toIndentedString(sortKeyType)).append("\n");
        sb.append("    enableLts: ").append(toIndentedString(enableLts)).append("\n");
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
