package com.huaweicloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * **参数解释**： 查询服务的命名空间，各服务命名空间请参考“[服务命名名称](ces_03_0059.xml)”。    **约束限制**： 不涉及。 **取值范围**： 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度在 0 到 32个字符之间。        **默认取值**： 不涉及。 
 */
public class NamespaceAllowedEmpty {

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
        sb.append("class NamespaceAllowedEmpty {\n");
        sb.append("}");
        return sb.toString();
    }

}
