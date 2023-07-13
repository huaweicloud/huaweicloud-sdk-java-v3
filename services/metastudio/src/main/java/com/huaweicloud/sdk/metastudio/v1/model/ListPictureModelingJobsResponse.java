package com.huaweicloud.sdk.metastudio.v1.model;

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
public class ListPictureModelingJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "picture_modeling_jobs")

    private List<PictureModelingInfo> pictureModelingJobs = null;

    public ListPictureModelingJobsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 照片建模任务总数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPictureModelingJobsResponse withPictureModelingJobs(List<PictureModelingInfo> pictureModelingJobs) {
        this.pictureModelingJobs = pictureModelingJobs;
        return this;
    }

    public ListPictureModelingJobsResponse addPictureModelingJobsItem(PictureModelingInfo pictureModelingJobsItem) {
        if (this.pictureModelingJobs == null) {
            this.pictureModelingJobs = new ArrayList<>();
        }
        this.pictureModelingJobs.add(pictureModelingJobsItem);
        return this;
    }

    public ListPictureModelingJobsResponse withPictureModelingJobs(
        Consumer<List<PictureModelingInfo>> pictureModelingJobsSetter) {
        if (this.pictureModelingJobs == null) {
            this.pictureModelingJobs = new ArrayList<>();
        }
        pictureModelingJobsSetter.accept(this.pictureModelingJobs);
        return this;
    }

    /**
     * 照片建模任务列表。
     * @return pictureModelingJobs
     */
    public List<PictureModelingInfo> getPictureModelingJobs() {
        return pictureModelingJobs;
    }

    public void setPictureModelingJobs(List<PictureModelingInfo> pictureModelingJobs) {
        this.pictureModelingJobs = pictureModelingJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPictureModelingJobsResponse that = (ListPictureModelingJobsResponse) obj;
        return Objects.equals(this.count, that.count)
            && Objects.equals(this.pictureModelingJobs, that.pictureModelingJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pictureModelingJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPictureModelingJobsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pictureModelingJobs: ").append(toIndentedString(pictureModelingJobs)).append("\n");
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
