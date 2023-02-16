package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListArticlesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")

    private String xServiceKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")

    private String xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private SearchArticlesReq body;

    public ListArticlesRequest withXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
        return this;
    }

    /**
     * 调用智能客服服务标志。
     * @return xServiceKey
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-service-key")
    public String getXServiceKey() {
        return xServiceKey;
    }

    public void setXServiceKey(String xServiceKey) {
        this.xServiceKey = xServiceKey;
    }

    public ListArticlesRequest withXSite(String xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 站点标记，0-中国站  1-国际站
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-site")
    public String getXSite() {
        return xSite;
    }

    public void setXSite(String xSite) {
        this.xSite = xSite;
    }

    public ListArticlesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 区域语言简写，en-us  zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListArticlesRequest withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 搜索类型：HOT-热点案例,RECOMMEND-推荐案例
     * @return searchType
     */
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public ListArticlesRequest withBody(SearchArticlesReq body) {
        this.body = body;
        return this;
    }

    public ListArticlesRequest withBody(Consumer<SearchArticlesReq> bodySetter) {
        if (this.body == null) {
            this.body = new SearchArticlesReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public SearchArticlesReq getBody() {
        return body;
    }

    public void setBody(SearchArticlesReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListArticlesRequest listArticlesRequest = (ListArticlesRequest) o;
        return Objects.equals(this.xServiceKey, listArticlesRequest.xServiceKey)
            && Objects.equals(this.xSite, listArticlesRequest.xSite)
            && Objects.equals(this.xLanguage, listArticlesRequest.xLanguage)
            && Objects.equals(this.searchType, listArticlesRequest.searchType)
            && Objects.equals(this.body, listArticlesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xServiceKey, xSite, xLanguage, searchType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListArticlesRequest {\n");
        sb.append("    xServiceKey: ").append(toIndentedString(xServiceKey)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
