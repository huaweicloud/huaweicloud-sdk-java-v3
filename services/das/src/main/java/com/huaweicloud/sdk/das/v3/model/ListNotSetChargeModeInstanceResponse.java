package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNotSetChargeModeInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_list")

    private List<InstanceSimpleDto> instanceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_status")

    private Integer quotaStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_num")

    private Integer quotaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_num")

    private Integer usedNum;

    public ListNotSetChargeModeInstanceResponse withInstanceList(List<InstanceSimpleDto> instanceList) {
        this.instanceList = instanceList;
        return this;
    }

    public ListNotSetChargeModeInstanceResponse addInstanceListItem(InstanceSimpleDto instanceListItem) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        this.instanceList.add(instanceListItem);
        return this;
    }

    public ListNotSetChargeModeInstanceResponse withInstanceList(Consumer<List<InstanceSimpleDto>> instanceListSetter) {
        if (this.instanceList == null) {
            this.instanceList = new ArrayList<>();
        }
        instanceListSetter.accept(this.instanceList);
        return this;
    }

    /**
     * 实例列表
     * @return instanceList
     */
    public List<InstanceSimpleDto> getInstanceList() {
        return instanceList;
    }

    public void setInstanceList(List<InstanceSimpleDto> instanceList) {
        this.instanceList = instanceList;
    }

    public ListNotSetChargeModeInstanceResponse withQuotaStatus(Integer quotaStatus) {
        this.quotaStatus = quotaStatus;
        return this;
    }

    /**
     * 付费状态。取值范围：0（免费实例）、1（付费实例）
     * @return quotaStatus
     */
    public Integer getQuotaStatus() {
        return quotaStatus;
    }

    public void setQuotaStatus(Integer quotaStatus) {
        this.quotaStatus = quotaStatus;
    }

    public ListNotSetChargeModeInstanceResponse withQuotaNum(Integer quotaNum) {
        this.quotaNum = quotaNum;
        return this;
    }

    /**
     * 开通配额总数
     * @return quotaNum
     */
    public Integer getQuotaNum() {
        return quotaNum;
    }

    public void setQuotaNum(Integer quotaNum) {
        this.quotaNum = quotaNum;
    }

    public ListNotSetChargeModeInstanceResponse withUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
        return this;
    }

    /**
     * 已使用配额数量
     * @return usedNum
     */
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotSetChargeModeInstanceResponse that = (ListNotSetChargeModeInstanceResponse) obj;
        return Objects.equals(this.instanceList, that.instanceList)
            && Objects.equals(this.quotaStatus, that.quotaStatus) && Objects.equals(this.quotaNum, that.quotaNum)
            && Objects.equals(this.usedNum, that.usedNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceList, quotaStatus, quotaNum, usedNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotSetChargeModeInstanceResponse {\n");
        sb.append("    instanceList: ").append(toIndentedString(instanceList)).append("\n");
        sb.append("    quotaStatus: ").append(toIndentedString(quotaStatus)).append("\n");
        sb.append("    quotaNum: ").append(toIndentedString(quotaNum)).append("\n");
        sb.append("    usedNum: ").append(toIndentedString(usedNum)).append("\n");
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
