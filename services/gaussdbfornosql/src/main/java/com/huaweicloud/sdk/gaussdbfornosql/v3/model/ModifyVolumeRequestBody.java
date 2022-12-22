package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyVolumeRequestBody
 */
public class ModifyVolumeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    public ModifyVolumeRequestBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 待变更到的磁盘容量。单位GB，取值为整数。 扩容场景下，必须大于当前磁盘容量。 缩容场景下，必须大于已用量的125%，向上取整。 磁盘容量的上下限与所选引擎类型以及规格相关。   - [GaussDB(for Cassandra)请参见[数据库实例规格](https://support.huaweicloud.com/cassandraug-nosql/nosql_05_0017.html)。](tag:hc)   - [GaussDB(for Cassandra)请参见[数据库实例规格。](https://support.huaweicloud.com/intl/zh-cn/cassandraug-nosql/nosql_05_0017.html)](tag:hk)   - [GaussDB(for Redis)请参见[数据库实例规格。](https://support.huaweicloud.com/redisug-nosql/nosql_05_0059.html)](tag:hc)   - [GaussDB(for Redis)请参见[数据库实例规格。](https://support.huaweicloud.com/intl/zh-cn/redisug-nosql/nosql_05_0059.html)](tag:hk)
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ModifyVolumeRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 扩容包年包月实例存储容量时可指定，表示是否自动从账户中支付，此字段不影响自动续订的支付方式。   - true，表示自动从账户中支付。   - false，表示手动从账户中支付，默认为该方式。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyVolumeRequestBody modifyVolumeRequestBody = (ModifyVolumeRequestBody) o;
        return Objects.equals(this.size, modifyVolumeRequestBody.size)
            && Objects.equals(this.isAutoPay, modifyVolumeRequestBody.isAutoPay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, isAutoPay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyVolumeRequestBody {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
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
