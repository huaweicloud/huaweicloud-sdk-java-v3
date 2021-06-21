package com.huaweicloud.sdk.live.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * FLVRecordConfig
 */
public class FLVRecordConfig  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_cycle")
    
    private Integer recordCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_prefix")
    
    private String recordPrefix;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_max_duration_to_merge_file")
    
    private Integer recordMaxDurationToMergeFile;

    public FLVRecordConfig withRecordCycle(Integer recordCycle) {
        this.recordCycle = recordCycle;
        return this;
    }

    


    /**
     * 单位为秒，周期录制时长，最小1分钟，最大12小时。如果为0则整个流录制一个文件。
     * @return recordCycle
     */
    public Integer getRecordCycle() {
        return recordCycle;
    }

    public void setRecordCycle(Integer recordCycle) {
        this.recordCycle = recordCycle;
    }

    

    public FLVRecordConfig withRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
        return this;
    }

    


    /**
     * 录制FLV文件含路径和文件名的前缀， 默认Record/{publish_domain}/{app}/{record_type}/{record_format}/{stream}_{file_start_time}/{file_start_time}
     * @return recordPrefix
     */
    public String getRecordPrefix() {
        return recordPrefix;
    }

    public void setRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
    }

    

    public FLVRecordConfig withRecordMaxDurationToMergeFile(Integer recordMaxDurationToMergeFile) {
        this.recordMaxDurationToMergeFile = recordMaxDurationToMergeFile;
        return this;
    }

    


    /**
     * 录制flv拼接时长，如果流中断超过该时间，则生成新文件。单位秒。如果为0表示流中断就生成新文件。默认为0。
     * @return recordMaxDurationToMergeFile
     */
    public Integer getRecordMaxDurationToMergeFile() {
        return recordMaxDurationToMergeFile;
    }

    public void setRecordMaxDurationToMergeFile(Integer recordMaxDurationToMergeFile) {
        this.recordMaxDurationToMergeFile = recordMaxDurationToMergeFile;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FLVRecordConfig flVRecordConfig = (FLVRecordConfig) o;
        return Objects.equals(this.recordCycle, flVRecordConfig.recordCycle) &&
            Objects.equals(this.recordPrefix, flVRecordConfig.recordPrefix) &&
            Objects.equals(this.recordMaxDurationToMergeFile, flVRecordConfig.recordMaxDurationToMergeFile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recordCycle, recordPrefix, recordMaxDurationToMergeFile);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FLVRecordConfig {\n");
        sb.append("    recordCycle: ").append(toIndentedString(recordCycle)).append("\n");
        sb.append("    recordPrefix: ").append(toIndentedString(recordPrefix)).append("\n");
        sb.append("    recordMaxDurationToMergeFile: ").append(toIndentedString(recordMaxDurationToMergeFile)).append("\n");
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

