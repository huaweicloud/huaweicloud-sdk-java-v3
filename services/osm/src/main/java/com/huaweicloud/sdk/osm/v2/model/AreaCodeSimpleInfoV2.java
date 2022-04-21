package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AreaCodeSimpleInfoV2
 */
public class AreaCodeSimpleInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_code")

    private String areaCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area_name")

    private String areaName;

    public AreaCodeSimpleInfoV2 withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一id
     * minimum: 0
     * maximum: 9223372036854775807
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AreaCodeSimpleInfoV2 withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * 国家码
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public AreaCodeSimpleInfoV2 withAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    /**
     * 国家名称
     * @return areaName
     */
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AreaCodeSimpleInfoV2 areaCodeSimpleInfoV2 = (AreaCodeSimpleInfoV2) o;
        return Objects.equals(this.id, areaCodeSimpleInfoV2.id)
            && Objects.equals(this.areaCode, areaCodeSimpleInfoV2.areaCode)
            && Objects.equals(this.areaName, areaCodeSimpleInfoV2.areaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, areaCode, areaName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AreaCodeSimpleInfoV2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
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
