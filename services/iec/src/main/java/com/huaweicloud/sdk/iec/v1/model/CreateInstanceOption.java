package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建边缘实例请求参数
 */
public class CreateInstanceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_prefix")

    private Boolean withPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_ref")

    private String imageRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_pass")

    private String adminPass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_name")

    private String keyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_config")

    private NetConfigInstance netConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandwidthConfigInstance bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private RootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<DataVolume> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupOption> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coverage")

    private CoverageInstance coverage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public CreateInstanceOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘资源名称，与边缘实例一一对应。 取值范围：只能由中文字符、大小写英文字母、数字及中划线、下划线组成，且长度为[1-48]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstanceOption withWithPrefix(Boolean withPrefix) {
        this.withPrefix = withPrefix;
        return this;
    }

    /**
     * 是否自动添加前缀。 - with_prefix为false时不拼接IEC前缀 - with_prefix不传或者传true时拼自动IEC前缀  以name为iec为例： 不添加前缀时实例名称为：iec 自动添加前缀实例名称为：IEC-ZS01-iec
     * @return withPrefix
     */
    public Boolean getWithPrefix() {
        return withPrefix;
    }

    public void setWithPrefix(Boolean withPrefix) {
        this.withPrefix = withPrefix;
    }

    public CreateInstanceOption withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    /**
     * 边缘实例的系统镜像，需要指定已创建镜像的ID，ID格式为通用唯一识别码（Universally Unique Identifier，简称UUID）。 镜像的ID可以从控制台或者参考本文档的“查询边镜像列表”的章节获取。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public CreateInstanceOption withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * 边缘实例的系统规格的ID。 已上线的规格请使用接口 “查询边缘实例规格列表“ 进行查询。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public CreateInstanceOption withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    /**
     * 如果需要使用密码方式登录边缘实例，可使用adminPass字段指定边缘实例管理员帐户初始登录密码。其中，Linux管理员帐户为root，Windows管理员帐户为Administrator。 密码复杂度要求： 1. 长度为8-26位。 2. 密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。 3. 密码不能包含用户名或用户名的逆序。 4. Windows系统密码不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。 说明 目前边缘实例不支持创建后设置密码，不设置此参数会导致实例创建后无法登录。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public CreateInstanceOption withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * 密钥对名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public CreateInstanceOption withNetConfig(NetConfigInstance netConfig) {
        this.netConfig = netConfig;
        return this;
    }

    public CreateInstanceOption withNetConfig(Consumer<NetConfigInstance> netConfigSetter) {
        if (this.netConfig == null) {
            this.netConfig = new NetConfigInstance();
            netConfigSetter.accept(this.netConfig);
        }

        return this;
    }

    /**
     * Get netConfig
     * @return netConfig
     */
    public NetConfigInstance getNetConfig() {
        return netConfig;
    }

    public void setNetConfig(NetConfigInstance netConfig) {
        this.netConfig = netConfig;
    }

    public CreateInstanceOption withBandwidth(BandwidthConfigInstance bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public CreateInstanceOption withBandwidth(Consumer<BandwidthConfigInstance> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandwidthConfigInstance();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthConfigInstance getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthConfigInstance bandwidth) {
        this.bandwidth = bandwidth;
    }

    public CreateInstanceOption withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public CreateInstanceOption withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
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

    public CreateInstanceOption withDataVolumes(List<DataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public CreateInstanceOption addDataVolumesItem(DataVolume dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public CreateInstanceOption withDataVolumes(Consumer<List<DataVolume>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 边缘实例对应数据盘相关配置。每一个数据结构代表一块待创建的数据盘。 约束：目前边缘实例最多可挂载2块数据盘
     * @return dataVolumes
     */
    public List<DataVolume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public CreateInstanceOption withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 边缘实例数量。
     * minimum: 1
     * maximum: 50
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateInstanceOption withSecurityGroups(List<SecurityGroupOption> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public CreateInstanceOption addSecurityGroupsItem(SecurityGroupOption securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public CreateInstanceOption withSecurityGroups(Consumer<List<SecurityGroupOption>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 边缘业务对应安全组信息。
     * @return securityGroups
     */
    public List<SecurityGroupOption> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupOption> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public CreateInstanceOption withCoverage(CoverageInstance coverage) {
        this.coverage = coverage;
        return this;
    }

    public CreateInstanceOption withCoverage(Consumer<CoverageInstance> coverageSetter) {
        if (this.coverage == null) {
            this.coverage = new CoverageInstance();
            coverageSetter.accept(this.coverage);
        }

        return this;
    }

    /**
     * Get coverage
     * @return coverage
     */
    public CoverageInstance getCoverage() {
        return coverage;
    }

    public void setCoverage(CoverageInstance coverage) {
        this.coverage = coverage;
    }

    public CreateInstanceOption withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 创建边缘实例过程中注入用户数据。支持注入文本、文本文件或gzip文件。 更多关于待注入用户数据的信息，请参见《弹性云服务器用户指南 》的“[用户数据注入](https://support.huaweicloud.com/usermanual-ecs/zh-cn_topic_0032380449.html)”章节。    
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceOption that = (CreateInstanceOption) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.withPrefix, that.withPrefix)
            && Objects.equals(this.imageRef, that.imageRef) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.adminPass, that.adminPass) && Objects.equals(this.keyName, that.keyName)
            && Objects.equals(this.netConfig, that.netConfig) && Objects.equals(this.bandwidth, that.bandwidth)
            && Objects.equals(this.rootVolume, that.rootVolume) && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.count, that.count) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.coverage, that.coverage) && Objects.equals(this.userData, that.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            withPrefix,
            imageRef,
            flavorRef,
            adminPass,
            keyName,
            netConfig,
            bandwidth,
            rootVolume,
            dataVolumes,
            count,
            securityGroups,
            coverage,
            userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    withPrefix: ").append(toIndentedString(withPrefix)).append("\n");
        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    netConfig: ").append(toIndentedString(netConfig)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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
