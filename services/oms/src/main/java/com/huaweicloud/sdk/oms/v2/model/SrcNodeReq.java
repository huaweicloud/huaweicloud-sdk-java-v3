package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源端节点信息。
 */
public class SrcNodeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

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
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private List<String> objectKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_file")

    private ListFile listFile;

    public SrcNodeReq withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 源端云服务提供商，task_type为非url_list时，本参数为URLSource。  可选值有AWS、Azure、Aliyun、Tencent、HuaweiCloud、QingCloud、KingsoftCloud、Baidu、Qiniu、URLSource或者UCloud。默认值为Aliyun。
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public SrcNodeReq withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 源端桶所处的区域，task_type为非url_list时，本参数为必选。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SrcNodeReq withAk(String ak) {
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

    public SrcNodeReq withSk(String sk) {
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

    public SrcNodeReq withSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }

    /**
     * 源端桶的临时Token（最大长度16384个字符）
     * @return securityToken
     */
    public String getSecurityToken() {
        return securityToken;
    }

    public void setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
    }

    public SrcNodeReq withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 当源端为腾讯云时，需要填写此参数。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public SrcNodeReq withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 源端桶的名称，task_type为非url_list时，本参数为必选。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public SrcNodeReq withObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    public SrcNodeReq addObjectKeyItem(String objectKeyItem) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        this.objectKey.add(objectKeyItem);
        return this;
    }

    public SrcNodeReq withObjectKey(Consumer<List<String>> objectKeySetter) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        objectKeySetter.accept(this.objectKey);
        return this;
    }

    /**
     * 任务类型为对象迁移任务时，表示待迁移对象名称（以“/”结尾的字符串代表待迁移的文件夹，非“/”结尾的字符串代表待迁移的文件。）； 任务类型为前缀迁移任务时，表示待迁移前缀。 整桶迁移时，此参数设置为[\"\"]。
     * @return objectKey
     */
    public List<String> getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
    }

    public SrcNodeReq withListFile(ListFile listFile) {
        this.listFile = listFile;
        return this;
    }

    public SrcNodeReq withListFile(Consumer<ListFile> listFileSetter) {
        if (this.listFile == null) {
            this.listFile = new ListFile();
            listFileSetter.accept(this.listFile);
        }

        return this;
    }

    /**
     * Get listFile
     * @return listFile
     */
    public ListFile getListFile() {
        return listFile;
    }

    public void setListFile(ListFile listFile) {
        this.listFile = listFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SrcNodeReq that = (SrcNodeReq) obj;
        return Objects.equals(this.cloudType, that.cloudType) && Objects.equals(this.region, that.region)
            && Objects.equals(this.ak, that.ak) && Objects.equals(this.sk, that.sk)
            && Objects.equals(this.securityToken, that.securityToken) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.bucket, that.bucket) && Objects.equals(this.objectKey, that.objectKey)
            && Objects.equals(this.listFile, that.listFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudType, region, ak, sk, securityToken, appId, bucket, objectKey, listFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SrcNodeReq {\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    securityToken: ").append(toIndentedString(securityToken)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    listFile: ").append(toIndentedString(listFile)).append("\n");
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
