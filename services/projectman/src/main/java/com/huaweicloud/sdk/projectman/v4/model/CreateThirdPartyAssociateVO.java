package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 新增关联外部链接参数。
 */
public class CreateThirdPartyAssociateVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public CreateThirdPartyAssociateVO withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 工作项下对应的外部链接的名称。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateThirdPartyAssociateVO withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 工作项下对应外部链接的地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateThirdPartyAssociateVO that = (CreateThirdPartyAssociateVO) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThirdPartyAssociateVO {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
