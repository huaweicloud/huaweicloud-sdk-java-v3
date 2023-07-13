package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IP地址组详情。
 */
public class IpGroupDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private ConfigStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpInfo> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_listeners")

    private List<ListenerAccessControlPolicy> associatedListeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    public IpGroupDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * IP地址组ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IpGroupDetail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * IP地址组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IpGroupDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * IP地址组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IpGroupDetail withStatus(ConfigStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ConfigStatus getStatus() {
        return status;
    }

    public void setStatus(ConfigStatus status) {
        this.status = status;
    }

    public IpGroupDetail withIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
        return this;
    }

    public IpGroupDetail addIpListItem(IpInfo ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public IpGroupDetail withIpList(Consumer<List<IpInfo>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /**
     * IP地址组中的IP网段列表。
     * @return ipList
     */
    public List<IpInfo> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
    }

    public IpGroupDetail withAssociatedListeners(List<ListenerAccessControlPolicy> associatedListeners) {
        this.associatedListeners = associatedListeners;
        return this;
    }

    public IpGroupDetail addAssociatedListenersItem(ListenerAccessControlPolicy associatedListenersItem) {
        if (this.associatedListeners == null) {
            this.associatedListeners = new ArrayList<>();
        }
        this.associatedListeners.add(associatedListenersItem);
        return this;
    }

    public IpGroupDetail withAssociatedListeners(
        Consumer<List<ListenerAccessControlPolicy>> associatedListenersSetter) {
        if (this.associatedListeners == null) {
            this.associatedListeners = new ArrayList<>();
        }
        associatedListenersSetter.accept(this.associatedListeners);
        return this;
    }

    /**
     * Get associatedListeners
     * @return associatedListeners
     */
    public List<ListenerAccessControlPolicy> getAssociatedListeners() {
        return associatedListeners;
    }

    public void setAssociatedListeners(List<ListenerAccessControlPolicy> associatedListeners) {
        this.associatedListeners = associatedListeners;
    }

    public IpGroupDetail withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public IpGroupDetail withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpGroupDetail that = (IpGroupDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.ipList, that.ipList)
            && Objects.equals(this.associatedListeners, that.associatedListeners)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, status, ipList, associatedListeners, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpGroupDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    associatedListeners: ").append(toIndentedString(associatedListeners)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
