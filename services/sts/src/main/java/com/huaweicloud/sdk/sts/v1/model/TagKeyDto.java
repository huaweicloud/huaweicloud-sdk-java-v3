package com.huaweicloud.sdk.sts.v1.model;

import java.util.Objects;

/**
 * **参数解释**： 标签键。  **约束限制**： 长度为1到128个字符。只允许大小写字母、数字、空格、\&quot;_\&quot;、\&quot;.\&quot;、\&quot;:\&quot;、\&quot;&#x3D;\&quot;、\&quot;+\&quot;、\&quot;-\&quot;、\&quot;@\&quot;、\&quot;/\&quot;，且不能以 \&quot;&amp;#95;sys&amp;#95;\&quot; 开头。  **取值范围**： 不涉及。  **默认取值**： 不涉及。 
 */
public class TagKeyDto {

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
        sb.append("class TagKeyDto {\n");
        sb.append("}");
        return sb.toString();
    }

}
