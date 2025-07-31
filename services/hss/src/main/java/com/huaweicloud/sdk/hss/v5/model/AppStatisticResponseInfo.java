package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 进程统计信息
 */
public class AppStatisticResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    public AppStatisticResponseInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符长度1-128位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public AppStatisticResponseInfo withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释**: 进程数量 **取值范围**: 字符长度0-100000位 
     * minimum: 0
     * maximum: 100000
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppStatisticResponseInfo that = (AppStatisticResponseInfo) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.num, that.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, num);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppStatisticResponseInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
