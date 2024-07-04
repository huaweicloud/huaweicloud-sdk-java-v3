package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchTaskInputDto
 */
public class BatchTaskInputDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_group")

    private List<BatchTaskVideoSourceGroupDto> videoSourceGroup = null;

    public BatchTaskInputDto withVideoSourceGroup(List<BatchTaskVideoSourceGroupDto> videoSourceGroup) {
        this.videoSourceGroup = videoSourceGroup;
        return this;
    }

    public BatchTaskInputDto addVideoSourceGroupItem(BatchTaskVideoSourceGroupDto videoSourceGroupItem) {
        if (this.videoSourceGroup == null) {
            this.videoSourceGroup = new ArrayList<>();
        }
        this.videoSourceGroup.add(videoSourceGroupItem);
        return this;
    }

    public BatchTaskInputDto withVideoSourceGroup(Consumer<List<BatchTaskVideoSourceGroupDto>> videoSourceGroupSetter) {
        if (this.videoSourceGroup == null) {
            this.videoSourceGroup = new ArrayList<>();
        }
        videoSourceGroupSetter.accept(this.videoSourceGroup);
        return this;
    }

    /**
     * 视频源分组信息
     * @return videoSourceGroup
     */
    public List<BatchTaskVideoSourceGroupDto> getVideoSourceGroup() {
        return videoSourceGroup;
    }

    public void setVideoSourceGroup(List<BatchTaskVideoSourceGroupDto> videoSourceGroup) {
        this.videoSourceGroup = videoSourceGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchTaskInputDto that = (BatchTaskInputDto) obj;
        return Objects.equals(this.videoSourceGroup, that.videoSourceGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTaskInputDto {\n");
        sb.append("    videoSourceGroup: ").append(toIndentedString(videoSourceGroup)).append("\n");
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
