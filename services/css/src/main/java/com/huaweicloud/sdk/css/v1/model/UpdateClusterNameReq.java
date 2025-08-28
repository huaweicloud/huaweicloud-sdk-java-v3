package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateClusterNameReq
 */
public class UpdateClusterNameReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public UpdateClusterNameReq withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 修改后集群名称。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UpdateClusterNameReq withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 修改后集群描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateClusterNameReq that = (UpdateClusterNameReq) obj;
        return Objects.equals(this.displayName, that.displayName) && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayName, desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterNameReq {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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
