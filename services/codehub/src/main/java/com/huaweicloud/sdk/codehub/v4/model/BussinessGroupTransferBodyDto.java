package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 移交代码组
 */
public class BussinessGroupTransferBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private Integer ownerId;

    public BussinessGroupTransferBodyDto withOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 移交目标用户id
     * minimum: 1
     * maximum: 2147483647
     * @return ownerId
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BussinessGroupTransferBodyDto that = (BussinessGroupTransferBodyDto) obj;
        return Objects.equals(this.ownerId, that.ownerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BussinessGroupTransferBodyDto {\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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
