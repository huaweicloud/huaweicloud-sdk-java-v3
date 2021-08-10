package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 负载均衡器 */
public class ModifyLb {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lbaas_listener")

    private LbaasListener lbaasListener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener")

    private String listener;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_details")

    private String failedDetails;

    public ModifyLb withLbaasListener(LbaasListener lbaasListener) {
        this.lbaasListener = lbaasListener;
        return this;
    }

    public ModifyLb withLbaasListener(Consumer<LbaasListener> lbaasListenerSetter) {
        if (this.lbaasListener == null) {
            this.lbaasListener = new LbaasListener();
            lbaasListenerSetter.accept(this.lbaasListener);
        }

        return this;
    }

    /** Get lbaasListener
     * 
     * @return lbaasListener */
    public LbaasListener getLbaasListener() {
        return lbaasListener;
    }

    public void setLbaasListener(LbaasListener lbaasListener) {
        this.lbaasListener = lbaasListener;
    }

    public ModifyLb withListener(String listener) {
        this.listener = listener;
        return this;
    }

    /** 经典型负载均衡器信息
     * 
     * @return listener */
    public String getListener() {
        return listener;
    }

    public void setListener(String listener) {
        this.listener = listener;
    }

    public ModifyLb withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /** 负载均衡器迁移失败原因。
     * 
     * @return failedReason */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ModifyLb withFailedDetails(String failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }

    /** 负载均衡器迁移失败详情。
     * 
     * @return failedDetails */
    public String getFailedDetails() {
        return failedDetails;
    }

    public void setFailedDetails(String failedDetails) {
        this.failedDetails = failedDetails;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyLb modifyLb = (ModifyLb) o;
        return Objects.equals(this.lbaasListener, modifyLb.lbaasListener)
            && Objects.equals(this.listener, modifyLb.listener)
            && Objects.equals(this.failedReason, modifyLb.failedReason)
            && Objects.equals(this.failedDetails, modifyLb.failedDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lbaasListener, listener, failedReason, failedDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyLb {\n");
        sb.append("    lbaasListener: ").append(toIndentedString(lbaasListener)).append("\n");
        sb.append("    listener: ").append(toIndentedString(listener)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    failedDetails: ").append(toIndentedString(failedDetails)).append("\n");
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
