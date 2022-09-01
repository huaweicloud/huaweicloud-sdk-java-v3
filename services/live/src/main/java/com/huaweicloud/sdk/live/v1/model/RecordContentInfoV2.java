package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecordContentInfoV2
 */
public class RecordContentInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    @JacksonXmlProperty(localName = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    @JacksonXmlProperty(localName = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    @JacksonXmlProperty(localName = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    @JacksonXmlProperty(localName = "stream")

    private String stream;

    /**
     * 录制格式flv，hls，mp4
     */
    public static final class RecordFormatEnum {

        /**
         * Enum FLV for value: "FLV"
         */
        public static final RecordFormatEnum FLV = new RecordFormatEnum("FLV");

        /**
         * Enum HLS for value: "HLS"
         */
        public static final RecordFormatEnum HLS = new RecordFormatEnum("HLS");

        /**
         * Enum MP4 for value: "MP4"
         */
        public static final RecordFormatEnum MP4 = new RecordFormatEnum("MP4");

        private static final Map<String, RecordFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordFormatEnum> createStaticFields() {
            Map<String, RecordFormatEnum> map = new HashMap<>();
            map.put("FLV", FLV);
            map.put("HLS", HLS);
            map.put("MP4", MP4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordFormatEnum(String value) {
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
        public static RecordFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RecordFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordFormatEnum(value);
            }
            return result;
        }

        public static RecordFormatEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof RecordFormatEnum) {
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
    @JsonProperty(value = "record_format")

    @JacksonXmlProperty(localName = "record_format")

    private RecordFormatEnum recordFormat;

    /**
     * 录制类型，CONTINUOUS_RECORD，COMMAND_RECORD，PLAN_RECORD, ON_DEMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD：持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD：命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。 - PLAN_RECORD：计划录制，在该规则类型配置后，推的流如果在计划录制的时间区间则触发录制。 - ON_DEMAND_RECORD：按需录制，在该规则类型配置后，录制系统收到推流后，需要调用租户提供的接口查询录制规则，并根据规则录制。 
     */
    public static final class RecordTypeEnum {

        /**
         * Enum CONTINUOUS_RECORD for value: "CONTINUOUS_RECORD"
         */
        public static final RecordTypeEnum CONTINUOUS_RECORD = new RecordTypeEnum("CONTINUOUS_RECORD");

        /**
         * Enum COMMAND_RECORD for value: "COMMAND_RECORD"
         */
        public static final RecordTypeEnum COMMAND_RECORD = new RecordTypeEnum("COMMAND_RECORD");

        /**
         * Enum PLAN_RECORD for value: "PLAN_RECORD"
         */
        public static final RecordTypeEnum PLAN_RECORD = new RecordTypeEnum("PLAN_RECORD");

        /**
         * Enum ON_DEMAND_RECORD for value: "ON_DEMAND_RECORD"
         */
        public static final RecordTypeEnum ON_DEMAND_RECORD = new RecordTypeEnum("ON_DEMAND_RECORD");

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("CONTINUOUS_RECORD", CONTINUOUS_RECORD);
            map.put("COMMAND_RECORD", COMMAND_RECORD);
            map.put("PLAN_RECORD", PLAN_RECORD);
            map.put("ON_DEMAND_RECORD", ON_DEMAND_RECORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordTypeEnum(String value) {
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
        public static RecordTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordTypeEnum(value);
            }
            return result;
        }

        public static RecordTypeEnum valueOf(String value) {
            if (value == null) {
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
            if (obj instanceof RecordTypeEnum) {
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
    @JsonProperty(value = "record_type")

    @JacksonXmlProperty(localName = "record_type")

    private RecordTypeEnum recordType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_addr")

    @JacksonXmlProperty(localName = "obs_addr")

    private RecordObsFileAddr obsAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vod_info")

    @JacksonXmlProperty(localName = "vod_info")

    private VodInfoV2 vodInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    @JacksonXmlProperty(localName = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private LocalDate startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    @JacksonXmlProperty(localName = "end_time")

    private LocalDate endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private Integer duration;

    public RecordContentInfoV2 withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * 直播推流域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public RecordContentInfoV2 withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 录制文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RecordContentInfoV2 withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public RecordContentInfoV2 withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 录制的流名
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public RecordContentInfoV2 withRecordFormat(RecordFormatEnum recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }

    /**
     * 录制格式flv，hls，mp4
     * @return recordFormat
     */
    public RecordFormatEnum getRecordFormat() {
        return recordFormat;
    }

    public void setRecordFormat(RecordFormatEnum recordFormat) {
        this.recordFormat = recordFormat;
    }

    public RecordContentInfoV2 withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    /**
     * 录制类型，CONTINUOUS_RECORD，COMMAND_RECORD，PLAN_RECORD, ON_DEMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD：持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD：命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。 - PLAN_RECORD：计划录制，在该规则类型配置后，推的流如果在计划录制的时间区间则触发录制。 - ON_DEMAND_RECORD：按需录制，在该规则类型配置后，录制系统收到推流后，需要调用租户提供的接口查询录制规则，并根据规则录制。 
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    public RecordContentInfoV2 withObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
        return this;
    }

    public RecordContentInfoV2 withObsAddr(Consumer<RecordObsFileAddr> obsAddrSetter) {
        if (this.obsAddr == null) {
            this.obsAddr = new RecordObsFileAddr();
            obsAddrSetter.accept(this.obsAddr);
        }

        return this;
    }

    /**
     * Get obsAddr
     * @return obsAddr
     */
    public RecordObsFileAddr getObsAddr() {
        return obsAddr;
    }

    public void setObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
    }

    public RecordContentInfoV2 withVodInfo(VodInfoV2 vodInfo) {
        this.vodInfo = vodInfo;
        return this;
    }

    public RecordContentInfoV2 withVodInfo(Consumer<VodInfoV2> vodInfoSetter) {
        if (this.vodInfo == null) {
            this.vodInfo = new VodInfoV2();
            vodInfoSetter.accept(this.vodInfo);
        }

        return this;
    }

    /**
     * Get vodInfo
     * @return vodInfo
     */
    public VodInfoV2 getVodInfo() {
        return vodInfo;
    }

    public void setVodInfo(VodInfoV2 vodInfo) {
        this.vodInfo = vodInfo;
    }

    public RecordContentInfoV2 withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * OBS下载地址
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public RecordContentInfoV2 withStartTime(LocalDate startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 录制开始时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。对record_type为PLAN_RECORD有效
     * @return startTime
     */
    public LocalDate getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    public RecordContentInfoV2 withEndTime(LocalDate endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 录制结束时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。对record_type为PLAN_RECORD有效
     * @return endTime
     */
    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public RecordContentInfoV2 withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 该录制文件时长，单位为秒
     * minimum: 0
     * maximum: 43200
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordContentInfoV2 recordContentInfoV2 = (RecordContentInfoV2) o;
        return Objects.equals(this.publishDomain, recordContentInfoV2.publishDomain)
            && Objects.equals(this.fileName, recordContentInfoV2.fileName)
            && Objects.equals(this.app, recordContentInfoV2.app)
            && Objects.equals(this.stream, recordContentInfoV2.stream)
            && Objects.equals(this.recordFormat, recordContentInfoV2.recordFormat)
            && Objects.equals(this.recordType, recordContentInfoV2.recordType)
            && Objects.equals(this.obsAddr, recordContentInfoV2.obsAddr)
            && Objects.equals(this.vodInfo, recordContentInfoV2.vodInfo)
            && Objects.equals(this.downloadUrl, recordContentInfoV2.downloadUrl)
            && Objects.equals(this.startTime, recordContentInfoV2.startTime)
            && Objects.equals(this.endTime, recordContentInfoV2.endTime)
            && Objects.equals(this.duration, recordContentInfoV2.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain,
            fileName,
            app,
            stream,
            recordFormat,
            recordType,
            obsAddr,
            vodInfo,
            downloadUrl,
            startTime,
            endTime,
            duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordContentInfoV2 {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    recordFormat: ").append(toIndentedString(recordFormat)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    obsAddr: ").append(toIndentedString(obsAddr)).append("\n");
        sb.append("    vodInfo: ").append(toIndentedString(vodInfo)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
