package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建日志流参数。
 */
public class CreateLogStreamParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private Integer ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsBody> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name_alias")

    private String logStreamNameAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_cold_separation")

    private Boolean hotColdSeparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hot_storage_days")

    private Integer hotStorageDays;

    public CreateLogStreamParams withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 需要创建的日志流名称。
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public CreateLogStreamParams withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间 说明： 该参数仅对华东-上海一、华北-北京四、华南-广州用户开放。
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

    public CreateLogStreamParams withTags(List<TagsBody> tags) {
        this.tags = tags;
        return this;
    }

    public CreateLogStreamParams addTagsItem(TagsBody tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateLogStreamParams withTags(Consumer<List<TagsBody>> tagsSetter) {
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

    public CreateLogStreamParams withLogStreamNameAlias(String logStreamNameAlias) {
        this.logStreamNameAlias = logStreamNameAlias;
        return this;
    }

    /**
     * 日志流名称别名
     * @return logStreamNameAlias
     */
    public String getLogStreamNameAlias() {
        return logStreamNameAlias;
    }

    public void setLogStreamNameAlias(String logStreamNameAlias) {
        this.logStreamNameAlias = logStreamNameAlias;
    }

    public CreateLogStreamParams withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称 >只能由中文、英文字母、数字、下划线、中划线组成，且不能使用任何大小写形式的“default”； 描述不超过512个字符。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public CreateLogStreamParams withHotColdSeparation(Boolean hotColdSeparation) {
        this.hotColdSeparation = hotColdSeparation;
        return this;
    }

    /**
     * **参数解释：** 是否开启智能冷存储。 **约束限制：** 开启智能冷存储需要日志存储时间大于7天。开启智能冷存储后，需要设置标准存储层数据的保存时间。标准存储至少需保存7天才能转换为智能冷存储层数据。当日志保存时间大于标准存储层数据保存时间，且小于日志存储时间时，日志数据将自动转换为智能冷存储层数据存储。 **取值范围：** true/false。 **默认取值：** false
     * @return hotColdSeparation
     */
    public Boolean getHotColdSeparation() {
        return hotColdSeparation;
    }

    public void setHotColdSeparation(Boolean hotColdSeparation) {
        this.hotColdSeparation = hotColdSeparation;
    }

    public CreateLogStreamParams withHotStorageDays(Integer hotStorageDays) {
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
        CreateLogStreamParams that = (CreateLogStreamParams) obj;
        return Objects.equals(this.logStreamName, that.logStreamName) && Objects.equals(this.ttlInDays, that.ttlInDays)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.logStreamNameAlias, that.logStreamNameAlias)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.hotColdSeparation, that.hotColdSeparation)
            && Objects.equals(this.hotStorageDays, that.hotStorageDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamName,
            ttlInDays,
            tags,
            logStreamNameAlias,
            enterpriseProjectName,
            hotColdSeparation,
            hotStorageDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogStreamParams {\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    logStreamNameAlias: ").append(toIndentedString(logStreamNameAlias)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
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
