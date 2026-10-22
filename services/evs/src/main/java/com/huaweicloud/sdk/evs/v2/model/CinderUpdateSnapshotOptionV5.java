package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CinderUpdateSnapshotOptionV5
 */
public class CinderUpdateSnapshotOptionV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instant_access")

    private Boolean instantAccess;

    public CinderUpdateSnapshotOptionV5 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照名称。最大支持64个字符。 **约束限制** 对云硬盘创建备份时，同时会创建以autobk_snapshot_为名称前缀的快照，云硬盘控制台对此类快照会有操作限制。因此建议不要创建以autobk_snapshot_为名称前缀的快照，避免影响快照的正常使用。 **取值范围** 不涉及。 **默认取值** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CinderUpdateSnapshotOptionV5 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照描述。 **约束限制** 不涉及。 **取值范围** 最大支持85个字符。 **默认取值** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CinderUpdateSnapshotOptionV5 withInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
        return this;
    }

    /**
     * **参数解释** 云硬盘快照极速可用标识。 **约束限制** 不涉及。 **取值范围** - true：开启快照极速可用功能。 - false：关闭快照极速可用功能。 **默认取值** 不涉及。
     * @return instantAccess
     */
    public Boolean getInstantAccess() {
        return instantAccess;
    }

    public void setInstantAccess(Boolean instantAccess) {
        this.instantAccess = instantAccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CinderUpdateSnapshotOptionV5 that = (CinderUpdateSnapshotOptionV5) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.instantAccess, that.instantAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, instantAccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderUpdateSnapshotOptionV5 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instantAccess: ").append(toIndentedString(instantAccess)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
