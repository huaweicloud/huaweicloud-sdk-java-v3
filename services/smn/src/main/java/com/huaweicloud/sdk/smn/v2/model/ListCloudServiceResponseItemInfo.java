package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListCloudServiceResponseItemInfo
 */
public class ListCloudServiceResponseItemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_name")

    private String showName;

    public ListCloudServiceResponseItemInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 云服务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListCloudServiceResponseItemInfo withShowName(String showName) {
        this.showName = showName;
        return this;
    }

    /**
     * 云服务显示名称。
     * @return showName
     */
    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCloudServiceResponseItemInfo that = (ListCloudServiceResponseItemInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.showName, that.showName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, showName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudServiceResponseItemInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    showName: ").append(toIndentedString(showName)).append("\n");
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
