package com.huaweicloud.sdk.live.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.ObsFileAddr;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RecordConfigInfo
 */
public class RecordConfigInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_duration")
    
    private Integer recordDuration;
    /**
     * 录制格式flv，hls，mp4，默认flv（目前仅支持flv）
     */
    public static final class RecordFormatEnum {

        
        /**
         * Enum FLV for value: "flv"
         */
        public static final RecordFormatEnum FLV = new RecordFormatEnum("flv");
        
        /**
         * Enum HLS for value: "hls"
         */
        public static final RecordFormatEnum HLS = new RecordFormatEnum("hls");
        
        /**
         * Enum MP4 for value: "mp4"
         */
        public static final RecordFormatEnum MP4 = new RecordFormatEnum("mp4");
        

        private static final Map<String, RecordFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordFormatEnum> createStaticFields() {
            Map<String, RecordFormatEnum> map = new HashMap<>();
            map.put("flv", FLV);
            map.put("hls", HLS);
            map.put("mp4", MP4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordFormatEnum(String value) {
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
        public static RecordFormatEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RecordFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordFormatEnum(value);
            }
            return result;
        }

        public static RecordFormatEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RecordFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RecordFormatEnum) {
                return this.value.equals(((RecordFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_format")
    
    private RecordFormatEnum recordFormat;
    /**
     * 录制类型，configer_record，默认configer_record。表示录制配置好后，只要有流就录制
     */
    public static final class RecordTypeEnum {

        
        /**
         * Enum CONFIGER_RECORD for value: "configer_record"
         */
        public static final RecordTypeEnum CONFIGER_RECORD = new RecordTypeEnum("configer_record");
        

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("configer_record", CONFIGER_RECORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordTypeEnum(value);
            }
            return result;
        }

        public static RecordTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RecordTypeEnum) {
                return this.value.equals(((RecordTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_type")
    
    private RecordTypeEnum recordType;
    /**
     * 录制位置vod， 默认vod（目前暂只支持vod）
     */
    public static final class RecordLocationEnum {

        
        /**
         * Enum VOD for value: "vod"
         */
        public static final RecordLocationEnum VOD = new RecordLocationEnum("vod");
        
        /**
         * Enum OBS for value: "obs"
         */
        public static final RecordLocationEnum OBS = new RecordLocationEnum("obs");
        

        private static final Map<String, RecordLocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordLocationEnum> createStaticFields() {
            Map<String, RecordLocationEnum> map = new HashMap<>();
            map.put("vod", VOD);
            map.put("obs", OBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordLocationEnum(String value) {
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
        public static RecordLocationEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RecordLocationEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordLocationEnum(value);
            }
            return result;
        }

        public static RecordLocationEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RecordLocationEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RecordLocationEnum) {
                return this.value.equals(((RecordLocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_location")
    
    private RecordLocationEnum recordLocation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_prefix")
    
    private String recordPrefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_addr")
    
    private ObsFileAddr obsAddr;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;

    public RecordConfigInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 直播播放域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public RecordConfigInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 应用名称。 默认为“live”，若您需要自定义应用名称，请先提交工单申请。 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public RecordConfigInfo withRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
        return this;
    }

    


    /**
     * 秒，周期录制时常，最小15分钟，最大6小时，默认1小时
     * @return recordDuration
     */
    public Integer getRecordDuration() {
        return recordDuration;
    }

    public void setRecordDuration(Integer recordDuration) {
        this.recordDuration = recordDuration;
    }

    

    public RecordConfigInfo withRecordFormat(RecordFormatEnum recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }

    


    /**
     * 录制格式flv，hls，mp4，默认flv（目前仅支持flv）
     * @return recordFormat
     */
    public RecordFormatEnum getRecordFormat() {
        return recordFormat;
    }

    public void setRecordFormat(RecordFormatEnum recordFormat) {
        this.recordFormat = recordFormat;
    }

    

    public RecordConfigInfo withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    


    /**
     * 录制类型，configer_record，默认configer_record。表示录制配置好后，只要有流就录制
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    

    public RecordConfigInfo withRecordLocation(RecordLocationEnum recordLocation) {
        this.recordLocation = recordLocation;
        return this;
    }

    


    /**
     * 录制位置vod， 默认vod（目前暂只支持vod）
     * @return recordLocation
     */
    public RecordLocationEnum getRecordLocation() {
        return recordLocation;
    }

    public void setRecordLocation(RecordLocationEnum recordLocation) {
        this.recordLocation = recordLocation;
    }

    

    public RecordConfigInfo withRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
        return this;
    }

    


    /**
     * 录制文件前缀， DomainName，AppName，StreamName必须，默认{DomainName}/{AppName}/{StreamName}/{StartTime}-{EndTime}
     * @return recordPrefix
     */
    public String getRecordPrefix() {
        return recordPrefix;
    }

    public void setRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
    }

    

    public RecordConfigInfo withObsAddr(ObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
        return this;
    }

    public RecordConfigInfo withObsAddr(Consumer<ObsFileAddr> obsAddrSetter) {
        if(this.obsAddr == null ){
            this.obsAddr = new ObsFileAddr();
            obsAddrSetter.accept(this.obsAddr);
        }
        
        return this;
    }


    /**
     * Get obsAddr
     * @return obsAddr
     */
    public ObsFileAddr getObsAddr() {
        return obsAddr;
    }

    public void setObsAddr(ObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
    }

    

    public RecordConfigInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 录制配置创建时间，样例2020-02-14T10:45:16.947+08:00
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordConfigInfo recordConfigInfo = (RecordConfigInfo) o;
        return Objects.equals(this.domain, recordConfigInfo.domain) &&
            Objects.equals(this.appName, recordConfigInfo.appName) &&
            Objects.equals(this.recordDuration, recordConfigInfo.recordDuration) &&
            Objects.equals(this.recordFormat, recordConfigInfo.recordFormat) &&
            Objects.equals(this.recordType, recordConfigInfo.recordType) &&
            Objects.equals(this.recordLocation, recordConfigInfo.recordLocation) &&
            Objects.equals(this.recordPrefix, recordConfigInfo.recordPrefix) &&
            Objects.equals(this.obsAddr, recordConfigInfo.obsAddr) &&
            Objects.equals(this.createTime, recordConfigInfo.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, recordDuration, recordFormat, recordType, recordLocation, recordPrefix, obsAddr, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordConfigInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    recordDuration: ").append(toIndentedString(recordDuration)).append("\n");
        sb.append("    recordFormat: ").append(toIndentedString(recordFormat)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    recordLocation: ").append(toIndentedString(recordLocation)).append("\n");
        sb.append("    recordPrefix: ").append(toIndentedString(recordPrefix)).append("\n");
        sb.append("    obsAddr: ").append(toIndentedString(obsAddr)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

