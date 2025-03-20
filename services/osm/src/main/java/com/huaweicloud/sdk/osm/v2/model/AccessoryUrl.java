package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessoryUrl
 */
public class AccessoryUrl {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_id")

    private String accessoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_name")

    private String accessoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_url")

    private String accessoryUrl;

    public AccessoryUrl withAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
        return this;
    }

    /**
     * 附件id
     * @return accessoryId
     */
    public String getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
    }

    public AccessoryUrl withAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
        return this;
    }

    /**
     * 文件名称
     * @return accessoryName
     */
    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public AccessoryUrl withAccessoryUrl(String accessoryUrl) {
        this.accessoryUrl = accessoryUrl;
        return this;
    }

    /**
     * 附件链接
     * @return accessoryUrl
     */
    public String getAccessoryUrl() {
        return accessoryUrl;
    }

    public void setAccessoryUrl(String accessoryUrl) {
        this.accessoryUrl = accessoryUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessoryUrl that = (AccessoryUrl) obj;
        return Objects.equals(this.accessoryId, that.accessoryId)
            && Objects.equals(this.accessoryName, that.accessoryName)
            && Objects.equals(this.accessoryUrl, that.accessoryUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryId, accessoryName, accessoryUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessoryUrl {\n");
        sb.append("    accessoryId: ").append(toIndentedString(accessoryId)).append("\n");
        sb.append("    accessoryName: ").append(toIndentedString(accessoryName)).append("\n");
        sb.append("    accessoryUrl: ").append(toIndentedString(accessoryUrl)).append("\n");
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
