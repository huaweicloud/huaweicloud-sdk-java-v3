package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApiParaForAuthorizeToInstance
 */
public class ApiParaForAuthorizeToInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_ids")

    private List<String> appIds = null;

    public ApiParaForAuthorizeToInstance withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 截止时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ApiParaForAuthorizeToInstance withAppIds(List<String> appIds) {
        this.appIds = appIds;
        return this;
    }

    public ApiParaForAuthorizeToInstance addAppIdsItem(String appIdsItem) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        this.appIds.add(appIdsItem);
        return this;
    }

    public ApiParaForAuthorizeToInstance withAppIds(Consumer<List<String>> appIdsSetter) {
        if (this.appIds == null) {
            this.appIds = new ArrayList<>();
        }
        appIdsSetter.accept(this.appIds);
        return this;
    }

    /**
     * app编号列表
     * @return appIds
     */
    public List<String> getAppIds() {
        return appIds;
    }

    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiParaForAuthorizeToInstance apiParaForAuthorizeToInstance = (ApiParaForAuthorizeToInstance) o;
        return Objects.equals(this.time, apiParaForAuthorizeToInstance.time)
            && Objects.equals(this.appIds, apiParaForAuthorizeToInstance.appIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, appIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiParaForAuthorizeToInstance {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
