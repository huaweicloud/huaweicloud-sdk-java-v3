package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class DstNodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_token")

    private String securityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_prefix")

    private String savePrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    public DstNodeReq withAk(String ak) {
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

    public DstNodeReq withSk(String sk) {
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

    public DstNodeReq withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * 目的端的临时Token（最大长度16384个字符）。
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public DstNodeReq withBucket(String bucket) {
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

    public DstNodeReq withSavePrefix(String savePrefix) {
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

    public DstNodeReq withRegion(String region) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DstNodeReq dstNodeReq = (DstNodeReq) o;
        return Objects.equals(this.ak, dstNodeReq.ak) && Objects.equals(this.sk, dstNodeReq.sk)
            && Objects.equals(this.securityToken, dstNodeReq.securityToken)
            && Objects.equals(this.bucket, dstNodeReq.bucket) && Objects.equals(this.savePrefix, dstNodeReq.savePrefix)
            && Objects.equals(this.region, dstNodeReq.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ak, sk, securityToken, bucket, savePrefix, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DstNodeReq {\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    savePrefix: ").append(toIndentedString(savePrefix)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
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
