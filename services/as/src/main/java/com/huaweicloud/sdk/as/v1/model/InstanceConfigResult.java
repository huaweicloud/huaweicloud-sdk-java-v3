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
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例配置信息
 */
public class InstanceConfigResult  {



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
    @JsonProperty(value="instance_name")
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adminPass")
    
    private String adminPass;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="personality")
    
    private Personality personality = null;


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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenancy")
    
    private String tenancy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dedicated_host_id")
    
    private String dedicatedHostId;

    public InstanceConfigResult withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    


    /**
     * 云服务器的规格ID。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public InstanceConfigResult withImageRef(String imageRef) {
        this.imageRef = imageRef;
        return this;
    }

    


    /**
     * 镜像ID，同image_id。
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public InstanceConfigResult withDisk(List<Disk> disk) {
        this.disk = disk;
        return this;
    }

    
    public InstanceConfigResult addDiskItem(Disk diskItem) {
        if (this.disk == null) {
            this.disk = new ArrayList<>();
        }
        this.disk.add(diskItem);
        return this;
    }

    public InstanceConfigResult withDisk(Consumer<List<Disk>> diskSetter) {
        if(this.disk == null ){
            this.disk = new ArrayList<>();
        }
        diskSetter.accept(this.disk);
        return this;
    }

    /**
     * 磁盘组信息。
     * @return disk
     */
    public List<Disk> getDisk() {
        return disk;
    }

    public void setDisk(List<Disk> disk) {
        this.disk = disk;
    }

    public InstanceConfigResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    


    /**
     * 登录云服务器的SSH密钥名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public InstanceConfigResult withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 该参数为预留字段。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public InstanceConfigResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 该参数为预留字段。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceConfigResult withAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    


    /**
     * 登录云服务器的密码，非明文回显。
     * @return adminPass
     */
    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public InstanceConfigResult withPersonality(Personality personality) {
        this.personality = personality;
        return this;
    }

    public InstanceConfigResult withPersonality(Consumer<Personality> personalitySetter) {
        if(this.personality == null ){
            this.personality = new Personality();
        }
        personalitySetter.accept(this.personality);
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

    public InstanceConfigResult withPublicIp(PublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public InstanceConfigResult withPublicIp(Consumer<PublicIp> publicIpSetter) {
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

    public InstanceConfigResult withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * cloud-init用户数据，base64格式编码。
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public InstanceConfigResult withMetadata(MetaData metadata) {
        this.metadata = metadata;
        return this;
    }

    public InstanceConfigResult withMetadata(Consumer<MetaData> metadataSetter) {
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

    public InstanceConfigResult withSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public InstanceConfigResult addSecurityGroupsItem(SecurityGroups securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public InstanceConfigResult withSecurityGroups(Consumer<List<SecurityGroups>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 安全组信息。
     * @return securityGroups
     */
    public List<SecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public InstanceConfigResult withServerGroupId(String serverGroupId) {
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

    public InstanceConfigResult withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    


    /**
     * 在专属主机上创建弹性云服务器。
     * @return tenancy
     */
    public String getTenancy() {
        return tenancy;
    }

    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public InstanceConfigResult withDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }

    


    /**
     * 专属主机的ID。
     * @return dedicatedHostId
     */
    public String getDedicatedHostId() {
        return dedicatedHostId;
    }

    public void setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceConfigResult instanceConfigResult = (InstanceConfigResult) o;
        return Objects.equals(this.flavorRef, instanceConfigResult.flavorRef) &&
            Objects.equals(this.imageRef, instanceConfigResult.imageRef) &&
            Objects.equals(this.disk, instanceConfigResult.disk) &&
            Objects.equals(this.keyName, instanceConfigResult.keyName) &&
            Objects.equals(this.instanceName, instanceConfigResult.instanceName) &&
            Objects.equals(this.instanceId, instanceConfigResult.instanceId) &&
            Objects.equals(this.adminPass, instanceConfigResult.adminPass) &&
            Objects.equals(this.personality, instanceConfigResult.personality) &&
            Objects.equals(this.publicIp, instanceConfigResult.publicIp) &&
            Objects.equals(this.userData, instanceConfigResult.userData) &&
            Objects.equals(this.metadata, instanceConfigResult.metadata) &&
            Objects.equals(this.securityGroups, instanceConfigResult.securityGroups) &&
            Objects.equals(this.serverGroupId, instanceConfigResult.serverGroupId) &&
            Objects.equals(this.tenancy, instanceConfigResult.tenancy) &&
            Objects.equals(this.dedicatedHostId, instanceConfigResult.dedicatedHostId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(flavorRef, imageRef, disk, keyName, instanceName, instanceId, adminPass, personality, publicIp, userData, metadata, securityGroups, serverGroupId, tenancy, dedicatedHostId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceConfigResult {\n");
            sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
            sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
            sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
            sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
            sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    adminPass: ").append(toIndentedString(adminPass)).append("\n");
            sb.append("    personality: ").append(toIndentedString(personality)).append("\n");
            sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
            sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
            sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
            sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
            sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
            sb.append("    tenancy: ").append(toIndentedString(tenancy)).append("\n");
            sb.append("    dedicatedHostId: ").append(toIndentedString(dedicatedHostId)).append("\n");
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

