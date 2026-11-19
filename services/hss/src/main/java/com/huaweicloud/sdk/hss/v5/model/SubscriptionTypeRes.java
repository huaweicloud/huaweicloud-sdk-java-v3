package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**: 订阅的方式 **取值范围**: - smn_topic：SMN主题 - message_center：消息中心 - silent：无需发送到邮箱 
 */
public class SubscriptionTypeRes {

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
        sb.append("class SubscriptionTypeRes {\n");
        sb.append("}");
        return sb.toString();
    }

}
