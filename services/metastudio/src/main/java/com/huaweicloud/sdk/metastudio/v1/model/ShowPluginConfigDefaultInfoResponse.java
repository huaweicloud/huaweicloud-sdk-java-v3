package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ShowPluginConfigDefaultInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_plugin_list")

    private List<DefaultPluginInfo> defaultPluginList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowPluginConfigDefaultInfoResponse withDefaultPluginList(List<DefaultPluginInfo> defaultPluginList) {
        this.defaultPluginList = defaultPluginList;
        return this;
    }

    public ShowPluginConfigDefaultInfoResponse addDefaultPluginListItem(DefaultPluginInfo defaultPluginListItem) {
        if (this.defaultPluginList == null) {
            this.defaultPluginList = new ArrayList<>();
        }
        this.defaultPluginList.add(defaultPluginListItem);
        return this;
    }

    public ShowPluginConfigDefaultInfoResponse withDefaultPluginList(
        Consumer<List<DefaultPluginInfo>> defaultPluginListSetter) {
        if (this.defaultPluginList == null) {
            this.defaultPluginList = new ArrayList<>();
        }
        defaultPluginListSetter.accept(this.defaultPluginList);
        return this;
    }

    /**
     * 默认插件支持列表
     * @return defaultPluginList
     */
    public List<DefaultPluginInfo> getDefaultPluginList() {
        return defaultPluginList;
    }

    public void setDefaultPluginList(List<DefaultPluginInfo> defaultPluginList) {
        this.defaultPluginList = defaultPluginList;
    }

    public ShowPluginConfigDefaultInfoResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPluginConfigDefaultInfoResponse that = (ShowPluginConfigDefaultInfoResponse) obj;
        return Objects.equals(this.defaultPluginList, that.defaultPluginList)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultPluginList, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPluginConfigDefaultInfoResponse {\n");
        sb.append("    defaultPluginList: ").append(toIndentedString(defaultPluginList)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
