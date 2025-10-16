package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowStatusServiceResponseBodyServerList
 */
public class ShowStatusServiceResponseBodyServerList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_list")

    private List<ShowStatusAppItem> appList = null;

    public ShowStatusServiceResponseBodyServerList withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 服务类型
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public ShowStatusServiceResponseBodyServerList withAppList(List<ShowStatusAppItem> appList) {
        this.appList = appList;
        return this;
    }

    public ShowStatusServiceResponseBodyServerList addAppListItem(ShowStatusAppItem appListItem) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        this.appList.add(appListItem);
        return this;
    }

    public ShowStatusServiceResponseBodyServerList withAppList(Consumer<List<ShowStatusAppItem>> appListSetter) {
        if (this.appList == null) {
            this.appList = new ArrayList<>();
        }
        appListSetter.accept(this.appList);
        return this;
    }

    /**
     * 应用列表
     * @return appList
     */
    public List<ShowStatusAppItem> getAppList() {
        return appList;
    }

    public void setAppList(List<ShowStatusAppItem> appList) {
        this.appList = appList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatusServiceResponseBodyServerList that = (ShowStatusServiceResponseBodyServerList) obj;
        return Objects.equals(this.serverType, that.serverType) && Objects.equals(this.appList, that.appList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverType, appList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatusServiceResponseBodyServerList {\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
        sb.append("    appList: ").append(toIndentedString(appList)).append("\n");
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
