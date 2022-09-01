package com.huaweicloud.sdk.hilens.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 设备实体列表
 */
public class GetDevicesListArrayObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    @JacksonXmlProperty(localName = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    @JacksonXmlProperty(localName = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    @JacksonXmlProperty(localName = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_name")

    @JacksonXmlProperty(localName = "firmware_name")

    private String firmwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_version")

    @JacksonXmlProperty(localName = "firmware_version")

    private String firmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_status")

    @JacksonXmlProperty(localName = "firmware_status")

    private Integer firmwareStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_cause")

    @JacksonXmlProperty(localName = "firmware_cause")

    private String firmwareCause;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    @JacksonXmlProperty(localName = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_update_status")

    @JacksonXmlProperty(localName = "path_update_status")

    private Integer pathUpdateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_update_cause")

    @JacksonXmlProperty(localName = "path_update_cause")

    private String pathUpdateCause;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_time")

    @JacksonXmlProperty(localName = "user_time")

    private String userTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    @JacksonXmlProperty(localName = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    @JacksonXmlProperty(localName = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_content")

    @JacksonXmlProperty(localName = "active_content")

    private String activeContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_flag")

    @JacksonXmlProperty(localName = "active_flag")

    private Integer activeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    @JacksonXmlProperty(localName = "topic_urn")

    private String topicUrn;

    public GetDevicesListArrayObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 设备ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetDevicesListArrayObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetDevicesListArrayObject withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GetDevicesListArrayObject withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 设备状态(0:离线;1:在线)
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GetDevicesListArrayObject withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu核数
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public GetDevicesListArrayObject withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public GetDevicesListArrayObject withOs(String os) {
        this.os = os;
        return this;
    }

    /**
     * 操作系统
     * @return os
     */
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public GetDevicesListArrayObject withFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }

    /**
     * 固件名称
     * @return firmwareName
     */
    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public GetDevicesListArrayObject withFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }

    /**
     * 固件版本
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public GetDevicesListArrayObject withFirmwareStatus(Integer firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
        return this;
    }

    /**
     * 固件状态(1:更新中，2：更新失败，3：更新成功)
     * @return firmwareStatus
     */
    public Integer getFirmwareStatus() {
        return firmwareStatus;
    }

    public void setFirmwareStatus(Integer firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
    }

    public GetDevicesListArrayObject withFirmwareCause(String firmwareCause) {
        this.firmwareCause = firmwareCause;
        return this;
    }

    /**
     * 固件更新失败原因
     * @return firmwareCause
     */
    public String getFirmwareCause() {
        return firmwareCause;
    }

    public void setFirmwareCause(String firmwareCause) {
        this.firmwareCause = firmwareCause;
    }

    public GetDevicesListArrayObject withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 设备数据存储路径，该桶需要和当前region匹配
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public GetDevicesListArrayObject withPathUpdateStatus(Integer pathUpdateStatus) {
        this.pathUpdateStatus = pathUpdateStatus;
        return this;
    }

    /**
     * 设备数据存储路径更新状态(0:更新成功，1：更新中)
     * @return pathUpdateStatus
     */
    public Integer getPathUpdateStatus() {
        return pathUpdateStatus;
    }

    public void setPathUpdateStatus(Integer pathUpdateStatus) {
        this.pathUpdateStatus = pathUpdateStatus;
    }

    public GetDevicesListArrayObject withPathUpdateCause(String pathUpdateCause) {
        this.pathUpdateCause = pathUpdateCause;
        return this;
    }

    /**
     * 设备数据存储路径更新失败原因
     * @return pathUpdateCause
     */
    public String getPathUpdateCause() {
        return pathUpdateCause;
    }

    public void setPathUpdateCause(String pathUpdateCause) {
        this.pathUpdateCause = pathUpdateCause;
    }

    public GetDevicesListArrayObject withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（时间戳）
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public GetDevicesListArrayObject withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（时间戳）
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public GetDevicesListArrayObject withUserTime(String userTime) {
        this.userTime = userTime;
        return this;
    }

    /**
     * IAM用户名
     * @return userTime
     */
    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }

    public GetDevicesListArrayObject withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 计费资源码
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public GetDevicesListArrayObject withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    /**
     * 云服务计费类型
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public GetDevicesListArrayObject withActiveContent(String activeContent) {
        this.activeContent = activeContent;
        return this;
    }

    /**
     * 激活内容
     * @return activeContent
     */
    public String getActiveContent() {
        return activeContent;
    }

    public void setActiveContent(String activeContent) {
        this.activeContent = activeContent;
    }

    public GetDevicesListArrayObject withActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
        return this;
    }

    /**
     * 激活状态(0:未激活，1：已激活且付费，2：已激活且免费，3：付费到期，4：已激活使用SN码，5：已激活30天免费，6：免费到期)
     * @return activeFlag
     */
    public Integer getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public GetDevicesListArrayObject withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 关联设备的主题消息推送的URN地址
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDevicesListArrayObject getDevicesListArrayObject = (GetDevicesListArrayObject) o;
        return Objects.equals(this.id, getDevicesListArrayObject.id)
            && Objects.equals(this.name, getDevicesListArrayObject.name)
            && Objects.equals(this.type, getDevicesListArrayObject.type)
            && Objects.equals(this.status, getDevicesListArrayObject.status)
            && Objects.equals(this.cpu, getDevicesListArrayObject.cpu)
            && Objects.equals(this.memory, getDevicesListArrayObject.memory)
            && Objects.equals(this.os, getDevicesListArrayObject.os)
            && Objects.equals(this.firmwareName, getDevicesListArrayObject.firmwareName)
            && Objects.equals(this.firmwareVersion, getDevicesListArrayObject.firmwareVersion)
            && Objects.equals(this.firmwareStatus, getDevicesListArrayObject.firmwareStatus)
            && Objects.equals(this.firmwareCause, getDevicesListArrayObject.firmwareCause)
            && Objects.equals(this.path, getDevicesListArrayObject.path)
            && Objects.equals(this.pathUpdateStatus, getDevicesListArrayObject.pathUpdateStatus)
            && Objects.equals(this.pathUpdateCause, getDevicesListArrayObject.pathUpdateCause)
            && Objects.equals(this.createTime, getDevicesListArrayObject.createTime)
            && Objects.equals(this.updateTime, getDevicesListArrayObject.updateTime)
            && Objects.equals(this.userTime, getDevicesListArrayObject.userTime)
            && Objects.equals(this.resourceSpecCode, getDevicesListArrayObject.resourceSpecCode)
            && Objects.equals(this.cloudServiceType, getDevicesListArrayObject.cloudServiceType)
            && Objects.equals(this.activeContent, getDevicesListArrayObject.activeContent)
            && Objects.equals(this.activeFlag, getDevicesListArrayObject.activeFlag)
            && Objects.equals(this.topicUrn, getDevicesListArrayObject.topicUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            status,
            cpu,
            memory,
            os,
            firmwareName,
            firmwareVersion,
            firmwareStatus,
            firmwareCause,
            path,
            pathUpdateStatus,
            pathUpdateCause,
            createTime,
            updateTime,
            userTime,
            resourceSpecCode,
            cloudServiceType,
            activeContent,
            activeFlag,
            topicUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDevicesListArrayObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    firmwareName: ").append(toIndentedString(firmwareName)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    firmwareStatus: ").append(toIndentedString(firmwareStatus)).append("\n");
        sb.append("    firmwareCause: ").append(toIndentedString(firmwareCause)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathUpdateStatus: ").append(toIndentedString(pathUpdateStatus)).append("\n");
        sb.append("    pathUpdateCause: ").append(toIndentedString(pathUpdateCause)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    userTime: ").append(toIndentedString(userTime)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    activeContent: ").append(toIndentedString(activeContent)).append("\n");
        sb.append("    activeFlag: ").append(toIndentedString(activeFlag)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
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
