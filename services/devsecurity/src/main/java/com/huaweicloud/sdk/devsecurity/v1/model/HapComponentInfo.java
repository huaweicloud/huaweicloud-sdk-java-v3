package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HapComponentInfo
 */
public class HapComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private List<PermissionItem> permission = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private List<HapComponentItem> page = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private List<HapComponentItem> service = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<HapComponentItem> data = null;

    public HapComponentInfo withPermission(List<PermissionItem> permission) {
        this.permission = permission;
        return this;
    }

    public HapComponentInfo addPermissionItem(PermissionItem permissionItem) {
        if (this.permission == null) {
            this.permission = new ArrayList<>();
        }
        this.permission.add(permissionItem);
        return this;
    }

    public HapComponentInfo withPermission(Consumer<List<PermissionItem>> permissionSetter) {
        if (this.permission == null) {
            this.permission = new ArrayList<>();
        }
        permissionSetter.accept(this.permission);
        return this;
    }

    /**
     * 权限列表
     * @return permission
     */
    public List<PermissionItem> getPermission() {
        return permission;
    }

    public void setPermission(List<PermissionItem> permission) {
        this.permission = permission;
    }

    public HapComponentInfo withPage(List<HapComponentItem> page) {
        this.page = page;
        return this;
    }

    public HapComponentInfo addPageItem(HapComponentItem pageItem) {
        if (this.page == null) {
            this.page = new ArrayList<>();
        }
        this.page.add(pageItem);
        return this;
    }

    public HapComponentInfo withPage(Consumer<List<HapComponentItem>> pageSetter) {
        if (this.page == null) {
            this.page = new ArrayList<>();
        }
        pageSetter.accept(this.page);
        return this;
    }

    /**
     * 鸿蒙Page列表，仅鸿蒙任务存在该组件
     * @return page
     */
    public List<HapComponentItem> getPage() {
        return page;
    }

    public void setPage(List<HapComponentItem> page) {
        this.page = page;
    }

    public HapComponentInfo withService(List<HapComponentItem> service) {
        this.service = service;
        return this;
    }

    public HapComponentInfo addServiceItem(HapComponentItem serviceItem) {
        if (this.service == null) {
            this.service = new ArrayList<>();
        }
        this.service.add(serviceItem);
        return this;
    }

    public HapComponentInfo withService(Consumer<List<HapComponentItem>> serviceSetter) {
        if (this.service == null) {
            this.service = new ArrayList<>();
        }
        serviceSetter.accept(this.service);
        return this;
    }

    /**
     * 鸿蒙service列表，仅鸿蒙任务存在该组件
     * @return service
     */
    public List<HapComponentItem> getService() {
        return service;
    }

    public void setService(List<HapComponentItem> service) {
        this.service = service;
    }

    public HapComponentInfo withData(List<HapComponentItem> data) {
        this.data = data;
        return this;
    }

    public HapComponentInfo addDataItem(HapComponentItem dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public HapComponentInfo withData(Consumer<List<HapComponentItem>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 鸿蒙data息列表，仅鸿蒙任务存在该组件
     * @return data
     */
    public List<HapComponentItem> getData() {
        return data;
    }

    public void setData(List<HapComponentItem> data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HapComponentInfo that = (HapComponentInfo) obj;
        return Objects.equals(this.permission, that.permission) && Objects.equals(this.page, that.page)
            && Objects.equals(this.service, that.service) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, page, service, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HapComponentInfo {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
