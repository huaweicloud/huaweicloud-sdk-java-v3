package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.BackupPolicy;
import com.huaweicloud.sdk.dcs.v2.model.BssParam;
import com.huaweicloud.sdk.dcs.v2.model.ResourceTag;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * CreateInstanceBody
 */
public class CreateInstanceBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_id")
    
    private String publicipId = "false";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_ssl")
    
    private Boolean enableSsl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private_ip")
    
    private String privateIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="capacity")
    
    private Float capacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_num")
    
    private Integer instanceNum = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_begin")
    
    private String maintainBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_end")
    
    private String maintainEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine")
    
    private String engine;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_version")
    
    private String engineVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="no_password_access")
    
    private Boolean noPasswordAccess = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bss_param")
    
    private BssParam bssParam = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_backup_policy")
    
    private BackupPolicy instanceBackupPolicy = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="az_codes")
    
    private List<String> azCodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<ResourceTag> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_user")
    
    private String accessUser;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_publicip")
    
    private Boolean enablePublicip = false;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rename_commands")
    
    private Object renameCommands = null;

    public CreateInstanceBody withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    


    /**
     * Redis缓存实例绑定的弹性IP地址的id。  如果开启了公网访问功能（即enable_publicip为true），该字段为必选。 
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public CreateInstanceBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateInstanceBody withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    


    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public CreateInstanceBody withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * 虚拟私有云ID。  获取方法如下：   - 方法1：登录虚拟私有云服务的控制台界面，在虚拟私有云的详情页面查找VPC ID。   - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询VPC列表](https://support.huaweicloud.com/api-vpc/vpc_api01_0003.html) 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateInstanceBody withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 实例的描述信息。  长度不超过1024的字符串。 > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstanceBody withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 指定实例所属的安全组。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，在安全组的详情页面查找安全组ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询安全组列表](https://support.huaweicloud.com/api-vpc/vpc_sg01_0002.html) 
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public CreateInstanceBody withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    


    /**
     * Redis缓存实例开启公网访问功能时，是否选择支持ssl。 - true：开启 - false：不开启 
     * @return enableSsl
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }

    public CreateInstanceBody withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    


    /**
     * 创建缓存实例手动指定的IP地址,支持Redis和Memcached。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public CreateInstanceBody withCapacity(Float capacity) {
        this.capacity = capacity;
        return this;
    }

    


    /**
     * 缓存容量（G Byte） - Redis3.0：单机和主备类型实例取值：2、4、8、16、32、64。Proxy集群实例规格支持64、128、256、512和1024。 - Redis4.0和Redis5.0：单机和主备类型实例取值：0.125、0.25、0.5、1、2、4、8、16、32、64。Cluster集群实例规格支持24、32、48、64、96、128、192、256、384、512、768、1024。 - Memcached：单机和主备类型实例取值：2、4、8、16、32、64。 
     * @return capacity
     */
    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public CreateInstanceBody withInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }

    


    /**
     * 表示批量创建缓存实例时，购买的实例个数。仅Redis和Memcached实例支持批量创建。  默认值：1  取值范围：1-100 
     * @return instanceNum
     */
    public Integer getInstanceNum() {
        return instanceNum;
    }

    public void setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
    }

    public CreateInstanceBody withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    


    /**
     * 维护时间窗开始时间，格式为HH:mm:ss - 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-dcs/ListMaintenanceWindows.html)获取 - 开始时间必须为22:00:00、02:00:00、06:00:00、10:00:00、14:00:00和18:00:00。 - 该参数不能单独为空，若该值为空，则结束时间也为空。系统分配一个默认开始时间02:00:00。 
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public CreateInstanceBody withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    


    /**
     * 维护时间窗结束时间，格式为HH:mm:ss。 - 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-dcs/ListMaintenanceWindows.html)获取 - 结束时间在开始时间基础上加四个小时，即当开始时间为22:00:00时，结束时间为02:00:00。 - 该参数不能单独为空，若该值为空，则开始时间也为空，系统分配一个默认结束时间06:00:00。 
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public CreateInstanceBody withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 缓存实例的认证信息 > 当“no_password_access”配置为“false”或未配置时，请求消息中须包含password参数。 Redis类型的缓存实例密码复杂度要求： - 输入长度为8到32位的字符串。 - 新密码不能与旧密码相同。 - 必须包含如下四种字符中的三种组合：   - 小写字母   - 大写字母   - 数字   - 特殊字符包括（`~!@#$%^&*()-_=+\\|[{}]:'\",<.>/?） 
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateInstanceBody withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    


    /**
     * 缓存引擎：Redis和Memcached。
     * @return engine
     */
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public CreateInstanceBody withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    


    /**
     * 缓存版本，当缓存引擎为Redis时，取值为3.0、4.0或5.0。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public CreateInstanceBody withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 产品规格编码。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public CreateInstanceBody withNoPasswordAccess(Boolean noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
        return this;
    }

    


    /**
     * 是否允许免密码访问缓存实例。 - true：该实例无需密码即可访问。 - false：该实例必须通过密码认证才能访问。 若未配置该参数则默认值为“false”。 
     * @return noPasswordAccess
     */
    public Boolean getNoPasswordAccess() {
        return noPasswordAccess;
    }

    public void setNoPasswordAccess(Boolean noPasswordAccess) {
        this.noPasswordAccess = noPasswordAccess;
    }

    public CreateInstanceBody withBssParam(BssParam bssParam) {
        this.bssParam = bssParam;
        return this;
    }

    public CreateInstanceBody withBssParam(Consumer<BssParam> bssParamSetter) {
        if(this.bssParam == null ){
            this.bssParam = new BssParam();
        }
        bssParamSetter.accept(this.bssParam);
        return this;
    }


    /**
     * Get bssParam
     * @return bssParam
     */
    public BssParam getBssParam() {
        return bssParam;
    }

    public void setBssParam(BssParam bssParam) {
        this.bssParam = bssParam;
    }

    public CreateInstanceBody withInstanceBackupPolicy(BackupPolicy instanceBackupPolicy) {
        this.instanceBackupPolicy = instanceBackupPolicy;
        return this;
    }

    public CreateInstanceBody withInstanceBackupPolicy(Consumer<BackupPolicy> instanceBackupPolicySetter) {
        if(this.instanceBackupPolicy == null ){
            this.instanceBackupPolicy = new BackupPolicy();
        }
        instanceBackupPolicySetter.accept(this.instanceBackupPolicy);
        return this;
    }


    /**
     * Get instanceBackupPolicy
     * @return instanceBackupPolicy
     */
    public BackupPolicy getInstanceBackupPolicy() {
        return instanceBackupPolicy;
    }

    public void setInstanceBackupPolicy(BackupPolicy instanceBackupPolicy) {
        this.instanceBackupPolicy = instanceBackupPolicy;
    }

    public CreateInstanceBody withAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
        return this;
    }

    
    public CreateInstanceBody addAzCodesItem(String azCodesItem) {
        if (this.azCodes == null) {
            this.azCodes = new ArrayList<>();
        }
        this.azCodes.add(azCodesItem);
        return this;
    }

    public CreateInstanceBody withAzCodes(Consumer<List<String>> azCodesSetter) {
        if(this.azCodes == null ){
            this.azCodes = new ArrayList<>();
        }
        azCodesSetter.accept(this.azCodes);
        return this;
    }

    /**
     * 创建缓存节点到指定且有资源的可用区Code。创建缓存节点到指定且有资源的可用区Code。具体查询方法，请参考[查询可用区信息](https://support.huaweicloud.com/api-dcs/ListAvailableZones.html),，在查询时，请注意查看该可用区是否有资源。  如果是创建主备、Proxy集群、Cluster集群实例，支持跨可用区部署，可以为备节点指定备可用区。在为节点指定可用区时，用逗号分隔开，具体请查看示例。 
     * @return azCodes
     */
    public List<String> getAzCodes() {
        return azCodes;
    }

    public void setAzCodes(List<String> azCodes) {
        this.azCodes = azCodes;
    }

    public CreateInstanceBody withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    
    public CreateInstanceBody addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateInstanceBody withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 实例标签键值。
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public CreateInstanceBody withAccessUser(String accessUser) {
        this.accessUser = accessUser;
        return this;
    }

    


    /**
     * 当缓存类型为Redis时，则不需要设置，保持为空即可。  当缓存引擎为Memcached，且“no_password_access”为“false”时才需要设置，表示通过密码认证访问缓存实例的认证用户名。  由英文字符开头，只能由英文字母、数字、中划线和下划线组成，长度为1~64的字符。 >   - 当缓存引擎为Memcached时，该参数为可选项。   - 当缓存引擎为Redis时，该参数不需要设置。 
     * @return accessUser
     */
    public String getAccessUser() {
        return accessUser;
    }

    public void setAccessUser(String accessUser) {
        this.accessUser = accessUser;
    }

    public CreateInstanceBody withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    


    /**
     * Redis缓存实例是否开启公网访问功能。 - true：开启 - false：不开启 
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public CreateInstanceBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。 由英文字符开头，只能由英文字母、数字、中划线和下划线组成。 创建单个实例时，名称长度为4到64位的字符串。批量创建实例时，名称长度为4到56位的字符串，且实例名称格式为“自定义名称-n”，其中n从000开始，依次递增。例如，批量创建两个实例，自定义名称为dcs_demo，则两个实例的名称为dcs_demo-000和dcs_demo-001。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * 子网的网络ID。  获取方法如下： - 方法1：登录虚拟私有云服务的控制台界面，单击VPC下的子网，进入子网详情页面，查找网络ID。 - 方法2：通过虚拟私有云服务的API接口查询，具体操作可参考[查询子网列表](https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html) 
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public CreateInstanceBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    


    /**
     * 实例自定义端口。只有创建Redis4.0和Redis5.0实例才支持自定义端口，Redis3.0和Memcached实例不支持。  创建Redis4.0和Redis5.0实例，如果没发送该参数或该参数为空，表示实例使用默认端口6379。如果自定义端口，端口范围为1~65535的任意数字。 
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CreateInstanceBody withRenameCommands(Object renameCommands) {
        this.renameCommands = renameCommands;
        return this;
    }

    


    /**
     * 支持自定义重命名高危命令。只有创建Redis4.0和Redis5.0实例才支持重命名高危命令，Redis3.0和Memcached实例不支持。  创建Redis4.0和Redis5.0实例，如果没发送该参数或该参数为空，表示没有需要重命名的命令。当前支持重命名的高危命令有command、keys、flushdb、flushall和hgetall，其他命令暂不支持重命名。 
     * @return renameCommands
     */
    public Object getRenameCommands() {
        return renameCommands;
    }

    public void setRenameCommands(Object renameCommands) {
        this.renameCommands = renameCommands;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceBody createInstanceBody = (CreateInstanceBody) o;
        return Objects.equals(this.publicipId, createInstanceBody.publicipId) &&
            Objects.equals(this.enterpriseProjectId, createInstanceBody.enterpriseProjectId) &&
            Objects.equals(this.enterpriseProjectName, createInstanceBody.enterpriseProjectName) &&
            Objects.equals(this.vpcId, createInstanceBody.vpcId) &&
            Objects.equals(this.description, createInstanceBody.description) &&
            Objects.equals(this.securityGroupId, createInstanceBody.securityGroupId) &&
            Objects.equals(this.enableSsl, createInstanceBody.enableSsl) &&
            Objects.equals(this.privateIp, createInstanceBody.privateIp) &&
            Objects.equals(this.capacity, createInstanceBody.capacity) &&
            Objects.equals(this.instanceNum, createInstanceBody.instanceNum) &&
            Objects.equals(this.maintainBegin, createInstanceBody.maintainBegin) &&
            Objects.equals(this.maintainEnd, createInstanceBody.maintainEnd) &&
            Objects.equals(this.password, createInstanceBody.password) &&
            Objects.equals(this.engine, createInstanceBody.engine) &&
            Objects.equals(this.engineVersion, createInstanceBody.engineVersion) &&
            Objects.equals(this.specCode, createInstanceBody.specCode) &&
            Objects.equals(this.noPasswordAccess, createInstanceBody.noPasswordAccess) &&
            Objects.equals(this.bssParam, createInstanceBody.bssParam) &&
            Objects.equals(this.instanceBackupPolicy, createInstanceBody.instanceBackupPolicy) &&
            Objects.equals(this.azCodes, createInstanceBody.azCodes) &&
            Objects.equals(this.tags, createInstanceBody.tags) &&
            Objects.equals(this.accessUser, createInstanceBody.accessUser) &&
            Objects.equals(this.enablePublicip, createInstanceBody.enablePublicip) &&
            Objects.equals(this.name, createInstanceBody.name) &&
            Objects.equals(this.subnetId, createInstanceBody.subnetId) &&
            Objects.equals(this.port, createInstanceBody.port) &&
            Objects.equals(this.renameCommands, createInstanceBody.renameCommands);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publicipId, enterpriseProjectId, enterpriseProjectName, vpcId, description, securityGroupId, enableSsl, privateIp, capacity, instanceNum, maintainBegin, maintainEnd, password, engine, engineVersion, specCode, noPasswordAccess, bssParam, instanceBackupPolicy, azCodes, tags, accessUser, enablePublicip, name, subnetId, port, renameCommands);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceBody {\n");
            sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
            sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
            sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
            sb.append("    enableSsl: ").append(toIndentedString(enableSsl)).append("\n");
            sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
            sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
            sb.append("    instanceNum: ").append(toIndentedString(instanceNum)).append("\n");
            sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
            sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
            sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
            sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
            sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
            sb.append("    noPasswordAccess: ").append(toIndentedString(noPasswordAccess)).append("\n");
            sb.append("    bssParam: ").append(toIndentedString(bssParam)).append("\n");
            sb.append("    instanceBackupPolicy: ").append(toIndentedString(instanceBackupPolicy)).append("\n");
            sb.append("    azCodes: ").append(toIndentedString(azCodes)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    accessUser: ").append(toIndentedString(accessUser)).append("\n");
            sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
            sb.append("    port: ").append(toIndentedString(port)).append("\n");
            sb.append("    renameCommands: ").append(toIndentedString(renameCommands)).append("\n");
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

