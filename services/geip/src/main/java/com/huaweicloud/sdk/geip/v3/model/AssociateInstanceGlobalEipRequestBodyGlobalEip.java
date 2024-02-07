package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 绑定后端实例请求体对象
 */
public class AssociateInstanceGlobalEipRequestBodyGlobalEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_info")

    private AssociateInstanceGlobalEipRequestBodyGlobalEipAssociateInstanceInfo associateInstanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gc_bandwidth_info")

    private AssociateInstanceGlobalEipRequestBodyGlobalEipGcBandwidthInfo gcBandwidthInfo;

    public AssociateInstanceGlobalEipRequestBodyGlobalEip withAssociateInstanceInfo(
        AssociateInstanceGlobalEipRequestBodyGlobalEipAssociateInstanceInfo associateInstanceInfo) {
        this.associateInstanceInfo = associateInstanceInfo;
        return this;
    }

    public AssociateInstanceGlobalEipRequestBodyGlobalEip withAssociateInstanceInfo(
        Consumer<AssociateInstanceGlobalEipRequestBodyGlobalEipAssociateInstanceInfo> associateInstanceInfoSetter) {
        if (this.associateInstanceInfo == null) {
            this.associateInstanceInfo = new AssociateInstanceGlobalEipRequestBodyGlobalEipAssociateInstanceInfo();
            associateInstanceInfoSetter.accept(this.associateInstanceInfo);
        }

        return this;
    }

    /**
     * Get associateInstanceInfo
     * @return associateInstanceInfo
     */
    public AssociateInstanceGlobalEipRequestBodyGlobalEipAssociateInstanceInfo getAssociateInstanceInfo() {
        return associateInstanceInfo;
    }

    public void setAssociateInstanceInfo(
        AssociateInstanceGlobalEipRequestBodyGlobalEipAssociateInstanceInfo associateInstanceInfo) {
        this.associateInstanceInfo = associateInstanceInfo;
    }

    public AssociateInstanceGlobalEipRequestBodyGlobalEip withGcBandwidthInfo(
        AssociateInstanceGlobalEipRequestBodyGlobalEipGcBandwidthInfo gcBandwidthInfo) {
        this.gcBandwidthInfo = gcBandwidthInfo;
        return this;
    }

    public AssociateInstanceGlobalEipRequestBodyGlobalEip withGcBandwidthInfo(
        Consumer<AssociateInstanceGlobalEipRequestBodyGlobalEipGcBandwidthInfo> gcBandwidthInfoSetter) {
        if (this.gcBandwidthInfo == null) {
            this.gcBandwidthInfo = new AssociateInstanceGlobalEipRequestBodyGlobalEipGcBandwidthInfo();
            gcBandwidthInfoSetter.accept(this.gcBandwidthInfo);
        }

        return this;
    }

    /**
     * Get gcBandwidthInfo
     * @return gcBandwidthInfo
     */
    public AssociateInstanceGlobalEipRequestBodyGlobalEipGcBandwidthInfo getGcBandwidthInfo() {
        return gcBandwidthInfo;
    }

    public void setGcBandwidthInfo(AssociateInstanceGlobalEipRequestBodyGlobalEipGcBandwidthInfo gcBandwidthInfo) {
        this.gcBandwidthInfo = gcBandwidthInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateInstanceGlobalEipRequestBodyGlobalEip that = (AssociateInstanceGlobalEipRequestBodyGlobalEip) obj;
        return Objects.equals(this.associateInstanceInfo, that.associateInstanceInfo)
            && Objects.equals(this.gcBandwidthInfo, that.gcBandwidthInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(associateInstanceInfo, gcBandwidthInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateInstanceGlobalEipRequestBodyGlobalEip {\n");
        sb.append("    associateInstanceInfo: ").append(toIndentedString(associateInstanceInfo)).append("\n");
        sb.append("    gcBandwidthInfo: ").append(toIndentedString(gcBandwidthInfo)).append("\n");
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
