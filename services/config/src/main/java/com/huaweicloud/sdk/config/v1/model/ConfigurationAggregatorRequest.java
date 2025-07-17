package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源聚合器请求体。
 */
public class ConfigurationAggregatorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_name")

    private String aggregatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_type")

    private String aggregatorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_aggregation_sources")

    private AccountAggregationSource accountAggregationSources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    public ConfigurationAggregatorRequest withAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
        return this;
    }

    /**
     * 资源聚合器名称。
     * @return aggregatorName
     */
    public String getAggregatorName() {
        return aggregatorName;
    }

    public void setAggregatorName(String aggregatorName) {
        this.aggregatorName = aggregatorName;
    }

    public ConfigurationAggregatorRequest withAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
        return this;
    }

    /**
     * 聚合器类型（ACCOUNT | ORGANIZATION）。
     * @return aggregatorType
     */
    public String getAggregatorType() {
        return aggregatorType;
    }

    public void setAggregatorType(String aggregatorType) {
        this.aggregatorType = aggregatorType;
    }

    public ConfigurationAggregatorRequest withAccountAggregationSources(
        AccountAggregationSource accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
        return this;
    }

    public ConfigurationAggregatorRequest withAccountAggregationSources(
        Consumer<AccountAggregationSource> accountAggregationSourcesSetter) {
        if (this.accountAggregationSources == null) {
            this.accountAggregationSources = new AccountAggregationSource();
            accountAggregationSourcesSetter.accept(this.accountAggregationSources);
        }

        return this;
    }

    /**
     * Get accountAggregationSources
     * @return accountAggregationSources
     */
    public AccountAggregationSource getAccountAggregationSources() {
        return accountAggregationSources;
    }

    public void setAccountAggregationSources(AccountAggregationSource accountAggregationSources) {
        this.accountAggregationSources = accountAggregationSources;
    }

    public ConfigurationAggregatorRequest withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public ConfigurationAggregatorRequest addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ConfigurationAggregatorRequest withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationAggregatorRequest that = (ConfigurationAggregatorRequest) obj;
        return Objects.equals(this.aggregatorName, that.aggregatorName)
            && Objects.equals(this.aggregatorType, that.aggregatorType)
            && Objects.equals(this.accountAggregationSources, that.accountAggregationSources)
            && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorName, aggregatorType, accountAggregationSources, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigurationAggregatorRequest {\n");
        sb.append("    aggregatorName: ").append(toIndentedString(aggregatorName)).append("\n");
        sb.append("    aggregatorType: ").append(toIndentedString(aggregatorType)).append("\n");
        sb.append("    accountAggregationSources: ").append(toIndentedString(accountAggregationSources)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
