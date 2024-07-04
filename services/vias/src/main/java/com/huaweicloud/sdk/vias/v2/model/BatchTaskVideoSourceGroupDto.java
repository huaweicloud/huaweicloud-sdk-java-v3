package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchTaskVideoSourceGroupDto
 */
public class BatchTaskVideoSourceGroupDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_group_id")

    private String videoSourceGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_list")

    private List<BatchTaskInputVideoSourceDto> videoSourceList = null;

    public BatchTaskVideoSourceGroupDto withVideoSourceGroupId(String videoSourceGroupId) {
        this.videoSourceGroupId = videoSourceGroupId;
        return this;
    }

    /**
     * 视频源分组id
     * @return videoSourceGroupId
     */
    public String getVideoSourceGroupId() {
        return videoSourceGroupId;
    }

    public void setVideoSourceGroupId(String videoSourceGroupId) {
        this.videoSourceGroupId = videoSourceGroupId;
    }

    public BatchTaskVideoSourceGroupDto withVideoSourceList(List<BatchTaskInputVideoSourceDto> videoSourceList) {
        this.videoSourceList = videoSourceList;
        return this;
    }

    public BatchTaskVideoSourceGroupDto addVideoSourceListItem(BatchTaskInputVideoSourceDto videoSourceListItem) {
        if (this.videoSourceList == null) {
            this.videoSourceList = new ArrayList<>();
        }
        this.videoSourceList.add(videoSourceListItem);
        return this;
    }

    public BatchTaskVideoSourceGroupDto withVideoSourceList(
        Consumer<List<BatchTaskInputVideoSourceDto>> videoSourceListSetter) {
        if (this.videoSourceList == null) {
            this.videoSourceList = new ArrayList<>();
        }
        videoSourceListSetter.accept(this.videoSourceList);
        return this;
    }

    /**
     * 视频源列表
     * @return videoSourceList
     */
    public List<BatchTaskInputVideoSourceDto> getVideoSourceList() {
        return videoSourceList;
    }

    public void setVideoSourceList(List<BatchTaskInputVideoSourceDto> videoSourceList) {
        this.videoSourceList = videoSourceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchTaskVideoSourceGroupDto that = (BatchTaskVideoSourceGroupDto) obj;
        return Objects.equals(this.videoSourceGroupId, that.videoSourceGroupId)
            && Objects.equals(this.videoSourceList, that.videoSourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceGroupId, videoSourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTaskVideoSourceGroupDto {\n");
        sb.append("    videoSourceGroupId: ").append(toIndentedString(videoSourceGroupId)).append("\n");
        sb.append("    videoSourceList: ").append(toIndentedString(videoSourceList)).append("\n");
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
