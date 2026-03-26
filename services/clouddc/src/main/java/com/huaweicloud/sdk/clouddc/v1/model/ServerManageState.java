package com.huaweicloud.sdk.clouddc.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 服务器的生命周期状态及对应的数量 **约束限制**： 格式为key: value state(生命周期状态): count(当前生命周期状态的服务器数量) 
 */
public class ServerManageState {

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
        sb.append("class ServerManageState {\n");
        sb.append("}");
        return sb.toString();
    }

}
