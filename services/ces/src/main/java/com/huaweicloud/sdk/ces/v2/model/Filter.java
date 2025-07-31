package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 聚合方式。average： 平均值，variance：方差，min：最小值，max：最大值，sum：求和，tp99：99百分位数，tp95：95百分位数，tp90：90百分位数
 */
public class Filter {

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
        sb.append("class Filter {\n");
        sb.append("}");
        return sb.toString();
    }

}
