package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 迁移任务组的源端节点
 */
public class TaskGroupSrcNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ak")

    private String ak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sk")

    private String sk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private List<String> objectKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_file")

    private ListFile listFile;

    public TaskGroupSrcNode withAk(String ak) {
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

    public TaskGroupSrcNode withSk(String sk) {
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

    public TaskGroupSrcNode withAppId(String appId) {
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

    public TaskGroupSrcNode withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 源端桶所处的区域，task_type为非URL_LIST时，本参数为必选。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TaskGroupSrcNode withObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    public TaskGroupSrcNode addObjectKeyItem(String objectKeyItem) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        this.objectKey.add(objectKeyItem);
        return this;
    }

    public TaskGroupSrcNode withObjectKey(Consumer<List<String>> objectKeySetter) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        objectKeySetter.accept(this.objectKey);
        return this;
    }

    /**
     * 任务类型为前缀迁移任务时，表示待迁移前缀。 整桶迁移时，此参数设置为[\"\"]。
     * @return objectKey
     */
    public List<String> getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
    }

    public TaskGroupSrcNode withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 源端所在桶
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TaskGroupSrcNode withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 源端云服务提供商，当task_type为URL_LIST时，本参数为URLSource。可选值有AWS、Azure、Aliyun、Tencent、HuaweiCloud、QingCloud、KingsoftCloud、Baidu、Qiniu、URLSource或者UCloud。默认值为Aliyun。
     * @return cloudType
     */
    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public TaskGroupSrcNode withListFile(ListFile listFile) {
        this.listFile = listFile;
        return this;
    }

    public TaskGroupSrcNode withListFile(Consumer<ListFile> listFileSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskGroupSrcNode taskGroupSrcNode = (TaskGroupSrcNode) o;
        return Objects.equals(this.ak, taskGroupSrcNode.ak) && Objects.equals(this.sk, taskGroupSrcNode.sk)
            && Objects.equals(this.appId, taskGroupSrcNode.appId)
            && Objects.equals(this.region, taskGroupSrcNode.region)
            && Objects.equals(this.objectKey, taskGroupSrcNode.objectKey)
            && Objects.equals(this.bucket, taskGroupSrcNode.bucket)
            && Objects.equals(this.cloudType, taskGroupSrcNode.cloudType)
            && Objects.equals(this.listFile, taskGroupSrcNode.listFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ak, sk, appId, region, objectKey, bucket, cloudType, listFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskGroupSrcNode {\n");
        sb.append("    ak: ").append(toIndentedString(ak)).append("\n");
        sb.append("    sk: ").append(toIndentedString(sk)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
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
