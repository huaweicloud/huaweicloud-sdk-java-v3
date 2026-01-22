package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRocketMqProductCoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_num")

    private Integer coreNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_extend_storage_space")

    private Integer totalExtendStorageSpace;

    public ShowRocketMqProductCoresResponse withCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }

    /**
     * **参数解释**： 核数。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return coreNum
     */
    public Integer getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
    }

    public ShowRocketMqProductCoresResponse withTotalExtendStorageSpace(Integer totalExtendStorageSpace) {
        this.totalExtendStorageSpace = totalExtendStorageSpace;
        return this;
    }

    /**
     * **参数解释**： 预估存储空间，当填写的broker_num小于等于当前实例真实值时，显示为当前实例的存储空间。如果填写的broker_num大于当前实例真实值时，显示为所填写broker_num时实例的预估存储空间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return totalExtendStorageSpace
     */
    public Integer getTotalExtendStorageSpace() {
        return totalExtendStorageSpace;
    }

    public void setTotalExtendStorageSpace(Integer totalExtendStorageSpace) {
        this.totalExtendStorageSpace = totalExtendStorageSpace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRocketMqProductCoresResponse that = (ShowRocketMqProductCoresResponse) obj;
        return Objects.equals(this.coreNum, that.coreNum)
            && Objects.equals(this.totalExtendStorageSpace, that.totalExtendStorageSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coreNum, totalExtendStorageSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRocketMqProductCoresResponse {\n");
        sb.append("    coreNum: ").append(toIndentedString(coreNum)).append("\n");
        sb.append("    totalExtendStorageSpace: ").append(toIndentedString(totalExtendStorageSpace)).append("\n");
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
