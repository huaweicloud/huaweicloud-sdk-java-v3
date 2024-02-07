package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 开启或关闭新增节点自动加入该Proxy请求体。
 */
public class UpdateNewNodeAutoAddSwitchRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private String switchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    public UpdateNewNodeAutoAddSwitchRequestBody withSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * 是否开启新增节点自动加入该Proxy。  取值范围： - ON：开启。 - OFF：关闭。
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    public UpdateNewNodeAutoAddSwitchRequestBody withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 新增节点的读权重：  - 新增节点自动加入为ON，取值为0~1000。 - 新增节点自动加入为OFF，则可不输入读权重。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNewNodeAutoAddSwitchRequestBody that = (UpdateNewNodeAutoAddSwitchRequestBody) obj;
        return Objects.equals(this.switchStatus, that.switchStatus) && Objects.equals(this.weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchStatus, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNewNodeAutoAddSwitchRequestBody {\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
