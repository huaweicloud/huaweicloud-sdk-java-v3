package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * FgacUpdateReq
 */
public class FgacUpdateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fgac_ids")

    private List<FgacSingleUpdateReq> fgacIds = null;

    public FgacUpdateReq withFgacIds(List<FgacSingleUpdateReq> fgacIds) {
        this.fgacIds = fgacIds;
        return this;
    }

    public FgacUpdateReq addFgacIdsItem(FgacSingleUpdateReq fgacIdsItem) {
        if (this.fgacIds == null) {
            this.fgacIds = new ArrayList<>();
        }
        this.fgacIds.add(fgacIdsItem);
        return this;
    }

    public FgacUpdateReq withFgacIds(Consumer<List<FgacSingleUpdateReq>> fgacIdsSetter) {
        if (this.fgacIds == null) {
            this.fgacIds = new ArrayList<>();
        }
        fgacIdsSetter.accept(this.fgacIds);
        return this;
    }

    /**
     * 细粒度认证数据开发连接列表
     * @return fgacIds
     */
    public List<FgacSingleUpdateReq> getFgacIds() {
        return fgacIds;
    }

    public void setFgacIds(List<FgacSingleUpdateReq> fgacIds) {
        this.fgacIds = fgacIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FgacUpdateReq that = (FgacUpdateReq) obj;
        return Objects.equals(this.fgacIds, that.fgacIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fgacIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FgacUpdateReq {\n");
        sb.append("    fgacIds: ").append(toIndentedString(fgacIds)).append("\n");
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
