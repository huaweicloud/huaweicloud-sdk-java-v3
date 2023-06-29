package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class SearchApplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_info_list")

    private List<AppInfo> appInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_total_count")

    private Integer appTotalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_info_map")

    private Map<String, AppInfo> appInfoMap = null;

    public SearchApplicationResponse withAppInfoList(List<AppInfo> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }

    public SearchApplicationResponse addAppInfoListItem(AppInfo appInfoListItem) {
        if (this.appInfoList == null) {
            this.appInfoList = new ArrayList<>();
        }
        this.appInfoList.add(appInfoListItem);
        return this;
    }

    public SearchApplicationResponse withAppInfoList(Consumer<List<AppInfo>> appInfoListSetter) {
        if (this.appInfoList == null) {
            this.appInfoList = new ArrayList<>();
        }
        appInfoListSetter.accept(this.appInfoList);
        return this;
    }

    /**
     * 组件列表。
     * @return appInfoList
     */
    public List<AppInfo> getAppInfoList() {
        return appInfoList;
    }

    public void setAppInfoList(List<AppInfo> appInfoList) {
        this.appInfoList = appInfoList;
    }

    public SearchApplicationResponse withAppTotalCount(Integer appTotalCount) {
        this.appTotalCount = appTotalCount;
        return this;
    }

    /**
     * 组件总数目。
     * @return appTotalCount
     */
    public Integer getAppTotalCount() {
        return appTotalCount;
    }

    public void setAppTotalCount(Integer appTotalCount) {
        this.appTotalCount = appTotalCount;
    }

    public SearchApplicationResponse withAppInfoMap(Map<String, AppInfo> appInfoMap) {
        this.appInfoMap = appInfoMap;
        return this;
    }

    public SearchApplicationResponse putAppInfoMapItem(String key, AppInfo appInfoMapItem) {
        if (this.appInfoMap == null) {
            this.appInfoMap = new HashMap<>();
        }
        this.appInfoMap.put(key, appInfoMapItem);
        return this;
    }

    public SearchApplicationResponse withAppInfoMap(Consumer<Map<String, AppInfo>> appInfoMapSetter) {
        if (this.appInfoMap == null) {
            this.appInfoMap = new HashMap<>();
        }
        appInfoMapSetter.accept(this.appInfoMap);
        return this;
    }

    /**
     * 组件名称和组件详情map表。
     * @return appInfoMap
     */
    public Map<String, AppInfo> getAppInfoMap() {
        return appInfoMap;
    }

    public void setAppInfoMap(Map<String, AppInfo> appInfoMap) {
        this.appInfoMap = appInfoMap;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchApplicationResponse that = (SearchApplicationResponse) obj;
        return Objects.equals(this.appInfoList, that.appInfoList)
            && Objects.equals(this.appTotalCount, that.appTotalCount)
            && Objects.equals(this.appInfoMap, that.appInfoMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appInfoList, appTotalCount, appInfoMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchApplicationResponse {\n");
        sb.append("    appInfoList: ").append(toIndentedString(appInfoList)).append("\n");
        sb.append("    appTotalCount: ").append(toIndentedString(appTotalCount)).append("\n");
        sb.append("    appInfoMap: ").append(toIndentedString(appInfoMap)).append("\n");
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
