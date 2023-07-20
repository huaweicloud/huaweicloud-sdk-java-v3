package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享带宽批量加入弹性公网IP请求参数
 */
public class BatchAttachSharebwReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<BatchAttachSharebwDict> publicips = null;

    public BatchAttachSharebwReq withPublicips(List<BatchAttachSharebwDict> publicips) {
        this.publicips = publicips;
        return this;
    }

    public BatchAttachSharebwReq addPublicipsItem(BatchAttachSharebwDict publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public BatchAttachSharebwReq withPublicips(Consumer<List<BatchAttachSharebwDict>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * - 功能说明：共享带宽数据 - 约束：共享带宽批量加入多个弹性公网IP时，请求参数publicips中的bandwidth_id必须为同一个共享带宽的id
     * @return publicips
     */
    public List<BatchAttachSharebwDict> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<BatchAttachSharebwDict> publicips) {
        this.publicips = publicips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAttachSharebwReq that = (BatchAttachSharebwReq) obj;
        return Objects.equals(this.publicips, that.publicips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAttachSharebwReq {\n");
        sb.append("    publicips: ").append(toIndentedString(publicips)).append("\n");
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
