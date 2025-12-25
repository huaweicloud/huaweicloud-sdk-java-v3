package com.huaweicloud.sdk.secmaster.v2.model;

import java.util.Objects;

/**
 * 脚本目录分组名称，长度在1到256个字符之间。
 */
public class ScriptDirectory {

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
        sb.append("class ScriptDirectory {\n");
        sb.append("}");
        return sb.toString();
    }

}
