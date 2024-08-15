package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 主机附加属性
 */
public class ResourceInstanceProp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ip")

    private String fixedIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip")

    private String floatingIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private String application;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ResourceInstanceProp withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名 未校验：长度
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ResourceInstanceProp withFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
        return this;
    }

    /**
     * 内网ip 未校验： 格式，长度
     * @return fixedIp
     */
    public String getFixedIp() {
        return fixedIp;
    }

    public void setFixedIp(String fixedIp) {
        this.fixedIp = fixedIp;
    }

    public ResourceInstanceProp withFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    /**
     * 弹性公网ip 未校验： 格式，长度
     * @return floatingIp
     */
    public String getFloatingIp() {
        return floatingIp;
    }

    public void setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
    }

    public ResourceInstanceProp withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域 未校验： 长度
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ResourceInstanceProp withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * 可用区
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public ResourceInstanceProp withApplication(String application) {
        this.application = application;
        return this;
    }

    /**
     * CMDB应用，CMDB应用视图才有值。类似管理面的云服务
     * @return application
     */
    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public ResourceInstanceProp withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * CMDB分组，CMDB应用视图才有值。类似管理面的schema
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ResourceInstanceProp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 实例的 project_id  需要消费，建议必填 未校验长度
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInstanceProp that = (ResourceInstanceProp) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.fixedIp, that.fixedIp)
            && Objects.equals(this.floatingIp, that.floatingIp) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.zoneId, that.zoneId) && Objects.equals(this.application, that.application)
            && Objects.equals(this.group, that.group) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, fixedIp, floatingIp, regionId, zoneId, application, group, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInstanceProp {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    fixedIp: ").append(toIndentedString(fixedIp)).append("\n");
        sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
