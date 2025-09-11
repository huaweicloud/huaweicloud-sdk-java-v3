package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSessionOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_num")

    private String activeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private String totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql_num")

    private String slowSqlNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_num")

    private String lockNum;

    public ShowSessionOverviewResponse withActiveNum(String activeNum) {
        this.activeNum = activeNum;
        return this;
    }

    /**
     * **参数解释**: 实时会话的活跃会话数。 **取值范围**: 不涉及。
     * @return activeNum
     */
    public String getActiveNum() {
        return activeNum;
    }

    public void setActiveNum(String activeNum) {
        this.activeNum = activeNum;
    }

    public ShowSessionOverviewResponse withTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * **参数解释**: 实时会话的总会话数。 **取值范围**: 不涉及。
     * @return totalNum
     */
    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public ShowSessionOverviewResponse withSlowSqlNum(String slowSqlNum) {
        this.slowSqlNum = slowSqlNum;
        return this;
    }

    /**
     * **参数解释**: 实时会话中的慢SQL数量。 **取值范围**: 不涉及。
     * @return slowSqlNum
     */
    public String getSlowSqlNum() {
        return slowSqlNum;
    }

    public void setSlowSqlNum(String slowSqlNum) {
        this.slowSqlNum = slowSqlNum;
    }

    public ShowSessionOverviewResponse withLockNum(String lockNum) {
        this.lockNum = lockNum;
        return this;
    }

    /**
     * **参数解释**: 实时会话中的锁等会话数。 **取值范围**: 不涉及。
     * @return lockNum
     */
    public String getLockNum() {
        return lockNum;
    }

    public void setLockNum(String lockNum) {
        this.lockNum = lockNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSessionOverviewResponse that = (ShowSessionOverviewResponse) obj;
        return Objects.equals(this.activeNum, that.activeNum) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.slowSqlNum, that.slowSqlNum) && Objects.equals(this.lockNum, that.lockNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeNum, totalNum, slowSqlNum, lockNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSessionOverviewResponse {\n");
        sb.append("    activeNum: ").append(toIndentedString(activeNum)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    slowSqlNum: ").append(toIndentedString(slowSqlNum)).append("\n");
        sb.append("    lockNum: ").append(toIndentedString(lockNum)).append("\n");
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
