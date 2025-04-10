package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * 任务状态，包含如下2种   - scanning ：扫描中   - finish ：扫描完成
 */
public class TaskStatus {

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
        sb.append("class TaskStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
