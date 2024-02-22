package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVersionAliasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_urn")

    private String aliasUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_version_weights")

    private Map<String, Integer> additionalVersionWeights = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_version_strategy")

    private Map<String, VersionStrategy> additionalVersionStrategy = null;

    public ShowVersionAliasResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 要获取的别名名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowVersionAliasResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 别名对应的版本名称。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ShowVersionAliasResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 别名描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowVersionAliasResponse withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 别名最后修改时间。
     * @return lastModified
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public ShowVersionAliasResponse withAliasUrn(String aliasUrn) {
        this.aliasUrn = aliasUrn;
        return this;
    }

    /**
     * 版本别名唯一标识。
     * @return aliasUrn
     */
    public String getAliasUrn() {
        return aliasUrn;
    }

    public void setAliasUrn(String aliasUrn) {
        this.aliasUrn = aliasUrn;
    }

    public ShowVersionAliasResponse withAdditionalVersionWeights(Map<String, Integer> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
        return this;
    }

    public ShowVersionAliasResponse putAdditionalVersionWeightsItem(String key, Integer additionalVersionWeightsItem) {
        if (this.additionalVersionWeights == null) {
            this.additionalVersionWeights = new HashMap<>();
        }
        this.additionalVersionWeights.put(key, additionalVersionWeightsItem);
        return this;
    }

    public ShowVersionAliasResponse withAdditionalVersionWeights(
        Consumer<Map<String, Integer>> additionalVersionWeightsSetter) {
        if (this.additionalVersionWeights == null) {
            this.additionalVersionWeights = new HashMap<>();
        }
        additionalVersionWeightsSetter.accept(this.additionalVersionWeights);
        return this;
    }

    /**
     * 百分比灰度配置信息
     * @return additionalVersionWeights
     */
    public Map<String, Integer> getAdditionalVersionWeights() {
        return additionalVersionWeights;
    }

    public void setAdditionalVersionWeights(Map<String, Integer> additionalVersionWeights) {
        this.additionalVersionWeights = additionalVersionWeights;
    }

    public ShowVersionAliasResponse withAdditionalVersionStrategy(
        Map<String, VersionStrategy> additionalVersionStrategy) {
        this.additionalVersionStrategy = additionalVersionStrategy;
        return this;
    }

    public ShowVersionAliasResponse putAdditionalVersionStrategyItem(String key,
        VersionStrategy additionalVersionStrategyItem) {
        if (this.additionalVersionStrategy == null) {
            this.additionalVersionStrategy = new HashMap<>();
        }
        this.additionalVersionStrategy.put(key, additionalVersionStrategyItem);
        return this;
    }

    public ShowVersionAliasResponse withAdditionalVersionStrategy(
        Consumer<Map<String, VersionStrategy>> additionalVersionStrategySetter) {
        if (this.additionalVersionStrategy == null) {
            this.additionalVersionStrategy = new HashMap<>();
        }
        additionalVersionStrategySetter.accept(this.additionalVersionStrategy);
        return this;
    }

    /**
     * 指定规则灰度策略信息
     * @return additionalVersionStrategy
     */
    public Map<String, VersionStrategy> getAdditionalVersionStrategy() {
        return additionalVersionStrategy;
    }

    public void setAdditionalVersionStrategy(Map<String, VersionStrategy> additionalVersionStrategy) {
        this.additionalVersionStrategy = additionalVersionStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVersionAliasResponse that = (ShowVersionAliasResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.lastModified, that.lastModified) && Objects.equals(this.aliasUrn, that.aliasUrn)
            && Objects.equals(this.additionalVersionWeights, that.additionalVersionWeights)
            && Objects.equals(this.additionalVersionStrategy, that.additionalVersionStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            version,
            description,
            lastModified,
            aliasUrn,
            additionalVersionWeights,
            additionalVersionStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVersionAliasResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    aliasUrn: ").append(toIndentedString(aliasUrn)).append("\n");
        sb.append("    additionalVersionWeights: ").append(toIndentedString(additionalVersionWeights)).append("\n");
        sb.append("    additionalVersionStrategy: ").append(toIndentedString(additionalVersionStrategy)).append("\n");
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
