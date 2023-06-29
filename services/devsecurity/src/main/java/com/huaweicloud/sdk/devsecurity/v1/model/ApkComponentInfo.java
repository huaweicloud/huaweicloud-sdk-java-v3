package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApkComponentInfo
 */
public class ApkComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private List<PermissionItem> permission = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activity")

    private List<ApkComponentItem> activity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private List<ApkComponentItem> service = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private List<ApkComponentItem> provider = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receive")

    private List<ApkComponentItem> receive = null;

    public ApkComponentInfo withPermission(List<PermissionItem> permission) {
        this.permission = permission;
        return this;
    }

    public ApkComponentInfo addPermissionItem(PermissionItem permissionItem) {
        if (this.permission == null) {
            this.permission = new ArrayList<>();
        }
        this.permission.add(permissionItem);
        return this;
    }

    public ApkComponentInfo withPermission(Consumer<List<PermissionItem>> permissionSetter) {
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

    public ApkComponentInfo withActivity(List<ApkComponentItem> activity) {
        this.activity = activity;
        return this;
    }

    public ApkComponentInfo addActivityItem(ApkComponentItem activityItem) {
        if (this.activity == null) {
            this.activity = new ArrayList<>();
        }
        this.activity.add(activityItem);
        return this;
    }

    public ApkComponentInfo withActivity(Consumer<List<ApkComponentItem>> activitySetter) {
        if (this.activity == null) {
            this.activity = new ArrayList<>();
        }
        activitySetter.accept(this.activity);
        return this;
    }

    /**
     * 安卓activity列表，仅安卓任务存在该组件
     * @return activity
     */
    public List<ApkComponentItem> getActivity() {
        return activity;
    }

    public void setActivity(List<ApkComponentItem> activity) {
        this.activity = activity;
    }

    public ApkComponentInfo withService(List<ApkComponentItem> service) {
        this.service = service;
        return this;
    }

    public ApkComponentInfo addServiceItem(ApkComponentItem serviceItem) {
        if (this.service == null) {
            this.service = new ArrayList<>();
        }
        this.service.add(serviceItem);
        return this;
    }

    public ApkComponentInfo withService(Consumer<List<ApkComponentItem>> serviceSetter) {
        if (this.service == null) {
            this.service = new ArrayList<>();
        }
        serviceSetter.accept(this.service);
        return this;
    }

    /**
     * 安卓service列表，仅安卓任务存在该组件
     * @return service
     */
    public List<ApkComponentItem> getService() {
        return service;
    }

    public void setService(List<ApkComponentItem> service) {
        this.service = service;
    }

    public ApkComponentInfo withProvider(List<ApkComponentItem> provider) {
        this.provider = provider;
        return this;
    }

    public ApkComponentInfo addProviderItem(ApkComponentItem providerItem) {
        if (this.provider == null) {
            this.provider = new ArrayList<>();
        }
        this.provider.add(providerItem);
        return this;
    }

    public ApkComponentInfo withProvider(Consumer<List<ApkComponentItem>> providerSetter) {
        if (this.provider == null) {
            this.provider = new ArrayList<>();
        }
        providerSetter.accept(this.provider);
        return this;
    }

    /**
     * 安卓provider列表，仅安卓任务存在该组件
     * @return provider
     */
    public List<ApkComponentItem> getProvider() {
        return provider;
    }

    public void setProvider(List<ApkComponentItem> provider) {
        this.provider = provider;
    }

    public ApkComponentInfo withReceive(List<ApkComponentItem> receive) {
        this.receive = receive;
        return this;
    }

    public ApkComponentInfo addReceiveItem(ApkComponentItem receiveItem) {
        if (this.receive == null) {
            this.receive = new ArrayList<>();
        }
        this.receive.add(receiveItem);
        return this;
    }

    public ApkComponentInfo withReceive(Consumer<List<ApkComponentItem>> receiveSetter) {
        if (this.receive == null) {
            this.receive = new ArrayList<>();
        }
        receiveSetter.accept(this.receive);
        return this;
    }

    /**
     * 安卓receive列表，仅安卓任务存在该组件
     * @return receive
     */
    public List<ApkComponentItem> getReceive() {
        return receive;
    }

    public void setReceive(List<ApkComponentItem> receive) {
        this.receive = receive;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApkComponentInfo that = (ApkComponentInfo) obj;
        return Objects.equals(this.permission, that.permission) && Objects.equals(this.activity, that.activity)
            && Objects.equals(this.service, that.service) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.receive, that.receive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, activity, service, provider, receive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApkComponentInfo {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    receive: ").append(toIndentedString(receive)).append("\n");
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
