package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastore;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorInfo;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHa;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListVolume;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussBackupStrategyForListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.OpenGaussChargeInfoListResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例信息。
 */
public class ListInstanceResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ips")
    
    
    private List<String> privateIps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ips")
    
    
    private List<String> publicIps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha")
    
    
    private ListHa ha;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replica_num")
    
    
    private Integer replicaNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore")
    
    
    private ListDatastore datastore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_user_name")
    
    
    private String dbUserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_info")
    
    
    private ListFlavorInfo flavorInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    
    private ListVolume volume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="switch_strategy")
    
    
    private String switchStrategy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_strategy")
    
    
    private OpenGaussBackupStrategyForListResponse backupStrategy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintenance_window")
    
    
    private String maintenanceWindow;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="related_instance")
    
    
    private List<Object> relatedInstance = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    
    private List<Object> nodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk_encryption_id")
    
    
    private String diskEncryptionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_info")
    
    
    private OpenGaussChargeInfoListResponse chargeInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_zone")
    
    
    private String timeZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    
    private List<Object> tags = null;
    
    public ListInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 创建的实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例状态。  取值：  值为“BUILD”，表示实例正在创建。  值为“ACTIVE”，表示实例正常。  值为“FAILED”，表示实例异常。  值为“FROZEN”，表示实例冻结。  值为“EXPANDING”，表示实例正在扩容CN或DN。  值为“REBOOTING”，表示实例正在重启。  值为“UPGRADING”，表示实例正在升级。  值为“BACKING UP”，表示实例正在进行备份。  值为“STORAGE FULL”，表示实例磁盘空间满。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListInstanceResponse withPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    
    public ListInstanceResponse addPrivateIpsItem(String privateIpsItem) {
        if(this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public ListInstanceResponse withPrivateIps(Consumer<List<String>> privateIpsSetter) {
        if(this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    /**
     * 实例内网IP地址列表。CN在的弹性云服务器创建成功后该值存在，其他情况下为空字符串。
     * @return privateIps
     */
    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    

    public ListInstanceResponse withPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
        return this;
    }

    
    public ListInstanceResponse addPublicIpsItem(String publicIpsItem) {
        if(this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        this.publicIps.add(publicIpsItem);
        return this;
    }

    public ListInstanceResponse withPublicIps(Consumer<List<String>> publicIpsSetter) {
        if(this.publicIps == null) {
            this.publicIps = new ArrayList<>();
        }
        publicIpsSetter.accept(this.publicIps);
        return this;
    }

    /**
     * 实例外网IP地址列表。绑定弹性公网IP后，该值不为空。
     * @return publicIps
     */
    public List<String> getPublicIps() {
        return publicIps;
    }

    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }

    

    public ListInstanceResponse withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 数据库端口号。GaussDB(for openGauss)数据库端口设置范围为1024~39998（其中2378,2379,2380,4999,5000,5999,6000,6001,8097,8098,20049,20050,21731,21732被系统占用不可设置）。  当不传该参数时，默认端口如下：8000。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    

    public ListInstanceResponse withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 实例类型，取值为 \"Enterprise\"，对应于分布式实例（企业版）。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListInstanceResponse withHa(ListHa ha) {
        this.ha = ha;
        return this;
    }

    public ListInstanceResponse withHa(Consumer<ListHa> haSetter) {
        if(this.ha == null ){
            this.ha = new ListHa();
            haSetter.accept(this.ha);
        }
        
        return this;
    }


    /**
     * Get ha
     * @return ha
     */
    public ListHa getHa() {
        return ha;
    }

    public void setHa(ListHa ha) {
        this.ha = ha;
    }

    

    public ListInstanceResponse withReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    


    /**
     * 实例副本数。说明：需添加白名单，才会开放显示。
     * @return replicaNum
     */
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    

    public ListInstanceResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 实例所在区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    

    public ListInstanceResponse withDatastore(ListDatastore datastore) {
        this.datastore = datastore;
        return this;
    }

    public ListInstanceResponse withDatastore(Consumer<ListDatastore> datastoreSetter) {
        if(this.datastore == null ){
            this.datastore = new ListDatastore();
            datastoreSetter.accept(this.datastore);
        }
        
        return this;
    }


    /**
     * Get datastore
     * @return datastore
     */
    public ListDatastore getDatastore() {
        return datastore;
    }

    public void setDatastore(ListDatastore datastore) {
        this.datastore = datastore;
    }

    

    public ListInstanceResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 创建时间，格式为“yyyy-mm-dd hh:mm:ss timezone”。  其中timezone是指时区。  说明：创建时该值为实例下发创建的时间，创建完成后，该值为创建完成时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    

    public ListInstanceResponse withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 更新时间，格式与“created”字段对应格式完全相同。  说明：创建时返回值为空，数据库实例创建成功后该值不为空。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    

    public ListInstanceResponse withDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
        return this;
    }

    


    /**
     * 默认用户名。
     * @return dbUserName
     */
    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    

    public ListInstanceResponse withVpcId(String vpcId) {
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

    

    public ListInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网的网络ID信息。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    

    public ListInstanceResponse withSecurityGroupId(String securityGroupId) {
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

    

    public ListInstanceResponse withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格码。参考[表1](https://support.huaweicloud.com/api-opengauss/opengauss_api_0037.html#opengauss_api_0037__ted9b9d433c8a4c52884e199e17f94479)中GaussDB(for openGauss)的“规格编码”列内容获取。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public ListInstanceResponse withFlavorInfo(ListFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
        return this;
    }

    public ListInstanceResponse withFlavorInfo(Consumer<ListFlavorInfo> flavorInfoSetter) {
        if(this.flavorInfo == null ){
            this.flavorInfo = new ListFlavorInfo();
            flavorInfoSetter.accept(this.flavorInfo);
        }
        
        return this;
    }


    /**
     * Get flavorInfo
     * @return flavorInfo
     */
    public ListFlavorInfo getFlavorInfo() {
        return flavorInfo;
    }

    public void setFlavorInfo(ListFlavorInfo flavorInfo) {
        this.flavorInfo = flavorInfo;
    }

    

    public ListInstanceResponse withVolume(ListVolume volume) {
        this.volume = volume;
        return this;
    }

    public ListInstanceResponse withVolume(Consumer<ListVolume> volumeSetter) {
        if(this.volume == null ){
            this.volume = new ListVolume();
            volumeSetter.accept(this.volume);
        }
        
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public ListVolume getVolume() {
        return volume;
    }

    public void setVolume(ListVolume volume) {
        this.volume = volume;
    }

    

    public ListInstanceResponse withSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
        return this;
    }

    


    /**
     * 数据库切换策略。取值为“reliability”或“availability”，分别对应于可靠性优先和可用性优先。
     * @return switchStrategy
     */
    public String getSwitchStrategy() {
        return switchStrategy;
    }

    public void setSwitchStrategy(String switchStrategy) {
        this.switchStrategy = switchStrategy;
    }

    

    public ListInstanceResponse withBackupStrategy(OpenGaussBackupStrategyForListResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
        return this;
    }

    public ListInstanceResponse withBackupStrategy(Consumer<OpenGaussBackupStrategyForListResponse> backupStrategySetter) {
        if(this.backupStrategy == null ){
            this.backupStrategy = new OpenGaussBackupStrategyForListResponse();
            backupStrategySetter.accept(this.backupStrategy);
        }
        
        return this;
    }


    /**
     * Get backupStrategy
     * @return backupStrategy
     */
    public OpenGaussBackupStrategyForListResponse getBackupStrategy() {
        return backupStrategy;
    }

    public void setBackupStrategy(OpenGaussBackupStrategyForListResponse backupStrategy) {
        this.backupStrategy = backupStrategy;
    }

    

    public ListInstanceResponse withMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
        return this;
    }

    


    /**
     * 可维护时间窗，为UTC时间。
     * @return maintenanceWindow
     */
    public String getMaintenanceWindow() {
        return maintenanceWindow;
    }

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    

    public ListInstanceResponse withRelatedInstance(List<Object> relatedInstance) {
        this.relatedInstance = relatedInstance;
        return this;
    }

    
    public ListInstanceResponse addRelatedInstanceItem(Object relatedInstanceItem) {
        if(this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        this.relatedInstance.add(relatedInstanceItem);
        return this;
    }

    public ListInstanceResponse withRelatedInstance(Consumer<List<Object>> relatedInstanceSetter) {
        if(this.relatedInstance == null) {
            this.relatedInstance = new ArrayList<>();
        }
        relatedInstanceSetter.accept(this.relatedInstance);
        return this;
    }

    /**
     * 所关联的数据库实例列表。GaussDB(for openGauss)不涉及该参数。
     * @return relatedInstance
     */
    public List<Object> getRelatedInstance() {
        return relatedInstance;
    }

    public void setRelatedInstance(List<Object> relatedInstance) {
        this.relatedInstance = relatedInstance;
    }

    

    public ListInstanceResponse withNodes(List<Object> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ListInstanceResponse addNodesItem(Object nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListInstanceResponse withNodes(Consumer<List<Object>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 实例节点信息。
     * @return nodes
     */
    public List<Object> getNodes() {
        return nodes;
    }

    public void setNodes(List<Object> nodes) {
        this.nodes = nodes;
    }

    

    public ListInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目标签ID。非企业项目账号的实例，企业项目默认0。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ListInstanceResponse withDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
        return this;
    }

    


    /**
     * 磁盘加密密钥ID。
     * @return diskEncryptionId
     */
    public String getDiskEncryptionId() {
        return diskEncryptionId;
    }

    public void setDiskEncryptionId(String diskEncryptionId) {
        this.diskEncryptionId = diskEncryptionId;
    }

    

    public ListInstanceResponse withChargeInfo(OpenGaussChargeInfoListResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
        return this;
    }

    public ListInstanceResponse withChargeInfo(Consumer<OpenGaussChargeInfoListResponse> chargeInfoSetter) {
        if(this.chargeInfo == null ){
            this.chargeInfo = new OpenGaussChargeInfoListResponse();
            chargeInfoSetter.accept(this.chargeInfo);
        }
        
        return this;
    }


    /**
     * Get chargeInfo
     * @return chargeInfo
     */
    public OpenGaussChargeInfoListResponse getChargeInfo() {
        return chargeInfo;
    }

    public void setChargeInfo(OpenGaussChargeInfoListResponse chargeInfo) {
        this.chargeInfo = chargeInfo;
    }

    

    public ListInstanceResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    


    /**
     * 时区。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    

    public ListInstanceResponse withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    
    public ListInstanceResponse addTagsItem(Object tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListInstanceResponse withTags(Consumer<List<Object>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表，没有标签默认为空数组。
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
        ListInstanceResponse listInstanceResponse = (ListInstanceResponse) o;
        return Objects.equals(this.id, listInstanceResponse.id) &&
            Objects.equals(this.name, listInstanceResponse.name) &&
            Objects.equals(this.status, listInstanceResponse.status) &&
            Objects.equals(this.privateIps, listInstanceResponse.privateIps) &&
            Objects.equals(this.publicIps, listInstanceResponse.publicIps) &&
            Objects.equals(this.port, listInstanceResponse.port) &&
            Objects.equals(this.type, listInstanceResponse.type) &&
            Objects.equals(this.ha, listInstanceResponse.ha) &&
            Objects.equals(this.replicaNum, listInstanceResponse.replicaNum) &&
            Objects.equals(this.region, listInstanceResponse.region) &&
            Objects.equals(this.datastore, listInstanceResponse.datastore) &&
            Objects.equals(this.created, listInstanceResponse.created) &&
            Objects.equals(this.updated, listInstanceResponse.updated) &&
            Objects.equals(this.dbUserName, listInstanceResponse.dbUserName) &&
            Objects.equals(this.vpcId, listInstanceResponse.vpcId) &&
            Objects.equals(this.subnetId, listInstanceResponse.subnetId) &&
            Objects.equals(this.securityGroupId, listInstanceResponse.securityGroupId) &&
            Objects.equals(this.flavorRef, listInstanceResponse.flavorRef) &&
            Objects.equals(this.flavorInfo, listInstanceResponse.flavorInfo) &&
            Objects.equals(this.volume, listInstanceResponse.volume) &&
            Objects.equals(this.switchStrategy, listInstanceResponse.switchStrategy) &&
            Objects.equals(this.backupStrategy, listInstanceResponse.backupStrategy) &&
            Objects.equals(this.maintenanceWindow, listInstanceResponse.maintenanceWindow) &&
            Objects.equals(this.relatedInstance, listInstanceResponse.relatedInstance) &&
            Objects.equals(this.nodes, listInstanceResponse.nodes) &&
            Objects.equals(this.enterpriseProjectId, listInstanceResponse.enterpriseProjectId) &&
            Objects.equals(this.diskEncryptionId, listInstanceResponse.diskEncryptionId) &&
            Objects.equals(this.chargeInfo, listInstanceResponse.chargeInfo) &&
            Objects.equals(this.timeZone, listInstanceResponse.timeZone) &&
            Objects.equals(this.tags, listInstanceResponse.tags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, privateIps, publicIps, port, type, ha, replicaNum, region, datastore, created, updated, dbUserName, vpcId, subnetId, securityGroupId, flavorRef, flavorInfo, volume, switchStrategy, backupStrategy, maintenanceWindow, relatedInstance, nodes, enterpriseProjectId, diskEncryptionId, chargeInfo, timeZone, tags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    publicIps: ").append(toIndentedString(publicIps)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    dbUserName: ").append(toIndentedString(dbUserName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    flavorInfo: ").append(toIndentedString(flavorInfo)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    switchStrategy: ").append(toIndentedString(switchStrategy)).append("\n");
        sb.append("    backupStrategy: ").append(toIndentedString(backupStrategy)).append("\n");
        sb.append("    maintenanceWindow: ").append(toIndentedString(maintenanceWindow)).append("\n");
        sb.append("    relatedInstance: ").append(toIndentedString(relatedInstance)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    diskEncryptionId: ").append(toIndentedString(diskEncryptionId)).append("\n");
        sb.append("    chargeInfo: ").append(toIndentedString(chargeInfo)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

