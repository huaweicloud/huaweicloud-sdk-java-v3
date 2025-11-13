package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchTransferPublicZonesTaskRequestBody
 */
public class BatchTransferPublicZonesTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_names")

    private List<String> zoneNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_user")

    private String targetUser;

    public BatchTransferPublicZonesTaskRequestBody withZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public BatchTransferPublicZonesTaskRequestBody addZoneNamesItem(String zoneNamesItem) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        this.zoneNames.add(zoneNamesItem);
        return this;
    }

    public BatchTransferPublicZonesTaskRequestBody withZoneNames(Consumer<List<String>> zoneNamesSetter) {
        if (this.zoneNames == null) {
            this.zoneNames = new ArrayList<>();
        }
        zoneNamesSetter.accept(this.zoneNames);
        return this;
    }

    /**
     * **参数解释：** 域名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return zoneNames
     */
    public List<String> getZoneNames() {
        return zoneNames;
    }

    public void setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
    }

    public BatchTransferPublicZonesTaskRequestBody withTargetUser(String targetUser) {
        this.targetUser = targetUser;
        return this;
    }

    /**
     * **参数解释：** 对方账号ID。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return targetUser
     */
    public String getTargetUser() {
        return targetUser;
    }

    public void setTargetUser(String targetUser) {
        this.targetUser = targetUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchTransferPublicZonesTaskRequestBody that = (BatchTransferPublicZonesTaskRequestBody) obj;
        return Objects.equals(this.zoneNames, that.zoneNames) && Objects.equals(this.targetUser, that.targetUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneNames, targetUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTransferPublicZonesTaskRequestBody {\n");
        sb.append("    zoneNames: ").append(toIndentedString(zoneNames)).append("\n");
        sb.append("    targetUser: ").append(toIndentedString(targetUser)).append("\n");
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
