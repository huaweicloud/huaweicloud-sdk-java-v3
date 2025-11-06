package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MergeRequestBaseEvaluationDto
 */
public class MergeRequestBaseEvaluationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_id")

    private Integer mergeRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private UserBasicDto user;

    public MergeRequestBaseEvaluationDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 评价id。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MergeRequestBaseEvaluationDto withMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }

    /**
     * **参数解释：** 合并请求id。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestId
     */
    public Integer getMergeRequestId() {
        return mergeRequestId;
    }

    public void setMergeRequestId(Integer mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
    }

    public MergeRequestBaseEvaluationDto withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释：** 分数。
     * minimum: 0
     * maximum: 5
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public MergeRequestBaseEvaluationDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public MergeRequestBaseEvaluationDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MergeRequestBaseEvaluationDto withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * **参数解释：** 评价文本内容。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MergeRequestBaseEvaluationDto withUser(UserBasicDto user) {
        this.user = user;
        return this;
    }

    public MergeRequestBaseEvaluationDto withUser(Consumer<UserBasicDto> userSetter) {
        if (this.user == null) {
            this.user = new UserBasicDto();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public UserBasicDto getUser() {
        return user;
    }

    public void setUser(UserBasicDto user) {
        this.user = user;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeRequestBaseEvaluationDto that = (MergeRequestBaseEvaluationDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.mergeRequestId, that.mergeRequestId)
            && Objects.equals(this.level, that.level) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.content, that.content)
            && Objects.equals(this.user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mergeRequestId, level, createdAt, updatedAt, content, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeRequestBaseEvaluationDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mergeRequestId: ").append(toIndentedString(mergeRequestId)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
