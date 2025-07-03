package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartKibanaPublicReqElbWhitelist
 */
public class StartKibanaPublicReqElbWhitelist {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_white_list")

    private Boolean enableWhiteList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_list")

    private String whiteList;

    public StartKibanaPublicReqElbWhitelist withEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
        return this;
    }

    /**
     * 是否开启白名单。 - true: 开启白名单。 - false: 关闭白名单。
     * @return enableWhiteList
     */
    public Boolean getEnableWhiteList() {
        return enableWhiteList;
    }

    public void setEnableWhiteList(Boolean enableWhiteList) {
        this.enableWhiteList = enableWhiteList;
    }

    public StartKibanaPublicReqElbWhitelist withWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    /**
     * 白名单。
     * @return whiteList
     */
    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartKibanaPublicReqElbWhitelist that = (StartKibanaPublicReqElbWhitelist) obj;
        return Objects.equals(this.enableWhiteList, that.enableWhiteList)
            && Objects.equals(this.whiteList, that.whiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableWhiteList, whiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartKibanaPublicReqElbWhitelist {\n");
        sb.append("    enableWhiteList: ").append(toIndentedString(enableWhiteList)).append("\n");
        sb.append("    whiteList: ").append(toIndentedString(whiteList)).append("\n");
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
