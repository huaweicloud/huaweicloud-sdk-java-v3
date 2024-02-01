package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源端迁移任务组节点信息。
 */
public class TaskGroupSrcNodeResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    /**
     * 源端云服务提供商。  可选值有AWS、AZURE、ALIYUN、TENCENT、HUAWEICLOUD、QINGCLOUD、KINGSOFTCLOUD、BAIDU、QINIU、GOOGLE、URLSOURCE或者UCLOUD。默认值为ALIYUN。
     */
    public static final class CloudTypeEnum {

        /**
         * Enum AWS for value: "AWS"
         */
        public static final CloudTypeEnum AWS = new CloudTypeEnum("AWS");

        /**
         * Enum AZURE for value: "AZURE"
         */
        public static final CloudTypeEnum AZURE = new CloudTypeEnum("AZURE");

        /**
         * Enum ALIYUN for value: "ALIYUN"
         */
        public static final CloudTypeEnum ALIYUN = new CloudTypeEnum("ALIYUN");

        /**
         * Enum TENCENT for value: "TENCENT"
         */
        public static final CloudTypeEnum TENCENT = new CloudTypeEnum("TENCENT");

        /**
         * Enum HUAWEICLOUD for value: "HUAWEICLOUD"
         */
        public static final CloudTypeEnum HUAWEICLOUD = new CloudTypeEnum("HUAWEICLOUD");

        /**
         * Enum QINGCLOUD for value: "QINGCLOUD"
         */
        public static final CloudTypeEnum QINGCLOUD = new CloudTypeEnum("QINGCLOUD");

        /**
         * Enum KINGSOFTCLOUD for value: "KINGSOFTCLOUD"
         */
        public static final CloudTypeEnum KINGSOFTCLOUD = new CloudTypeEnum("KINGSOFTCLOUD");

        /**
         * Enum BAIDU for value: "BAIDU"
         */
        public static final CloudTypeEnum BAIDU = new CloudTypeEnum("BAIDU");

        /**
         * Enum QINIU for value: "QINIU"
         */
        public static final CloudTypeEnum QINIU = new CloudTypeEnum("QINIU");

        /**
         * Enum URLSOURCE for value: "URLSOURCE"
         */
        public static final CloudTypeEnum URLSOURCE = new CloudTypeEnum("URLSOURCE");

        /**
         * Enum UCLOUD for value: "UCLOUD"
         */
        public static final CloudTypeEnum UCLOUD = new CloudTypeEnum("UCLOUD");

        /**
         * Enum GOOGLE for value: "GOOGLE"
         */
        public static final CloudTypeEnum GOOGLE = new CloudTypeEnum("GOOGLE");

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("AWS", AWS);
            map.put("AZURE", AZURE);
            map.put("ALIYUN", ALIYUN);
            map.put("TENCENT", TENCENT);
            map.put("HUAWEICLOUD", HUAWEICLOUD);
            map.put("QINGCLOUD", QINGCLOUD);
            map.put("KINGSOFTCLOUD", KINGSOFTCLOUD);
            map.put("BAIDU", BAIDU);
            map.put("QINIU", QINIU);
            map.put("URLSOURCE", URLSOURCE);
            map.put("UCLOUD", UCLOUD);
            map.put("GOOGLE", GOOGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CloudTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CloudTypeEnum(value));
        }

        public static CloudTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloudTypeEnum) {
                return this.value.equals(((CloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private CloudTypeEnum cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private List<String> objectKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_file")

    private ListFile listFile;

    public TaskGroupSrcNodeResp withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 源端桶的名称。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public TaskGroupSrcNodeResp withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 源端云服务提供商。  可选值有AWS、AZURE、ALIYUN、TENCENT、HUAWEICLOUD、QINGCLOUD、KINGSOFTCLOUD、BAIDU、QINIU、GOOGLE、URLSOURCE或者UCLOUD。默认值为ALIYUN。
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public TaskGroupSrcNodeResp withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 源端桶所处的区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TaskGroupSrcNodeResp withAppId(String appId) {
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

    public TaskGroupSrcNodeResp withObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    public TaskGroupSrcNodeResp addObjectKeyItem(String objectKeyItem) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        this.objectKey.add(objectKeyItem);
        return this;
    }

    public TaskGroupSrcNodeResp withObjectKey(Consumer<List<String>> objectKeySetter) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        objectKeySetter.accept(this.objectKey);
        return this;
    }

    /**
     * 任务组类型为前缀迁移任务时，表示待迁移前缀。
     * @return objectKey
     */
    public List<String> getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
    }

    public TaskGroupSrcNodeResp withListFile(ListFile listFile) {
        this.listFile = listFile;
        return this;
    }

    public TaskGroupSrcNodeResp withListFile(Consumer<ListFile> listFileSetter) {
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
        TaskGroupSrcNodeResp that = (TaskGroupSrcNodeResp) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.cloudType, that.cloudType)
            && Objects.equals(this.region, that.region) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.listFile, that.listFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, cloudType, region, appId, objectKey, listFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskGroupSrcNodeResp {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
