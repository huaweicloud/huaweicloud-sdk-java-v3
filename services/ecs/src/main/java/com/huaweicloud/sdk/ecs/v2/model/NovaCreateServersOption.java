package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerBlockDeviceMapping;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerNetwork;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerSecurityGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  弹性云服务器信息
 */
public class NovaCreateServersOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="imageRef")
    
    private String imageRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavorRef")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Map<String, Object> metadata = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminPass")
    
    private String adminPass;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="block_device_mapping_v2")
    
    private List<NovaServerBlockDeviceMapping> blockDeviceMappingV2 = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_drive")
    
    private String configDrive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<NovaServerSecurityGroup> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="networks")
    
    private List<NovaServerNetwork> networks = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="availability_zone")
    
    private String availabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="return_reservation_id")
    
    private Boolean returnReservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_count")
    
    private Integer minCount = 1;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="max_count")
    
    private Integer maxCount;
    /**
     * diskConfig的方式，取值为AUTO、MANUAL。  - MANUAL，镜像空间不会扩展。 - AUTO，系统盘镜像空间会自动扩展为与flavor大小一致。  当前不支持该功能。
     */
    public static class OsDCFDiskConfigEnum {

        
        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        
        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        

        public static Map<String, OsDCFDiskConfigEnum> staticFields =
                new HashMap<String, OsDCFDiskConfigEnum>() {
                    { 
                        put("AUTO", AUTO);
                        put("MANUAL", MANUAL);
                    }
                };

        private String value;

        OsDCFDiskConfigEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsDCFDiskConfigEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsDCFDiskConfigEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsDCFDiskConfigEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsDCFDiskConfigEnum) {
                return this.value.equals(((OsDCFDiskConfigEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-DCF:diskConfig")
    
    private OsDCFDiskConfigEnum osDCFDiskConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public NovaCreateServersOption withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    


    /**
     * 镜像ID或者镜像资源的URL。  - 镜像ID示例：3b8d6fef-af77-42ab-b8b7-5a7f0f0af8f2 - 镜像URL示例：http://glance.openstack.example.com/images/3b8d6fef-af77-42ab-b8b7-5a7f0f0af8f2 - 指定卷作为系统卷创弹性云服务器时，不需填写该参数；非卷创建弹性云服务器时需填写有效的UUID参数，否则API将返回400错误。  > 说明： > - 对于部分规格的弹性云服务器，不能支持公有云平台提供的所有公共镜像。具体规格的镜像支持列表，请登录管理控制台，以“创建弹性云服务器”页面系统自动过滤的镜像信息为准，并在镜像服务页面查询镜像ID。 > - 如果创建失败，请尝试修改参数配置。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public NovaCreateServersOption withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 规格ID或URL。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public NovaCreateServersOption withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 弹性云服务器名称，长度大于0小于256字节。  > 说明： >  > 云服务器内部主机名(hostname)命名规则遵循 [RFC 952](https://tools.ietf.org/html/rfc952)和[RFC 1123](https://tools.ietf.org/html/rfc1123)命名规范，建议使用a-zA-z或0-9以及中划线\"-\"组成的名称命名，\"_\"将在弹性云服务器内部默认转化为\"-\"。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NovaCreateServersOption withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    

    public NovaCreateServersOption putMetadataItem(String key, Object metadataItem) {
         if (this.metadata == null) {
            this.metadata = new HashMap<>();
         }
        this.metadata.put(key, metadataItem);
        return this;
    }

    public NovaCreateServersOption withMetadata(Consumer<Map<String, Object>> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }
    /**
     * 用户自定义字段键值对。  > - key的长度大于0小于256字节 > - value的长度大于等于0小于256字节   系统预留字段  1. admin_pass：弹性云服务器密码        Windows弹性云服务器Administrator用户的密码。     > 说明：     > 创建密码方式鉴权的Windows弹性云服务器时为必选字段。
     * @return metadata
     */
    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public NovaCreateServersOption withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    


    /**
     * 如果需要使用密码方式登录云服务器，可使用adminPass字段指定云服务器管理员帐户初始登录密码。其中，Linux管理员帐户为root，Windows管理员帐户为Administrator。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public NovaCreateServersOption withBlockDeviceMappingV2(List<NovaServerBlockDeviceMapping> blockDeviceMappingV2) {
        this.blockDeviceMappingV2 = blockDeviceMappingV2;
        return this;
    }

    
    public NovaCreateServersOption addBlockDeviceMappingV2Item(NovaServerBlockDeviceMapping blockDeviceMappingV2Item) {
        if (this.blockDeviceMappingV2 == null) {
            this.blockDeviceMappingV2 = new ArrayList<>();
        }
        this.blockDeviceMappingV2.add(blockDeviceMappingV2Item);
        return this;
    }

    public NovaCreateServersOption withBlockDeviceMappingV2(Consumer<List<NovaServerBlockDeviceMapping>> blockDeviceMappingV2Setter) {
        if(this.blockDeviceMappingV2 == null ){
            this.blockDeviceMappingV2 = new ArrayList<>();
        }
        blockDeviceMappingV2Setter.accept(this.blockDeviceMappingV2);
        return this;
    }

    /**
     * 扩展属性，指定弹性云服务器存储设备的v2接口。是存储资源的新版本接口，指定卷场景不能批创弹性云服务器。  裸金属服务器场景不支持。
     * @return blockDeviceMappingV2
     */
    public List<NovaServerBlockDeviceMapping> getBlockDeviceMappingV2() {
        return blockDeviceMappingV2;
    }

    public void setBlockDeviceMappingV2(List<NovaServerBlockDeviceMapping> blockDeviceMappingV2) {
        this.blockDeviceMappingV2 = blockDeviceMappingV2;
    }

    public NovaCreateServersOption withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    


    /**
     * 扩展属性，开启后在弹性云服务器创建时挂载config_drive向弹性云服务器内部传递信息。  当前不支持该功能。
     * @return configDrive
     */
    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public NovaCreateServersOption withSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public NovaCreateServersOption addSecurityGroupsItem(NovaServerSecurityGroup securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaCreateServersOption withSecurityGroups(Consumer<List<NovaServerSecurityGroup>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 扩展属性，指定弹性云服务器的安全组，默认为default。  指定network创建弹性云服务器时该字段有效。对于已存在端口，安全组请求无效。
     * @return securityGroups
     */
    public List<NovaServerSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NovaServerSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NovaCreateServersOption withNetworks(List<NovaServerNetwork> networks) {
        this.networks = networks;
        return this;
    }

    
    public NovaCreateServersOption addNetworksItem(NovaServerNetwork networksItem) {
        this.networks.add(networksItem);
        return this;
    }

    public NovaCreateServersOption withNetworks(Consumer<List<NovaServerNetwork>> networksSetter) {
        if(this.networks == null ){
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * 扩展属性，指定弹性云服务器的网卡信息。有多个租户网络时必须指定。 
     * @return networks
     */
    public List<NovaServerNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NovaServerNetwork> networks) {
        this.networks = networks;
    }

    public NovaCreateServersOption withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    


    /**
     * 扩展属性，指定keypair的名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public NovaCreateServersOption withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 扩展属性，字符串长度小于65535，且必须是base64加密的。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public NovaCreateServersOption withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    


    /**
     * 扩展属性，指定弹性云服务器所在的AZ。  创建弹性云服务器时需要填入该参数。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public NovaCreateServersOption withReturnReservationId(Boolean returnReservationId) {
        this.returnReservationId = returnReservationId;
        return this;
    }

    


    /**
     * 扩展属性，是否支持返回批量创建弹性云服务器的reservation_id。通过返回的reservation_id，可以过滤查询到本次创建的弹性云服务器。  - true，返回reservation_id。 - false，返回弹性云服务器信息。  > 说明： >  > 批量创建弹性云服务器时，支持使用该字段。
     * @return returnReservationId
     */
    public Boolean getReturnReservationId() {
        return returnReservationId;
    }

    public void setReturnReservationId(Boolean returnReservationId) {
        this.returnReservationId = returnReservationId;
    }

    public NovaCreateServersOption withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    


    /**
     * 扩展属性，表示创建弹性云服务器最小数量。  默认值为1。  > 说明： >  > 指定镜像创建弹性云服务器时，支持使用该字段。
     * @return minCount
     */
    public Integer getMinCount() {
        return minCount;
    }

    public void setMinCount(Integer minCount) {
        this.minCount = minCount;
    }

    public NovaCreateServersOption withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    


    /**
     * 表示创建弹性云服务器最大数量。  默认值与min_count的取值一致。  约束：  参数max_count的取值必须大于参数min_count的取值。  当min_count、max_count同时设置时，创弹性云服务器的数量取决于服务器的资源情况。根据资源情况，在min_count至max_count的取值范围内创建最大数量的弹性云服务器。  - 说明： -  - 指定镜像创建弹性云服务器时，支持使用该字段。
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public NovaCreateServersOption withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    


    /**
     * diskConfig的方式，取值为AUTO、MANUAL。  - MANUAL，镜像空间不会扩展。 - AUTO，系统盘镜像空间会自动扩展为与flavor大小一致。  当前不支持该功能。
     * @return osDCFDiskConfig
     */
    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public NovaCreateServersOption withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 扩展属性，表示弹性云服务器描述信息，默认为空字符串。  - 长度最多允许85个字符。 - 不能包含“<” 和 “>”等特殊符号。  > 说明： >  > - V2接口不支持该字段。 > - V2.1接口支持该字段，此时，需在请求Header中增加一组Key-Value值。其中，Key固定为“X-OpenStack-Nova-API-Version” ，Value为微版本号，当Value的值为2.19时，支持使用该字段。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaCreateServersOption novaCreateServersOption = (NovaCreateServersOption) o;
        return Objects.equals(this.imageRef, novaCreateServersOption.imageRef) &&
            Objects.equals(this.flavorRef, novaCreateServersOption.flavorRef) &&
            Objects.equals(this.name, novaCreateServersOption.name) &&
            Objects.equals(this.metadata, novaCreateServersOption.metadata) &&
            Objects.equals(this.adminPass, novaCreateServersOption.adminPass) &&
            Objects.equals(this.blockDeviceMappingV2, novaCreateServersOption.blockDeviceMappingV2) &&
            Objects.equals(this.configDrive, novaCreateServersOption.configDrive) &&
            Objects.equals(this.securityGroups, novaCreateServersOption.securityGroups) &&
            Objects.equals(this.networks, novaCreateServersOption.networks) &&
            Objects.equals(this.keyName, novaCreateServersOption.keyName) &&
            Objects.equals(this.userData, novaCreateServersOption.userData) &&
            Objects.equals(this.availabilityZone, novaCreateServersOption.availabilityZone) &&
            Objects.equals(this.returnReservationId, novaCreateServersOption.returnReservationId) &&
            Objects.equals(this.minCount, novaCreateServersOption.minCount) &&
            Objects.equals(this.maxCount, novaCreateServersOption.maxCount) &&
            Objects.equals(this.osDCFDiskConfig, novaCreateServersOption.osDCFDiskConfig) &&
            Objects.equals(this.description, novaCreateServersOption.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(imageRef, flavorRef, name, metadata, adminPass, blockDeviceMappingV2, configDrive, securityGroups, networks, keyName, userData, availabilityZone, returnReservationId, minCount, maxCount, osDCFDiskConfig, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersOption {\n");
            sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
            sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
            sb.append("    blockDeviceMappingV2: ").append(toIndentedString(blockDeviceMappingV2)).append("\n");
            sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
            sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
            sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
            sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
            sb.append("    returnReservationId: ").append(toIndentedString(returnReservationId)).append("\n");
            sb.append("    minCount: ").append(toIndentedString(minCount)).append("\n");
            sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
            sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

