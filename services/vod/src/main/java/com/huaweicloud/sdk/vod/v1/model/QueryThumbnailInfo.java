package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 截图信息。
 */
public class QueryThumbnailInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_para")

    private Thumbnail thumbnailPara;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_count")

    private Integer thumbnailCount;

    public QueryThumbnailInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 截图任务 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public QueryThumbnailInfo withThumbnailPara(Thumbnail thumbnailPara) {
        this.thumbnailPara = thumbnailPara;
        return this;
    }

    public QueryThumbnailInfo withThumbnailPara(Consumer<Thumbnail> thumbnailParaSetter) {
        if (this.thumbnailPara == null) {
            this.thumbnailPara = new Thumbnail();
            thumbnailParaSetter.accept(this.thumbnailPara);
        }

        return this;
    }

    /**
     * Get thumbnailPara
     * @return thumbnailPara
     */
    public Thumbnail getThumbnailPara() {
        return thumbnailPara;
    }

    public void setThumbnailPara(Thumbnail thumbnailPara) {
        this.thumbnailPara = thumbnailPara;
    }

    public QueryThumbnailInfo withThumbnailCount(Integer thumbnailCount) {
        this.thumbnailCount = thumbnailCount;
        return this;
    }

    /**
     * 视频截图个数。
     * minimum: 0
     * maximum: 20480
     * @return thumbnailCount
     */
    public Integer getThumbnailCount() {
        return thumbnailCount;
    }

    public void setThumbnailCount(Integer thumbnailCount) {
        this.thumbnailCount = thumbnailCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryThumbnailInfo that = (QueryThumbnailInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.thumbnailPara, that.thumbnailPara)
            && Objects.equals(this.thumbnailCount, that.thumbnailCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, thumbnailPara, thumbnailCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryThumbnailInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    thumbnailPara: ").append(toIndentedString(thumbnailPara)).append("\n");
        sb.append("    thumbnailCount: ").append(toIndentedString(thumbnailCount)).append("\n");
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
