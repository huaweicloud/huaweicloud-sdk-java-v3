package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchDeleteAiAppsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appIds")

    private List<String> appIds = null;

    public BatchDeleteAiAppsResponse withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public BatchDeleteAiAppsResponse addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public BatchDeleteAiAppsResponse withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /**
     * 已删除的AI应用ID列表
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
        BatchDeleteAiAppsResponse that = (BatchDeleteAiAppsResponse) obj;
        return Objects.equals(this.appIds, that.appIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteAiAppsResponse {\n");
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
