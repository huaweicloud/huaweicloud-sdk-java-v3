package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：URL重定向配置。  **约束限制**：当action为REDIRECT_TO_POOL的时候生效。
 */
public class RewriteUrlConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public RewriteUrlConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * **参数解释**：重定向的域名。  **取值范围**：英文字母、数字、“-”、“.”，必须以字母、数字开头。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RewriteUrlConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**：重定向的请求路径。其中$1-$9会匹配请求url通配符星号(*)，当正则匹配分组小于指定数字，则$指定数字结果为空。$后面跟字母，匹配结果均为空，直到下一个特殊字符出现，例如$abc#123，则匹配结果为#123；$后面跟特殊字符则直接输出特殊字符，例如$#匹配结果为$#。  **取值范围**：英文字母、数字、_~';@^-%#&$.+?,=!:|/()，且必须以\"/\"开头。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RewriteUrlConfig withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**：重定向的查询字符串。其中$1-$9会匹配请求url通配符星号（*），当正则匹配分组小于指定数字，则$指定数字结果为空。$后面跟字母，匹配结果均为空，直到下一个特殊字符出现，例如$abc#123，则匹配结果为#123；$后面跟特殊字符则直接输出特殊字符，例如$#匹配结果为$#。  **取值范围**：英文字母、数字和特殊字符：!$&'()+,-./:;=?@^_`。字母区分大小写。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RewriteUrlConfig that = (RewriteUrlConfig) obj;
        return Objects.equals(this.host, that.host) && Objects.equals(this.path, that.path)
            && Objects.equals(this.query, that.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, path, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RewriteUrlConfig {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
