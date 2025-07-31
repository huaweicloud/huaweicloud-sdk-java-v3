package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListClusterProtectOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_num")

    private Integer clusterNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "under_protect_num")

    private Integer underProtectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_num")

    private Integer policyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_num")

    private Integer eventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_num")

    private Integer blockNum;

    public ListClusterProtectOverviewResponse withClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    /**
     * 集群数量
     * minimum: 0
     * maximum: 2147483647
     * @return clusterNum
     */
    public Integer getClusterNum() {
        return clusterNum;
    }

    public void setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
    }

    public ListClusterProtectOverviewResponse withUnderProtectNum(Integer underProtectNum) {
        this.underProtectNum = underProtectNum;
        return this;
    }

    /**
     * 防护中数量
     * minimum: 0
     * maximum: 2147483647
     * @return underProtectNum
     */
    public Integer getUnderProtectNum() {
        return underProtectNum;
    }

    public void setUnderProtectNum(Integer underProtectNum) {
        this.underProtectNum = underProtectNum;
    }

    public ListClusterProtectOverviewResponse withPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
        return this;
    }

    /**
     * 策略数量
     * minimum: 0
     * maximum: 2147483647
     * @return policyNum
     */
    public Integer getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(Integer policyNum) {
        this.policyNum = policyNum;
    }

    public ListClusterProtectOverviewResponse withEventNum(Integer eventNum) {
        this.eventNum = eventNum;
        return this;
    }

    /**
     * 事件数量
     * minimum: 0
     * maximum: 2147483647
     * @return eventNum
     */
    public Integer getEventNum() {
        return eventNum;
    }

    public void setEventNum(Integer eventNum) {
        this.eventNum = eventNum;
    }

    public ListClusterProtectOverviewResponse withBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
        return this;
    }

    /**
     * 已阻断事件数量
     * minimum: 0
     * maximum: 2147483647
     * @return blockNum
     */
    public Integer getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClusterProtectOverviewResponse that = (ListClusterProtectOverviewResponse) obj;
        return Objects.equals(this.clusterNum, that.clusterNum)
            && Objects.equals(this.underProtectNum, that.underProtectNum)
            && Objects.equals(this.policyNum, that.policyNum) && Objects.equals(this.eventNum, that.eventNum)
            && Objects.equals(this.blockNum, that.blockNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterNum, underProtectNum, policyNum, eventNum, blockNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterProtectOverviewResponse {\n");
        sb.append("    clusterNum: ").append(toIndentedString(clusterNum)).append("\n");
        sb.append("    underProtectNum: ").append(toIndentedString(underProtectNum)).append("\n");
        sb.append("    policyNum: ").append(toIndentedString(policyNum)).append("\n");
        sb.append("    eventNum: ").append(toIndentedString(eventNum)).append("\n");
        sb.append("    blockNum: ").append(toIndentedString(blockNum)).append("\n");
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
