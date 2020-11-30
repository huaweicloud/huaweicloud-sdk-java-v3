package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.DataVolumes;
import com.huaweicloud.sdk.bms.v1.model.ExtendParam;
import com.huaweicloud.sdk.bms.v1.model.MetaDataInfo;
import com.huaweicloud.sdk.bms.v1.model.Nics;
import com.huaweicloud.sdk.bms.v1.model.PublicIp;
import com.huaweicloud.sdk.bms.v1.model.RootVolume;
import com.huaweicloud.sdk.bms.v1.model.SchedulerHints;
import com.huaweicloud.sdk.bms.v1.model.SecurityGroupsInfo;
import com.huaweicloud.sdk.bms.v1.model.SystemTags;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * server字段数据结构说明
 */
public class CreateServers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="imageRef")
    
    private UUID imageRef = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavorRef")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private MetaDataInfo metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminPass")
    
    private String adminPass;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroupsInfo> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nics")
    
    private List<Nics> nics = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpcid")
    
    private UUID vpcid = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip")
    
    private PublicIp publicip = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="root_volume")
    
    private RootVolume rootVolume = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volumes")
    
    private List<DataVolumes> dataVolumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extendparam")
    
    private ExtendParam extendparam = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schedulerHints")
    
    private SchedulerHints schedulerHints = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_tags")
    
    private List<SystemTags> serverTags = null;
    
    public CreateServers withImageRef(UUID imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    


    /**
     * 裸金属服务器使用的镜像ID或者镜像资源的URL。ID格式为通用唯一识别码（Universally Unique Identifier，简称UUID）。镜像ID可以从镜像服务控制台获取，或者参考《镜像服务API参考》的“查询镜像列表”章节查询。在使用“查询镜像列表”API查询时，可以添加过滤字段“?virtual_env_type=Ironic”来筛选裸金属服务器镜像。
     * @return imageRef
     */
    public UUID getImageRef() {
        return imageRef;
    }

    public void setImageRef(UUID imageRef) {
        this.imageRef = imageRef;
    }

    public CreateServers withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 裸金属服务器使用的规格ID，格式为physical.x.x。规格ID可以从裸金属服务器控制台获取，也可以通过7.7.1-查询裸金属服务器规格信息列表（OpenStack原生）API查询。 说明：裸金属服务器规格与镜像间的约束关系请参见裸金属服务器类型与支持的操作系统版本。对于physical.x.x.hba类型的规格，申请的租户只能是DeC租户，且只能挂载DESS卷。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateServers withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 裸金属服务器名称。取值范围：只能由中文字符、英文字母（a~z，A~Z）、数字（0~9）、下划线（_）、中划线（-）、点（.）组成，且长度为[1-63]个字符。创建的裸金属服务器数量大于1时，为区分不同裸金属服务器，创建过程中系统会自动在名称后加“-0000”的类似标记。故此时名称的长度为[1-58]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateServers withMetadata(MetaDataInfo metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateServers withMetadata(Consumer<MetaDataInfo> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new MetaDataInfo();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public MetaDataInfo getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaDataInfo metadata) {
        this.metadata = metadata;
    }

    public CreateServers withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 创建裸金属服务器过程中待注入的用户数据。支持注入文本、文本文件或gzip文件。约束：注入内容，需要进行base64格式编码。注入内容（编码之前的内容）最大长度32KB。当key_name没有指定时，user_data注入的数据默认为裸金属服务器root帐户的登录密码。创建密码方式鉴权的Linux裸金属服务器时为必填项，为root用户注入自定义初始化密码。建议密码复杂度如下：长度为8-26位。密码至少必须包含大写字母（A-Z）、小写字母（a-z）、数字（0-9）和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。示例：使用明文密码（存在安全风险），以密码cloud.1234为例：#!/bin/bash echo 'root:Cloud.1234' | chpasswd ;使用密码：#!/bin/bash echo 'root:$6$V6azyeLwcD3CHlpY$BN3VVq18fmCkj66B4zdHLWevqcxlig' | chpasswd -e其中，$6$V6azyeLwcD3CHlpY$BN3VVq18fmCkj66B4zdHLWevqcxlig为密文密码
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CreateServers withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    


    /**
     * 如果需要使用密码方式登录裸金属服务器，可使用adminPass字段指定裸金属服务器管理员帐户初始登录密码。其中，Linux管理员帐户为root，Windows管理员帐户为Administrator。密码复杂度要求：长度为8-26位。密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。Linux系统密码不能包含用户名或用户名的逆序。Windows系统密码不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public CreateServers withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    


    /**
     * 扩展属性，指定密钥的名称。如果需要使用SSH密钥方式登录裸金属服务器，请指定已有密钥的名称。密钥可以通过7.10.3-创建和导入SSH密钥（OpenStack原生）API创建，或者使用7.10.1-查询SSH密钥列表（OpenStack原生）API查询已有的密钥。约束：当key_name和user_data同时指定时，user_data只能用做用户数据注入。Windows裸金属服务器登录时，首先需要将密钥解析为密码，然后通过远程登录工具进行登录。具体请参见“MSTSC密码方式登录”“MSTSC密码方式登录”。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public CreateServers withSecurityGroups(List<SecurityGroupsInfo> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public CreateServers addSecurityGroupsItem(SecurityGroupsInfo securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateServers withSecurityGroups(Consumer<List<SecurityGroupsInfo>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 指定裸金属服务器的安全组。详情请参见表 security_groups字段数据结构说明。
     * @return securityGroups
     */
    public List<SecurityGroupsInfo> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupsInfo> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateServers withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    
    public CreateServers addNicsItem(Nics nicsItem) {
        this.nics.add(nicsItem);
        return this;
    }

    public CreateServers withNics(Consumer<List<Nics>> nicsSetter) {
        if(this.nics == null ){
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 指定裸金属服务器的网卡信息。详情请参见表 nics字段数据结构说明。约束：一个裸金属服务器最多挂载2个网卡，参数中第一个网卡会作为裸金属服务器的主网卡。若用户指定了多组网卡参数，需保证各组参数都属于同一VPC。
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public CreateServers withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 裸金属服务器对应可用区信息，需要指定可用区（AZ）的名称。请参考地区和终端节点获取。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateServers withVpcid(UUID vpcid) {
        this.vpcid = vpcid;
        return this;
    }

    


    /**
     * 创建裸金属服务器所属虚拟私有云（VPC），需要指定已有VPC的ID，UUID格式。VPC的ID可以从网络控制台或者参考《虚拟私有云API参考》的“查询VPC”。
     * @return vpcid
     */
    public UUID getVpcid() {
        return vpcid;
    }

    public void setVpcid(UUID vpcid) {
        this.vpcid = vpcid;
    }

    public CreateServers withPublicip(PublicIp publicip) {
        this.publicip = publicip;
        return this;
    }

    public CreateServers withPublicip(Consumer<PublicIp> publicipSetter) {
        if(this.publicip == null ){
            this.publicip = new PublicIp();
            publicipSetter.accept(this.publicip);
        }
        
        return this;
    }


    /**
     * Get publicip
     * @return publicip
     */
    public PublicIp getPublicip() {
        return publicip;
    }

    public void setPublicip(PublicIp publicip) {
        this.publicip = publicip;
    }

    public CreateServers withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 创建裸金属服务器的数量。约束：不传该字段时默认取值为1。租户的配额足够时，最大值为24。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateServers withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateServers withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
        if(this.rootVolume == null ){
            this.rootVolume = new RootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }
        
        return this;
    }


    /**
     * Get rootVolume
     * @return rootVolume
     */
    public RootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public CreateServers withDataVolumes(List<DataVolumes> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    
    public CreateServers addDataVolumesItem(DataVolumes dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public CreateServers withDataVolumes(Consumer<List<DataVolumes>> dataVolumesSetter) {
        if(this.dataVolumes == null ){
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 裸金属服务器对应数据盘相关配置。每一个数据结构代表一个待创建的数据盘。详情请参见表 data_volumes字段数据结构说明。约束：目前裸金属服务器最多可挂载60块云硬盘（包括系统盘和数据盘）。
     * @return dataVolumes
     */
    public List<DataVolumes> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DataVolumes> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public CreateServers withExtendparam(ExtendParam extendparam) {
        this.extendparam = extendparam;
        return this;
    }

    public CreateServers withExtendparam(Consumer<ExtendParam> extendparamSetter) {
        if(this.extendparam == null ){
            this.extendparam = new ExtendParam();
            extendparamSetter.accept(this.extendparam);
        }
        
        return this;
    }


    /**
     * Get extendparam
     * @return extendparam
     */
    public ExtendParam getExtendparam() {
        return extendparam;
    }

    public void setExtendparam(ExtendParam extendparam) {
        this.extendparam = extendparam;
    }

    public CreateServers withSchedulerHints(SchedulerHints schedulerHints) {
        this.schedulerHints = schedulerHints;
        return this;
    }

    public CreateServers withSchedulerHints(Consumer<SchedulerHints> schedulerHintsSetter) {
        if(this.schedulerHints == null ){
            this.schedulerHints = new SchedulerHints();
            schedulerHintsSetter.accept(this.schedulerHints);
        }
        
        return this;
    }


    /**
     * Get schedulerHints
     * @return schedulerHints
     */
    public SchedulerHints getSchedulerHints() {
        return schedulerHints;
    }

    public void setSchedulerHints(SchedulerHints schedulerHints) {
        this.schedulerHints = schedulerHints;
    }

    public CreateServers withServerTags(List<SystemTags> serverTags) {
        this.serverTags = serverTags;
        return this;
    }

    
    public CreateServers addServerTagsItem(SystemTags serverTagsItem) {
        if (this.serverTags == null) {
            this.serverTags = new ArrayList<>();
        }
        this.serverTags.add(serverTagsItem);
        return this;
    }

    public CreateServers withServerTags(Consumer<List<SystemTags>> serverTagsSetter) {
        if(this.serverTags == null ){
            this.serverTags = new ArrayList<>();
        }
        serverTagsSetter.accept(this.serverTags);
        return this;
    }

    /**
     * 裸金属服务器的标签。详情请参见表 server_tags字段数据结构说明。 说明：创建裸金属服务器时，一台裸金属服务器最多可以添加10个标签。其中，__type_baremetal为系统内部标签，因此实际能添加的标签为9个。
     * @return serverTags
     */
    public List<SystemTags> getServerTags() {
        return serverTags;
    }

    public void setServerTags(List<SystemTags> serverTags) {
        this.serverTags = serverTags;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateServers createServers = (CreateServers) o;
        return Objects.equals(this.imageRef, createServers.imageRef) &&
            Objects.equals(this.flavorRef, createServers.flavorRef) &&
            Objects.equals(this.name, createServers.name) &&
            Objects.equals(this.metadata, createServers.metadata) &&
            Objects.equals(this.userData, createServers.userData) &&
            Objects.equals(this.adminPass, createServers.adminPass) &&
            Objects.equals(this.keyName, createServers.keyName) &&
            Objects.equals(this.securityGroups, createServers.securityGroups) &&
            Objects.equals(this.nics, createServers.nics) &&
            Objects.equals(this.availabilityZone, createServers.availabilityZone) &&
            Objects.equals(this.vpcid, createServers.vpcid) &&
            Objects.equals(this.publicip, createServers.publicip) &&
            Objects.equals(this.count, createServers.count) &&
            Objects.equals(this.rootVolume, createServers.rootVolume) &&
            Objects.equals(this.dataVolumes, createServers.dataVolumes) &&
            Objects.equals(this.extendparam, createServers.extendparam) &&
            Objects.equals(this.schedulerHints, createServers.schedulerHints) &&
            Objects.equals(this.serverTags, createServers.serverTags);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageRef, flavorRef, name, metadata, userData, adminPass, keyName, securityGroups, nics, availabilityZone, vpcid, publicip, count, rootVolume, dataVolumes, extendparam, schedulerHints, serverTags);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServers {\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    vpcid: ").append(toIndentedString(vpcid)).append("\n");
        sb.append("    publicip: ").append(toIndentedString(publicip)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    extendparam: ").append(toIndentedString(extendparam)).append("\n");
        sb.append("    schedulerHints: ").append(toIndentedString(schedulerHints)).append("\n");
        sb.append("    serverTags: ").append(toIndentedString(serverTags)).append("\n");
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

