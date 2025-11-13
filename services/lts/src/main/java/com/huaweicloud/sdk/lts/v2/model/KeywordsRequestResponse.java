package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * KeywordsRequestResponse
 */
public class KeywordsRequestResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_time_range")

    private Integer searchTimeRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_time_range_unit")

    private String searchTimeRangeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_date")

    private CustomDate customDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_time_range_relative")

    private Boolean isTimeRangeRelative;

    public KeywordsRequestResponse withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * **参数解释：** 日志流ID，获取方式请参见：[获取日志组ID和日志流ID](lts_api_0014.xml)。 **取值范围：** 不涉及。
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public KeywordsRequestResponse withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * **参数解释：** 日志流名称。 **取值范围：** 不涉及。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public KeywordsRequestResponse withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * **参数解释：** 日志流ID。 **取值范围：** 不涉及。
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public KeywordsRequestResponse withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * **参数解释：** 日志组名称。 **取值范围：** 不涉及。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public KeywordsRequestResponse withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * **参数解释：** 在日志搜索能查到的日志关键字。 **取值范围：** 不涉及。
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public KeywordsRequestResponse withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * **参数解释：** 告警查询条件。 **取值范围：**  <、- >、 <=、>=
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public KeywordsRequestResponse withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释：** 告警匹配条数。 **取值范围：** 不涉及。
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public KeywordsRequestResponse withSearchTimeRange(Integer searchTimeRange) {
        this.searchTimeRange = searchTimeRange;
        return this;
    }

    /**
     * **参数解释：** 查询执行告警任务时最近数据的时间范围。 **取值范围：** - 最小值：1 - 最大值：60
     * @return searchTimeRange
     */
    public Integer getSearchTimeRange() {
        return searchTimeRange;
    }

    public void setSearchTimeRange(Integer searchTimeRange) {
        this.searchTimeRange = searchTimeRange;
    }

    public KeywordsRequestResponse withSearchTimeRangeUnit(String searchTimeRangeUnit) {
        this.searchTimeRangeUnit = searchTimeRangeUnit;
        return this;
    }

    /**
     * **参数解释：** 查询告警时间范围单位。 **取值范围：** - minute - hour
     * @return searchTimeRangeUnit
     */
    public String getSearchTimeRangeUnit() {
        return searchTimeRangeUnit;
    }

    public void setSearchTimeRangeUnit(String searchTimeRangeUnit) {
        this.searchTimeRangeUnit = searchTimeRangeUnit;
    }

    public KeywordsRequestResponse withCustomDate(CustomDate customDate) {
        this.customDate = customDate;
        return this;
    }

    public KeywordsRequestResponse withCustomDate(Consumer<CustomDate> customDateSetter) {
        if (this.customDate == null) {
            this.customDate = new CustomDate();
            customDateSetter.accept(this.customDate);
        }

        return this;
    }

    /**
     * Get customDate
     * @return customDate
     */
    public CustomDate getCustomDate() {
        return customDate;
    }

    public void setCustomDate(CustomDate customDate) {
        this.customDate = customDate;
    }

    public KeywordsRequestResponse withIsTimeRangeRelative(Boolean isTimeRangeRelative) {
        this.isTimeRangeRelative = isTimeRangeRelative;
        return this;
    }

    /**
     * **参数解释：** 告警查询日志的时间区间为相对时间还是整点时间。 **约束限制：** 不涉及。 **取值范围：** - true: 相对时间。 - false: 整点时间。 **默认取值：** true
     * @return isTimeRangeRelative
     */
    public Boolean getIsTimeRangeRelative() {
        return isTimeRangeRelative;
    }

    public void setIsTimeRangeRelative(Boolean isTimeRangeRelative) {
        this.isTimeRangeRelative = isTimeRangeRelative;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeywordsRequestResponse that = (KeywordsRequestResponse) obj;
        return Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.keywords, that.keywords) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.number, that.number) && Objects.equals(this.searchTimeRange, that.searchTimeRange)
            && Objects.equals(this.searchTimeRangeUnit, that.searchTimeRangeUnit)
            && Objects.equals(this.customDate, that.customDate)
            && Objects.equals(this.isTimeRangeRelative, that.isTimeRangeRelative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamId,
            logStreamName,
            logGroupId,
            logGroupName,
            keywords,
            condition,
            number,
            searchTimeRange,
            searchTimeRangeUnit,
            customDate,
            isTimeRangeRelative);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsRequestResponse {\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    searchTimeRange: ").append(toIndentedString(searchTimeRange)).append("\n");
        sb.append("    searchTimeRangeUnit: ").append(toIndentedString(searchTimeRangeUnit)).append("\n");
        sb.append("    customDate: ").append(toIndentedString(customDate)).append("\n");
        sb.append("    isTimeRangeRelative: ").append(toIndentedString(isTimeRangeRelative)).append("\n");
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
