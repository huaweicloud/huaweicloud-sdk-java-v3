package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 共享带宽批量移出弹性公网IP请求参数
 */
public class DetachBatchSharedbwReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicips")

    private List<DetachBatchSharedbwReqPublicips> publicips = null;

    public DetachBatchSharedbwReq withPublicips(List<DetachBatchSharedbwReqPublicips> publicips) {
        this.publicips = publicips;
        return this;
    }

    public DetachBatchSharedbwReq addPublicipsItem(DetachBatchSharedbwReqPublicips publicipsItem) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        this.publicips.add(publicipsItem);
        return this;
    }

    public DetachBatchSharedbwReq withPublicips(Consumer<List<DetachBatchSharedbwReqPublicips>> publicipsSetter) {
        if (this.publicips == null) {
            this.publicips = new ArrayList<>();
        }
        publicipsSetter.accept(this.publicips);
        return this;
    }

    /**
     * 共享带宽批量移出弹性公网IP请求对象
     * @return publicips
     */
    public List<DetachBatchSharedbwReqPublicips> getPublicips() {
        return publicips;
    }

    public void setPublicips(List<DetachBatchSharedbwReqPublicips> publicips) {
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
        DetachBatchSharedbwReq that = (DetachBatchSharedbwReq) obj;
        return Objects.equals(this.publicips, that.publicips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachBatchSharedbwReq {\n");
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
