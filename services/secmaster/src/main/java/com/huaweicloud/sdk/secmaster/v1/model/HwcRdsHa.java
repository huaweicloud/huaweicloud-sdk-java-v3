package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 备机同步参数
 */
public class HwcRdsHa {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_mode")

    private String replicationMode;

    public HwcRdsHa withReplicationMode(String replicationMode) {
        this.replicationMode = replicationMode;
        return this;
    }

    /**
     * 备机同步参数。  取值：非空。  RDS for MySQL为“async”或“semisync”。 RDS for PostgreSQL为“async”或“sync”。 RDS for Microsoft SQL Server为“sync”。 说明： “async”为异步模式。 “semisync”为半同步模式。 “sync”为同步模式。
     * @return replicationMode
     */
    public String getReplicationMode() {
        return replicationMode;
    }

    public void setReplicationMode(String replicationMode) {
        this.replicationMode = replicationMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcRdsHa that = (HwcRdsHa) obj;
        return Objects.equals(this.replicationMode, that.replicationMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(replicationMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcRdsHa {\n");
        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
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
