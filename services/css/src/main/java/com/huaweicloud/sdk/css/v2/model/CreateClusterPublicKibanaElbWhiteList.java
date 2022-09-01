package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * kibana白名单信息。
 */
public class CreateClusterPublicKibanaElbWhiteList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whiteList")

    @JacksonXmlProperty(localName = "whiteList")

    private String whiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableWhiteList")

    @JacksonXmlProperty(localName = "enableWhiteList")

    private Boolean enableWhiteList;

    public CreateClusterPublicKibanaElbWhiteList withWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    /**
     * 白名单。需要添加白名单的网段或ip，以逗号隔开，不可重复。
     * @return whiteList
     */
    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList;
    }

    public CreateClusterPublicKibanaElbWhiteList withEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
        return this;
    }

    /**
     * 是否开启kibana访问控制。
     * @return enableWhiteList
     */
    public Boolean getEnableWhiteList() {
        return enableWhiteList;
    }

    public void setEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterPublicKibanaElbWhiteList createClusterPublicKibanaElbWhiteList =
            (CreateClusterPublicKibanaElbWhiteList) o;
        return Objects.equals(this.whiteList, createClusterPublicKibanaElbWhiteList.whiteList)
            && Objects.equals(this.enableWhiteList, createClusterPublicKibanaElbWhiteList.enableWhiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whiteList, enableWhiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterPublicKibanaElbWhiteList {\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
        sb.append("    enableWhiteList: ").append(toIndentedString(enableWhiteList)).append("\n");
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
