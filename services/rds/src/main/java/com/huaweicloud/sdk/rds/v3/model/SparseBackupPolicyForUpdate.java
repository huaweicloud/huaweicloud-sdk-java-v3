package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SparseBackupPolicyForUpdate
 */
public class SparseBackupPolicyForUpdate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_backups")

    private Boolean reserveBackups;

    public SparseBackupPolicyForUpdate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释：  备份策略ID。  约束限制：  备份策略可能关联多个已生成的备份集，修改、删除策略会对该策略所关联的已生成的备份集生效。如果修改某策略的备份保留天数小于原保留天数或删除某策略，可能会导致关联该条策略的现有全量备份过期删除，请检查策略后再次确认。  取值范围：  不填写ID时，表示新增一条备份策略。 填写当前存在的备份策略ID时，表示修改或删除该条备份策略的内容，ID获取方法请参见查询稀疏备份策略接口。 如您要删除该备份策略，请填写其keep_days为0，period为null，同时必须填写reserve_backups来说明是否保留已生成的与该条备份策略关联的自动备份。 如您要修改该备份策略，至少需要填写period、keep_days其中之一。  默认取值：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SparseBackupPolicyForUpdate withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * 参数解释：  备份周期配置。  约束限制：  该字段为UTC时区的Cron表达式，和备份时间段start_time共同作用。实例基础备份策略的start_time获取方法请参见查询自动备份策略接口，稀疏备份策略的start_time与基础备份策略一致。 比如当地时区为UTC+08:00，接口查询到的start_time为21:00-22:00时，对应的备份时间是当地时间05:00-06:00。当您设置稀疏备份策略的period为1 * *，意为该条策略将在UTC时区的每月1号21:00-22:00执行任务，也即您所在的UTC+08:00时区的每月2号05:00-06:00执行任务。 新增策略时，此字段必填。  取值范围：  格式必须为“日期 月份 星期”形式的Cron表达式，时区为UTC时区，且需要符合周策略、月策略或者年策略的形式，规则如下： · 周策略 日期需填写*，月份需填写*。星期支持填写1~7（1表示星期一，2表示星期二，依次类推），支持填写多个数字，需以逗号隔开。 取值示例： \\* \\* 6 表示每周六执行任务。 \\* \\* 1,2,3 表示每周一、二、三执行任务。 · 月策略 月份需填写*，星期需填写*。日期支持填写1~28和特殊字符L（表示最后一天），支持填写多个数字，需以逗号隔开。 取值示例： 1,2 * * 表示每月1号、2号执行任务。 L * * 表示每月的最后一天执行任务。 · 年策略 星期需填写*。日期支持填写1~31，月份支持填写1~12，日期和月份的组合需要为有效的日期。 取值示例： 15 3 * 表示每年的3月15日执行任务。  默认取值：  不涉及。
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public SparseBackupPolicyForUpdate withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 参数解释：  备份文件可以保存的天数。  约束限制：  新增策略时，此字段必填。  取值范围：  0～3660。取0值时，表示删除该条备份策略。  默认取值：  不涉及。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SparseBackupPolicyForUpdate withReserveBackups(Boolean reserveBackups) {
        this.reserveBackups = reserveBackups;
        return this;
    }

    /**
     * 参数解释：  删除备份策略时是否保留备份集。  约束限制：  仅在keep_days填写0时生效，删除备份策略时，此字段必填。 备份策略可能关联多个已生成的备份集，如果设置本字段为false，所有关联此策略的备份数据都会被立即清理，请谨慎操作。  取值范围：  true：表示保留该条备份策略关联的自动备份。 false：表示删除该条备份策略的同时，立即删除该条策略关联的自动备份。  默认取值：  不涉及。
     * @return reserveBackups
     */
    public Boolean getReserveBackups() {
        return reserveBackups;
    }

    public void setReserveBackups(Boolean reserveBackups) {
        this.reserveBackups = reserveBackups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparseBackupPolicyForUpdate that = (SparseBackupPolicyForUpdate) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.period, that.period)
            && Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.reserveBackups, that.reserveBackups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, period, keepDays, reserveBackups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparseBackupPolicyForUpdate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    reserveBackups: ").append(toIndentedString(reserveBackups)).append("\n");
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
