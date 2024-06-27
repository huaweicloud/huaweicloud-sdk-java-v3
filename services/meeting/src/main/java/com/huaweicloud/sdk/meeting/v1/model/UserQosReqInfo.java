package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QOS请求用户信息
 */
public class UserQosReqInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessMediaType")

    private String accessMediaType;

    public UserQosReqInfo withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 用户pid
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public UserQosReqInfo withAccessMediaType(String accessMediaType) {
        this.accessMediaType = accessMediaType;
        return this;
    }

    /**
     * 用户接入媒体类型
     * @return accessMediaType
     */
    public String getAccessMediaType() {
        return accessMediaType;
    }

    public void setAccessMediaType(String accessMediaType) {
        this.accessMediaType = accessMediaType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserQosReqInfo that = (UserQosReqInfo) obj;
        return Objects.equals(this.pid, that.pid) && Objects.equals(this.accessMediaType, that.accessMediaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, accessMediaType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserQosReqInfo {\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    accessMediaType: ").append(toIndentedString(accessMediaType)).append("\n");
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
