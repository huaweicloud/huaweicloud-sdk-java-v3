package com.huaweicloud.sdk.cbh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建堡垒机实例请求body
 */
public class CBHInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_ref")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personality")

    private Personality personality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_password")

    private String adminPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private PublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private RootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private DataVolumes dataVolumes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroup> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_availability_zone")

    private String slaveAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private ExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private String metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hx_password")

    private String hxPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bastion_type")

    private String bastionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public CBHInstances withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    /**
     * 镜像ID
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public CBHInstances withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 规格ID
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CBHInstances withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 堡垒机实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public CBHInstances withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CBHInstances withPersonality(Personality personality) {
        this.personality = personality;
        return this;
    }

    public CBHInstances withPersonality(Consumer<Personality> personalitySetter) {
        if (this.personality == null) {
            this.personality = new Personality();
            personalitySetter.accept(this.personality);
        }

        return this;
    }

    /**
     * Get personality
     * @return personality
     */
    public Personality getPersonality() {
        return personality;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }

    public CBHInstances withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 注入用户数据
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CBHInstances withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    /**
     * 初始登录密码
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public CBHInstances withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 管理员SSH秘钥登录
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public CBHInstances withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CBHInstances withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public CBHInstances addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CBHInstances withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 网卡信息
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public CBHInstances withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CBHInstances withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new PublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public PublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public CBHInstances withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 弹性数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CBHInstances withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CBHInstances withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
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

    public CBHInstances withDataVolumes(DataVolumes dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public CBHInstances withDataVolumes(Consumer<DataVolumes> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new DataVolumes();
            dataVolumesSetter.accept(this.dataVolumes);
        }

        return this;
    }

    /**
     * Get dataVolumes
     * @return dataVolumes
     */
    public DataVolumes getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(DataVolumes dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public CBHInstances withSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CBHInstances addSecurityGroupsItem(SecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CBHInstances withSecurityGroups(Consumer<List<SecurityGroup>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 网卡信息
     * @return securityGroups
     */
    public List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CBHInstances withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 分区信息
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CBHInstances withSlaveAvailabilityZone(String slaveAvailabilityZone) {
        this.slaveAvailabilityZone = slaveAvailabilityZone;
        return this;
    }

    /**
     * 备用区
     * @return slaveAvailabilityZone
     */
    public String getSlaveAvailabilityZone() {
        return slaveAvailabilityZone;
    }

    public void setSlaveAvailabilityZone(String slaveAvailabilityZone) {
        this.slaveAvailabilityZone = slaveAvailabilityZone;
    }

    public CBHInstances withExtendParam(ExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CBHInstances withExtendParam(Consumer<ExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new ExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public ExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(ExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public CBHInstances withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * 创建云服务云数据
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public CBHInstances withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 描述
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public CBHInstances withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 云服务所在区域ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CBHInstances withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region标识
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CBHInstances withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 资源规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public CBHInstances withHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
        return this;
    }

    /**
     * 前端登录密码
     * @return hxPassword
     */
    public String getHxPassword() {
        return hxPassword;
    }

    public void setHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
    }

    public CBHInstances withBastionType(String bastionType) {
        this.bastionType = bastionType;
        return this;
    }

    /**
     * 堡垒机机机型
     * @return bastionType
     */
    public String getBastionType() {
        return bastionType;
    }

    public void setBastionType(String bastionType) {
        this.bastionType = bastionType;
    }

    public CBHInstances withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 分区信息
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public CBHInstances withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 订购截止日期
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CBHInstances cbHInstances = (CBHInstances) o;
        return Objects.equals(this.imageRef, cbHInstances.imageRef)
            && Objects.equals(this.flavorRef, cbHInstances.flavorRef)
            && Objects.equals(this.instanceName, cbHInstances.instanceName)
            && Objects.equals(this.name, cbHInstances.name)
            && Objects.equals(this.personality, cbHInstances.personality)
            && Objects.equals(this.userData, cbHInstances.userData)
            && Objects.equals(this.adminPassword, cbHInstances.adminPassword)
            && Objects.equals(this.keyName, cbHInstances.keyName) && Objects.equals(this.vpcId, cbHInstances.vpcId)
            && Objects.equals(this.nics, cbHInstances.nics) && Objects.equals(this.publicIp, cbHInstances.publicIp)
            && Objects.equals(this.count, cbHInstances.count)
            && Objects.equals(this.rootVolume, cbHInstances.rootVolume)
            && Objects.equals(this.dataVolumes, cbHInstances.dataVolumes)
            && Objects.equals(this.securityGroups, cbHInstances.securityGroups)
            && Objects.equals(this.availabilityZone, cbHInstances.availabilityZone)
            && Objects.equals(this.slaveAvailabilityZone, cbHInstances.slaveAvailabilityZone)
            && Objects.equals(this.extendParam, cbHInstances.extendParam)
            && Objects.equals(this.metadata, cbHInstances.metadata)
            && Objects.equals(this.comment, cbHInstances.comment) && Objects.equals(this.region, cbHInstances.region)
            && Objects.equals(this.regionId, cbHInstances.regionId)
            && Objects.equals(this.resourceSpecCode, cbHInstances.resourceSpecCode)
            && Objects.equals(this.hxPassword, cbHInstances.hxPassword)
            && Objects.equals(this.bastionType, cbHInstances.bastionType)
            && Objects.equals(this.ipv6Enable, cbHInstances.ipv6Enable)
            && Objects.equals(this.endTime, cbHInstances.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageRef,
            flavorRef,
            instanceName,
            name,
            personality,
            userData,
            adminPassword,
            keyName,
            vpcId,
            nics,
            publicIp,
            count,
            rootVolume,
            dataVolumes,
            securityGroups,
            availabilityZone,
            slaveAvailabilityZone,
            extendParam,
            metadata,
            comment,
            region,
            regionId,
            resourceSpecCode,
            hxPassword,
            bastionType,
            ipv6Enable,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CBHInstances {\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    personality: ").append(toIndentedString(personality)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    adminPassword: ").append(toIndentedString(adminPassword)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    slaveAvailabilityZone: ").append(toIndentedString(slaveAvailabilityZone)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    hxPassword: ").append(toIndentedString(hxPassword)).append("\n");
        sb.append("    bastionType: ").append(toIndentedString(bastionType)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
