package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 增加磁盘请求。
 */
public class AddDesktopsVolumesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addDesktopVolumesReq")

    private List<AddDesktopVolumesReq> addDesktopVolumesReq = null;

    public AddDesktopsVolumesReq withAddDesktopVolumesReq(List<AddDesktopVolumesReq> addDesktopVolumesReq) {
        this.addDesktopVolumesReq = addDesktopVolumesReq;
        return this;
    }

    public AddDesktopsVolumesReq addAddDesktopVolumesReqItem(AddDesktopVolumesReq addDesktopVolumesReqItem) {
        if (this.addDesktopVolumesReq == null) {
            this.addDesktopVolumesReq = new ArrayList<>();
        }
        this.addDesktopVolumesReq.add(addDesktopVolumesReqItem);
        return this;
    }

    public AddDesktopsVolumesReq withAddDesktopVolumesReq(
        Consumer<List<AddDesktopVolumesReq>> addDesktopVolumesReqSetter) {
        if (this.addDesktopVolumesReq == null) {
            this.addDesktopVolumesReq = new ArrayList<>();
        }
        addDesktopVolumesReqSetter.accept(this.addDesktopVolumesReq);
        return this;
    }

    /**
     * 新增磁盘参数。
     * @return addDesktopVolumesReq
     */
    public List<AddDesktopVolumesReq> getAddDesktopVolumesReq() {
        return addDesktopVolumesReq;
    }

    public void setAddDesktopVolumesReq(List<AddDesktopVolumesReq> addDesktopVolumesReq) {
        this.addDesktopVolumesReq = addDesktopVolumesReq;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddDesktopsVolumesReq addDesktopsVolumesReq = (AddDesktopsVolumesReq) o;
        return Objects.equals(this.addDesktopVolumesReq, addDesktopsVolumesReq.addDesktopVolumesReq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addDesktopVolumesReq);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddDesktopsVolumesReq {\n");
        sb.append("    addDesktopVolumesReq: ").append(toIndentedString(addDesktopVolumesReq)).append("\n");
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
