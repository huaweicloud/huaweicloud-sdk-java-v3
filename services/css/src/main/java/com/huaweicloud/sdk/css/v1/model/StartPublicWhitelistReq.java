package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartPublicWhitelistReq
 */
public class StartPublicWhitelistReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_list")

    private String whiteList;

    public StartPublicWhitelistReq withWhiteList(String whiteList) {
        this.whiteList = whiteList;
        return this;
    }

    /**
     * 开启白名单的用户IP。
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
        StartPublicWhitelistReq that = (StartPublicWhitelistReq) obj;
        return Objects.equals(this.whiteList, that.whiteList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whiteList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartPublicWhitelistReq {\n");
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
