package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 用户在页面中选择的指标单位， 用于后续指标数据回显和计算
 */
public class SelectedUnit {

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
        sb.append("class SelectedUnit {\n");
        sb.append("}");
        return sb.toString();
    }

}
