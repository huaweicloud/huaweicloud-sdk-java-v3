package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接数限制列表
 */
public class CleanLimitDict {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cleaning_access_pos_id")

    private Long cleaningAccessPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_connection_limited")

    private Long newConnectionLimited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_connection_limited")

    private Long totalConnectionLimited;

    public CleanLimitDict withCleaningAccessPosId(Long cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
        return this;
    }

    /**
     * 清洗时访问限制分段ID
     * @return cleaningAccessPosId
     */
    public Long getCleaningAccessPosId() {
        return cleaningAccessPosId;
    }

    public void setCleaningAccessPosId(Long cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
    }

    public CleanLimitDict withNewConnectionLimited(Long newConnectionLimited) {
        this.newConnectionLimited = newConnectionLimited;
        return this;
    }

    /**
     * 单一源IP新建连接个数
     * @return newConnectionLimited
     */
    public Long getNewConnectionLimited() {
        return newConnectionLimited;
    }

    public void setNewConnectionLimited(Long newConnectionLimited) {
        this.newConnectionLimited = newConnectionLimited;
    }

    public CleanLimitDict withTotalConnectionLimited(Long totalConnectionLimited) {
        this.totalConnectionLimited = totalConnectionLimited;
        return this;
    }

    /**
     * 单一源IP连接数总个数
     * @return totalConnectionLimited
     */
    public Long getTotalConnectionLimited() {
        return totalConnectionLimited;
    }

    public void setTotalConnectionLimited(Long totalConnectionLimited) {
        this.totalConnectionLimited = totalConnectionLimited;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CleanLimitDict that = (CleanLimitDict) obj;
        return Objects.equals(this.cleaningAccessPosId, that.cleaningAccessPosId)
            && Objects.equals(this.newConnectionLimited, that.newConnectionLimited)
            && Objects.equals(this.totalConnectionLimited, that.totalConnectionLimited);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cleaningAccessPosId, newConnectionLimited, totalConnectionLimited);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CleanLimitDict {\n");
        sb.append("    cleaningAccessPosId: ").append(toIndentedString(cleaningAccessPosId)).append("\n");
        sb.append("    newConnectionLimited: ").append(toIndentedString(newConnectionLimited)).append("\n");
        sb.append("    totalConnectionLimited: ").append(toIndentedString(totalConnectionLimited)).append("\n");
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
