package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HtapInstanceListAvailableZones
 */
public class HtapInstanceListAvailableZones {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_type")

    private String azType;

    public HtapInstanceListAvailableZones withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 可用区码。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HtapInstanceListAvailableZones withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 可用区描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HtapInstanceListAvailableZones withAzType(String azType) {
        this.azType = azType;
        return this;
    }

    /**
     * 可用区类型。
     * @return azType
     */
    public String getAzType() {
        return azType;
    }

    public void setAzType(String azType) {
        this.azType = azType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HtapInstanceListAvailableZones that = (HtapInstanceListAvailableZones) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.description, that.description)
            && Objects.equals(this.azType, that.azType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, azType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HtapInstanceListAvailableZones {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    azType: ").append(toIndentedString(azType)).append("\n");
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
