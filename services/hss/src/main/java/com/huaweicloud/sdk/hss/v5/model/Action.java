package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 处置动作，包含如下:   - auto ：自动处置   - manual : 人工处置
 */
public class Action {

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
        sb.append("class Action {\n");
        sb.append("}");
        return sb.toString();
    }

}
