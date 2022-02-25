package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ShrinkClusterReq */
public class ShrinkClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrink")

    private List<ShrinkNodeReq> shrink = null;

    public ShrinkClusterReq withShrink(List<ShrinkNodeReq> shrink) {
        this.shrink = shrink;
        return this;
    }

    public ShrinkClusterReq addShrinkItem(ShrinkNodeReq shrinkItem) {
        if (this.shrink == null) {
            this.shrink = new ArrayList<>();
        }
        this.shrink.add(shrinkItem);
        return this;
    }

    public ShrinkClusterReq withShrink(Consumer<List<ShrinkNodeReq>> shrinkSetter) {
        if (this.shrink == null) {
            this.shrink = new ArrayList<>();
        }
        shrinkSetter.accept(this.shrink);
        return this;
    }

    /** 需要缩容的节点类型和数量集合。
     * 
     * @return shrink */
    public List<ShrinkNodeReq> getShrink() {
        return shrink;
    }

    public void setShrink(List<ShrinkNodeReq> shrink) {
        this.shrink = shrink;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShrinkClusterReq shrinkClusterReq = (ShrinkClusterReq) o;
        return Objects.equals(this.shrink, shrinkClusterReq.shrink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shrink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkClusterReq {\n");
        sb.append("    shrink: ").append(toIndentedString(shrink)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
