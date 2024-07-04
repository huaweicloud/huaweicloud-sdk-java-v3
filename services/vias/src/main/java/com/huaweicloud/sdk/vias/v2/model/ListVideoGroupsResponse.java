package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVideoGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_number")

    private Integer videoGroupNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_number")

    private Integer quotaNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_list")

    private List<VideoGroupListInfoDto> videoGroupList = null;

    public ListVideoGroupsResponse withVideoGroupNumber(Integer videoGroupNumber) {
        this.videoGroupNumber = videoGroupNumber;
        return this;
    }

    /**
     * 分组数量
     * @return videoGroupNumber
     */
    public Integer getVideoGroupNumber() {
        return videoGroupNumber;
    }

    public void setVideoGroupNumber(Integer videoGroupNumber) {
        this.videoGroupNumber = videoGroupNumber;
    }

    public ListVideoGroupsResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 视频源分组总数
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListVideoGroupsResponse withQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
        return this;
    }

    /**
     * 视频源分组最大限额
     * @return quotaNumber
     */
    public Integer getQuotaNumber() {
        return quotaNumber;
    }

    public void setQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
    }

    public ListVideoGroupsResponse withVideoGroupList(List<VideoGroupListInfoDto> videoGroupList) {
        this.videoGroupList = videoGroupList;
        return this;
    }

    public ListVideoGroupsResponse addVideoGroupListItem(VideoGroupListInfoDto videoGroupListItem) {
        if (this.videoGroupList == null) {
            this.videoGroupList = new ArrayList<>();
        }
        this.videoGroupList.add(videoGroupListItem);
        return this;
    }

    public ListVideoGroupsResponse withVideoGroupList(Consumer<List<VideoGroupListInfoDto>> videoGroupListSetter) {
        if (this.videoGroupList == null) {
            this.videoGroupList = new ArrayList<>();
        }
        videoGroupListSetter.accept(this.videoGroupList);
        return this;
    }

    /**
     * 分组列表
     * @return videoGroupList
     */
    public List<VideoGroupListInfoDto> getVideoGroupList() {
        return videoGroupList;
    }

    public void setVideoGroupList(List<VideoGroupListInfoDto> videoGroupList) {
        this.videoGroupList = videoGroupList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVideoGroupsResponse that = (ListVideoGroupsResponse) obj;
        return Objects.equals(this.videoGroupNumber, that.videoGroupNumber)
            && Objects.equals(this.totalNumber, that.totalNumber) && Objects.equals(this.quotaNumber, that.quotaNumber)
            && Objects.equals(this.videoGroupList, that.videoGroupList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoGroupNumber, totalNumber, quotaNumber, videoGroupList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoGroupsResponse {\n");
        sb.append("    videoGroupNumber: ").append(toIndentedString(videoGroupNumber)).append("\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    quotaNumber: ").append(toIndentedString(quotaNumber)).append("\n");
        sb.append("    videoGroupList: ").append(toIndentedString(videoGroupList)).append("\n");
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
