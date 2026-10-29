package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ResourceExtraInfoIncludeVolumesResp
 */
public class ResourceExtraInfoIncludeVolumesResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    public ResourceExtraInfoIncludeVolumesResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 备份时，需要备份的卷的ID **取值范围：** 格式为uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceExtraInfoIncludeVolumesResp withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * **参数解释：** 操作系统类型 **取值范围：** 不涉及
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceExtraInfoIncludeVolumesResp that = (ResourceExtraInfoIncludeVolumesResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.osVersion, that.osVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, osVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceExtraInfoIncludeVolumesResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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
