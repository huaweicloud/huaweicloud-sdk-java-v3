package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.Disk;
import com.huaweicloud.sdk.as.v1.model.MetaData;
import com.huaweicloud.sdk.as.v1.model.Personality;
import com.huaweicloud.sdk.as.v1.model.PublicIp;
import com.huaweicloud.sdk.as.v1.model.SecurityGroups;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例配置信息
 */
public class InstanceConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavorRef")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="imageRef")
    
    private String imageRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disk")
    
    private List<Disk> disk = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="personality")
    
    private List<Personality> personality = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private PublicIp publicIp = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private MetaData metadata = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroups> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_group_id")
    
    private String serverGroupId;
    /**
     * 在专属主机上创建弹性云服务器。参数取值为dedicated。
     */
    public static class TenancyEnum {

        
        /**
         * Enum DEDICATED for value: "dedicated"
         */
        public static final TenancyEnum DEDICATED = new TenancyEnum("dedicated");

        

        public static Map<String, TenancyEnum> staticFields =
                new HashMap<String, TenancyEnum>() {
                    { 
                        put("dedicated", DEDICATED);
                    }
                };

        private String value;

        TenancyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TenancyEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            TenancyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new TenancyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static TenancyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TenancyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TenancyEnum) {
                return this.value.equals(((TenancyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenancy")
    
    private TenancyEnum tenancy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_host_id")
    
    private String dedicatedHostId;
    /**
     * 使用伸缩配置创建云主机的时候，多规格使用的优先级策略。PICK_FIRST（默认）：选择优先，虚拟机扩容时规格的选择按照flavorRef列表的顺序进行优先级排序。COST_FIRST：成本优化，虚拟机扩容时规格的选择按照价格最优原则进行优先级排序。
     */
    public static class MultiFlavorPriorityPolicyEnum {

        
        /**
         * Enum PICK_FIRST for value: "PICK_FIRST"
         */
        public static final MultiFlavorPriorityPolicyEnum PICK_FIRST = new MultiFlavorPriorityPolicyEnum("PICK_FIRST");

        
        /**
         * Enum COST_FIRST for value: "COST_FIRST"
         */
        public static final MultiFlavorPriorityPolicyEnum COST_FIRST = new MultiFlavorPriorityPolicyEnum("COST_FIRST");

        

        public static Map<String, MultiFlavorPriorityPolicyEnum> staticFields =
                new HashMap<String, MultiFlavorPriorityPolicyEnum>() {
                    { 
                        put("PICK_FIRST", PICK_FIRST);
                        put("COST_FIRST", COST_FIRST);
                    }
                };

        private String value;

        MultiFlavorPriorityPolicyEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MultiFlavorPriorityPolicyEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            MultiFlavorPriorityPolicyEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new MultiFlavorPriorityPolicyEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static MultiFlavorPriorityPolicyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MultiFlavorPriorityPolicyEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MultiFlavorPriorityPolicyEnum) {
                return this.value.equals(((MultiFlavorPriorityPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="multi_flavor_priority_policy")
    
    private MultiFlavorPriorityPolicyEnum multiFlavorPriorityPolicy;
    /**
     * 云服务器的计费模式，可以选择竞价计费或按需计费，取值如下：按需计费：不指定该字段。竞价计费：spot
     */
    public static class MarketTypeEnum {

        
        /**
         * Enum SPOT for value: "spot"
         */
        public static final MarketTypeEnum SPOT = new MarketTypeEnum("spot");

        

        public static Map<String, MarketTypeEnum> staticFields =
                new HashMap<String, MarketTypeEnum>() {
                    { 
                        put("spot", SPOT);
                    }
                };

        private String value;

        MarketTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MarketTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            MarketTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new MarketTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static MarketTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            MarketTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof MarketTypeEnum) {
                return this.value.equals(((MarketTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="market_type")
    
    private MarketTypeEnum marketType;

    public InstanceConfig withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 云服务器ID，当使用已存在的云服务器的规格为模板创建弹性伸缩配置时传入该字段，此时flavorRef、imageRef、disk、security_groups、tenancy和dedicated_host_id字段不生效。当不传入instance_id字段时flavorRef、imageRef、disk字段为必选。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceConfig withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 云服务器的规格ID。最多支持选择10个规格，多个规格ID以逗号分隔。云服务器的ID通过查询弹性云服务器规格详情和扩展信息列表接口获取，详情请参考查询云服务器规格详情和扩展信息列表。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public InstanceConfig withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    


    /**
     * 镜像ID，同image_id，通过查询镜像服务镜像列表接口获取，详见《镜像服务API参考》的“查询镜像列表”。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public InstanceConfig withDisk(List<Disk> disk) {
        this.disk = disk;
        return this;
    }

    
    public InstanceConfig addDiskItem(Disk diskItem) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        this.disk.add(diskItem);
        return this;
    }

    public InstanceConfig withDisk(Consumer<List<Disk>> diskSetter) {
        if(this.disk == null ){
            this.disk = new ArrayList<>();
        }
        diskSetter.accept(this.disk);
        return this;
    }

    /**
     * 磁盘组信息，系统盘必选，数据盘可选。
     * @return disk
     */
    public List<Disk> getDisk() {
        return disk;
    }

    public void setDisk(List<Disk> disk) {
        this.disk = disk;
    }

    public InstanceConfig withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    


    /**
     * 登录云服务器的SSH密钥名称，与adminPass互斥，且必选一个。Windoes弹性云服务器不支持使用密钥登陆方式。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public InstanceConfig withPersonality(List<Personality> personality) {
        this.personality = personality;
        return this;
    }

    
    public InstanceConfig addPersonalityItem(Personality personalityItem) {
        if (this.personality == null) {
            this.personality = new ArrayList<>();
        }
        this.personality.add(personalityItem);
        return this;
    }

    public InstanceConfig withPersonality(Consumer<List<Personality>> personalitySetter) {
        if(this.personality == null ){
            this.personality = new ArrayList<>();
        }
        personalitySetter.accept(this.personality);
        return this;
    }

    /**
     * 注入文件信息。仅支持注入文本文件，最大支持注入5个文件，每个文件最大1KB。
     * @return personality
     */
    public List<Personality> getPersonality() {
        return personality;
    }

    public void setPersonality(List<Personality> personality) {
        this.personality = personality;
    }

    public InstanceConfig withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public InstanceConfig withPublicIp(Consumer<PublicIp> publicIpSetter) {
        if(this.publicIp == null ){
            this.publicIp = new PublicIp();
        }
        publicIpSetter.accept(this.publicIp);
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

    public InstanceConfig withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * cloud-init用户数据。支持注入文本、文本文件或gzip文件。文件内容需要进行base64格式编码，注入内容（编码之前的内容）最大为32KB。说明：当key_name没有指定时，user_data注入的数据默认为云服务器root账号的登录密码。创建密码方式鉴权的Linux弹性云服务器时为必填项，为root用户注入自定义初始化密码。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public InstanceConfig withMetadata(MetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public InstanceConfig withMetadata(Consumer<MetaData> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new MetaData();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public MetaData getMetadata() {
        return metadata;
    }

    public void setMetadata(MetaData metadata) {
        this.metadata = metadata;
    }

    public InstanceConfig withSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public InstanceConfig addSecurityGroupsItem(SecurityGroups securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public InstanceConfig withSecurityGroups(Consumer<List<SecurityGroups>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息。使用vpc_id通过查询VPC服务安全组列表接口获取，详见《虚拟私有云API参考》的“查询安全组列表”。当伸缩配置和伸缩组同时指定安全组时，将以伸缩配置中的安全组为准；当伸缩配置和伸缩组都没有指定安全组时，将使用默认安全组。为了使用灵活性更高，推荐在伸缩配置中指定安全组。
     * @return securityGroups
     */
    public List<SecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public InstanceConfig withServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
        return this;
    }

    


    /**
     * 云服务器组ID。
     * @return serverGroupId
     */
    public String getServerGroupId() {
        return serverGroupId;
    }

    public void setServerGroupId(String serverGroupId) {
        this.serverGroupId = serverGroupId;
    }

    public InstanceConfig withTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    


    /**
     * 在专属主机上创建弹性云服务器。参数取值为dedicated。
     * @return tenancy
     */
    public TenancyEnum getTenancy() {
        return tenancy;
    }

    public void setTenancy(TenancyEnum tenancy) {
        this.tenancy = tenancy;
    }

    public InstanceConfig withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    


    /**
     * 专属主机的ID。 说明：该字段仅在tenancy为dedicated时生效；如果指定该字段，云服务器将被创建到指定的专属主机上；如果不指定该字段，此时系统会将云服务器创建在符合规格的专属主机中剩余内存最大的那一台上，以使各专属主机尽量均衡负载。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }

    public InstanceConfig withMultiFlavorPriorityPolicy(MultiFlavorPriorityPolicyEnum multiFlavorPriorityPolicy) {
        this.multiFlavorPriorityPolicy = multiFlavorPriorityPolicy;
        return this;
    }

    


    /**
     * 使用伸缩配置创建云主机的时候，多规格使用的优先级策略。PICK_FIRST（默认）：选择优先，虚拟机扩容时规格的选择按照flavorRef列表的顺序进行优先级排序。COST_FIRST：成本优化，虚拟机扩容时规格的选择按照价格最优原则进行优先级排序。
     * @return multiFlavorPriorityPolicy
     */
    public MultiFlavorPriorityPolicyEnum getMultiFlavorPriorityPolicy() {
        return multiFlavorPriorityPolicy;
    }

    public void setMultiFlavorPriorityPolicy(MultiFlavorPriorityPolicyEnum multiFlavorPriorityPolicy) {
        this.multiFlavorPriorityPolicy = multiFlavorPriorityPolicy;
    }

    public InstanceConfig withMarketType(MarketTypeEnum marketType) {
        this.marketType = marketType;
        return this;
    }

    


    /**
     * 云服务器的计费模式，可以选择竞价计费或按需计费，取值如下：按需计费：不指定该字段。竞价计费：spot
     * @return marketType
     */
    public MarketTypeEnum getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketTypeEnum marketType) {
        this.marketType = marketType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceConfig instanceConfig = (InstanceConfig) o;
        return Objects.equals(this.instanceId, instanceConfig.instanceId) &&
            Objects.equals(this.flavorRef, instanceConfig.flavorRef) &&
            Objects.equals(this.imageRef, instanceConfig.imageRef) &&
            Objects.equals(this.disk, instanceConfig.disk) &&
            Objects.equals(this.keyName, instanceConfig.keyName) &&
            Objects.equals(this.personality, instanceConfig.personality) &&
            Objects.equals(this.publicIp, instanceConfig.publicIp) &&
            Objects.equals(this.userData, instanceConfig.userData) &&
            Objects.equals(this.metadata, instanceConfig.metadata) &&
            Objects.equals(this.securityGroups, instanceConfig.securityGroups) &&
            Objects.equals(this.serverGroupId, instanceConfig.serverGroupId) &&
            Objects.equals(this.tenancy, instanceConfig.tenancy) &&
            Objects.equals(this.dedicatedHostId, instanceConfig.dedicatedHostId) &&
            Objects.equals(this.multiFlavorPriorityPolicy, instanceConfig.multiFlavorPriorityPolicy) &&
            Objects.equals(this.marketType, instanceConfig.marketType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, flavorRef, imageRef, disk, keyName, personality, publicIp, userData, metadata, securityGroups, serverGroupId, tenancy, dedicatedHostId, multiFlavorPriorityPolicy, marketType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceConfig {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
            sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
            sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
            sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
            sb.append("    personality: ").append(toIndentedString(personality)).append("\n");
            sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
            sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
            sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
            sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
            sb.append("    multiFlavorPriorityPolicy: ").append(toIndentedString(multiFlavorPriorityPolicy)).append("\n");
            sb.append("    marketType: ").append(toIndentedString(marketType)).append("\n");
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

