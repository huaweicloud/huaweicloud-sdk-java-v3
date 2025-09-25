package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 环境详情
 */
public class EnvironmentDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os")

    private String os;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private Integer deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_count")

    private Integer instanceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private UserInfo createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private EnvironmentPermissionDetail permission;

    public EnvironmentDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 环境id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnvironmentDetail withName(String name) {
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

    public EnvironmentDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 环境描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EnvironmentDetail withOs(String os) {
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

    public EnvironmentDetail withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public EnvironmentDetail withDeployType(Integer deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * 部署类型：0表示主机, 1表示kubernetes
     * @return deployType
     */
    public Integer getDeployType() {
        return deployType;
    }

    public void setDeployType(Integer deployType) {
        this.deployType = deployType;
    }

    public EnvironmentDetail withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public EnvironmentDetail withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * 环境下主机实例数量
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public EnvironmentDetail withCreatedBy(UserInfo createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public EnvironmentDetail withCreatedBy(Consumer<UserInfo> createdBySetter) {
        if (this.createdBy == null) {
            this.createdBy = new UserInfo();
            createdBySetter.accept(this.createdBy);
        }

        return this;
    }

    /**
     * Get createdBy
     * @return createdBy
     */
    public UserInfo getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserInfo createdBy) {
        this.createdBy = createdBy;
    }

    public EnvironmentDetail withPermission(EnvironmentPermissionDetail permission) {
        this.permission = permission;
        return this;
    }

    public EnvironmentDetail withPermission(Consumer<EnvironmentPermissionDetail> permissionSetter) {
        if (this.permission == null) {
            this.permission = new EnvironmentPermissionDetail();
            permissionSetter.accept(this.permission);
        }

        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    public EnvironmentPermissionDetail getPermission() {
        return permission;
    }

    public void setPermission(EnvironmentPermissionDetail permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnvironmentDetail that = (EnvironmentDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.os, that.os)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.instanceCount, that.instanceCount) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.permission, that.permission);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, description, os, nickName, deployType, createdTime, instanceCount, createdBy, permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
