package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 迁移任务组目的端节点信息
 */
public class TaskGroupDstNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_prefix")

    private String savePrefix;

    public TaskGroupDstNode withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 目的端桶的AK（最大长度100个字符）。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public TaskGroupDstNode withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 目的端桶的SK（最大长度100个字符）。
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public TaskGroupDstNode withRegion(String region) {
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

    public TaskGroupDstNode withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 目的端的桶名称
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TaskGroupDstNode withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 华为云目的端信息，默认为HEC
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public TaskGroupDstNode withSavePrefix(String savePrefix) {
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
        TaskGroupDstNode that = (TaskGroupDstNode) obj;
        return Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.region, that.region) && Objects.equals(this.bucket, that.bucket)
            && Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.savePrefix, that.savePrefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ak, sk, region, bucket, cloudType, savePrefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskGroupDstNode {\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
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
