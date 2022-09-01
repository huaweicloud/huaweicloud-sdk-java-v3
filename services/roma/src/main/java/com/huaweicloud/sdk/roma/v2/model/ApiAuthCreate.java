package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiAuthCreate
 */
public class ApiAuthCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    @JacksonXmlProperty(localName = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ids")

    @JacksonXmlProperty(localName = "app_ids")

    private List<String> appIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_ids")

    @JacksonXmlProperty(localName = "api_ids")

    private List<String> apiIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_tunnel")

    @JacksonXmlProperty(localName = "auth_tunnel")

    private String authTunnel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_whitelist")

    @JacksonXmlProperty(localName = "auth_whitelist")

    private List<String> authWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_blacklist")

    @JacksonXmlProperty(localName = "auth_blacklist")

    private List<String> authBlacklist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visit_params")

    @JacksonXmlProperty(localName = "visit_params")

    private List<ApiAuthVisitParam> visitParams = null;

    public ApiAuthCreate withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 需要授权的环境编号
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public ApiAuthCreate withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public ApiAuthCreate addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public ApiAuthCreate withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /**
     * APP的编号列表
     * @return appIds
     */
    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public ApiAuthCreate withApiIds(List<String> apiIds) {
        this.apiIds = apiIds;
        return this;
    }

    public ApiAuthCreate addApiIdsItem(String apiIdsItem) {
        if (this.apiIds == null) {
            this.apiIds = new ArrayList<>();
        }
        this.apiIds.add(apiIdsItem);
        return this;
    }

    public ApiAuthCreate withApiIds(Consumer<List<String>> apiIdsSetter) {
        if (this.apiIds == null) {
            this.apiIds = new ArrayList<>();
        }
        apiIdsSetter.accept(this.apiIds);
        return this;
    }

    /**
     * API的编号列表。
     * @return apiIds
     */
    public List<String> getApiIds() {
        return apiIds;
    }

    public void setApiIds(List<String> apiIds) {
        this.apiIds = apiIds;
    }

    public ApiAuthCreate withAuthTunnel(String authTunnel) {
        this.authTunnel = authTunnel;
        return this;
    }

    /**
     * 授权通道类型： - GREEN：绿色通道 - NORMAL：非绿色通道  实例开启green_tunnel特性时可以开启绿色通道，此字段不填默认为不使用绿色通道
     * @return authTunnel
     */
    public String getAuthTunnel() {
        return authTunnel;
    }

    public void setAuthTunnel(String authTunnel) {
        this.authTunnel = authTunnel;
    }

    public ApiAuthCreate withAuthWhitelist(List<String> authWhitelist) {
        this.authWhitelist = authWhitelist;
        return this;
    }

    public ApiAuthCreate addAuthWhitelistItem(String authWhitelistItem) {
        if (this.authWhitelist == null) {
            this.authWhitelist = new ArrayList<>();
        }
        this.authWhitelist.add(authWhitelistItem);
        return this;
    }

    public ApiAuthCreate withAuthWhitelist(Consumer<List<String>> authWhitelistSetter) {
        if (this.authWhitelist == null) {
            this.authWhitelist = new ArrayList<>();
        }
        authWhitelistSetter.accept(this.authWhitelist);
        return this;
    }

    /**
     * 绿色通道授权白名单。  允许白名单中的IP不使用认证信息访问，auth_tunnel = GREEN时生效
     * @return authWhitelist
     */
    public List<String> getAuthWhitelist() {
        return authWhitelist;
    }

    public void setAuthWhitelist(List<String> authWhitelist) {
        this.authWhitelist = authWhitelist;
    }

    public ApiAuthCreate withAuthBlacklist(List<String> authBlacklist) {
        this.authBlacklist = authBlacklist;
        return this;
    }

    public ApiAuthCreate addAuthBlacklistItem(String authBlacklistItem) {
        if (this.authBlacklist == null) {
            this.authBlacklist = new ArrayList<>();
        }
        this.authBlacklist.add(authBlacklistItem);
        return this;
    }

    public ApiAuthCreate withAuthBlacklist(Consumer<List<String>> authBlacklistSetter) {
        if (this.authBlacklist == null) {
            this.authBlacklist = new ArrayList<>();
        }
        authBlacklistSetter.accept(this.authBlacklist);
        return this;
    }

    /**
     * 绿色通道授权黑名单。  auth_tunnel = GREEN时生效
     * @return authBlacklist
     */
    public List<String> getAuthBlacklist() {
        return authBlacklist;
    }

    public void setAuthBlacklist(List<String> authBlacklist) {
        this.authBlacklist = authBlacklist;
    }

    public ApiAuthCreate withVisitParams(List<ApiAuthVisitParam> visitParams) {
        this.visitParams = visitParams;
        return this;
    }

    public ApiAuthCreate addVisitParamsItem(ApiAuthVisitParam visitParamsItem) {
        if (this.visitParams == null) {
            this.visitParams = new ArrayList<>();
        }
        this.visitParams.add(visitParamsItem);
        return this;
    }

    public ApiAuthCreate withVisitParams(Consumer<List<ApiAuthVisitParam>> visitParamsSetter) {
        if (this.visitParams == null) {
            this.visitParams = new ArrayList<>();
        }
        visitParamsSetter.accept(this.visitParams);
        return this;
    }

    /**
     * 访问参数列表。
     * @return visitParams
     */
    public List<ApiAuthVisitParam> getVisitParams() {
        return visitParams;
    }

    public void setVisitParams(List<ApiAuthVisitParam> visitParams) {
        this.visitParams = visitParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiAuthCreate apiAuthCreate = (ApiAuthCreate) o;
        return Objects.equals(this.envId, apiAuthCreate.envId) && Objects.equals(this.appIds, apiAuthCreate.appIds)
            && Objects.equals(this.apiIds, apiAuthCreate.apiIds)
            && Objects.equals(this.authTunnel, apiAuthCreate.authTunnel)
            && Objects.equals(this.authWhitelist, apiAuthCreate.authWhitelist)
            && Objects.equals(this.authBlacklist, apiAuthCreate.authBlacklist)
            && Objects.equals(this.visitParams, apiAuthCreate.visitParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, appIds, apiIds, authTunnel, authWhitelist, authBlacklist, visitParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiAuthCreate {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
        sb.append("    apiIds: ").append(toIndentedString(apiIds)).append("\n");
        sb.append("    authTunnel: ").append(toIndentedString(authTunnel)).append("\n");
        sb.append("    authWhitelist: ").append(toIndentedString(authWhitelist)).append("\n");
        sb.append("    authBlacklist: ").append(toIndentedString(authBlacklist)).append("\n");
        sb.append("    visitParams: ").append(toIndentedString(visitParams)).append("\n");
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
