package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.BandwidthConfig;
import com.huaweicloud.sdk.iec.v1.model.DataVolume;
import com.huaweicloud.sdk.iec.v1.model.NetConfig;
import com.huaweicloud.sdk.iec.v1.model.RootVolume;
import com.huaweicloud.sdk.iec.v1.model.SecurityGroupOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 边缘资源对象
 */
public class Resource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="with_prefix")
    
    private Boolean withPrefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_ref")
    
    private String imageRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_pass")
    
    private String adminPass;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="net_config")
    
    private NetConfig netConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private BandwidthConfig bandwidth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="root_volume")
    
    private RootVolume rootVolume;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_volumes")
    
    private List<DataVolume> dataVolumes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroupOption> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;

    public Resource withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 边缘实例名称。 取值范围： 只能由中文字符、英文字母 (大小写)、数字及“_”、“-”、“.” 组成。 创建的边缘实例数量（count字段对应的值）大于1时，为区分不同边缘实例，创建过程中系统会自动在名称后加“-000x”的类似标记。  >  华为云边缘实例内部主机名 （hostname）命名规则遵循RFC 952和RFC 1123命名规范，建议使用a-zA-z或0-9以及中划线'-'组成的名称命名，' _' 将在边缘实例内部默认转化为'-'。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public Resource withWithPrefix(Boolean withPrefix) {
        this.withPrefix = withPrefix;
        return this;
    }

    


    /**
     * 是否自动添加名称前缀。 - with_prefix为false时不拼接IEC前缀 - with_prefix不传或者传true时拼自动IEC前缀  以name为iec为例： 不添加前缀时实例名称为：iec-0001 自动添加前缀实例名称为：IEC-ZS01-iec-0001 0001为创建边缘业务时根据实例个数自动添加的编号
     * @return withPrefix
     */
    public Boolean getWithPrefix() {
        return withPrefix;
    }

    public void setWithPrefix(Boolean withPrefix) {
        this.withPrefix = withPrefix;
    }

    

    public Resource withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    


    /**
     * 待发放边缘实例的系统镜像，需要指定已创建镜像的ID。 > 镜像的ID可以从控制台或者参考本文档的“查询边镜像列表”的章节获取。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    

    public Resource withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 边缘实例的系统规格的ID。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    

    public Resource withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    


    /**
     * 如果需要使用密码方式登录边缘实例，可使用admin_pass字段指定边缘实例管理员帐户初始登录密码。其中，Linux管理员帐户为root，Windows管理员帐户为Administrator。  密码复杂度要求： - 长度为8-26位。 - 密码至少必须包含大写字母、小写字母、数字和特殊字符（!@$%^-_=+[{}]:,./?）中的三种。 - 密码不能包含用户名或用户名的逆序。 - Windows系统密码不能包含用户名或用户名的逆序，不能包含用户名中超过两个连续字符的部分。  >   目前边缘实例不支持创建后设置密码，不设置此参数会导致实例无法登录。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    

    public Resource withKeyName(String keyName) {
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

    

    public Resource withNetConfig(NetConfig netConfig) {
        this.netConfig = netConfig;
        return this;
    }

    public Resource withNetConfig(Consumer<NetConfig> netConfigSetter) {
        if(this.netConfig == null ){
            this.netConfig = new NetConfig();
            netConfigSetter.accept(this.netConfig);
        }
        
        return this;
    }


    /**
     * Get netConfig
     * @return netConfig
     */
    public NetConfig getNetConfig() {
        return netConfig;
    }

    public void setNetConfig(NetConfig netConfig) {
        this.netConfig = netConfig;
    }

    

    public Resource withBandwidth(BandwidthConfig bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Resource withBandwidth(Consumer<BandwidthConfig> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new BandwidthConfig();
            bandwidthSetter.accept(this.bandwidth);
        }
        
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandwidthConfig getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandwidthConfig bandwidth) {
        this.bandwidth = bandwidth;
    }

    

    public Resource withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public Resource withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
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

    

    public Resource withDataVolumes(List<DataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    
    public Resource addDataVolumesItem(DataVolume dataVolumesItem) {
        if(this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public Resource withDataVolumes(Consumer<List<DataVolume>> dataVolumesSetter) {
        if(this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * 边缘实例对应数据盘相关配置。每一个数据结构代表一块待创建的数据盘。  约束：目前边缘实例最多可挂载2块数据盘
     * @return dataVolumes
     */
    public List<DataVolume> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DataVolume> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    

    public Resource withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 边缘实例数量。 不传该字段时默认取值为1。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public Resource withSecurityGroups(List<SecurityGroupOption> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public Resource addSecurityGroupsItem(SecurityGroupOption securityGroupsItem) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public Resource withSecurityGroups(Consumer<List<SecurityGroupOption>> securityGroupsSetter) {
        if(this.securityGroups == null) {
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

    

    public Resource withUserData(String userData) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return Objects.equals(this.name, resource.name) &&
            Objects.equals(this.withPrefix, resource.withPrefix) &&
            Objects.equals(this.imageRef, resource.imageRef) &&
            Objects.equals(this.flavorRef, resource.flavorRef) &&
            Objects.equals(this.adminPass, resource.adminPass) &&
            Objects.equals(this.keyName, resource.keyName) &&
            Objects.equals(this.netConfig, resource.netConfig) &&
            Objects.equals(this.bandwidth, resource.bandwidth) &&
            Objects.equals(this.rootVolume, resource.rootVolume) &&
            Objects.equals(this.dataVolumes, resource.dataVolumes) &&
            Objects.equals(this.count, resource.count) &&
            Objects.equals(this.securityGroups, resource.securityGroups) &&
            Objects.equals(this.userData, resource.userData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, withPrefix, imageRef, flavorRef, adminPass, keyName, netConfig, bandwidth, rootVolume, dataVolumes, count, securityGroups, userData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
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

