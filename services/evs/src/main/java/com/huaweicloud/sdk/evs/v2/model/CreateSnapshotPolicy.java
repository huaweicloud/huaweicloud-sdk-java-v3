package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建自动快照策略模型。
 */
public class CreateSnapshotPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_weekdays")

    private List<String> repeatWeekdays = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_interval_days")

    private Integer repeatIntervalDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_points")

    private List<String> timePoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_days")

    private Integer retentionDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private Map<String, String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CreateSnapshotPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自动快照策略名称。最大支持255个字节。  最小长度：0  最大长度：255
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSnapshotPolicy withRepeatWeekdays(List<String> repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }

    public CreateSnapshotPolicy addRepeatWeekdaysItem(String repeatWeekdaysItem) {
        if (this.repeatWeekdays == null) {
            this.repeatWeekdays = new ArrayList<>();
        }
        this.repeatWeekdays.add(repeatWeekdaysItem);
        return this;
    }

    public CreateSnapshotPolicy withRepeatWeekdays(Consumer<List<String>> repeatWeekdaysSetter) {
        if (this.repeatWeekdays == null) {
            this.repeatWeekdays = new ArrayList<>();
        }
        repeatWeekdaysSetter.accept(this.repeatWeekdays);
        return this;
    }

    /**
     * 自动快照的重复日期，单位为天，周期为星期。取值范围为 1~7，如 1 表示周一。  当一星期内需要创建多次自动快照时，可以传入多个时间点：  最多传入 7 个时间点。 多个时间点用一个格式类似\"1\", \"2\", … \"7\"的 JSON 数组表示，时间点之间用半角逗号（,）隔开。
     * @return repeatWeekdays
     */
    public List<String> getRepeatWeekdays() {
        return repeatWeekdays;
    }

    public void setRepeatWeekdays(List<String> repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
    }

    public CreateSnapshotPolicy withRepeatIntervalDays(Integer repeatIntervalDays) {
        this.repeatIntervalDays = repeatIntervalDays;
        return this;
    }

    /**
     * 自动快照的间隔日期，单位为天，取值范围为 1~30,如1表示每天。
     * @return repeatIntervalDays
     */
    public Integer getRepeatIntervalDays() {
        return repeatIntervalDays;
    }

    public void setRepeatIntervalDays(Integer repeatIntervalDays) {
        this.repeatIntervalDays = repeatIntervalDays;
    }

    public CreateSnapshotPolicy withTimePoints(List<String> timePoints) {
        this.timePoints = timePoints;
        return this;
    }

    public CreateSnapshotPolicy addTimePointsItem(String timePointsItem) {
        if (this.timePoints == null) {
            this.timePoints = new ArrayList<>();
        }
        this.timePoints.add(timePointsItem);
        return this;
    }

    public CreateSnapshotPolicy withTimePoints(Consumer<List<String>> timePointsSetter) {
        if (this.timePoints == null) {
            this.timePoints = new ArrayList<>();
        }
        timePointsSetter.accept(this.timePoints);
        return this;
    }

    /**
     * 自动快照的创建时间点。使用 UTC +8 时间，单位为小时。取值范围为 0~23，代表 00:00 至 23:00 共 24 个时间点，如 1 表示 01:00。  当一天内需要创建多次自动快照时，可以传入多个时间点：  最多传入 24 个时间点。 多个时间点用一个格式类似\"0\", \"1\", … \"23\"的 JSON 数组表示，时间点之间用半角逗号（,）隔开。
     * @return timePoints
     */
    public List<String> getTimePoints() {
        return timePoints;
    }

    public void setTimePoints(List<String> timePoints) {
        this.timePoints = timePoints;
    }

    public CreateSnapshotPolicy withRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

    /**
     * 设置快照的保留时间，单位为天。保留时间到期后快照会被自动释放，取值范围：1~65536。 缺省值：-1，表示快照持续保留。
     * @return retentionDays
     */
    public Integer getRetentionDays() {
        return retentionDays;
    }

    public void setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
    }

    public CreateSnapshotPolicy withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateSnapshotPolicy putTagsItem(String key, String tagsItem) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        this.tags.put(key, tagsItem);
        return this;
    }

    public CreateSnapshotPolicy withTags(Consumer<Map<String, String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new HashMap<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 设置自动快照策略的标签。
     * @return tags
     */
    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public CreateSnapshotPolicy withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSnapshotPolicy that = (CreateSnapshotPolicy) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.repeatWeekdays, that.repeatWeekdays)
            && Objects.equals(this.repeatIntervalDays, that.repeatIntervalDays)
            && Objects.equals(this.timePoints, that.timePoints)
            && Objects.equals(this.retentionDays, that.retentionDays) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, repeatWeekdays, repeatIntervalDays, timePoints, retentionDays, tags, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSnapshotPolicy {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    repeatWeekdays: ").append(toIndentedString(repeatWeekdays)).append("\n");
        sb.append("    repeatIntervalDays: ").append(toIndentedString(repeatIntervalDays)).append("\n");
        sb.append("    timePoints: ").append(toIndentedString(timePoints)).append("\n");
        sb.append("    retentionDays: ").append(toIndentedString(retentionDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
