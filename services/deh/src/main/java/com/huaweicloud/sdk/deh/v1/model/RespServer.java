package com.huaweicloud.sdk.deh.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * server字段数据结构说明。
 */
public class RespServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private Map<String, List<RespAddr>> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private RespFlavor flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private RespImage image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private RespMetadata metadata;

    public RespServer withAddresses(Map<String, List<RespAddr>> addresses) {
        this.addresses = addresses;
        return this;
    }

    public RespServer putAddressesItem(String key, List<RespAddr> addressesItem) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        this.addresses.put(key, addressesItem);
        return this;
    }

    public RespServer withAddresses(Consumer<Map<String, List<RespAddr>>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 弹性云服务器的网络属性。
     * @return addresses
     */
    public Map<String, List<RespAddr>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<RespAddr>> addresses) {
        this.addresses = addresses;
    }

    public RespServer withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 弹性云服务器创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public RespServer withFlavor(RespFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public RespServer withFlavor(Consumer<RespFlavor> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new RespFlavor();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public RespFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(RespFlavor flavor) {
        this.flavor = flavor;
    }

    public RespServer withId(String id) {
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

    public RespServer withName(String name) {
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

    public RespServer withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性云服务器状态。  取值范围：ACTIVE、BUILD、DELETED、ERROR、HARD_REBOOT、MIGRATING、PASSWORD、PAUSED、REBOOT、REBUILD、RESIZE、REVERT_RESIZE、SHUTOFF、SHELVED、SHELVED_OFFLOADED、SOFT_DELETED、SUSPENDED、VERIFY_RESIZE
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RespServer withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 弹性云服务器所属租户ID，格式为UUID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public RespServer withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 弹性云服务器更新时间。
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public RespServer withUserId(String userId) {
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

    public RespServer withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 弹性云服务器当前任务的状态。
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public RespServer withImage(RespImage image) {
        this.image = image;
        return this;
    }

    public RespServer withImage(Consumer<RespImage> imageSetter) {
        if (this.image == null) {
            this.image = new RespImage();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public RespImage getImage() {
        return image;
    }

    public void setImage(RespImage image) {
        this.image = image;
    }

    public RespServer withMetadata(RespMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public RespServer withMetadata(Consumer<RespMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new RespMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public RespMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(RespMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RespServer that = (RespServer) obj;
        return Objects.equals(this.addresses, that.addresses) && Objects.equals(this.created, that.created)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.updated, that.updated)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.taskState, that.taskState)
            && Objects.equals(this.image, that.image) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(addresses, created, flavor, id, name, status, tenantId, updated, userId, taskState, image, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RespServer {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
