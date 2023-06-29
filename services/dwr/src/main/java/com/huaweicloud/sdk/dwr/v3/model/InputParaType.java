package com.huaweicloud.sdk.dwr.v3.model;

import java.util.Objects;

/**
 * Input结构体参数类型。支持string,integer,float,boolean,list,map
 */
public class InputParaType {

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
        sb.append("class InputParaType {\n");
        sb.append("}");
        return sb.toString();
    }

}
