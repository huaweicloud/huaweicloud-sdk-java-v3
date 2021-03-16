package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * links字段数据结构说明
 */
public class LinksInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private String rel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public LinksInfo withRel(String rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * 快捷链接标记名称。取值为：self：包含版本号的资源链接，需要立即跟踪时使用此类链接。bookmark：提供了适合长期存储的资源链接。
     * @return rel
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    

    public LinksInfo withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 对应快捷链接
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    

    public LinksInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 快捷链接类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinksInfo linksInfo = (LinksInfo) o;
        return Objects.equals(this.rel, linksInfo.rel) &&
            Objects.equals(this.href, linksInfo.href) &&
            Objects.equals(this.type, linksInfo.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rel, href, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinksInfo {\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

