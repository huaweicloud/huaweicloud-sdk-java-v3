package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateLogStreamParams
 */
public class UpdateLogStreamParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private Integer ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsBody> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "whether_log_storage")

    private Boolean whetherLogStorage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_cold_separation")

    private Boolean hotColdSeparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_storage_days")

    private Integer hotStorageDays;

    public UpdateLogStreamParams withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间（天）。
     * minimum: 1
     * maximum: 365
     * @return ttlInDays
     */
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    public UpdateLogStreamParams withTags(List<TagsBody> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateLogStreamParams addTagsItem(TagsBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateLogStreamParams withTags(Consumer<List<TagsBody>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签字段信息
     * @return tags
     */
    public List<TagsBody> getTags() {
        return tags;
    }

    public void setTags(List<TagsBody> tags) {
        this.tags = tags;
    }

    public UpdateLogStreamParams withWhetherLogStorage(Boolean whetherLogStorage) {
        this.whetherLogStorage = whetherLogStorage;
        return this;
    }

    /**
     * 日志是否存储
     * @return whetherLogStorage
     */
    public Boolean getWhetherLogStorage() {
        return whetherLogStorage;
    }

    public void setWhetherLogStorage(Boolean whetherLogStorage) {
        this.whetherLogStorage = whetherLogStorage;
    }

    public UpdateLogStreamParams withHotColdSeparation(Boolean hotColdSeparation) {
        this.hotColdSeparation = hotColdSeparation;
        return this;
    }

    /**
     * **参数解释：** 是否开启智能冷存储。 **约束限制：** 开启智能冷存储需要日志存储时间大于7天。开启智能冷存储后，需要设置标准存储层数据的保存时间。标准存储至少需保存7天才能转换为智能冷存储层数据。当日志保存时间大于标准存储层数据保存时间，且小于日志存储时间时，日志数据将自动转换为智能冷存储层数据存储。 **取值范围：** - true：开启智能冷存储。 - false：关闭智能冷存储。 **默认取值：** false
     * @return hotColdSeparation
     */
    public Boolean getHotColdSeparation() {
        return hotColdSeparation;
    }

    public void setHotColdSeparation(Boolean hotColdSeparation) {
        this.hotColdSeparation = hotColdSeparation;
    }

    public UpdateLogStreamParams withHotStorageDays(Integer hotStorageDays) {
        this.hotStorageDays = hotStorageDays;
        return this;
    }

    /**
     * **参数解释：** 日志流标准存储时间（单位：天），即日志上报到LTS后日志标准存储的时间。 **约束限制：** 开启智能冷存储需要日志总存储时间大于7天。 **取值范围：** 最小值：7天 最大值：365天 **默认取值：** 不涉及。
     * @return hotStorageDays
     */
    public Integer getHotStorageDays() {
        return hotStorageDays;
    }

    public void setHotStorageDays(Integer hotStorageDays) {
        this.hotStorageDays = hotStorageDays;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogStreamParams that = (UpdateLogStreamParams) obj;
        return Objects.equals(this.ttlInDays, that.ttlInDays) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.whetherLogStorage, that.whetherLogStorage)
            && Objects.equals(this.hotColdSeparation, that.hotColdSeparation)
            && Objects.equals(this.hotStorageDays, that.hotStorageDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttlInDays, tags, whetherLogStorage, hotColdSeparation, hotStorageDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogStreamParams {\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    whetherLogStorage: ").append(toIndentedString(whetherLogStorage)).append("\n");
        sb.append("    hotColdSeparation: ").append(toIndentedString(hotColdSeparation)).append("\n");
        sb.append("    hotStorageDays: ").append(toIndentedString(hotStorageDays)).append("\n");
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
