package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 技能包区域详情项（用于技能包详情中的 regions 列表）。
 */
public class SkillPackageRegionItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_object_key")

    private String obsObjectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_status")

    private UploadStatusEnum uploadStatus;

    public SkillPackageRegionItem withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域标识。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SkillPackageRegionItem withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * OBS 桶名。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public SkillPackageRegionItem withObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
        return this;
    }

    /**
     * OBS 对象键。
     * @return obsObjectKey
     */
    public String getObsObjectKey() {
        return obsObjectKey;
    }

    public void setObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
    }

    public SkillPackageRegionItem withUploadStatus(UploadStatusEnum uploadStatus) {
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
        SkillPackageRegionItem that = (SkillPackageRegionItem) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.obsBucket, that.obsBucket)
            && Objects.equals(this.obsObjectKey, that.obsObjectKey)
            && Objects.equals(this.uploadStatus, that.uploadStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, obsBucket, obsObjectKey, uploadStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillPackageRegionItem {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    obsObjectKey: ").append(toIndentedString(obsObjectKey)).append("\n");
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
