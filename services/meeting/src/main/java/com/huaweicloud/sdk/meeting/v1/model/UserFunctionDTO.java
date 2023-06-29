package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UserFunctionDTO
 */
public class UserFunctionDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableRoom")

    private Boolean enableRoom;

    public UserFunctionDTO withEnableRoom(Boolean enableRoom) {
        this.enableRoom = enableRoom;
        return this;
    }

    /**
     * 是否开启智能协同白板功能。如果开启，表示该帐号是给智能协同白板使用，占用企业智能协同白板的资源，如果资源不足，则无法开启。 默认值：false。 > 该参数将废弃，请勿使用。 
     * @return enableRoom
     */
    public Boolean getEnableRoom() {
        return enableRoom;
    }

    public void setEnableRoom(Boolean enableRoom) {
        this.enableRoom = enableRoom;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserFunctionDTO that = (UserFunctionDTO) obj;
        return Objects.equals(this.enableRoom, that.enableRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableRoom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserFunctionDTO {\n");
        sb.append("    enableRoom: ").append(toIndentedString(enableRoom)).append("\n");
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
