package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEventSourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_id")

    @JacksonXmlProperty(localName = "channel_id")

    private String channelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    @JacksonXmlProperty(localName = "sort")

    private String sort;

    /**
     * 指定查询提供方的类型
     */
    public static final class ProviderTypeEnum {

        /**
         * Enum OFFICIAL for value: "OFFICIAL"
         */
        public static final ProviderTypeEnum OFFICIAL = new ProviderTypeEnum("OFFICIAL");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ProviderTypeEnum CUSTOM = new ProviderTypeEnum("CUSTOM");

        private static final Map<String, ProviderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderTypeEnum> createStaticFields() {
            Map<String, ProviderTypeEnum> map = new HashMap<>();
            map.put("OFFICIAL", OFFICIAL);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ProviderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProviderTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProviderTypeEnum(value);
            }
            return result;
        }

        public static ProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProviderTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderTypeEnum) {
                return this.value.equals(((ProviderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    @JacksonXmlProperty(localName = "provider_type")

    private ProviderTypeEnum providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzzy_name")

    @JacksonXmlProperty(localName = "fuzzy_name")

    private String fuzzyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fuzzy_label")

    @JacksonXmlProperty(localName = "fuzzy_label")

    private String fuzzyLabel;

    public ListEventSourcesRequest withChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * 事件通道ID
     * @return channelId
     */
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public ListEventSourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，偏移量不能小于0
     * minimum: 0
     * maximum: 100
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListEventSourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，不能小于0。
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEventSourcesRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 指定查询排序
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListEventSourcesRequest withProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 指定查询提供方的类型
     * @return providerType
     */
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public ListEventSourcesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指定查询的事件源名称，精准匹配
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListEventSourcesRequest withFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
        return this;
    }

    /**
     * 指定查询的事件源名称，模糊匹配
     * @return fuzzyName
     */
    public String getFuzzyName() {
        return fuzzyName;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public ListEventSourcesRequest withFuzzyLabel(String fuzzyLabel) {
        this.fuzzyLabel = fuzzyLabel;
        return this;
    }

    /**
     * 指定查询的事件源标签，模糊匹配
     * @return fuzzyLabel
     */
    public String getFuzzyLabel() {
        return fuzzyLabel;
    }

    public void setFuzzyLabel(String fuzzyLabel) {
        this.fuzzyLabel = fuzzyLabel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventSourcesRequest listEventSourcesRequest = (ListEventSourcesRequest) o;
        return Objects.equals(this.channelId, listEventSourcesRequest.channelId)
            && Objects.equals(this.offset, listEventSourcesRequest.offset)
            && Objects.equals(this.limit, listEventSourcesRequest.limit)
            && Objects.equals(this.sort, listEventSourcesRequest.sort)
            && Objects.equals(this.providerType, listEventSourcesRequest.providerType)
            && Objects.equals(this.name, listEventSourcesRequest.name)
            && Objects.equals(this.fuzzyName, listEventSourcesRequest.fuzzyName)
            && Objects.equals(this.fuzzyLabel, listEventSourcesRequest.fuzzyLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channelId, offset, limit, sort, providerType, name, fuzzyName, fuzzyLabel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventSourcesRequest {\n");
        sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fuzzyName: ").append(toIndentedString(fuzzyName)).append("\n");
        sb.append("    fuzzyLabel: ").append(toIndentedString(fuzzyLabel)).append("\n");
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
