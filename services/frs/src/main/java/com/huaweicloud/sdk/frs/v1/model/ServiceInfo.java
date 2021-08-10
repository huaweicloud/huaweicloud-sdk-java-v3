package com.huaweicloud.sdk.frs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ServiceInfo */
public class ServiceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscribe_status")

    private Boolean subscribeStatus;

    public ServiceInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 开通该子服务时间。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ServiceInfo withSubscribeStatus(Boolean subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
        return this;
    }

    /** 是否开通该子服务。
     * 
     * @return subscribeStatus */
    public Boolean getSubscribeStatus() {
        return subscribeStatus;
    }

    public void setSubscribeStatus(Boolean subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceInfo serviceInfo = (ServiceInfo) o;
        return Objects.equals(this.createTime, serviceInfo.createTime)
            && Objects.equals(this.subscribeStatus, serviceInfo.subscribeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, subscribeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceInfo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    subscribeStatus: ").append(toIndentedString(subscribeStatus)).append("\n");
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
