package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 检查前缀请求体
 */
public class CheckPrefixReq {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_center")

    private String dataCenter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_token")

    private String securityToken;

    public CheckPrefixReq withCloudType(String cloudType) {
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

    public CheckPrefixReq withAk(String ak) {
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

    public CheckPrefixReq withSk(String sk) {
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

    public CheckPrefixReq withJsonAuthFile(String jsonAuthFile) {
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

    public CheckPrefixReq withConnectionString(String connectionString) {
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

    public CheckPrefixReq withAppId(String appId) {
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

    public CheckPrefixReq withBucketName(String bucketName) {
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

    public CheckPrefixReq withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 前缀名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CheckPrefixReq withDataCenter(String dataCenter) {
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

    public CheckPrefixReq withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * 安全令牌
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckPrefixReq that = (CheckPrefixReq) obj;
        return Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.ak, that.ak)
            && Objects.equals(this.sk, that.sk) && Objects.equals(this.jsonAuthFile, that.jsonAuthFile)
            && Objects.equals(this.connectionString, that.connectionString) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.bucketName, that.bucketName) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.dataCenter, that.dataCenter)
            && Objects.equals(this.securityToken, that.securityToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudType,
            ak,
            sk,
            jsonAuthFile,
            connectionString,
            appId,
            bucketName,
            fileName,
            dataCenter,
            securityToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckPrefixReq {\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    jsonAuthFile: ").append(toIndentedString(jsonAuthFile)).append("\n");
        sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    dataCenter: ").append(toIndentedString(dataCenter)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
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
