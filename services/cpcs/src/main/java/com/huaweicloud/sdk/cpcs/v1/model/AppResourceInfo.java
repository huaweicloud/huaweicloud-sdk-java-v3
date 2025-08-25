package com.huaweicloud.sdk.cpcs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppResourceInfo
 */
public class AppResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_num")

    private Integer appNum;

    public AppResourceInfo withAppNum(Integer appNum) {
        this.appNum = appNum;
        return this;
    }

    /**
     * 当前租户在cpcs创建的简单应用数量
     * @return appNum
     */
    public Integer getAppNum() {
        return appNum;
    }

    public void setAppNum(Integer appNum) {
        this.appNum = appNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppResourceInfo that = (AppResourceInfo) obj;
        return Objects.equals(this.appNum, that.appNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppResourceInfo {\n");
        sb.append("    appNum: ").append(toIndentedString(appNum)).append("\n");
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
