package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangeChargeModeBody
 */
public class ChangeChargeModeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id_list")

    private List<String> instanceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore_type")

    private String datastoreType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_mode")

    private Boolean paymentMode;

    public ChangeChargeModeBody withInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public ChangeChargeModeBody addInstanceIdListItem(String instanceIdListItem) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        this.instanceIdList.add(instanceIdListItem);
        return this;
    }

    public ChangeChargeModeBody withInstanceIdList(Consumer<List<String>> instanceIdListSetter) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        instanceIdListSetter.accept(this.instanceIdList);
        return this;
    }

    /**
     * 实例ID列表
     * @return instanceIdList
     */
    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public void setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
    }

    public ChangeChargeModeBody withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    /**
     * 引擎类型
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ChangeChargeModeBody withPaymentMode(Boolean paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    /**
     * true: 设置为付费, false: 设置为免费
     * @return paymentMode
     */
    public Boolean getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(Boolean paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeChargeModeBody that = (ChangeChargeModeBody) obj;
        return Objects.equals(this.instanceIdList, that.instanceIdList)
            && Objects.equals(this.datastoreType, that.datastoreType)
            && Objects.equals(this.paymentMode, that.paymentMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIdList, datastoreType, paymentMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeChargeModeBody {\n");
        sb.append("    instanceIdList: ").append(toIndentedString(instanceIdList)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
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
