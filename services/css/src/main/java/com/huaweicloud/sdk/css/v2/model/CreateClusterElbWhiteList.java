package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 弹性IP白名单。 */
public class CreateClusterElbWhiteList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableWhiteList")

    private Boolean enableWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whiteList")

    private String whiteList;

    public CreateClusterElbWhiteList withEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
        return this;
    }

    /** 是否开启访问控制。
     * 
     * @return enableWhiteList */
    public Boolean getEnableWhiteList() {
        return enableWhiteList;
    }

    public void setEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
    }

    public CreateClusterElbWhiteList withWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    /** 访问控制白名单。
     * 
     * @return whiteList */
    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterElbWhiteList createClusterElbWhiteList = (CreateClusterElbWhiteList) o;
        return Objects.equals(this.enableWhiteList, createClusterElbWhiteList.enableWhiteList)
            && Objects.equals(this.whiteList, createClusterElbWhiteList.whiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableWhiteList, whiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterElbWhiteList {\n");
        sb.append("    enableWhiteList: ").append(toIndentedString(enableWhiteList)).append("\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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
