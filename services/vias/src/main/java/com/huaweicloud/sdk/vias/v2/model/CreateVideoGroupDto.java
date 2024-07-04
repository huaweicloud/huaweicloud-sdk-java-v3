package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVideoGroupDto
 */
public class CreateVideoGroupDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_name")

    private String videoGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private String accessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_ids")

    private List<String> videoSourceIds = null;

    public CreateVideoGroupDto withVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
        return this;
    }

    /**
     * 视频源分组名称，只能由中文、小写英文字母(a~z)、大写英文字母(A~Z)、数字(0~9)组成, 长度范围为[1, 20]
     * @return videoGroupName
     */
    public String getVideoGroupName() {
        return videoGroupName;
    }

    public void setVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
    }

    public CreateVideoGroupDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 视频源分组描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateVideoGroupDto withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * 接入方式，只能选择cloud 或者 edge
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public CreateVideoGroupDto withVideoSourceIds(List<String> videoSourceIds) {
        this.videoSourceIds = videoSourceIds;
        return this;
    }

    public CreateVideoGroupDto addVideoSourceIdsItem(String videoSourceIdsItem) {
        if (this.videoSourceIds == null) {
            this.videoSourceIds = new ArrayList<>();
        }
        this.videoSourceIds.add(videoSourceIdsItem);
        return this;
    }

    public CreateVideoGroupDto withVideoSourceIds(Consumer<List<String>> videoSourceIdsSetter) {
        if (this.videoSourceIds == null) {
            this.videoSourceIds = new ArrayList<>();
        }
        videoSourceIdsSetter.accept(this.videoSourceIds);
        return this;
    }

    /**
     * 选中分组内视频源id列表，只能由小写英文字母(a~z,)、数字(0~9)、中划线(-)、下划线(\\_)组成, 长度范围为[4, 36]
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
        CreateVideoGroupDto that = (CreateVideoGroupDto) obj;
        return Objects.equals(this.videoGroupName, that.videoGroupName)
            && Objects.equals(this.description, that.description) && Objects.equals(this.accessType, that.accessType)
            && Objects.equals(this.videoSourceIds, that.videoSourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoGroupName, description, accessType, videoSourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoGroupDto {\n");
        sb.append("    videoGroupName: ").append(toIndentedString(videoGroupName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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
