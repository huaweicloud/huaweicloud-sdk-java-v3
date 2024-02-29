package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowFactoryPackageDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_package")

    private ShowPackageDetailRespReleasePackage releasePackage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_details")

    private List<ShowPackageDetailRespTaskDetails> taskDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowFactoryPackageDetailResponse withReleasePackage(ShowPackageDetailRespReleasePackage releasePackage) {
        this.releasePackage = releasePackage;
        return this;
    }

    public ShowFactoryPackageDetailResponse withReleasePackage(
        Consumer<ShowPackageDetailRespReleasePackage> releasePackageSetter) {
        if (this.releasePackage == null) {
            this.releasePackage = new ShowPackageDetailRespReleasePackage();
            releasePackageSetter.accept(this.releasePackage);
        }

        return this;
    }

    /**
     * Get releasePackage
     * @return releasePackage
     */
    public ShowPackageDetailRespReleasePackage getReleasePackage() {
        return releasePackage;
    }

    public void setReleasePackage(ShowPackageDetailRespReleasePackage releasePackage) {
        this.releasePackage = releasePackage;
    }

    public ShowFactoryPackageDetailResponse withTaskDetails(List<ShowPackageDetailRespTaskDetails> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }

    public ShowFactoryPackageDetailResponse addTaskDetailsItem(ShowPackageDetailRespTaskDetails taskDetailsItem) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        this.taskDetails.add(taskDetailsItem);
        return this;
    }

    public ShowFactoryPackageDetailResponse withTaskDetails(
        Consumer<List<ShowPackageDetailRespTaskDetails>> taskDetailsSetter) {
        if (this.taskDetails == null) {
            this.taskDetails = new ArrayList<>();
        }
        taskDetailsSetter.accept(this.taskDetails);
        return this;
    }

    /**
     * 发布任务详情
     * @return taskDetails
     */
    public List<ShowPackageDetailRespTaskDetails> getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(List<ShowPackageDetailRespTaskDetails> taskDetails) {
        this.taskDetails = taskDetails;
    }

    public ShowFactoryPackageDetailResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryPackageDetailResponse that = (ShowFactoryPackageDetailResponse) obj;
        return Objects.equals(this.releasePackage, that.releasePackage)
            && Objects.equals(this.taskDetails, that.taskDetails) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releasePackage, taskDetails, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryPackageDetailResponse {\n");
        sb.append("    releasePackage: ").append(toIndentedString(releasePackage)).append("\n");
        sb.append("    taskDetails: ").append(toIndentedString(taskDetails)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
