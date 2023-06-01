package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 灵活回源信息,最多20条。
 */
public class FlexibleOrigins {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_pattern")

    private String matchPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_sources")

    private List<BackSources> backSources = null;

    public FlexibleOrigins withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * URI的匹配方式，支持文件后缀（file_extension）和路径前缀（file_path）。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public FlexibleOrigins withMatchPattern(String matchPattern) {
        this.matchPattern = matchPattern;
        return this;
    }

    /**
     * file_extension（文件后缀）： 支持所有格式的文件类型。 输入首字符为“.”，以“;”进行分隔。 输入的文件后缀名总数不能超过20个。 file_path（目录路径）：输入要求以“/”作为首字符，以“;”进行分隔，输入的目录路径总数不能超过20个。
     * @return matchPattern
     */
    public String getMatchPattern() {
        return matchPattern;
    }

    public void setMatchPattern(String matchPattern) {
        this.matchPattern = matchPattern;
    }

    public FlexibleOrigins withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级取值范围为1~100，数值越大优先级越高。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public FlexibleOrigins withBackSources(List<BackSources> backSources) {
        this.backSources = backSources;
        return this;
    }

    public FlexibleOrigins addBackSourcesItem(BackSources backSourcesItem) {
        if (this.backSources == null) {
            this.backSources = new ArrayList<>();
        }
        this.backSources.add(backSourcesItem);
        return this;
    }

    public FlexibleOrigins withBackSources(Consumer<List<BackSources>> backSourcesSetter) {
        if (this.backSources == null) {
            this.backSources = new ArrayList<>();
        }
        backSourcesSetter.accept(this.backSources);
        return this;
    }

    /**
     * 回源信息。  > 每个目录的回源源站数量不超过1个。
     * @return backSources
     */
    public List<BackSources> getBackSources() {
        return backSources;
    }

    public void setBackSources(List<BackSources> backSources) {
        this.backSources = backSources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlexibleOrigins flexibleOrigins = (FlexibleOrigins) o;
        return Objects.equals(this.matchType, flexibleOrigins.matchType)
            && Objects.equals(this.matchPattern, flexibleOrigins.matchPattern)
            && Objects.equals(this.priority, flexibleOrigins.priority)
            && Objects.equals(this.backSources, flexibleOrigins.backSources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchType, matchPattern, priority, backSources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlexibleOrigins {\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    matchPattern: ").append(toIndentedString(matchPattern)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    backSources: ").append(toIndentedString(backSources)).append("\n");
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
