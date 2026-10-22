package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定 AI 应用请求
 */
public class BindAiAppsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ids")

    private List<String> appIds = null;

    public BindAiAppsRequestBody withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public BindAiAppsRequestBody addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public BindAiAppsRequestBody withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /**
     * 绑定的 AI 应用 ID 列表
     * @return appIds
     */
    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindAiAppsRequestBody that = (BindAiAppsRequestBody) obj;
        return Objects.equals(this.appIds, that.appIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindAiAppsRequestBody {\n");
        sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
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
