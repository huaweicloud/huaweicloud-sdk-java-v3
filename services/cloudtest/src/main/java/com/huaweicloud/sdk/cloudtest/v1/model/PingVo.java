package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PingVo
 */
public class PingVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_name")

    private String subTaskName;

    public PingVo withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * ping地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PingVo withSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
        return this;
    }

    /**
     * 节点名称
     * @return subTaskName
     */
    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PingVo that = (PingVo) obj;
        return Objects.equals(this.address, that.address) && Objects.equals(this.subTaskName, that.subTaskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, subTaskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PingVo {\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    subTaskName: ").append(toIndentedString(subTaskName)).append("\n");
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
