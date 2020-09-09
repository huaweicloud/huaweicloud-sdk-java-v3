package com.huaweicloud.sdk.ecs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.Link;
import com.huaweicloud.sdk.ecs.v2.model.SimpleFlavor;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 云服务器详情。
 */
public class UpdateServerResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private String image;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv4")
    
    private String accessIPv4;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv6")
    
    private String accessIPv6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Map<String, String> metadata = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addresses")
    
    private Map<String, List<UpdateServerAddress>> addresses = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostId")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private SimpleFlavor flavor = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-DCF:diskConfig")
    
    private String osDCFDiskConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    private Integer progress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Link> links = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private String updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    private Boolean locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:hostname")
    
    private String osEXTSRVATTRHostname;

    public UpdateServerResult withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UpdateServerResult withImage(String image) {
        this.image = image;
        return this;
    }

    


    /**
     * 镜像ID。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public UpdateServerResult withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    


    /**
     * 预留属性。
     * @return accessIPv4
     */
    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public UpdateServerResult withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    


    /**
     * 预留属性。
     * @return accessIPv6
     */
    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public UpdateServerResult withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    

    public UpdateServerResult putMetadataItem(String key, String metadataItem) {
        this.metadata.put(key, metadataItem);
        return this;
    }

    public UpdateServerResult withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }
    /**
     * 云服务器元数据。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public UpdateServerResult withAddresses(Map<String, List<UpdateServerAddress>> addresses) {
        this.addresses = addresses;
        return this;
    }

    

    public UpdateServerResult putAddressesItem(String key, List<UpdateServerAddress> addressesItem) {
        this.addresses.put(key, addressesItem);
        return this;
    }

    public UpdateServerResult withAddresses(Consumer<Map<String, List<UpdateServerAddress>>> addressesSetter) {
        if(this.addresses == null ){
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }
    /**
     * 弹性云服务器的网络属性。
     * @return addresses
     */
    public Map<String, List<UpdateServerAddress>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<UpdateServerAddress>> addresses) {
        this.addresses = addresses;
    }

    public UpdateServerResult withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 弹性云服务器创建时间。  时间格式例如：2019-05-22T03:19:19Z
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public UpdateServerResult withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 弹性云服务器所在主机的主机ID。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public UpdateServerResult withFlavor(SimpleFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public UpdateServerResult withFlavor(Consumer<SimpleFlavor> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new SimpleFlavor();
            flavorSetter.accept(this.flavor);
        }
        
        return this;
    }


    /**
     * Get flavor
     * @return flavor
     */
    public SimpleFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(SimpleFlavor flavor) {
        this.flavor = flavor;
    }

    public UpdateServerResult withOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    


    /**
     * 扩展属性， diskConfig的类型。  - MANUAL，镜像空间不会扩展。 - AUTO，系统盘镜像空间会自动扩展为与flavor大小一致。
     * @return osDCFDiskConfig
     */
    public String getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(String osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public UpdateServerResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 创建弹性云服务器的用户ID，格式为UUID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateServerResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 弹性云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateServerResult withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    


    /**
     * 弹性云服务器进度。
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public UpdateServerResult withLinks(List<Link> links) {
        this.links = links;
        return this;
    }

    
    public UpdateServerResult addLinksItem(Link linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public UpdateServerResult withLinks(Consumer<List<Link>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 云服务器相关标记快捷链接信息。
     * @return links
     */
    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public UpdateServerResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 弹性云服务器ID，格式为UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateServerResult withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 弹性云服务器更新时间。  时间格式例如：2019-05-22T03:30:52Z
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public UpdateServerResult withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 弹性云服务器是否为锁定状态。  - true：锁定 - false：未锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public UpdateServerResult withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 弹性云服务器的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateServerResult withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public UpdateServerResult addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateServerResult withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 云服务器的标签列表。  微版本2.26后支持，如果不使用微版本查询，响应中无tags字段。  系统近期对标签功能进行了升级，升级后，返回的tag值遵循如下规则：  - key与value使用“=”连接，如“key=value”。 - 如果value为空字符串，则仅返回key。 - key与value使用“=”连接，如“key=value”。 - 如果value为空字符串，则仅返回key。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateServerResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 弹性云服务器状态。  取值范围：  ACTIVE、BUILD、DELETED、ERROR、HARD_REBOOT、MIGRATING、PAUSED、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、SHELVED、SHELVED_OFFLOADED、SOFT_DELETED、SUSPENDED、VERIFY_RESIZE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateServerResult withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    


    /**
     * 弹性云服务器的主机名。
     * @return osEXTSRVATTRHostname
     */
    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateServerResult updateServerResult = (UpdateServerResult) o;
        return Objects.equals(this.tenantId, updateServerResult.tenantId) &&
            Objects.equals(this.image, updateServerResult.image) &&
            Objects.equals(this.accessIPv4, updateServerResult.accessIPv4) &&
            Objects.equals(this.accessIPv6, updateServerResult.accessIPv6) &&
            Objects.equals(this.metadata, updateServerResult.metadata) &&
            Objects.equals(this.addresses, updateServerResult.addresses) &&
            Objects.equals(this.created, updateServerResult.created) &&
            Objects.equals(this.hostId, updateServerResult.hostId) &&
            Objects.equals(this.flavor, updateServerResult.flavor) &&
            Objects.equals(this.osDCFDiskConfig, updateServerResult.osDCFDiskConfig) &&
            Objects.equals(this.userId, updateServerResult.userId) &&
            Objects.equals(this.name, updateServerResult.name) &&
            Objects.equals(this.progress, updateServerResult.progress) &&
            Objects.equals(this.links, updateServerResult.links) &&
            Objects.equals(this.id, updateServerResult.id) &&
            Objects.equals(this.updated, updateServerResult.updated) &&
            Objects.equals(this.locked, updateServerResult.locked) &&
            Objects.equals(this.description, updateServerResult.description) &&
            Objects.equals(this.tags, updateServerResult.tags) &&
            Objects.equals(this.status, updateServerResult.status) &&
            Objects.equals(this.osEXTSRVATTRHostname, updateServerResult.osEXTSRVATTRHostname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tenantId, image, accessIPv4, accessIPv6, metadata, addresses, created, hostId, flavor, osDCFDiskConfig, userId, name, progress, links, id, updated, locked, description, tags, status, osEXTSRVATTRHostname);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerResult {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
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

