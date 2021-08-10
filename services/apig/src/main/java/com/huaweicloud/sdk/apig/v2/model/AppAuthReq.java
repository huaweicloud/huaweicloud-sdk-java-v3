package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** AppAuthReq */
public class AppAuthReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ids")

    private List<String> appIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_ids")

    private List<String> apiIds = null;

    public AppAuthReq withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /** 需要授权的环境编号
     * 
     * @return envId */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public AppAuthReq withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public AppAuthReq addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public AppAuthReq withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /** APP的编号列表
     * 
     * @return appIds */
    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public AppAuthReq withApiIds(List<String> apiIds) {
        this.apiIds = apiIds;
        return this;
    }

    public AppAuthReq addApiIdsItem(String apiIdsItem) {
        if (this.apiIds == null) {
            this.apiIds = new ArrayList<>();
        }
        this.apiIds.add(apiIdsItem);
        return this;
    }

    public AppAuthReq withApiIds(Consumer<List<String>> apiIdsSetter) {
        if (this.apiIds == null) {
            this.apiIds = new ArrayList<>();
        }
        apiIdsSetter.accept(this.apiIds);
        return this;
    }

    /** API的编号列表，可以选择租户自己的API，也可以选择从云市场上购买的API。
     * 
     * @return apiIds */
    public List<String> getApiIds() {
        return apiIds;
    }

    public void setApiIds(List<String> apiIds) {
        this.apiIds = apiIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppAuthReq appAuthReq = (AppAuthReq) o;
        return Objects.equals(this.envId, appAuthReq.envId) && Objects.equals(this.appIds, appAuthReq.appIds)
            && Objects.equals(this.apiIds, appAuthReq.apiIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, appIds, apiIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppAuthReq {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
        sb.append("    apiIds: ").append(toIndentedString(apiIds)).append("\n");
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
