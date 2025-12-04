package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowKafkaProductCoresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "core_num")

    private Integer coreNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_extend_storage_space")

    private Integer totalExtendStorageSpace;

    public ShowKafkaProductCoresResponse withCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
        return this;
    }

    /**
     * **参数解释**： 核数。 **取值范围**： 不涉及。
     * @return coreNum
     */
    public Integer getCoreNum() {
        return coreNum;
    }

    public void setCoreNum(Integer coreNum) {
        this.coreNum = coreNum;
    }

    public ShowKafkaProductCoresResponse withTotalExtendStorageSpace(Integer totalExtendStorageSpace) {
        this.totalExtendStorageSpace = totalExtendStorageSpace;
        return this;
    }

    /**
     * **参数解释**： 需要扩容的存储空间。 **取值范围**： 不涉及。
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
        ShowKafkaProductCoresResponse that = (ShowKafkaProductCoresResponse) obj;
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
        sb.append("class ShowKafkaProductCoresResponse {\n");
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
