package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库基本设置信息体，当源库或者目标库在特定场景下需要额外设置时填写。例如： - 实时迁移入云场景：云数据库（RDS for MySQL）、云数据库 GaussDB(for MySQL) 主备版作为目标库（target_endpoint）时，需要设置“只读”或者“读写”（is_target_readonly)。 - 实时迁移入云场景：分布式数据库中间件DDM作为目标库，源库为MySQL分库分表时，需要设置“端数据库实例个数”。 - 实时迁移入云场景：MongoDB作为源库时，需要设置“源数据库实例类型”为非集群、集群或者集群(MongoDB 4.0+)，并且实例类型为“集群”时，还需要设置“源端分片个数”（source_shard_num)。 - 实时灾备场景：单主灾备且本云为备时，云数据库（RDS for MySQL）、云数据库 GaussDB(for MySQL) 主备版、分布式数据库中间件DDM、文档数据库服务DDS等作为目标库（target_endpoint）时，需要设置“只读”或者“读写”（is_target_readonly)。 - 实时灾备场景：云数据库GaussDB(for Cassandra) 灾备时，需要设置“是否迁移TTL”，如果参数为true时，还需要设置TTL列名。
 */
public class BaseEndpointConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_target_readonly")

    private Boolean isTargetReadonly;

    public BaseEndpointConfig withIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
        return this;
    }

    /**
     * 目标实例是否设置为为只读。 - MySQL迁移和灾备，且job_direction为up时设置有效。（灾备场景下，单主灾备且本云为备为必填且为true，不填默认设置为true）。
     * @return isTargetReadonly
     */
    public Boolean getIsTargetReadonly() {
        return isTargetReadonly;
    }

    public void setIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseEndpointConfig baseEndpointConfig = (BaseEndpointConfig) o;
        return Objects.equals(this.isTargetReadonly, baseEndpointConfig.isTargetReadonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTargetReadonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseEndpointConfig {\n");
        sb.append("    isTargetReadonly: ").append(toIndentedString(isTargetReadonly)).append("\n");
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
