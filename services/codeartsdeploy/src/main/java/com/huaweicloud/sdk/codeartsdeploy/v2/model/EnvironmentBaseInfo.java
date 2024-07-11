package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 环境基本信息
 */
public class EnvironmentBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_count")

    private Integer hostCount;

    public EnvironmentBaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 环境名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnvironmentBaseInfo withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 操作系统：windows|linux
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public EnvironmentBaseInfo withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * 环境id
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public EnvironmentBaseInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 主机集群id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EnvironmentBaseInfo withHostCount(Integer hostCount) {
        this.hostCount = hostCount;
        return this;
    }

    /**
     * 环境下主机数量
     * @return hostCount
     */
    public Integer getHostCount() {
        return hostCount;
    }

    public void setHostCount(Integer hostCount) {
        this.hostCount = hostCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentBaseInfo that = (EnvironmentBaseInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.os, that.os)
            && Objects.equals(this.uuid, that.uuid) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.hostCount, that.hostCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, os, uuid, groupId, hostCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentBaseInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    hostCount: ").append(toIndentedString(hostCount)).append("\n");
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
