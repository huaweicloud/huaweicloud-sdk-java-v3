package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 技能包区域信息（企业自研技能，含上传状态）。服务端根据 slug+version+packageName+region 自动构造 OBS 路径。
 */
public class PackageRegionWithStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_status")

    private UploadStatusEnum uploadStatus;

    public PackageRegionWithStatusInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域标识（如 cn-north-7）。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PackageRegionWithStatusInfo withUploadStatus(UploadStatusEnum uploadStatus) {
        this.uploadStatus = uploadStatus;
        return this;
    }

    /**
     * Get uploadStatus
     * @return uploadStatus
     */
    public UploadStatusEnum getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(UploadStatusEnum uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackageRegionWithStatusInfo that = (PackageRegionWithStatusInfo) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.uploadStatus, that.uploadStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, uploadStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackageRegionWithStatusInfo {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
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
