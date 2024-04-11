package com.huaweicloud.sdk.dataartsstudio.v1.model;

import java.util.Objects;

/**
 * 数据连接类型，对应表所在的数仓类型，取值可以为DLI、DWS、MRS_HIVE、POSTGRESQL、MRS_SPARK、CLICKHOUSE、MYSQL、ORACLE和DORIS等。
 */
public class DwType {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DwType {\n");
        sb.append("}");
        return sb.toString();
    }

}
