package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询刺点信息所需的参数。
 */
public class SpurQueryParaInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imageCode")

    private String imageCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public SpurQueryParaInfo withImageCode(String imageCode) {
        this.imageCode = imageCode;
        return this;
    }

    /**
     * 图片ID。
     * @return imageCode
     */
    public String getImageCode() {
        return imageCode;
    }

    public void setImageCode(String imageCode) {
        this.imageCode = imageCode;
    }

    public SpurQueryParaInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 刺点所属的任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SpurQueryParaInfo withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SpurQueryParaInfo withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpurQueryParaInfo that = (SpurQueryParaInfo) obj;
        return Objects.equals(this.imageCode, that.imageCode) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageCode, taskId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpurQueryParaInfo {\n");
        sb.append("    imageCode: ").append(toIndentedString(imageCode)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
