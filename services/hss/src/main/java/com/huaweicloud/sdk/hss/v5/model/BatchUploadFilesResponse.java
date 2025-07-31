package com.huaweicloud.sdk.hss.v5.model;

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
public class BatchUploadFilesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_file_info")

    private List<BatchUploadFilesResponseInfoSuccessFileInfo> successFileInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_file_info")

    private List<BatchUploadFilesResponseInfoFailFileInfo> failFileInfo = null;

    public BatchUploadFilesResponse withSuccessFileInfo(
        List<BatchUploadFilesResponseInfoSuccessFileInfo> successFileInfo) {
        this.successFileInfo = successFileInfo;
        return this;
    }

    public BatchUploadFilesResponse addSuccessFileInfoItem(
        BatchUploadFilesResponseInfoSuccessFileInfo successFileInfoItem) {
        if (this.successFileInfo == null) {
            this.successFileInfo = new ArrayList<>();
        }
        this.successFileInfo.add(successFileInfoItem);
        return this;
    }

    public BatchUploadFilesResponse withSuccessFileInfo(
        Consumer<List<BatchUploadFilesResponseInfoSuccessFileInfo>> successFileInfoSetter) {
        if (this.successFileInfo == null) {
            this.successFileInfo = new ArrayList<>();
        }
        successFileInfoSetter.accept(this.successFileInfo);
        return this;
    }

    /**
     * 上传成功的文件信息列表。
     * @return successFileInfo
     */
    public List<BatchUploadFilesResponseInfoSuccessFileInfo> getSuccessFileInfo() {
        return successFileInfo;
    }

    public void setSuccessFileInfo(List<BatchUploadFilesResponseInfoSuccessFileInfo> successFileInfo) {
        this.successFileInfo = successFileInfo;
    }

    public BatchUploadFilesResponse withFailFileInfo(List<BatchUploadFilesResponseInfoFailFileInfo> failFileInfo) {
        this.failFileInfo = failFileInfo;
        return this;
    }

    public BatchUploadFilesResponse addFailFileInfoItem(BatchUploadFilesResponseInfoFailFileInfo failFileInfoItem) {
        if (this.failFileInfo == null) {
            this.failFileInfo = new ArrayList<>();
        }
        this.failFileInfo.add(failFileInfoItem);
        return this;
    }

    public BatchUploadFilesResponse withFailFileInfo(
        Consumer<List<BatchUploadFilesResponseInfoFailFileInfo>> failFileInfoSetter) {
        if (this.failFileInfo == null) {
            this.failFileInfo = new ArrayList<>();
        }
        failFileInfoSetter.accept(this.failFileInfo);
        return this;
    }

    /**
     * 上传失败的文件信息列表。
     * @return failFileInfo
     */
    public List<BatchUploadFilesResponseInfoFailFileInfo> getFailFileInfo() {
        return failFileInfo;
    }

    public void setFailFileInfo(List<BatchUploadFilesResponseInfoFailFileInfo> failFileInfo) {
        this.failFileInfo = failFileInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUploadFilesResponse that = (BatchUploadFilesResponse) obj;
        return Objects.equals(this.successFileInfo, that.successFileInfo)
            && Objects.equals(this.failFileInfo, that.failFileInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successFileInfo, failFileInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUploadFilesResponse {\n");
        sb.append("    successFileInfo: ").append(toIndentedString(successFileInfo)).append("\n");
        sb.append("    failFileInfo: ").append(toIndentedString(failFileInfo)).append("\n");
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
