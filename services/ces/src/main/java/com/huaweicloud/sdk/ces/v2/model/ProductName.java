package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 产品层级跨纬规则创建时需要指明的规则产品名称，一般由\&quot;服务命名空间,服务首层维度名称\&quot;组成，如\&quot;SYS.ECS,instance_id\&quot;
 */
public class ProductName {

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
        sb.append("class ProductName {\n");
        sb.append("}");
        return sb.toString();
    }

}
