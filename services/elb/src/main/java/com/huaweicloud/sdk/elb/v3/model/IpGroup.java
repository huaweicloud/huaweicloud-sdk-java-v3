package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** IP地址组信息。 */
public class IpGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_list")

    private List<IpInfo> ipList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ListenerRef> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public IpGroup withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** IP地址组的创建时间。
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public IpGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /** IP地址组的描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IpGroup withId(String id) {
        this.id = id;
        return this;
    }

    /** IP地址组的ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IpGroup withIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
        return this;
    }

    public IpGroup addIpListItem(IpInfo ipListItem) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        this.ipList.add(ipListItem);
        return this;
    }

    public IpGroup withIpList(Consumer<List<IpInfo>> ipListSetter) {
        if (this.ipList == null) {
            this.ipList = new ArrayList<>();
        }
        ipListSetter.accept(this.ipList);
        return this;
    }

    /** IP地址组中包含的IP或网段列表。[]表示任意IP。
     * 
     * @return ipList */
    public List<IpInfo> getIpList() {
        return ipList;
    }

    public void setIpList(List<IpInfo> ipList) {
        this.ipList = ipList;
    }

    public IpGroup withListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
        return this;
    }

    public IpGroup addListenersItem(ListenerRef listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public IpGroup withListeners(Consumer<List<ListenerRef>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /** 与IP地址组关联的监听器的ID列表。
     * 
     * @return listeners */
    public List<ListenerRef> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerRef> listeners) {
        this.listeners = listeners;
    }

    public IpGroup withName(String name) {
        this.name = name;
        return this;
    }

    /** IP地址组的名称。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IpGroup withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** IP地址组的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IpGroup withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** IP地址组的更新时间。
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IpGroup ipGroup = (IpGroup) o;
        return Objects.equals(this.createdAt, ipGroup.createdAt)
            && Objects.equals(this.description, ipGroup.description) && Objects.equals(this.id, ipGroup.id)
            && Objects.equals(this.ipList, ipGroup.ipList) && Objects.equals(this.listeners, ipGroup.listeners)
            && Objects.equals(this.name, ipGroup.name) && Objects.equals(this.projectId, ipGroup.projectId)
            && Objects.equals(this.updatedAt, ipGroup.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, description, id, ipList, listeners, name, projectId, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpGroup {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
