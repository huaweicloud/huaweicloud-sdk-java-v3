package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查桶对应的CDN信息
 */
public class ShowCdnInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private PrefixKeyInfo prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn")

    private SourceCdnReq sourceCdn;

    public ShowCdnInfoReq withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 源端桶的AK（最大长度100个字符），task_type为非url_list时，本参数为必选。
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public ShowCdnInfoReq withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 源端桶的SK（最大长度100个字符），task_type为非url_list时，本参数为必选。
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public ShowCdnInfoReq withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云类型 AWS：亚马逊 Aliyun：阿里云 Qiniu：七牛云 QingCloud：青云 Tencent：腾讯云 Baidu：百度云 KingsoftCloud：金山云 Azure：微软云 UCloud：优刻得 HuaweiCloud：华为云 URLSource：URL HEC：HEC
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public ShowCdnInfoReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowCdnInfoReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 当源端为腾讯云时，会返回此参数。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowCdnInfoReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 桶名
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ShowCdnInfoReq withPrefix(PrefixKeyInfo prefix) {
        this.prefix = prefix;
        return this;
    }

    public ShowCdnInfoReq withPrefix(Consumer<PrefixKeyInfo> prefixSetter) {
        if (this.prefix == null) {
            this.prefix = new PrefixKeyInfo();
            prefixSetter.accept(this.prefix);
        }

        return this;
    }

    /**
     * Get prefix
     * @return prefix
     */
    public PrefixKeyInfo getPrefix() {
        return prefix;
    }

    public void setPrefix(PrefixKeyInfo prefix) {
        this.prefix = prefix;
    }

    public ShowCdnInfoReq withSourceCdn(SourceCdnReq sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public ShowCdnInfoReq withSourceCdn(Consumer<SourceCdnReq> sourceCdnSetter) {
        if (this.sourceCdn == null) {
            this.sourceCdn = new SourceCdnReq();
            sourceCdnSetter.accept(this.sourceCdn);
        }

        return this;
    }

    /**
     * Get sourceCdn
     * @return sourceCdn
     */
    public SourceCdnReq getSourceCdn() {
        return sourceCdn;
    }

    public void setSourceCdn(SourceCdnReq sourceCdn) {
        this.sourceCdn = sourceCdn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCdnInfoReq that = (ShowCdnInfoReq) obj;
        return Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.bucket, that.bucket)
            && Objects.equals(this.prefix, that.prefix) && Objects.equals(this.sourceCdn, that.sourceCdn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ak, sk, cloudType, region, appId, bucket, prefix, sourceCdn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCdnInfoReq {\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    sourceCdn: ").append(toIndentedString(sourceCdn)).append("\n");
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
