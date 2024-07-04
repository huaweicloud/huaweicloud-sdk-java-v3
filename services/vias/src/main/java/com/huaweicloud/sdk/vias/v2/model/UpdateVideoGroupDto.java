package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVideoGroupDto
 */
public class UpdateVideoGroupDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_name")

    private String videoGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_ids")

    private List<String> videoSourceIds = null;

    public UpdateVideoGroupDto withVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
        return this;
    }

    /**
     * 视频源分组名称。如不传入则不修改名称，传入则只能由中文、中划线(-)、下划线(\\_)、英文字母(a~z)、数字(0~9)组成长度范围为[1, 20]
     * @return videoGroupName
     */
    public String getVideoGroupName() {
        return videoGroupName;
    }

    public void setVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
    }

    public UpdateVideoGroupDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。如不传入则不修改描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateVideoGroupDto withVideoSourceIds(List<String> videoSourceIds) {
        this.videoSourceIds = videoSourceIds;
        return this;
    }

    public UpdateVideoGroupDto addVideoSourceIdsItem(String videoSourceIdsItem) {
        if (this.videoSourceIds == null) {
            this.videoSourceIds = new ArrayList<>();
        }
        this.videoSourceIds.add(videoSourceIdsItem);
        return this;
    }

    public UpdateVideoGroupDto withVideoSourceIds(Consumer<List<String>> videoSourceIdsSetter) {
        if (this.videoSourceIds == null) {
            this.videoSourceIds = new ArrayList<>();
        }
        videoSourceIdsSetter.accept(this.videoSourceIds);
        return this;
    }

    /**
     * 分组中的视频源id集。id个数需在1~50，每个id只能由小写英文字母(a~z,)、数字(0~9)、中划线(-)、下划线(\\_)组成长度范围为[4, 36]
     * @return videoSourceIds
     */
    public List<String> getVideoSourceIds() {
        return videoSourceIds;
    }

    public void setVideoSourceIds(List<String> videoSourceIds) {
        this.videoSourceIds = videoSourceIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVideoGroupDto that = (UpdateVideoGroupDto) obj;
        return Objects.equals(this.videoGroupName, that.videoGroupName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.videoSourceIds, that.videoSourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoGroupName, description, videoSourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVideoGroupDto {\n");
        sb.append("    videoGroupName: ").append(toIndentedString(videoGroupName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    videoSourceIds: ").append(toIndentedString(videoSourceIds)).append("\n");
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
