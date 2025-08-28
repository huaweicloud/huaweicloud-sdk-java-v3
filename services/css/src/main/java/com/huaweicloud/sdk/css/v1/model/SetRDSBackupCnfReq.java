package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetRDSBackupCnfReq
 */
public class SetRDSBackupCnfReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indices")

    private String indices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix")

    private String prefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepday")

    private Integer keepday;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private String enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_auto")

    private String deleteAuto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency")

    private String frequency;

    public SetRDSBackupCnfReq withIndices(String indices) {
        this.indices = indices;
        return this;
    }

    /**
     * 需要备份的索引名。*代表所有索引。
     * @return indices
     */
    public String getIndices() {
        return indices;
    }

    public void setIndices(String indices) {
        this.indices = indices;
    }

    public SetRDSBackupCnfReq withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * 自动创建快照的名称前缀，需要用户自己手动输入。 只能包含1~32位小写字母、数字、中划线或者下划线，并且以小写字母开头。  > 当enable为true时该字段为必选字段
     * @return prefix
     */
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public SetRDSBackupCnfReq withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 每天创建快照的时刻，只支持整点，后面需加上时区，格式为“HH:mm z”，“HH:mm”表示整点时间，“z”表示时区。 比如“00:00 GMT+08:00”、“01:00 GMT+08:00”等。  > 当enable为true时该字段为必选字段
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public SetRDSBackupCnfReq withKeepday(Integer keepday) {
        this.keepday = keepday;
        return this;
    }

    /**
     * 自定义设置快照保留的天数，范围是1～90。系统在半点时刻会自动删除超过保留天数的快照。  > 当enable为true时该字段为必选字段
     * @return keepday
     */
    public Integer getKeepday() {
        return keepday;
    }

    public void setKeepday(Integer keepday) {
        this.keepday = keepday;
    }

    public SetRDSBackupCnfReq withEnable(String enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启自动创建快照策略。 - true：表示开启自动创建快照策略。 - false：表示关闭自动创建快照策略。
     * @return enable
     */
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public SetRDSBackupCnfReq withDeleteAuto(String deleteAuto) {
        this.deleteAuto = deleteAuto;
        return this;
    }

    /**
     * 表示关闭自动创建快照策略时，是否需要清除所有自动创建的快照。 默认为“false”，表示不会删除之前已自动创建的快照。 设置为true，表示在关闭自动创建快照策略的同时，删除所有已创建的快照。
     * @return deleteAuto
     */
    public String getDeleteAuto() {
        return deleteAuto;
    }

    public void setDeleteAuto(String deleteAuto) {
        this.deleteAuto = deleteAuto;
    }

    public SetRDSBackupCnfReq withFrequency(String frequency) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetRDSBackupCnfReq that = (SetRDSBackupCnfReq) obj;
        return Objects.equals(this.indices, that.indices) && Objects.equals(this.prefix, that.prefix)
            && Objects.equals(this.period, that.period) && Objects.equals(this.keepday, that.keepday)
            && Objects.equals(this.enable, that.enable) && Objects.equals(this.deleteAuto, that.deleteAuto)
            && Objects.equals(this.frequency, that.frequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indices, prefix, period, keepday, enable, deleteAuto, frequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRDSBackupCnfReq {\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
        sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    keepday: ").append(toIndentedString(keepday)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    deleteAuto: ").append(toIndentedString(deleteAuto)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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
