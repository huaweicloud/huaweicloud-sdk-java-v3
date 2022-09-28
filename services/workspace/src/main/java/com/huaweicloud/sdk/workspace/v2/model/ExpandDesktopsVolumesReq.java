package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩容磁盘请求。
 */
public class ExpandDesktopsVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expandVolumesReq")

    private List<ExpandVolumesReq> expandVolumesReq = null;

    public ExpandDesktopsVolumesReq withExpandVolumesReq(List<ExpandVolumesReq> expandVolumesReq) {
        this.expandVolumesReq = expandVolumesReq;
        return this;
    }

    public ExpandDesktopsVolumesReq addExpandVolumesReqItem(ExpandVolumesReq expandVolumesReqItem) {
        if (this.expandVolumesReq == null) {
            this.expandVolumesReq = new ArrayList<>();
        }
        this.expandVolumesReq.add(expandVolumesReqItem);
        return this;
    }

    public ExpandDesktopsVolumesReq withExpandVolumesReq(Consumer<List<ExpandVolumesReq>> expandVolumesReqSetter) {
        if (this.expandVolumesReq == null) {
            this.expandVolumesReq = new ArrayList<>();
        }
        expandVolumesReqSetter.accept(this.expandVolumesReq);
        return this;
    }

    /**
     * 扩容磁盘参数。
     * @return expandVolumesReq
     */
    public List<ExpandVolumesReq> getExpandVolumesReq() {
        return expandVolumesReq;
    }

    public void setExpandVolumesReq(List<ExpandVolumesReq> expandVolumesReq) {
        this.expandVolumesReq = expandVolumesReq;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandDesktopsVolumesReq expandDesktopsVolumesReq = (ExpandDesktopsVolumesReq) o;
        return Objects.equals(this.expandVolumesReq, expandDesktopsVolumesReq.expandVolumesReq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expandVolumesReq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandDesktopsVolumesReq {\n");
        sb.append("    expandVolumesReq: ").append(toIndentedString(expandVolumesReq)).append("\n");
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
