package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * AddProtectAccessLevel
 */
public class AddProtectAccessLevel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_access_level")

    @JacksonXmlProperty(localName = "push_access_level")

    private Integer pushAccessLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_access_level")

    @JacksonXmlProperty(localName = "merge_access_level")

    private Integer mergeAccessLevel;

    public AddProtectAccessLevel withPushAccessLevel(Integer pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }

    /**
     * 提交权限
     * @return pushAccessLevel
     */
    public Integer getPushAccessLevel() {
        return pushAccessLevel;
    }

    public void setPushAccessLevel(Integer pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
    }

    public AddProtectAccessLevel withMergeAccessLevel(Integer mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }

    /**
     * 合并权限
     * @return mergeAccessLevel
     */
    public Integer getMergeAccessLevel() {
        return mergeAccessLevel;
    }

    public void setMergeAccessLevel(Integer mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddProtectAccessLevel addProtectAccessLevel = (AddProtectAccessLevel) o;
        return Objects.equals(this.pushAccessLevel, addProtectAccessLevel.pushAccessLevel)
            && Objects.equals(this.mergeAccessLevel, addProtectAccessLevel.mergeAccessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pushAccessLevel, mergeAccessLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddProtectAccessLevel {\n");
        sb.append("    pushAccessLevel: ").append(toIndentedString(pushAccessLevel)).append("\n");
        sb.append("    mergeAccessLevel: ").append(toIndentedString(mergeAccessLevel)).append("\n");
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
