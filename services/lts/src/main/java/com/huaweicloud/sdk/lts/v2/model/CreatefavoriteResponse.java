package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreatefavoriteResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite_resource_id")

    private String favoriteResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite_resource_type")

    private String favoriteResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_global")

    private Boolean isGlobal;

    public CreatefavoriteResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreatefavoriteResponse withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public CreatefavoriteResponse withFavoriteResourceId(String favoriteResourceId) {
        this.favoriteResourceId = favoriteResourceId;
        return this;
    }

    /**
     * 收藏资源id
     * @return favoriteResourceId
     */
    public String getFavoriteResourceId() {
        return favoriteResourceId;
    }

    public void setFavoriteResourceId(String favoriteResourceId) {
        this.favoriteResourceId = favoriteResourceId;
    }

    public CreatefavoriteResponse withFavoriteResourceType(String favoriteResourceType) {
        this.favoriteResourceType = favoriteResourceType;
        return this;
    }

    /**
     * 收藏资源类型
     * @return favoriteResourceType
     */
    public String getFavoriteResourceType() {
        return favoriteResourceType;
    }

    public void setFavoriteResourceType(String favoriteResourceType) {
        this.favoriteResourceType = favoriteResourceType;
    }

    public CreatefavoriteResponse withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组id
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreatefavoriteResponse withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 日志组名称
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public CreatefavoriteResponse withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流id
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public CreatefavoriteResponse withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public CreatefavoriteResponse withProjectId(String projectId) {
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

    public CreatefavoriteResponse withIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
        return this;
    }

    /**
     * 是否开启日志收藏
     * @return isGlobal
     */
    public Boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(Boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatefavoriteResponse that = (CreatefavoriteResponse) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.epsId, that.epsId)
            && Objects.equals(this.favoriteResourceId, that.favoriteResourceId)
            && Objects.equals(this.favoriteResourceType, that.favoriteResourceType)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.isGlobal, that.isGlobal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            epsId,
            favoriteResourceId,
            favoriteResourceType,
            logGroupId,
            logGroupName,
            logStreamId,
            logStreamName,
            projectId,
            isGlobal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatefavoriteResponse {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    favoriteResourceId: ").append(toIndentedString(favoriteResourceId)).append("\n");
        sb.append("    favoriteResourceType: ").append(toIndentedString(favoriteResourceType)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    isGlobal: ").append(toIndentedString(isGlobal)).append("\n");
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
