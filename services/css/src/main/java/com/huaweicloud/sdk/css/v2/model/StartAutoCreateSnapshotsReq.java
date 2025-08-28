package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartAutoCreateSnapshotsReq
 */
public class StartAutoCreateSnapshotsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    private String indices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepday")

    private Integer keepday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    public StartAutoCreateSnapshotsReq withIndices(String indices) {
        this.indices = indices;
        return this;
    }

    /**
     * 指定要恢复的索引名称，多个索引用逗号隔开，默认恢复所有索引。支持使用“\\*”匹配多个索引，例如：2018-06\\*，表示恢复名称前缀是2018-06的所有索引的数据。 0～1024个字符，不能包含空格和大写字母，且不能包含\\\"\\\\<|>/?特殊字符。 默认值为\\*，表示恢复所有索引。
     * @return indices
     */
    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    public StartAutoCreateSnapshotsReq withKeepday(Integer keepday) {
        this.keepday = keepday;
        return this;
    }

    /**
     * 设置快照保留的天数，范围是1～90。系统在半点时刻会自动删除超过保留天数的快照。
     * @return keepday
     */
    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public StartAutoCreateSnapshotsReq withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * 自动创建快照的执行频次。
     * @return frequency
     */
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public StartAutoCreateSnapshotsReq withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 每天创建快照的时刻，只支持整点，后面需加上时区，格式为“HH:mm z”，“HH:mm”表示整点时间，“z”表示时区。比如“00:00 GMT+08:00”、“01:00 GMT+08:00”等。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public StartAutoCreateSnapshotsReq withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 自动创建的快照名称前缀，需要用户自己手动输入。只能包含1~32位小写字母、数字、中划线或者下划线，并且以小写字母开头。
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartAutoCreateSnapshotsReq that = (StartAutoCreateSnapshotsReq) obj;
        return Objects.equals(this.indices, that.indices) && Objects.equals(this.keepday, that.keepday)
            && Objects.equals(this.frequency, that.frequency) && Objects.equals(this.period, that.period)
            && Objects.equals(this.prefix, that.prefix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indices, keepday, frequency, period, prefix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartAutoCreateSnapshotsReq {\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
        sb.append("    keepday: ").append(toIndentedString(keepday)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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
