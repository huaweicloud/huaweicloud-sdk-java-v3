package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 报告发送的时间段 **取值范围**:   - morning：代表0点到6点   - noon：代表6点到12点   - afternoon：代表12点到18点   - evening：代表18点到24点 
 */
public class SendingPeriod {

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
        sb.append("class SendingPeriod {\n");
        sb.append("}");
        return sb.toString();
    }

}
