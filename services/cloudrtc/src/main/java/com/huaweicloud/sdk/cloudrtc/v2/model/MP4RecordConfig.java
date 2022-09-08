package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MP4RecordConfig
 */
public class MP4RecordConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_cycle")

    private Integer recordCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_prefix")

    private String recordPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_max_duration_to_merge_file")

    private Integer recordMaxDurationToMergeFile;

    public MP4RecordConfig withRecordCycle(Integer recordCycle) {
        this.recordCycle = recordCycle;
        return this;
    }

    /**
     *  周期录制时长。  取值范围：[60，10800]。  单位：秒。 
     * minimum: 60
     * maximum: 10800
     * @return recordCycle
     */
    public Integer getRecordCycle() {
        return recordCycle;
    }

    public void setRecordCycle(Integer recordCycle) {
        this.recordCycle = recordCycle;
    }

    public MP4RecordConfig withRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
        return this;
    }

    /**
     * 录制文件含路径和文件名的前缀。  默认{app_id}/{record_format}/{stream}\\_{file_start_time}/{stream}\\_{file_start_time}  上述特殊变量含义： - {app_id}：应用id - {record_format}：录制格式 - {stream}：流名 - {file_start_time}：文件生成时间 
     * @return recordPrefix
     */
    public String getRecordPrefix() {
        return recordPrefix;
    }

    public void setRecordPrefix(String recordPrefix) {
        this.recordPrefix = recordPrefix;
    }

    public MP4RecordConfig withRecordMaxDurationToMergeFile(Integer recordMaxDurationToMergeFile) {
        this.recordMaxDurationToMergeFile = recordMaxDurationToMergeFile;
        return this;
    }

    /**
     * 录制MP4拼接时长，如果流中断超过该时间，则生成新文件。  取值范围：[0，300]，缺省为0。  单位：秒。  如果为0表示流中断就生成新文件。 
     * minimum: 0
     * maximum: 300
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
        MP4RecordConfig mp4RecordConfig = (MP4RecordConfig) o;
        return Objects.equals(this.recordCycle, mp4RecordConfig.recordCycle)
            && Objects.equals(this.recordPrefix, mp4RecordConfig.recordPrefix)
            && Objects.equals(this.recordMaxDurationToMergeFile, mp4RecordConfig.recordMaxDurationToMergeFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordCycle, recordPrefix, recordMaxDurationToMergeFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MP4RecordConfig {\n");
        sb.append("    recordCycle: ").append(toIndentedString(recordCycle)).append("\n");
        sb.append("    recordPrefix: ").append(toIndentedString(recordPrefix)).append("\n");
        sb.append("    recordMaxDurationToMergeFile: ")
            .append(toIndentedString(recordMaxDurationToMergeFile))
            .append("\n");
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
