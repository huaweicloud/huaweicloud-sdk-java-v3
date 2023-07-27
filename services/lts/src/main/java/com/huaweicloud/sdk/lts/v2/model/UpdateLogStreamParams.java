package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateLogStreamParams
 */
public class UpdateLogStreamParams {

    /**
     * 日志存储时间（天）。   该参数仅对华东-上海一、华北-北京四、华南-广州用户开放。
     */
    public static final class TtlInDaysEnum {

        /**
         * Enum NUMBER_7 for value: 7
         */
        public static final TtlInDaysEnum NUMBER_7 = new TtlInDaysEnum(7);

        private static final Map<Integer, TtlInDaysEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TtlInDaysEnum> createStaticFields() {
            Map<Integer, TtlInDaysEnum> map = new HashMap<>();
            map.put(7, NUMBER_7);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TtlInDaysEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TtlInDaysEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TtlInDaysEnum(value));
        }

        public static TtlInDaysEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TtlInDaysEnum) {
                return this.value.equals(((TtlInDaysEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private TtlInDaysEnum ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsBody> tags = null;

    public UpdateLogStreamParams withTtlInDays(TtlInDaysEnum ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间（天）。   该参数仅对华东-上海一、华北-北京四、华南-广州用户开放。
     * minimum: 1
     * maximum: 365
     * @return ttlInDays
     */
    public TtlInDaysEnum getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(TtlInDaysEnum ttlInDays) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLogStreamParams that = (UpdateLogStreamParams) obj;
        return Objects.equals(this.ttlInDays, that.ttlInDays) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttlInDays, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogStreamParams {\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
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
