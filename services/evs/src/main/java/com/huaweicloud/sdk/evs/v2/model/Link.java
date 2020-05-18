package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 云硬盘uri自描述信息
 */
public class Link  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private String rel;

    public Link withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 对应的快捷链接。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Link withRel(String rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * 快捷链接标记名称。
     * @return rel
     */
    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Link link = (Link) o;
        return Objects.equals(this.href, link.href) &&
            Objects.equals(this.rel, link.rel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Link {\n");
            sb.append("    href: ").append(toIndentedString(href)).append("\n");
            sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

