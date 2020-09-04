package com.huaweicloud.sdk.cts.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转储桶信息。
 */
public class TrackerObsInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_name")
    
    private String bucketName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_prefix_name")
    
    private String filePrefixName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_obs_created")
    
    private Boolean isObsCreated;
    /**
     * 标识配置桶内对象存储周期。 当\"tracker_type\"参数值为\"data\"时该参数值有效。
     */
    public static class BucketLifecycleEnum {

        
        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final BucketLifecycleEnum NUMBER_30 = new BucketLifecycleEnum(30);
        
        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final BucketLifecycleEnum NUMBER_60 = new BucketLifecycleEnum(60);
        
        /**
         * Enum NUMBER_90 for value: 90
         */
        public static final BucketLifecycleEnum NUMBER_90 = new BucketLifecycleEnum(90);
        
        /**
         * Enum NUMBER_180 for value: 180
         */
        public static final BucketLifecycleEnum NUMBER_180 = new BucketLifecycleEnum(180);
        
        /**
         * Enum NUMBER_1095 for value: 1095
         */
        public static final BucketLifecycleEnum NUMBER_1095 = new BucketLifecycleEnum(1095);
        

        public static final Map<Integer, BucketLifecycleEnum> staticFields = new HashMap<Integer, BucketLifecycleEnum>() {
            { 
                put(30, NUMBER_30);
                put(60, NUMBER_60);
                put(90, NUMBER_90);
                put(180, NUMBER_180);
                put(1095, NUMBER_1095);
            }
        };

        private Integer value;

        BucketLifecycleEnum(Integer value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BucketLifecycleEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            BucketLifecycleEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new BucketLifecycleEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static BucketLifecycleEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            BucketLifecycleEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BucketLifecycleEnum) {
                return this.value.equals(((BucketLifecycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bucket_lifecycle")
    
    private BucketLifecycleEnum bucketLifecycle;

    public TrackerObsInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    


    /**
     * 标识OBS桶名称。由数字或字母开头，支持小写字母、数字、“-”、“.”，长度为3～63个字符。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public TrackerObsInfo withFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
        return this;
    }

    


    /**
     * 标识需要存储于OBS的日志文件前缀，0-9，a-z，A-Z，'-'，'.'，'_'长度为0～64字符。
     * @return filePrefixName
     */
    public String getFilePrefixName() {
        return filePrefixName;
    }

    public void setFilePrefixName(String filePrefixName) {
        this.filePrefixName = filePrefixName;
    }

    public TrackerObsInfo withIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
        return this;
    }

    


    /**
     * 是否支持新建OBS桶。   值为“true”时，表示新创建OBS桶存储事件文件；   值为“false”时，选择已存在的OBS桶存储事件文件。
     * @return isObsCreated
     */
    public Boolean getIsObsCreated() {
        return isObsCreated;
    }

    public void setIsObsCreated(Boolean isObsCreated) {
        this.isObsCreated = isObsCreated;
    }

    public TrackerObsInfo withBucketLifecycle(BucketLifecycleEnum bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
        return this;
    }

    


    /**
     * 标识配置桶内对象存储周期。 当\"tracker_type\"参数值为\"data\"时该参数值有效。
     * @return bucketLifecycle
     */
    public BucketLifecycleEnum getBucketLifecycle() {
        return bucketLifecycle;
    }

    public void setBucketLifecycle(BucketLifecycleEnum bucketLifecycle) {
        this.bucketLifecycle = bucketLifecycle;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TrackerObsInfo trackerObsInfo = (TrackerObsInfo) o;
        return Objects.equals(this.bucketName, trackerObsInfo.bucketName) &&
            Objects.equals(this.filePrefixName, trackerObsInfo.filePrefixName) &&
            Objects.equals(this.isObsCreated, trackerObsInfo.isObsCreated) &&
            Objects.equals(this.bucketLifecycle, trackerObsInfo.bucketLifecycle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bucketName, filePrefixName, isObsCreated, bucketLifecycle);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrackerObsInfo {\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    filePrefixName: ").append(toIndentedString(filePrefixName)).append("\n");
        sb.append("    isObsCreated: ").append(toIndentedString(isObsCreated)).append("\n");
        sb.append("    bucketLifecycle: ").append(toIndentedString(bucketLifecycle)).append("\n");
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

