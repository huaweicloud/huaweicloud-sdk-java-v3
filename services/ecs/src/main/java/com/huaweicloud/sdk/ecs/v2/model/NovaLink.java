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
 *  
 */
public class NovaLink  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="href")
    
    private String href;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rel")
    
    private String rel;

    public NovaLink withHref(String href) {
        this.href = href;
        return this;
    }

    


    /**
     * 相应资源的链接。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public NovaLink withRel(String rel) {
        this.rel = rel;
        return this;
    }

    


    /**
     * 有三种取值。self：自助链接包含版本链接的资源。立即链接后使用这些链接。bookmark：书签链接提供了一个永久资源的永久链接，该链接适合于长期存储。alternate：备用链接可以包含资源的替换表示形式。例如，OpenStack计算映像可能在OpenStack映像服务中有一个替代表示。
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
        NovaLink novaLink = (NovaLink) o;
        return Objects.equals(this.href, novaLink.href) &&
            Objects.equals(this.rel, novaLink.rel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaLink {\n");
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

