package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 开关记录列表。 **取值范围**: 不涉及。
 */
public class FullSqlSwitchResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_open")

    private Boolean isOpen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "save_days")

    private Integer saveDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_mode")

    private String storageMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_config")

    private LtsConfigInfoResult ltsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type_range")

    private List<SqlTypeInfoResult> sqlTypeRange = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_exclude_sys_user")

    private Boolean isExcludeSysUser;

    public FullSqlSwitchResult withIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    /**
     * **参数解释**: 是否开启全量SQL。 **取值范围**: - true：已开启。 - false：已关闭。
     * @return isOpen
     */
    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public FullSqlSwitchResult withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**: 开关状态持续的开始时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。 **取值范围**: 不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public FullSqlSwitchResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 开关状态持续的结束时间。格式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。 **取值范围**: 为null则表示，开关状态还在持续，没有发生切换。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public FullSqlSwitchResult withSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
        return this;
    }

    /**
     * **参数解释**: 已采集的全量SQL数据的最大保留天数。 **取值范围**: [1,30]
     * minimum: 1
     * maximum: 30
     * @return saveDays
     */
    public Integer getSaveDays() {
        return saveDays;
    }

    public void setSaveDays(Integer saveDays) {
        this.saveDays = saveDays;
    }

    public FullSqlSwitchResult withStorageMode(String storageMode) {
        this.storageMode = storageMode;
        return this;
    }

    /**
     * **参数解释**: 全量SQL数据存储类型。 **取值范围**: - LTS：LTS云日志服务。
     * @return storageMode
     */
    public String getStorageMode() {
        return storageMode;
    }

    public void setStorageMode(String storageMode) {
        this.storageMode = storageMode;
    }

    public FullSqlSwitchResult withLtsConfig(LtsConfigInfoResult ltsConfig) {
        this.ltsConfig = ltsConfig;
        return this;
    }

    public FullSqlSwitchResult withLtsConfig(Consumer<LtsConfigInfoResult> ltsConfigSetter) {
        if (this.ltsConfig == null) {
            this.ltsConfig = new LtsConfigInfoResult();
            ltsConfigSetter.accept(this.ltsConfig);
        }

        return this;
    }

    /**
     * Get ltsConfig
     * @return ltsConfig
     */
    public LtsConfigInfoResult getLtsConfig() {
        return ltsConfig;
    }

    public void setLtsConfig(LtsConfigInfoResult ltsConfig) {
        this.ltsConfig = ltsConfig;
    }

    public FullSqlSwitchResult withSqlTypeRange(List<SqlTypeInfoResult> sqlTypeRange) {
        this.sqlTypeRange = sqlTypeRange;
        return this;
    }

    public FullSqlSwitchResult addSqlTypeRangeItem(SqlTypeInfoResult sqlTypeRangeItem) {
        if (this.sqlTypeRange == null) {
            this.sqlTypeRange = new ArrayList<>();
        }
        this.sqlTypeRange.add(sqlTypeRangeItem);
        return this;
    }

    public FullSqlSwitchResult withSqlTypeRange(Consumer<List<SqlTypeInfoResult>> sqlTypeRangeSetter) {
        if (this.sqlTypeRange == null) {
            this.sqlTypeRange = new ArrayList<>();
        }
        sqlTypeRangeSetter.accept(this.sqlTypeRange);
        return this;
    }

    /**
     * **参数解释**: SQL采集类型列表。 **取值范围**: 不涉及。
     * @return sqlTypeRange
     */
    public List<SqlTypeInfoResult> getSqlTypeRange() {
        return sqlTypeRange;
    }

    public void setSqlTypeRange(List<SqlTypeInfoResult> sqlTypeRange) {
        this.sqlTypeRange = sqlTypeRange;
    }

    public FullSqlSwitchResult withIsExcludeSysUser(Boolean isExcludeSysUser) {
        this.isExcludeSysUser = isExcludeSysUser;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **取值范围**: 不涉及。是否过滤系统用户。使能该选项后，全量SQL采集将会跳过系统用户所执行的SQL记录
     * @return isExcludeSysUser
     */
    public Boolean getIsExcludeSysUser() {
        return isExcludeSysUser;
    }

    public void setIsExcludeSysUser(Boolean isExcludeSysUser) {
        this.isExcludeSysUser = isExcludeSysUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlSwitchResult that = (FullSqlSwitchResult) obj;
        return Objects.equals(this.isOpen, that.isOpen) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.saveDays, that.saveDays)
            && Objects.equals(this.storageMode, that.storageMode) && Objects.equals(this.ltsConfig, that.ltsConfig)
            && Objects.equals(this.sqlTypeRange, that.sqlTypeRange)
            && Objects.equals(this.isExcludeSysUser, that.isExcludeSysUser);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(isOpen, beginTime, endTime, saveDays, storageMode, ltsConfig, sqlTypeRange, isExcludeSysUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlSwitchResult {\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    saveDays: ").append(toIndentedString(saveDays)).append("\n");
        sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
        sb.append("    ltsConfig: ").append(toIndentedString(ltsConfig)).append("\n");
        sb.append("    sqlTypeRange: ").append(toIndentedString(sqlTypeRange)).append("\n");
        sb.append("    isExcludeSysUser: ").append(toIndentedString(isExcludeSysUser)).append("\n");
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
