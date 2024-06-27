package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BasicAwCata
 */
public class BasicAwCata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_dir")

    private String awDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cata_type")

    private Integer cataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private String extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_folder")

    private String isFolder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nameView")

    private String nameView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refCnt")

    private Integer refCnt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    public BasicAwCata withAwDir(String awDir) {
        this.awDir = awDir;
        return this;
    }

    /**
     * aw归属目录信息
     * @return awDir
     */
    public String getAwDir() {
        return awDir;
    }

    public void setAwDir(String awDir) {
        this.awDir = awDir;
    }

    public BasicAwCata withCataType(Integer cataType) {
        this.cataType = cataType;
        return this;
    }

    /**
     * 目录层级
     * @return cataType
     */
    public Integer getCataType() {
        return cataType;
    }

    public void setCataType(Integer cataType) {
        this.cataType = cataType;
    }

    public BasicAwCata withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public BasicAwCata withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public BasicAwCata withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * 创建人id
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public BasicAwCata withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 目录描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BasicAwCata withExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * 引用次数
     * @return extraInfo
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public BasicAwCata withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BasicAwCata withIsFolder(String isFolder) {
        this.isFolder = isFolder;
        return this;
    }

    /**
     * 判断是否为文件夹的标识
     * @return isFolder
     */
    public String getIsFolder() {
        return isFolder;
    }

    public void setIsFolder(String isFolder) {
        this.isFolder = isFolder;
    }

    public BasicAwCata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicAwCata withNameView(String nameView) {
        this.nameView = nameView;
        return this;
    }

    /**
     * aw在页面上显示的名字
     * @return nameView
     */
    public String getNameView() {
        return nameView;
    }

    public void setNameView(String nameView) {
        this.nameView = nameView;
    }

    public BasicAwCata withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * aw目录父编号
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BasicAwCata withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public BasicAwCata withRefCnt(Integer refCnt) {
        this.refCnt = refCnt;
        return this;
    }

    /**
     * 引用次数
     * @return refCnt
     */
    public Integer getRefCnt() {
        return refCnt;
    }

    public void setRefCnt(Integer refCnt) {
        this.refCnt = refCnt;
    }

    public BasicAwCata withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BasicAwCata withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public BasicAwCata withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BasicAwCata that = (BasicAwCata) obj;
        return Objects.equals(this.awDir, that.awDir) && Objects.equals(this.cataType, that.cataType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createUserId, that.createUserId) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isFolder, that.isFolder) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nameView, that.nameView) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.refCnt, that.refCnt)
            && Objects.equals(this.region, that.region) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awDir,
            cataType,
            createTime,
            createUser,
            createUserId,
            desc,
            extraInfo,
            id,
            isFolder,
            name,
            nameView,
            parentId,
            projectId,
            refCnt,
            region,
            updateTime,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BasicAwCata {\n");
        sb.append("    awDir: ").append(toIndentedString(awDir)).append("\n");
        sb.append("    cataType: ").append(toIndentedString(cataType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameView: ").append(toIndentedString(nameView)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    refCnt: ").append(toIndentedString(refCnt)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
