package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FlavorLink
 */
public class FlavorLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private String rel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hrel")

    private String hrel;

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

    public FlavorLink withHrel(String hrel) {
        this.hrel = hrel;
        return this;
    }

    /**
     * 对应快捷链接。
     * @return hrel
     */
    public String getHrel() {
        return hrel;
    }

    public void setHrel(String hrel) {
        this.hrel = hrel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlavorLink that = (FlavorLink) obj;
        return Objects.equals(this.rel, that.rel) && Objects.equals(this.hrel, that.hrel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rel, hrel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlavorLink {\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
        sb.append("    hrel: ").append(toIndentedString(hrel)).append("\n");
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
