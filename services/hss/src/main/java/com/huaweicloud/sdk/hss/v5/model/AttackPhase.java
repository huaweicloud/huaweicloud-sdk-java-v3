package com.huaweicloud.sdk.hss.v5.model;

import java.util.Objects;

/**
 * **参数解释**： 攻击阶段 **取值范围**： - reconnaissance：侦查跟踪 - weaponization：武器构建 - delivery：载荷投递 - exploit：漏洞利用 - installation：安装植入 - command_and_control：命令与控制 - actions：目标达成 
 */
public class AttackPhase {

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
        sb.append("class AttackPhase {\n");
        sb.append("}");
        return sb.toString();
    }

}
