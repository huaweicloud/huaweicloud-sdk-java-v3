package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;

/**
 * ProvisionedThroughput
 */
public class ProvisionedThroughput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rcu")
    @BsonProperty(value = "rcu")

    private Long rcu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wcu")
    @BsonProperty(value = "wcu")

    private Long wcu;

    public ProvisionedThroughput withRcu(Long rcu) {
        this.rcu = rcu;
        return this;
    }

    /**
     * 预置表级读请求单元数
     * @return rcu
     */
    public Long getRcu() {
        return rcu;
    }

    public void setRcu(Long rcu) {
        this.rcu = rcu;
    }

    public ProvisionedThroughput withWcu(Long wcu) {
        this.wcu = wcu;
        return this;
    }

    /**
     * 预置表级写请求单元数
     * @return wcu
     */
    public Long getWcu() {
        return wcu;
    }

    public void setWcu(Long wcu) {
        this.wcu = wcu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProvisionedThroughput that = (ProvisionedThroughput) obj;
        return Objects.equals(this.rcu, that.rcu) && Objects.equals(this.wcu, that.wcu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rcu, wcu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvisionedThroughput {\n");
        sb.append("    rcu: ").append(toIndentedString(rcu)).append("\n");
        sb.append("    wcu: ").append(toIndentedString(wcu)).append("\n");
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
