package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.BasicListResp;
import com.huaweicloud.sdk.cbs.v1.model.Video;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ExecuteGetVideosListResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota")
    

    private Integer quota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="videos")
    
    private List<Video> videos = null;
    
    public ExecuteGetVideosListResponse withQuota(Integer quota) {
        this.quota = quota;
        return this;
    }

    


    /**
     * 配额
     * @return quota
     */
    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    

    public ExecuteGetVideosListResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ExecuteGetVideosListResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ExecuteGetVideosListResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 返回数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ExecuteGetVideosListResponse withVideos(List<Video> videos) {
        this.videos = videos;
        return this;
    }

    
    public ExecuteGetVideosListResponse addVideosItem(Video videosItem) {
        if(this.videos == null) {
            this.videos = new ArrayList<>();
        }
        this.videos.add(videosItem);
        return this;
    }

    public ExecuteGetVideosListResponse withVideos(Consumer<List<Video>> videosSetter) {
        if(this.videos == null) {
            this.videos = new ArrayList<>();
        }
        videosSetter.accept(this.videos);
        return this;
    }

    /**
     * 视频列表
     * @return videos
     */
    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGetVideosListResponse executeGetVideosListResponse = (ExecuteGetVideosListResponse) o;
        return Objects.equals(this.quota, executeGetVideosListResponse.quota) &&
            Objects.equals(this.total, executeGetVideosListResponse.total) &&
            Objects.equals(this.offset, executeGetVideosListResponse.offset) &&
            Objects.equals(this.count, executeGetVideosListResponse.count) &&
            Objects.equals(this.videos, executeGetVideosListResponse.videos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quota, total, offset, count, videos);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetVideosListResponse {\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

