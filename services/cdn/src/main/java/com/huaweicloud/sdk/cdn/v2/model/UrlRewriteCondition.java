package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 匹配条件。
 */
public class UrlRewriteCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_type")

    private String matchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match_value")

    private String matchValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public UrlRewriteCondition withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    /**
     * 匹配类型。   - catalog：指定目录下的文件需执行访问URL重写规则，   - full_path：某个完整路径下的文件需执行访问URL重写规则。
     * @return matchType
     */
    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public UrlRewriteCondition withMatchValue(String matchValue) {
        this.matchValue = matchValue;
        return this;
    }

    /**
     * 匹配内容。当match_type为catalog时，为目录路径，输入要求以“/”作为首字符，以“,”进行分隔，如/test/folder01,/test/folder02，并且输入的目录路径总数不超过20个。 当match_type为full_path时，为全路径，输入要求以“/”作为首字符，支持匹配指定目录下的具体文件，或者带通配符“\\*”的文件，单条全路径缓存规则里仅支持配置一个全路径，如/test/index.html或/test/\\*.jpg。
     * @return matchValue
     */
    public String getMatchValue() {
        return matchValue;
    }

    public void setMatchValue(String matchValue) {
        this.matchValue = matchValue;
    }

    public UrlRewriteCondition withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 访问URL重写规则的优先级。取值为1-100之间的整数，数值越大优先级越高。优先级设置具有唯一性，不支持多条规则设置同一优先级，且优先级不能为空。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlRewriteCondition that = (UrlRewriteCondition) obj;
        return Objects.equals(this.matchType, that.matchType) && Objects.equals(this.matchValue, that.matchValue)
            && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchType, matchValue, priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UrlRewriteCondition {\n");
        sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
        sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
