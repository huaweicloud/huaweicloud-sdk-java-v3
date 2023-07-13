package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RealtimeScaleDimensionValue
 */
public class RealtimeScaleDimensionValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension")

    private String dimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "online_users")

    private Long onlineUsers;

    public RealtimeScaleDimensionValue withDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * 维度值，如查询维度为region，则此处取值可能为GD 
     * @return dimension
     */
    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public RealtimeScaleDimensionValue withOnlineUsers(Long onlineUsers) {
        this.onlineUsers = onlineUsers;
        return this;
    }

    /**
     * 在线观众数
     * minimum: 0
     * maximum: 1844674407
     * @return onlineUsers
     */
    public Long getOnlineUsers() {
        return onlineUsers;
    }

    public void setOnlineUsers(Long onlineUsers) {
        this.onlineUsers = onlineUsers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealtimeScaleDimensionValue that = (RealtimeScaleDimensionValue) obj;
        return Objects.equals(this.dimension, that.dimension) && Objects.equals(this.onlineUsers, that.onlineUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimension, onlineUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeScaleDimensionValue {\n");
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    onlineUsers: ").append(toIndentedString(onlineUsers)).append("\n");
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
