package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/** MemberGroupInfo */
public class MemberGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_remark")

    private String memberGroupRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_weight")

    private Integer memberGroupWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_code")

    private String dictCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_id")

    private String memberGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public MemberGroupInfo withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /** VPC通道后端服务器组名称
     * 
     * @return memberGroupName */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public MemberGroupInfo withMemberGroupRemark(String memberGroupRemark) {
        this.memberGroupRemark = memberGroupRemark;
        return this;
    }

    /** VPC通道后端服务器组描述
     * 
     * @return memberGroupRemark */
    public String getMemberGroupRemark() {
        return memberGroupRemark;
    }

    public void setMemberGroupRemark(String memberGroupRemark) {
        this.memberGroupRemark = memberGroupRemark;
    }

    public MemberGroupInfo withMemberGroupWeight(Integer memberGroupWeight) {
        this.memberGroupWeight = memberGroupWeight;
        return this;
    }

    /** VPC通道后端服务器组权重值。 当前服务器组存在服务器且此权重值存在时，自动使用此权重值分配权重。 minimum: 0 maximum: 100
     * 
     * @return memberGroupWeight */
    public Integer getMemberGroupWeight() {
        return memberGroupWeight;
    }

    public void setMemberGroupWeight(Integer memberGroupWeight) {
        this.memberGroupWeight = memberGroupWeight;
    }

    public MemberGroupInfo withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /** VPC通道后端服务器组的字典编码 支持英文，数字，特殊字符（-_.） 暂不支持
     * 
     * @return dictCode */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public MemberGroupInfo withMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
        return this;
    }

    /** VPC通道后端服务器组编号
     * 
     * @return memberGroupId */
    public String getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    public MemberGroupInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /** VPC通道后端服务器组创建时间
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public MemberGroupInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /** VPC通道后端服务器组更新时间
     * 
     * @return updateTime */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberGroupInfo memberGroupInfo = (MemberGroupInfo) o;
        return Objects.equals(this.memberGroupName, memberGroupInfo.memberGroupName)
            && Objects.equals(this.memberGroupRemark, memberGroupInfo.memberGroupRemark)
            && Objects.equals(this.memberGroupWeight, memberGroupInfo.memberGroupWeight)
            && Objects.equals(this.dictCode, memberGroupInfo.dictCode)
            && Objects.equals(this.memberGroupId, memberGroupInfo.memberGroupId)
            && Objects.equals(this.createTime, memberGroupInfo.createTime)
            && Objects.equals(this.updateTime, memberGroupInfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberGroupName,
            memberGroupRemark,
            memberGroupWeight,
            dictCode,
            memberGroupId,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberGroupInfo {\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    memberGroupRemark: ").append(toIndentedString(memberGroupRemark)).append("\n");
        sb.append("    memberGroupWeight: ").append(toIndentedString(memberGroupWeight)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
        sb.append("    memberGroupId: ").append(toIndentedString(memberGroupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
