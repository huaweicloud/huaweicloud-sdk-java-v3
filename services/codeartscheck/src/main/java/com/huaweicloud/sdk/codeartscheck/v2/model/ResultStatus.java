package com.huaweicloud.sdk.codeartscheck.v2.model;

import java.util.Objects;

/**
 * **参数解释：** 接口响应状态。 **取值范围：** - success：接口响应成功。 - error：接口响应失败。
 */
public class ResultStatus {

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
        sb.append("class ResultStatus {\n");
        sb.append("}");
        return sb.toString();
    }

}
