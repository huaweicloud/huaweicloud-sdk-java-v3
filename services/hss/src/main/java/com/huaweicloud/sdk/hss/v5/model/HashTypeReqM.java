package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： hash类型 **约束限制**： 必填 **取值范围**： - SHA-256：sha256sum - MD5：md5sum - SHA-1：sha1sum  **默认取值**： 不涉及 
 */
public class HashTypeReqM {

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
        sb.append("class HashTypeReqM {\n");
        sb.append("}");
        return sb.toString();
    }

}
