package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 容量相关信息。 **取值范围**： 不涉及。
 */
public class CompatibleInstanceVolumeResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Float used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public CompatibleInstanceVolumeResp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 磁盘类型。 **取值范围**： - SATA：普通IO - SAS：高IO - SSD：超高IO - ESSD：极速型SSD - GPSSD：通用型SSD
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CompatibleInstanceVolumeResp withUsed(Float used) {
        this.used = used;
        return this;
    }

    /**
     * **参数解释**： 已使用空间。 **取值范围**： 不涉及。
     * @return used
     */
    public Float getUsed() {
        return used;
    }

    public void setUsed(Float used) {
        this.used = used;
    }

    public CompatibleInstanceVolumeResp withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**： 总大小。 **取值范围**： 不涉及。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompatibleInstanceVolumeResp that = (CompatibleInstanceVolumeResp) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.used, that.used)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, used, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompatibleInstanceVolumeResp {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
