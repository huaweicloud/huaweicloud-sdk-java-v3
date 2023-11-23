package com.huaweicloud.sdk.dataartsinsight.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 协同授权对应的资源请求实体
 */
public class CooperateAuthorizationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_switch_config")

    private Map<String, Boolean> authSwitchConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    public CooperateAuthorizationDto withAuthSwitchConfig(Map<String, Boolean> authSwitchConfig) {
        this.authSwitchConfig = authSwitchConfig;
        return this;
    }

    public CooperateAuthorizationDto putAuthSwitchConfigItem(String key, Boolean authSwitchConfigItem) {
        if (this.authSwitchConfig == null) {
            this.authSwitchConfig = new HashMap<>();
        }
        this.authSwitchConfig.put(key, authSwitchConfigItem);
        return this;
    }

    public CooperateAuthorizationDto withAuthSwitchConfig(Consumer<Map<String, Boolean>> authSwitchConfigSetter) {
        if (this.authSwitchConfig == null) {
            this.authSwitchConfig = new HashMap<>();
        }
        authSwitchConfigSetter.accept(this.authSwitchConfig);
        return this;
    }

    /**
     * 权限点开关。取值为true或者false，用于区分对应开关是否打开。 • edit：编辑权限 • export：导出权限 • read：查看权限 • use：使用权限 说明 • 权限之间有依赖关系， 授予edit权限，自动关联授予read和export或者use权限；授予了export权限，自动关联授予read权限。 • 对仪表板和大屏来说， 权限点有三个， edit, export, read， 例如{\"edit\": false, \"read\": true, \"export\": true}， 表示打开了查看和导出的权限。 • 对于数据源、数据集、领域来说，权限点有两个，edit，use， 对应编辑和使用权限。 例如{\"use\": true, \"edit\": false} ，表示仅打开使用权限。
     * @return authSwitchConfig
     */
    public Map<String, Boolean> getAuthSwitchConfig() {
        return authSwitchConfig;
    }

    public void setAuthSwitchConfig(Map<String, Boolean> authSwitchConfig) {
        this.authSwitchConfig = authSwitchConfig;
    }

    public CooperateAuthorizationDto withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public CooperateAuthorizationDto withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，目前有datasource, dataset, dashboard, screen
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CooperateAuthorizationDto that = (CooperateAuthorizationDto) obj;
        return Objects.equals(this.authSwitchConfig, that.authSwitchConfig)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authSwitchConfig, resourceId, resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CooperateAuthorizationDto {\n");
        sb.append("    authSwitchConfig: ").append(toIndentedString(authSwitchConfig)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
