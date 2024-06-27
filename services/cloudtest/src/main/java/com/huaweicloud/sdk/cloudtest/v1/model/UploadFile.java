package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UploadFile
 */
public class UploadFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "awInsId")

    private String awInsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_string")

    private String createTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_size")

    private Long currentSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filePath")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "originName")

    private String originName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_string")

    private String updateTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    public UploadFile withAwInsId(String awInsId) {
        this.awInsId = awInsId;
        return this;
    }

    /**
     * 所属的AWInstance的ID
     * @return awInsId
     */
    public String getAwInsId() {
        return awInsId;
    }

    public void setAwInsId(String awInsId) {
        this.awInsId = awInsId;
    }

    public UploadFile withCreateTime(String createTime) {
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

    public UploadFile withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public UploadFile withCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
        return this;
    }

    /**
     * 创建时间字符串
     * @return createTimeString
     */
    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public UploadFile withCreateUser(String createUser) {
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

    public UploadFile withCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
        return this;
    }

    /**
     * 当前大小
     * @return currentSize
     */
    public Long getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Long currentSize) {
        this.currentSize = currentSize;
    }

    public UploadFile withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public UploadFile withId(String id) {
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

    public UploadFile withName(String name) {
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

    public UploadFile withOriginName(String originName) {
        this.originName = originName;
        return this;
    }

    /**
     * 文件的原名
     * @return originName
     */
    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public UploadFile withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UploadFile withRegion(String region) {
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

    public UploadFile withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 测试用例的唯一标识符
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    public UploadFile withUpdateTime(String updateTime) {
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

    public UploadFile withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public UploadFile withUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
        return this;
    }

    /**
     * 更新时间字符串
     * @return updateTimeString
     */
    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }

    public UploadFile withUpdateUser(String updateUser) {
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
        UploadFile that = (UploadFile) obj;
        return Objects.equals(this.awInsId, that.awInsId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.createTimeString, that.createTimeString)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.currentSize, that.currentSize)
            && Objects.equals(this.filePath, that.filePath) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.originName, that.originName)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.testcaseId, that.testcaseId) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.updateTimeString, that.updateTimeString)
            && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awInsId,
            createTime,
            createTimeStamp,
            createTimeString,
            createUser,
            currentSize,
            filePath,
            id,
            name,
            originName,
            projectId,
            region,
            testcaseId,
            updateTime,
            updateTimeStamp,
            updateTimeString,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadFile {\n");
        sb.append("    awInsId: ").append(toIndentedString(awInsId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    createTimeString: ").append(toIndentedString(createTimeString)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    originName: ").append(toIndentedString(originName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    updateTimeString: ").append(toIndentedString(updateTimeString)).append("\n");
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
