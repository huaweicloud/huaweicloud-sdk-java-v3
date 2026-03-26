package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建Endpoint的输入参数
 */
public class EndpointInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private EndpointType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserved_resource")

    private ReservedResource reservedResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_resource")

    private RayResourceInput rayResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cap")

    private CapRef cap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private EndpointConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cache_list")

    private List<CacheConfig> cacheList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_access")

    private Boolean publicAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_image_id")

    private String customImageId;

    public EndpointInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 一个Endpoint名称，只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EndpointInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EndpointInput withType(EndpointType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public EndpointType getType() {
        return type;
    }

    public void setType(EndpointType type) {
        this.type = type;
    }

    public EndpointInput withReservedResource(ReservedResource reservedResource) {
        this.reservedResource = reservedResource;
        return this;
    }

    public EndpointInput withReservedResource(Consumer<ReservedResource> reservedResourceSetter) {
        if (this.reservedResource == null) {
            this.reservedResource = new ReservedResource();
            reservedResourceSetter.accept(this.reservedResource);
        }

        return this;
    }

    /**
     * Get reservedResource
     * @return reservedResource
     */
    public ReservedResource getReservedResource() {
        return reservedResource;
    }

    public void setReservedResource(ReservedResource reservedResource) {
        this.reservedResource = reservedResource;
    }

    public EndpointInput withRayResource(RayResourceInput rayResource) {
        this.rayResource = rayResource;
        return this;
    }

    public EndpointInput withRayResource(Consumer<RayResourceInput> rayResourceSetter) {
        if (this.rayResource == null) {
            this.rayResource = new RayResourceInput();
            rayResourceSetter.accept(this.rayResource);
        }

        return this;
    }

    /**
     * Get rayResource
     * @return rayResource
     */
    public RayResourceInput getRayResource() {
        return rayResource;
    }

    public void setRayResource(RayResourceInput rayResource) {
        this.rayResource = rayResource;
    }

    public EndpointInput withCap(CapRef cap) {
        this.cap = cap;
        return this;
    }

    public EndpointInput withCap(Consumer<CapRef> capSetter) {
        if (this.cap == null) {
            this.cap = new CapRef();
            capSetter.accept(this.cap);
        }

        return this;
    }

    /**
     * Get cap
     * @return cap
     */
    public CapRef getCap() {
        return cap;
    }

    public void setCap(CapRef cap) {
        this.cap = cap;
    }

    public EndpointInput withConfig(EndpointConfig config) {
        this.config = config;
        return this;
    }

    public EndpointInput withConfig(Consumer<EndpointConfig> configSetter) {
        if (this.config == null) {
            this.config = new EndpointConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public EndpointConfig getConfig() {
        return config;
    }

    public void setConfig(EndpointConfig config) {
        this.config = config;
    }

    public EndpointInput withCacheList(List<CacheConfig> cacheList) {
        this.cacheList = cacheList;
        return this;
    }

    public EndpointInput addCacheListItem(CacheConfig cacheListItem) {
        if (this.cacheList == null) {
            this.cacheList = new ArrayList<>();
        }
        this.cacheList.add(cacheListItem);
        return this;
    }

    public EndpointInput withCacheList(Consumer<List<CacheConfig>> cacheListSetter) {
        if (this.cacheList == null) {
            this.cacheList = new ArrayList<>();
        }
        cacheListSetter.accept(this.cacheList);
        return this;
    }

    /**
     * Get cacheList
     * @return cacheList
     */
    public List<CacheConfig> getCacheList() {
        return cacheList;
    }

    public void setCacheList(List<CacheConfig> cacheList) {
        this.cacheList = cacheList;
    }

    public EndpointInput withPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }

    /**
     * **参数解释**：是否开启公网访问。 **约束限制**：不涉及。 **取值范围**：开启true，关闭false。 **默认取值**：false。 
     * @return publicAccess
     */
    public Boolean getPublicAccess() {
        return publicAccess;
    }

    public void setPublicAccess(Boolean publicAccess) {
        this.publicAccess = publicAccess;
    }

    public EndpointInput withCustomImageId(String customImageId) {
        this.customImageId = customImageId;
        return this;
    }

    /**
     * 自定义镜像ID
     * @return customImageId
     */
    public String getCustomImageId() {
        return customImageId;
    }

    public void setCustomImageId(String customImageId) {
        this.customImageId = customImageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EndpointInput that = (EndpointInput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.reservedResource, that.reservedResource)
            && Objects.equals(this.rayResource, that.rayResource) && Objects.equals(this.cap, that.cap)
            && Objects.equals(this.config, that.config) && Objects.equals(this.cacheList, that.cacheList)
            && Objects.equals(this.publicAccess, that.publicAccess)
            && Objects.equals(this.customImageId, that.customImageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            type,
            reservedResource,
            rayResource,
            cap,
            config,
            cacheList,
            publicAccess,
            customImageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    reservedResource: ").append(toIndentedString(reservedResource)).append("\n");
        sb.append("    rayResource: ").append(toIndentedString(rayResource)).append("\n");
        sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    cacheList: ").append(toIndentedString(cacheList)).append("\n");
        sb.append("    publicAccess: ").append(toIndentedString(publicAccess)).append("\n");
        sb.append("    customImageId: ").append(toIndentedString(customImageId)).append("\n");
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
