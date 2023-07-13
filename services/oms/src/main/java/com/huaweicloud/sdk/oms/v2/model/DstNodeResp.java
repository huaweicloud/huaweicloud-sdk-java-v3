package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class DstNodeResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_prefix")

    private String savePrefix;

    public DstNodeResp withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 目的端桶的名称。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public DstNodeResp withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 目的端桶所处的区域。  请与Endpoint对应的区域保持一致。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DstNodeResp withSavePrefix(String savePrefix) {
        this.savePrefix = savePrefix;
        return this;
    }

    /**
     * 目的端桶内路径前缀（拼接在对象key前面,组成新的key,拼接后不能超过1024个字符）。
     * @return savePrefix
     */
    public String getSavePrefix() {
        return savePrefix;
    }

    public void setSavePrefix(String savePrefix) {
        this.savePrefix = savePrefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DstNodeResp that = (DstNodeResp) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.region, that.region)
            && Objects.equals(this.savePrefix, that.savePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, region, savePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DstNodeResp {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    savePrefix: ").append(toIndentedString(savePrefix)).append("\n");
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
