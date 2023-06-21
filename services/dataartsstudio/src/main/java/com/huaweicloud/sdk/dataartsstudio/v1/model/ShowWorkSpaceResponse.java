package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowWorkSpaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_record_location_name")

    private String badRecordLocationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_log_location_name")

    private String jobLogLocationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default")

    private Integer isDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private BigDecimal createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_num")

    private Integer memberNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private BigDecimal updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    public ShowWorkSpaceResponse withBadRecordLocationName(String badRecordLocationName) {
        this.badRecordLocationName = badRecordLocationName;
        return this;
    }

    /**
     * DLI脏数据OBS路径
     * @return badRecordLocationName
     */
    public String getBadRecordLocationName() {
        return badRecordLocationName;
    }

    public void setBadRecordLocationName(String badRecordLocationName) {
        this.badRecordLocationName = badRecordLocationName;
    }

    public ShowWorkSpaceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工作空间描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowWorkSpaceResponse withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id，如果当前为公有云，且用户开启企业项目，则必选
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public ShowWorkSpaceResponse withJobLogLocationName(String jobLogLocationName) {
        this.jobLogLocationName = jobLogLocationName;
        return this;
    }

    /**
     * 作业日志OBS路径
     * @return jobLogLocationName
     */
    public String getJobLogLocationName() {
        return jobLogLocationName;
    }

    public void setJobLogLocationName(String jobLogLocationName) {
        this.jobLogLocationName = jobLogLocationName;
    }

    public ShowWorkSpaceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作空间名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowWorkSpaceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 工作空间id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowWorkSpaceResponse withIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * 是否为默认空间，0为私有空间，1为默认空间，2为公共空间
     * @return isDefault
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public ShowWorkSpaceResponse withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 创建者名称
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public ShowWorkSpaceResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowWorkSpaceResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 当前租户所属domain id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowWorkSpaceResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 当前工作空间所属实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowWorkSpaceResponse withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public ShowWorkSpaceResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建用户名称
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowWorkSpaceResponse withMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
        return this;
    }

    /**
     * 当前工作空间成员数量
     * minimum: 0
     * maximum: 100
     * @return memberNum
     */
    public Integer getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    public ShowWorkSpaceResponse withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public ShowWorkSpaceResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新用户名称
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowWorkSpaceResponse showWorkSpaceResponse = (ShowWorkSpaceResponse) o;
        return Objects.equals(this.badRecordLocationName, showWorkSpaceResponse.badRecordLocationName)
            && Objects.equals(this.description, showWorkSpaceResponse.description)
            && Objects.equals(this.epsId, showWorkSpaceResponse.epsId)
            && Objects.equals(this.jobLogLocationName, showWorkSpaceResponse.jobLogLocationName)
            && Objects.equals(this.name, showWorkSpaceResponse.name)
            && Objects.equals(this.id, showWorkSpaceResponse.id)
            && Objects.equals(this.isDefault, showWorkSpaceResponse.isDefault)
            && Objects.equals(this.ownerName, showWorkSpaceResponse.ownerName)
            && Objects.equals(this.projectId, showWorkSpaceResponse.projectId)
            && Objects.equals(this.domainId, showWorkSpaceResponse.domainId)
            && Objects.equals(this.instanceId, showWorkSpaceResponse.instanceId)
            && Objects.equals(this.createTime, showWorkSpaceResponse.createTime)
            && Objects.equals(this.createUser, showWorkSpaceResponse.createUser)
            && Objects.equals(this.memberNum, showWorkSpaceResponse.memberNum)
            && Objects.equals(this.updateTime, showWorkSpaceResponse.updateTime)
            && Objects.equals(this.updateUser, showWorkSpaceResponse.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(badRecordLocationName,
            description,
            epsId,
            jobLogLocationName,
            name,
            id,
            isDefault,
            ownerName,
            projectId,
            domainId,
            instanceId,
            createTime,
            createUser,
            memberNum,
            updateTime,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowWorkSpaceResponse {\n");
        sb.append("    badRecordLocationName: ").append(toIndentedString(badRecordLocationName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    jobLogLocationName: ").append(toIndentedString(jobLogLocationName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    memberNum: ").append(toIndentedString(memberNum)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
