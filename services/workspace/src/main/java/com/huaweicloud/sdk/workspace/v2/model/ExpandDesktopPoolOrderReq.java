package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 扩容桌面池请求。
 */
public class ExpandDesktopPoolOrderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    public ExpandDesktopPoolOrderReq withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 扩容桌面池的大小。
     * minimum: 1
     * maximum: 1000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ExpandDesktopPoolOrderReq withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 要扩容的桌面池ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExpandDesktopPoolOrderReq that = (ExpandDesktopPoolOrderReq) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.poolId, that.poolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, poolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandDesktopPoolOrderReq {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
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
