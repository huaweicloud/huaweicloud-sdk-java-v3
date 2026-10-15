package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChapterConfig
 */
public class ChapterConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_chapters")

    private Map<String, Boolean> subChapters = null;

    public ChapterConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用该章节。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ChapterConfig withSubChapters(Map<String, Boolean> subChapters) {
        this.subChapters = subChapters;
        return this;
    }

    public ChapterConfig putSubChaptersItem(String key, Boolean subChaptersItem) {
        if (this.subChapters == null) {
            this.subChapters = new HashMap<>();
        }
        this.subChapters.put(key, subChaptersItem);
        return this;
    }

    public ChapterConfig withSubChapters(Consumer<Map<String, Boolean>> subChaptersSetter) {
        if (this.subChapters == null) {
            this.subChapters = new HashMap<>();
        }
        subChaptersSetter.accept(this.subChapters);
        return this;
    }

    /**
     * 子章节配置，key为子章节编码，value为是否启用。
     * @return subChapters
     */
    public Map<String, Boolean> getSubChapters() {
        return subChapters;
    }

    public void setSubChapters(Map<String, Boolean> subChapters) {
        this.subChapters = subChapters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterConfig that = (ChapterConfig) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.subChapters, that.subChapters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, subChapters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChapterConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    subChapters: ").append(toIndentedString(subChapters)).append("\n");
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
