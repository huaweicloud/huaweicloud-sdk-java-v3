package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MemberAccess
 */
public class MemberAccess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_level")

    private Integer accessLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_level")

    private Integer notificationLevel;

    public MemberAccess withAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * **参数解释：** 访问级别。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public MemberAccess withNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
        return this;
    }

    /**
     * **参数解释：** 通知级别。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return notificationLevel
     */
    public Integer getNotificationLevel() {
        return notificationLevel;
    }

    public void setNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberAccess that = (MemberAccess) obj;
        return Objects.equals(this.accessLevel, that.accessLevel)
            && Objects.equals(this.notificationLevel, that.notificationLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessLevel, notificationLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberAccess {\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
        sb.append("    notificationLevel: ").append(toIndentedString(notificationLevel)).append("\n");
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
