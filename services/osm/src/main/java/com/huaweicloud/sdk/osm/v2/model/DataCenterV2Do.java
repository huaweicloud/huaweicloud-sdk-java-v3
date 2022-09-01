package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * DataCenterV2Do
 */
public class DataCenterV2Do {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    @JacksonXmlProperty(localName = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    @JacksonXmlProperty(localName = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sensitive")

    @JacksonXmlProperty(localName = "is_sensitive")

    private Integer isSensitive;

    public DataCenterV2Do withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 区域类型0大陆 1国际
     * minimum: 0
     * maximum: 10
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public DataCenterV2Do withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public DataCenterV2Do withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public DataCenterV2Do withIsSensitive(Integer isSensitive) {
        this.isSensitive = isSensitive;
        return this;
    }

    /**
     * 是否敏感
     * minimum: 0
     * maximum: 1
     * @return isSensitive
     */
    public Integer getIsSensitive() {
        return isSensitive;
    }

    public void setIsSensitive(Integer isSensitive) {
        this.isSensitive = isSensitive;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataCenterV2Do dataCenterV2Do = (DataCenterV2Do) o;
        return Objects.equals(this.type, dataCenterV2Do.type) && Objects.equals(this.regionId, dataCenterV2Do.regionId)
            && Objects.equals(this.regionName, dataCenterV2Do.regionName)
            && Objects.equals(this.isSensitive, dataCenterV2Do.isSensitive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, regionId, regionName, isSensitive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataCenterV2Do {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    isSensitive: ").append(toIndentedString(isSensitive)).append("\n");
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
