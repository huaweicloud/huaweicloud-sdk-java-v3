package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetWtpProtectionStatusRequestInfo
 */
public class SetWtpProtectionStatusRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_mode")

    private Integer paymentMode;

    public SetWtpProtectionStatusRequestInfo withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 开启关闭状态
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public SetWtpProtectionStatusRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public SetWtpProtectionStatusRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public SetWtpProtectionStatusRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * HostId list
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public SetWtpProtectionStatusRequestInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SetWtpProtectionStatusRequestInfo withPaymentMode(Integer paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    /**
     * 随机选择配额还是指定资源
     * minimum: 0
     * maximum: 100
     * @return paymentMode
     */
    public Integer getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(Integer paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetWtpProtectionStatusRequestInfo setWtpProtectionStatusRequestInfo = (SetWtpProtectionStatusRequestInfo) o;
        return Objects.equals(this.status, setWtpProtectionStatusRequestInfo.status)
            && Objects.equals(this.hostIdList, setWtpProtectionStatusRequestInfo.hostIdList)
            && Objects.equals(this.resourceId, setWtpProtectionStatusRequestInfo.resourceId)
            && Objects.equals(this.paymentMode, setWtpProtectionStatusRequestInfo.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, hostIdList, resourceId, paymentMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetWtpProtectionStatusRequestInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
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
