package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 此参数在请求实体中，采用json字符串格式
 */
public class CreateLogDumpObsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    @JacksonXmlProperty(localName = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_ids")

    @JacksonXmlProperty(localName = "log_stream_ids")

    private List<String> logStreamIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    @JacksonXmlProperty(localName = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_format")

    @JacksonXmlProperty(localName = "storage_format")

    private String storageFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_on")

    @JacksonXmlProperty(localName = "switch_on")

    private Boolean switchOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix_name")

    @JacksonXmlProperty(localName = "prefix_name")

    private String prefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dir_prefix_name")

    @JacksonXmlProperty(localName = "dir_prefix_name")

    private String dirPrefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    @JacksonXmlProperty(localName = "period")

    private Integer period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_unit")

    @JacksonXmlProperty(localName = "period_unit")

    private String periodUnit;

    public CreateLogDumpObsRequestBody withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组id。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public CreateLogDumpObsRequestBody withLogStreamIds(List<String> logStreamIds) {
        this.logStreamIds = logStreamIds;
        return this;
    }

    public CreateLogDumpObsRequestBody addLogStreamIdsItem(String logStreamIdsItem) {
        if (this.logStreamIds == null) {
            this.logStreamIds = new ArrayList<>();
        }
        this.logStreamIds.add(logStreamIdsItem);
        return this;
    }

    public CreateLogDumpObsRequestBody withLogStreamIds(Consumer<List<String>> logStreamIdsSetter) {
        if (this.logStreamIds == null) {
            this.logStreamIds = new ArrayList<>();
        }
        logStreamIdsSetter.accept(this.logStreamIds);
        return this;
    }

    /**
     * 日志流id列表, 可以指定一个或多个日志流进行obs周期性转储
     * @return logStreamIds
     */
    public List<String> getLogStreamIds() {
        return logStreamIds;
    }

    public void setLogStreamIds(List<String> logStreamIds) {
        this.logStreamIds = logStreamIds;
    }

    public CreateLogDumpObsRequestBody withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * obs 桶名称。
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public CreateLogDumpObsRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 周期性转储, 必须填 cycle。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateLogDumpObsRequestBody withStorageFormat(String storageFormat) {
        this.storageFormat = storageFormat;
        return this;
    }

    /**
     * 转储格式 RAW/JSON， 默认为 RAW。
     * @return storageFormat
     */
    public String getStorageFormat() {
        return storageFormat;
    }

    public void setStorageFormat(String storageFormat) {
        this.storageFormat = storageFormat;
    }

    public CreateLogDumpObsRequestBody withSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
        return this;
    }

    /**
     * 是否开启转储 true/false, 默认为 true
     * @return switchOn
     */
    public Boolean getSwitchOn() {
        return switchOn;
    }

    public void setSwitchOn(Boolean switchOn) {
        this.switchOn = switchOn;
    }

    public CreateLogDumpObsRequestBody withPrefixName(String prefixName) {
        this.prefixName = prefixName;
        return this;
    }

    /**
     * 转储至OBS桶中的日志文件前缀。
     * @return prefixName
     */
    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }

    public CreateLogDumpObsRequestBody withDirPrefixName(String dirPrefixName) {
        this.dirPrefixName = dirPrefixName;
        return this;
    }

    /**
     * 自定义文件夹路径。
     * @return dirPrefixName
     */
    public String getDirPrefixName() {
        return dirPrefixName;
    }

    public void setDirPrefixName(String dirPrefixName) {
        this.dirPrefixName = dirPrefixName;
    }

    public CreateLogDumpObsRequestBody withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 转储周期的长度， 与 period_unit 拼接后必须在该列表中 [\"2min\",\"5min\",\"30min\",\"1hour\",\"3hour\",\"6hour\",\"12hour\"]。
     * minimum: 1
     * maximum: 30
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public CreateLogDumpObsRequestBody withPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }

    /**
     * 转储周期的单位， 与 period 拼接后必须在该列表中 [\"2min\",\"5min\",\"30min\",\"1hour\",\"3hour\",\"6hour\",\"12hour\"]。
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLogDumpObsRequestBody createLogDumpObsRequestBody = (CreateLogDumpObsRequestBody) o;
        return Objects.equals(this.logGroupId, createLogDumpObsRequestBody.logGroupId)
            && Objects.equals(this.logStreamIds, createLogDumpObsRequestBody.logStreamIds)
            && Objects.equals(this.obsBucketName, createLogDumpObsRequestBody.obsBucketName)
            && Objects.equals(this.type, createLogDumpObsRequestBody.type)
            && Objects.equals(this.storageFormat, createLogDumpObsRequestBody.storageFormat)
            && Objects.equals(this.switchOn, createLogDumpObsRequestBody.switchOn)
            && Objects.equals(this.prefixName, createLogDumpObsRequestBody.prefixName)
            && Objects.equals(this.dirPrefixName, createLogDumpObsRequestBody.dirPrefixName)
            && Objects.equals(this.period, createLogDumpObsRequestBody.period)
            && Objects.equals(this.periodUnit, createLogDumpObsRequestBody.periodUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupId,
            logStreamIds,
            obsBucketName,
            type,
            storageFormat,
            switchOn,
            prefixName,
            dirPrefixName,
            period,
            periodUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogDumpObsRequestBody {\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logStreamIds: ").append(toIndentedString(logStreamIds)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    storageFormat: ").append(toIndentedString(storageFormat)).append("\n");
        sb.append("    switchOn: ").append(toIndentedString(switchOn)).append("\n");
        sb.append("    prefixName: ").append(toIndentedString(prefixName)).append("\n");
        sb.append("    dirPrefixName: ").append(toIndentedString(dirPrefixName)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
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
