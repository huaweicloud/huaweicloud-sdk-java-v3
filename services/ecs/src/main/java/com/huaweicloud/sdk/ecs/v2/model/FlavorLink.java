package com.huaweicloud.sdk.ecs.v2.model;

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
 * 规格相关快捷链接地址。
 */
public class FlavorLink  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private String rel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;

    public FlavorLink withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 对应快捷链接。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public FlavorLink withRel(String rel) {
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

    public FlavorLink withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 快捷链接类型，当前接口未使用，缺省值为null。
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
        FlavorLink flavorLink = (FlavorLink) o;
        return Objects.equals(this.href, flavorLink.href) &&
            Objects.equals(this.rel, flavorLink.rel) &&
            Objects.equals(this.type, flavorLink.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(href, rel, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorLink {\n");
            sb.append("    href: ").append(toIndentedString(href)).append("\n");
            sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

