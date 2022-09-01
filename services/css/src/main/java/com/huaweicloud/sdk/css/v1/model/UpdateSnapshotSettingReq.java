package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdateSnapshotSettingReq
 */
public class UpdateSnapshotSettingReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    @JacksonXmlProperty(localName = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    @JacksonXmlProperty(localName = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basePath")

    @JacksonXmlProperty(localName = "basePath")

    private String basePath;

    public UpdateSnapshotSettingReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 备份使用的OBS桶的桶名。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public UpdateSnapshotSettingReq withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 访问OBS使用的IAM委托名称。
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public UpdateSnapshotSettingReq withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * 快照在OBS桶中的存放路径。
     * @return basePath
     */
    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSnapshotSettingReq updateSnapshotSettingReq = (UpdateSnapshotSettingReq) o;
        return Objects.equals(this.bucket, updateSnapshotSettingReq.bucket)
            && Objects.equals(this.agency, updateSnapshotSettingReq.agency)
            && Objects.equals(this.basePath, updateSnapshotSettingReq.basePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, agency, basePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotSettingReq {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
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
