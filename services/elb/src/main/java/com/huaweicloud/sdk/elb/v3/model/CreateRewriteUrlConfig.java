package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 转发到的后端主机组的URL配置。rewrite_url_enable为true时，该字段必须传入。
 */
public class CreateRewriteUrlConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    public CreateRewriteUrlConfig withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * url重写的主机名。字符串只能包含英文字母、数字、“-”、“.”，必须以字母、数字开头。默认值${host}表示继承原值（即与被重写请求保持一致）。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public CreateRewriteUrlConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * url重定向的路径。默认值${path}表示继承原值（即与被重写请求保持一致）。 只能包含英文字母、数字、_~';@^-%#&$.*+?,=!:|\\/()，且必须以\"/\"开头。其中$1-$9会匹配请求url通配符星号(*)，当正则匹配分组小于指定数字，则$指定数字结果为空。$后面跟字母，匹配结果均为空，直到下一个特殊字符出现，例如$abc#123，则匹配结果为#123；$后面跟特殊字符则直接输出特殊字符，例如$#匹配结果为$#.
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CreateRewriteUrlConfig withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * url重定向的查询字符串。默认${query}表示继承原值（即与被重写请求保持一致）。 只能包含英文字母、数字和特殊字符：!$&'()*+,-./:;=?@^_`。字母区分大小写。其中$1-$9会匹配请求url通配符星号（*），当正则匹配分组小于指定数字，则$指定数字结果为空。$后面跟字母，匹配结果均为空，直到下一个特殊字符出现，例如$abc#123，则匹配结果为#123；$后面跟特殊字符则直接输出特殊字符，例如$#匹配结果为$#
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRewriteUrlConfig createRewriteUrlConfig = (CreateRewriteUrlConfig) o;
        return Objects.equals(this.host, createRewriteUrlConfig.host)
            && Objects.equals(this.path, createRewriteUrlConfig.path)
            && Objects.equals(this.query, createRewriteUrlConfig.query);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, path, query);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRewriteUrlConfig {\n");
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
