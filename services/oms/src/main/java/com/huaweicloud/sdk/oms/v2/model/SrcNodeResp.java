package com.huaweicloud.sdk.oms.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.oms.v2.model.ListFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 源端节点信息。
 */
public class SrcNodeResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket")
    
    private String bucket;
    /**
     * 源端云服务提供商。  可选值有AWS、Azure、Aliyun、Tencent、HuaweiCloud、QingCloud、KingsoftCloud、Baidu、Qiniu、URLSource或者UCloud。默认值为Aliyun。
     */
    public static final class CloudTypeEnum {

        
        /**
         * Enum AWS for value: "AWS"
         */
        public static final CloudTypeEnum AWS = new CloudTypeEnum("AWS");
        
        /**
         * Enum AZURE for value: "Azure"
         */
        public static final CloudTypeEnum AZURE = new CloudTypeEnum("Azure");
        
        /**
         * Enum ALIYUN for value: "Aliyun"
         */
        public static final CloudTypeEnum ALIYUN = new CloudTypeEnum("Aliyun");
        
        /**
         * Enum TENCENT for value: "Tencent"
         */
        public static final CloudTypeEnum TENCENT = new CloudTypeEnum("Tencent");
        
        /**
         * Enum HUAWEICLOUD for value: "HuaweiCloud"
         */
        public static final CloudTypeEnum HUAWEICLOUD = new CloudTypeEnum("HuaweiCloud");
        
        /**
         * Enum QINGCLOUD for value: "QingCloud"
         */
        public static final CloudTypeEnum QINGCLOUD = new CloudTypeEnum("QingCloud");
        
        /**
         * Enum KINGSOFTCLOUD for value: "KingsoftCloud"
         */
        public static final CloudTypeEnum KINGSOFTCLOUD = new CloudTypeEnum("KingsoftCloud");
        
        /**
         * Enum BAIDU for value: "Baidu"
         */
        public static final CloudTypeEnum BAIDU = new CloudTypeEnum("Baidu");
        
        /**
         * Enum QINIU for value: "Qiniu"
         */
        public static final CloudTypeEnum QINIU = new CloudTypeEnum("Qiniu");
        
        /**
         * Enum URLSOURCE for value: "URLSource"
         */
        public static final CloudTypeEnum URLSOURCE = new CloudTypeEnum("URLSource");
        
        /**
         * Enum UCLOUD for value: "UCloud"
         */
        public static final CloudTypeEnum UCLOUD = new CloudTypeEnum("UCloud");
        

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("AWS", AWS);
            map.put("Azure", AZURE);
            map.put("Aliyun", ALIYUN);
            map.put("Tencent", TENCENT);
            map.put("HuaweiCloud", HUAWEICLOUD);
            map.put("QingCloud", QINGCLOUD);
            map.put("KingsoftCloud", KINGSOFTCLOUD);
            map.put("Baidu", BAIDU);
            map.put("Qiniu", QINIU);
            map.put("URLSource", URLSOURCE);
            map.put("UCloud", UCLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CloudTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CloudTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CloudTypeEnum(value);
            }
            return result;
        }

        public static CloudTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CloudTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CloudTypeEnum) {
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
    @JsonProperty(value="cloud_type")
    
    private CloudTypeEnum cloudType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="object_key")
    
    private List<String> objectKey = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list_file")
    
    private ListFile listFile = null;

    public SrcNodeResp withBucket(String bucket) {
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

    public SrcNodeResp withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    


    /**
     * 源端云服务提供商。  可选值有AWS、Azure、Aliyun、Tencent、HuaweiCloud、QingCloud、KingsoftCloud、Baidu、Qiniu、URLSource或者UCloud。默认值为Aliyun。
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public SrcNodeResp withRegion(String region) {
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

    public SrcNodeResp withAppId(String appId) {
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

    public SrcNodeResp withObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    
    public SrcNodeResp addObjectKeyItem(String objectKeyItem) {
        if (this.objectKey == null) {
            this.objectKey = new ArrayList<>();
        }
        this.objectKey.add(objectKeyItem);
        return this;
    }

    public SrcNodeResp withObjectKey(Consumer<List<String>> objectKeySetter) {
        if(this.objectKey == null ){
            this.objectKey = new ArrayList<>();
        }
        objectKeySetter.accept(this.objectKey);
        return this;
    }

    /**
     * 任务类型为对象迁移任务时，表示待迁移对象名称； 任务类型为前缀迁移任务时，表示待迁移前缀。
     * @return objectKey
     */
    public List<String> getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(List<String> objectKey) {
        this.objectKey = objectKey;
    }

    public SrcNodeResp withListFile(ListFile listFile) {
        this.listFile = listFile;
        return this;
    }

    public SrcNodeResp withListFile(Consumer<ListFile> listFileSetter) {
        if(this.listFile == null ){
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
        SrcNodeResp srcNodeResp = (SrcNodeResp) o;
        return Objects.equals(this.bucket, srcNodeResp.bucket) &&
            Objects.equals(this.cloudType, srcNodeResp.cloudType) &&
            Objects.equals(this.region, srcNodeResp.region) &&
            Objects.equals(this.appId, srcNodeResp.appId) &&
            Objects.equals(this.objectKey, srcNodeResp.objectKey) &&
            Objects.equals(this.listFile, srcNodeResp.listFile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucket, cloudType, region, appId, objectKey, listFile);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SrcNodeResp {\n");
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

