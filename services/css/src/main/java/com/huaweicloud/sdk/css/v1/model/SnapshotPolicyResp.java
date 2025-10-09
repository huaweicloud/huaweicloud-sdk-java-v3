package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自动快照信息
 */
public class SnapshotPolicyResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backupEnable")

    private Boolean backupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakPeriod")

    private String bakPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakFrequency")

    private String bakFrequency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bakKeepDay")

    private Integer bakKeepDay;

    public SnapshotPolicyResp withBackupEnable(Boolean backupEnable) {
        this.backupEnable = backupEnable;
        return this;
    }

    /**
     * 集群是否开启自动快照。
     * @return backupEnable
     */
    public Boolean getBackupEnable() {
        return backupEnable;
    }

    public void setBackupEnable(Boolean backupEnable) {
        this.backupEnable = backupEnable;
    }

    public SnapshotPolicyResp withBakPeriod(String bakPeriod) {
        this.bakPeriod = bakPeriod;
        return this;
    }

    /**
     * 快照备份时间。
     * @return bakPeriod
     */
    public String getBakPeriod() {
        return bakPeriod;
    }

    public void setBakPeriod(String bakPeriod) {
        this.bakPeriod = bakPeriod;
    }

    public SnapshotPolicyResp withBakFrequency(String bakFrequency) {
        this.bakFrequency = bakFrequency;
        return this;
    }

    /**
     * 快照备份间隔。
     * @return bakFrequency
     */
    public String getBakFrequency() {
        return bakFrequency;
    }

    public void setBakFrequency(String bakFrequency) {
        this.bakFrequency = bakFrequency;
    }

    public SnapshotPolicyResp withBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
        return this;
    }

    /**
     * 快照备份保留个数。
     * @return bakKeepDay
     */
    public Integer getBakKeepDay() {
        return bakKeepDay;
    }

    public void setBakKeepDay(Integer bakKeepDay) {
        this.bakKeepDay = bakKeepDay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SnapshotPolicyResp that = (SnapshotPolicyResp) obj;
        return Objects.equals(this.backupEnable, that.backupEnable) && Objects.equals(this.bakPeriod, that.bakPeriod)
            && Objects.equals(this.bakFrequency, that.bakFrequency) && Objects.equals(this.bakKeepDay, that.bakKeepDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backupEnable, bakPeriod, bakFrequency, bakKeepDay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotPolicyResp {\n");
        sb.append("    backupEnable: ").append(toIndentedString(backupEnable)).append("\n");
        sb.append("    bakPeriod: ").append(toIndentedString(bakPeriod)).append("\n");
        sb.append("    bakFrequency: ").append(toIndentedString(bakFrequency)).append("\n");
        sb.append("    bakKeepDay: ").append(toIndentedString(bakKeepDay)).append("\n");
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
