package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询桶对应的region
 */
public class ShowBucketRegionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_auth_file")

    private String jsonAuthFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_string")

    private String connectionString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    public ShowBucketRegionReq withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云类型 AWS：亚马逊 Aliyun：阿里云 Qiniu：七牛云 QingCloud：青云 Tencent：腾讯云 Baidu：百度云 KingsoftCloud：金山云 Azure：微软云 UCloud：优刻得 HuaweiCloud：华为云 Google: 谷歌云 URLSource：URL HEC：HEC
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public ShowBucketRegionReq withAk(String ak) {
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

    public ShowBucketRegionReq withSk(String sk) {
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

    public ShowBucketRegionReq withJsonAuthFile(String jsonAuthFile) {
        this.jsonAuthFile = jsonAuthFile;
        return this;
    }

    /**
     * 用于谷歌云Cloud Storage鉴权
     * @return jsonAuthFile
     */
    public String getJsonAuthFile() {
        return jsonAuthFile;
    }

    public void setJsonAuthFile(String jsonAuthFile) {
        this.jsonAuthFile = jsonAuthFile;
    }

    public ShowBucketRegionReq withConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * 连接字符串，用于微软云Blob鉴权
     * @return connectionString
     */
    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public ShowBucketRegionReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 腾讯云APPID，当源端为腾讯云时，需要填写此参数，您可以在腾讯云控制台账号信息页面获取。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowBucketRegionReq withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * 桶名
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBucketRegionReq that = (ShowBucketRegionReq) obj;
        return Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.ak, that.ak)
            && Objects.equals(this.sk, that.sk) && Objects.equals(this.jsonAuthFile, that.jsonAuthFile)
            && Objects.equals(this.connectionString, that.connectionString) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.bucketName, that.bucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudType, ak, sk, jsonAuthFile, connectionString, appId, bucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBucketRegionReq {\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    jsonAuthFile: ").append(toIndentedString(jsonAuthFile)).append("\n");
        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
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
