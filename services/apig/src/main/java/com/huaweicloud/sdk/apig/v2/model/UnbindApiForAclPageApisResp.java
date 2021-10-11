package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** UnbindApiForAclPageApisResp */
public class UnbindApiForAclPageApisResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_env_name")

    private String runEnvName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_env_id")

    private String runEnvId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_id")

    private String publishId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "acl_name")

    private String aclName;

    public UnbindApiForAclPageApisResp withId(String id) {
        this.id = id;
        return this;
    }

    /** API的ID
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UnbindApiForAclPageApisResp withName(String name) {
        this.name = name;
        return this;
    }

    /** API名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnbindApiForAclPageApisResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** API所属分组的编号
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public UnbindApiForAclPageApisResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /** API所属分组的名称
     * 
     * @return groupName */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public UnbindApiForAclPageApisResp withType(Integer type) {
        this.type = type;
        return this;
    }

    /** API开放状态
     * 
     * @return type */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public UnbindApiForAclPageApisResp withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /** API描述
     * 
     * @return remark */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UnbindApiForAclPageApisResp withRunEnvName(String runEnvName) {
        this.runEnvName = runEnvName;
        return this;
    }

    /** 发布的环境名
     * 
     * @return runEnvName */
    public String getRunEnvName() {
        return runEnvName;
    }

    public void setRunEnvName(String runEnvName) {
        this.runEnvName = runEnvName;
    }

    public UnbindApiForAclPageApisResp withRunEnvId(String runEnvId) {
        this.runEnvId = runEnvId;
        return this;
    }

    /** 发布的环境id
     * 
     * @return runEnvId */
    public String getRunEnvId() {
        return runEnvId;
    }

    public void setRunEnvId(String runEnvId) {
        this.runEnvId = runEnvId;
    }

    public UnbindApiForAclPageApisResp withPublishId(String publishId) {
        this.publishId = publishId;
        return this;
    }

    /** API发布记录编号
     * 
     * @return publishId */
    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId;
    }

    public UnbindApiForAclPageApisResp withAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }

    /** 绑定的其他同类型的ACL策略名称
     * 
     * @return aclName */
    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnbindApiForAclPageApisResp unbindApiForAclPageApisResp = (UnbindApiForAclPageApisResp) o;
        return Objects.equals(this.id, unbindApiForAclPageApisResp.id)
            && Objects.equals(this.name, unbindApiForAclPageApisResp.name)
            && Objects.equals(this.groupId, unbindApiForAclPageApisResp.groupId)
            && Objects.equals(this.groupName, unbindApiForAclPageApisResp.groupName)
            && Objects.equals(this.type, unbindApiForAclPageApisResp.type)
            && Objects.equals(this.remark, unbindApiForAclPageApisResp.remark)
            && Objects.equals(this.runEnvName, unbindApiForAclPageApisResp.runEnvName)
            && Objects.equals(this.runEnvId, unbindApiForAclPageApisResp.runEnvId)
            && Objects.equals(this.publishId, unbindApiForAclPageApisResp.publishId)
            && Objects.equals(this.aclName, unbindApiForAclPageApisResp.aclName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, groupId, groupName, type, remark, runEnvName, runEnvId, publishId, aclName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnbindApiForAclPageApisResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    runEnvName: ").append(toIndentedString(runEnvName)).append("\n");
        sb.append("    runEnvId: ").append(toIndentedString(runEnvId)).append("\n");
        sb.append("    publishId: ").append(toIndentedString(publishId)).append("\n");
        sb.append("    aclName: ").append(toIndentedString(aclName)).append("\n");
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
