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
public class ListVideoSourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_number")

    private Integer videoSourceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Integer totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_number")

    private Integer quotaNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_list")

    private List<ListVideoSourceInfoDto> videoSourceList = null;

    public ListVideoSourcesResponse withVideoSourceNumber(Integer videoSourceNumber) {
        this.videoSourceNumber = videoSourceNumber;
        return this;
    }

    /**
     * 视频源数量
     * @return videoSourceNumber
     */
    public Integer getVideoSourceNumber() {
        return videoSourceNumber;
    }

    public void setVideoSourceNumber(Integer videoSourceNumber) {
        this.videoSourceNumber = videoSourceNumber;
    }

    public ListVideoSourcesResponse withTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 视频源总数
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListVideoSourcesResponse withQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
        return this;
    }

    /**
     * 视频源限额
     * @return quotaNumber
     */
    public Integer getQuotaNumber() {
        return quotaNumber;
    }

    public void setQuotaNumber(Integer quotaNumber) {
        this.quotaNumber = quotaNumber;
    }

    public ListVideoSourcesResponse withVideoSourceList(List<ListVideoSourceInfoDto> videoSourceList) {
        this.videoSourceList = videoSourceList;
        return this;
    }

    public ListVideoSourcesResponse addVideoSourceListItem(ListVideoSourceInfoDto videoSourceListItem) {
        if (this.videoSourceList == null) {
            this.videoSourceList = new ArrayList<>();
        }
        this.videoSourceList.add(videoSourceListItem);
        return this;
    }

    public ListVideoSourcesResponse withVideoSourceList(Consumer<List<ListVideoSourceInfoDto>> videoSourceListSetter) {
        if (this.videoSourceList == null) {
            this.videoSourceList = new ArrayList<>();
        }
        videoSourceListSetter.accept(this.videoSourceList);
        return this;
    }

    /**
     * 视频源列表数据
     * @return videoSourceList
     */
    public List<ListVideoSourceInfoDto> getVideoSourceList() {
        return videoSourceList;
    }

    public void setVideoSourceList(List<ListVideoSourceInfoDto> videoSourceList) {
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
        ListVideoSourcesResponse that = (ListVideoSourcesResponse) obj;
        return Objects.equals(this.videoSourceNumber, that.videoSourceNumber)
            && Objects.equals(this.totalNumber, that.totalNumber) && Objects.equals(this.quotaNumber, that.quotaNumber)
            && Objects.equals(this.videoSourceList, that.videoSourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceNumber, totalNumber, quotaNumber, videoSourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoSourcesResponse {\n");
        sb.append("    videoSourceNumber: ").append(toIndentedString(videoSourceNumber)).append("\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    quotaNumber: ").append(toIndentedString(quotaNumber)).append("\n");
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
