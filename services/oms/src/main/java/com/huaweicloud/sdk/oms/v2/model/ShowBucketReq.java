package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询桶请求体
 */
public class ShowBucketReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_string")

    private String connectionString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_auth_file")

    private String jsonAuthFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behind_filename")

    private String behindFilename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    public ShowBucketReq withCloudType(String cloudType) {
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

    public ShowBucketReq withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 目标桶中需要查询的对象文件路径，/结尾
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ShowBucketReq withAk(String ak) {
        this.ak = ak;
        return this;
    }

    /**
     * 源端桶的AK（最大长度100个字符）
     * @return ak
     */
    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public ShowBucketReq withSk(String sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 源端桶的SK（最大长度100个字符）
     * @return sk
     */
    public String getSk() {
        return sk;
    }

    public void setSk(String sk) {
        this.sk = sk;
    }

    public ShowBucketReq withConnectionString(String connectionString) {
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

    public ShowBucketReq withJsonAuthFile(String jsonAuthFile) {
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

    public ShowBucketReq withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * 数据中心，区域
     * @return dataCenter
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public ShowBucketReq withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页信息，页大小
     * minimum: 0
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ShowBucketReq withBehindFilename(String behindFilename) {
        this.behindFilename = behindFilename;
        return this;
    }

    /**
     * 分页信息，当前页最后一个对象名称（偏移量）
     * @return behindFilename
     */
    public String getBehindFilename() {
        return behindFilename;
    }

    public void setBehindFilename(String behindFilename) {
        this.behindFilename = behindFilename;
    }

    public ShowBucketReq withAppId(String appId) {
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

    public ShowBucketReq withBucketName(String bucketName) {
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
        ShowBucketReq that = (ShowBucketReq) obj;
        return Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.connectionString, that.connectionString)
            && Objects.equals(this.jsonAuthFile, that.jsonAuthFile) && Objects.equals(this.dataCenter, that.dataCenter)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.behindFilename, that.behindFilename)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.bucketName, that.bucketName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudType,
            filePath,
            ak,
            sk,
            connectionString,
            jsonAuthFile,
            dataCenter,
            pageSize,
            behindFilename,
            appId,
            bucketName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBucketReq {\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    jsonAuthFile: ").append(toIndentedString(jsonAuthFile)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    behindFilename: ").append(toIndentedString(behindFilename)).append("\n");
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
