package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 弱口令的账号信息
 */
public class WeakPwdAccountInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public WeakPwdAccountInfoResponseInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 弱口令账号名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WeakPwdAccountInfoResponseInfo withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 账号类型
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public WeakPwdAccountInfoResponseInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 弱口令使用时长，单位天
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WeakPwdAccountInfoResponseInfo weakPwdAccountInfoResponseInfo = (WeakPwdAccountInfoResponseInfo) o;
        return Objects.equals(this.userName, weakPwdAccountInfoResponseInfo.userName)
            && Objects.equals(this.serviceType, weakPwdAccountInfoResponseInfo.serviceType)
            && Objects.equals(this.duration, weakPwdAccountInfoResponseInfo.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, serviceType, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WeakPwdAccountInfoResponseInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
