package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩副本请求体
 */
public class ExpandGraphReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expand")

    private ExpandGraphReqExpand expand;

    public ExpandGraphReq withExpand(ExpandGraphReqExpand expand) {
        this.expand = expand;
        return this;
    }

    public ExpandGraphReq withExpand(Consumer<ExpandGraphReqExpand> expandSetter) {
        if (this.expand == null) {
            this.expand = new ExpandGraphReqExpand();
            expandSetter.accept(this.expand);
        }

        return this;
    }

    /**
     * Get expand
     * @return expand
     */
    public ExpandGraphReqExpand getExpand() {
        return expand;
    }

    public void setExpand(ExpandGraphReqExpand expand) {
        this.expand = expand;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandGraphReq that = (ExpandGraphReq) obj;
        return Objects.equals(this.expand, that.expand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandGraphReq {\n");
        sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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
