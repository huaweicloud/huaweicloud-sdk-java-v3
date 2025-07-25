package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListLogStreamsResponseBody1LogStreams
 */
public class ListLogStreamsResponseBody1LogStreams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private Long creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name_alias")

    private String logStreamNameAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private Map<String, String> tag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_count")

    private Integer filterCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_log_storage")

    private Boolean whetherLogStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_cold_separation")

    private Boolean hotColdSeparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_web_tracking")

    private Boolean authWebTracking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private Integer ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_storage_days")

    private Integer hotStorageDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    public ListLogStreamsResponseBody1LogStreams withCreationTime(Long creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 日志流创建时间
     * minimum: 1577808000000
     * maximum: 4102416000000
     * @return creationTime
     */
    public Long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    public ListLogStreamsResponseBody1LogStreams withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流ID
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public ListLogStreamsResponseBody1LogStreams withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public ListLogStreamsResponseBody1LogStreams withLogStreamNameAlias(String logStreamNameAlias) {
        this.logStreamNameAlias = logStreamNameAlias;
        return this;
    }

    /**
     * 日志流别名
     * @return logStreamNameAlias
     */
    public String getLogStreamNameAlias() {
        return logStreamNameAlias;
    }

    public void setLogStreamNameAlias(String logStreamNameAlias) {
        this.logStreamNameAlias = logStreamNameAlias;
    }

    public ListLogStreamsResponseBody1LogStreams withTag(Map<String, String> tag) {
        this.tag = tag;
        return this;
    }

    public ListLogStreamsResponseBody1LogStreams putTagItem(String key, String tagItem) {
        if (this.tag == null) {
            this.tag = new HashMap<>();
        }
        this.tag.put(key, tagItem);
        return this;
    }

    public ListLogStreamsResponseBody1LogStreams withTag(Consumer<Map<String, String>> tagSetter) {
        if (this.tag == null) {
            this.tag = new HashMap<>();
        }
        tagSetter.accept(this.tag);
        return this;
    }

    /**
     * 日志流所属标签
     * @return tag
     */
    public Map<String, String> getTag() {
        return tag;
    }

    public void setTag(Map<String, String> tag) {
        this.tag = tag;
    }

    public ListLogStreamsResponseBody1LogStreams withFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
        return this;
    }

    /**
     * 过滤器个数
     * minimum: 0
     * maximum: 5
     * @return filterCount
     */
    public Integer getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(Integer filterCount) {
        this.filterCount = filterCount;
    }

    public ListLogStreamsResponseBody1LogStreams withWhetherLogStorage(Boolean whetherLogStorage) {
        this.whetherLogStorage = whetherLogStorage;
        return this;
    }

    /**
     * 是否日志存储
     * @return whetherLogStorage
     */
    public Boolean getWhetherLogStorage() {
        return whetherLogStorage;
    }

    public void setWhetherLogStorage(Boolean whetherLogStorage) {
        this.whetherLogStorage = whetherLogStorage;
    }

    public ListLogStreamsResponseBody1LogStreams withHotColdSeparation(Boolean hotColdSeparation) {
        this.hotColdSeparation = hotColdSeparation;
        return this;
    }

    /**
     * 是否冷存储
     * @return hotColdSeparation
     */
    public Boolean getHotColdSeparation() {
        return hotColdSeparation;
    }

    public void setHotColdSeparation(Boolean hotColdSeparation) {
        this.hotColdSeparation = hotColdSeparation;
    }

    public ListLogStreamsResponseBody1LogStreams withAuthWebTracking(Boolean authWebTracking) {
        this.authWebTracking = authWebTracking;
        return this;
    }

    /**
     * 匿名写入开关
     * @return authWebTracking
     */
    public Boolean getAuthWebTracking() {
        return authWebTracking;
    }

    public void setAuthWebTracking(Boolean authWebTracking) {
        this.authWebTracking = authWebTracking;
    }

    public ListLogStreamsResponseBody1LogStreams withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 存储时间
     * @return ttlInDays
     */
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    public ListLogStreamsResponseBody1LogStreams withHotStorageDays(Integer hotStorageDays) {
        this.hotStorageDays = hotStorageDays;
        return this;
    }

    /**
     * 标准存储时间
     * @return hotStorageDays
     */
    public Integer getHotStorageDays() {
        return hotStorageDays;
    }

    public void setHotStorageDays(Integer hotStorageDays) {
        this.hotStorageDays = hotStorageDays;
    }

    public ListLogStreamsResponseBody1LogStreams withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组ID
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogStreamsResponseBody1LogStreams that = (ListLogStreamsResponseBody1LogStreams) obj;
        return Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.logStreamNameAlias, that.logStreamNameAlias) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.filterCount, that.filterCount)
            && Objects.equals(this.whetherLogStorage, that.whetherLogStorage)
            && Objects.equals(this.hotColdSeparation, that.hotColdSeparation)
            && Objects.equals(this.authWebTracking, that.authWebTracking)
            && Objects.equals(this.ttlInDays, that.ttlInDays)
            && Objects.equals(this.hotStorageDays, that.hotStorageDays)
            && Objects.equals(this.logGroupId, that.logGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime,
            logStreamId,
            logStreamName,
            logStreamNameAlias,
            tag,
            filterCount,
            whetherLogStorage,
            hotColdSeparation,
            authWebTracking,
            ttlInDays,
            hotStorageDays,
            logGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogStreamsResponseBody1LogStreams {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logStreamNameAlias: ").append(toIndentedString(logStreamNameAlias)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    filterCount: ").append(toIndentedString(filterCount)).append("\n");
        sb.append("    whetherLogStorage: ").append(toIndentedString(whetherLogStorage)).append("\n");
        sb.append("    hotColdSeparation: ").append(toIndentedString(hotColdSeparation)).append("\n");
        sb.append("    authWebTracking: ").append(toIndentedString(authWebTracking)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
        sb.append("    hotStorageDays: ").append(toIndentedString(hotStorageDays)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
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
