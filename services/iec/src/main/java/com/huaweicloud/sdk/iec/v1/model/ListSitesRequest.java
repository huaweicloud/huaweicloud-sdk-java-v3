package com.huaweicloud.sdk.iec.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSitesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area")
    
    private String area;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="province")
    
    private String province;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="city")
    
    private String city;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private String flavor;
    /**
     * Gets or Sets volumeType
     */
    public static final class VolumeTypeEnum {

        
        /**
         * Enum SATA for value: "SATA"
         */
        public static final VolumeTypeEnum SATA = new VolumeTypeEnum("SATA");
        
        /**
         * Enum SAS for value: "SAS"
         */
        public static final VolumeTypeEnum SAS = new VolumeTypeEnum("SAS");
        

        private static final Map<String, VolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeTypeEnum> createStaticFields() {
            Map<String, VolumeTypeEnum> map = new HashMap<>();
            map.put("SATA", SATA);
            map.put("SAS", SAS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VolumeTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VolumeTypeEnum(value);
            }
            return result;
        }

        public static VolumeTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            VolumeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof VolumeTypeEnum) {
                return this.value.equals(((VolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_type")
    
    private VolumeTypeEnum volumeType;

    public ListSitesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListSitesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListSitesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ListSitesRequest withArea(String area) {
        this.area = area;
        return this;
    }

    


    /**
     * Get area
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    

    public ListSitesRequest withProvince(String province) {
        this.province = province;
        return this;
    }

    


    /**
     * Get province
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    

    public ListSitesRequest withCity(String city) {
        this.city = city;
        return this;
    }

    


    /**
     * Get city
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    

    public ListSitesRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    


    /**
     * Get flavor
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    

    public ListSitesRequest withVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    


    /**
     * Get volumeType
     * @return volumeType
     */
    public VolumeTypeEnum getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSitesRequest listSitesRequest = (ListSitesRequest) o;
        return Objects.equals(this.limit, listSitesRequest.limit) &&
            Objects.equals(this.offset, listSitesRequest.offset) &&
            Objects.equals(this.id, listSitesRequest.id) &&
            Objects.equals(this.area, listSitesRequest.area) &&
            Objects.equals(this.province, listSitesRequest.province) &&
            Objects.equals(this.city, listSitesRequest.city) &&
            Objects.equals(this.flavor, listSitesRequest.flavor) &&
            Objects.equals(this.volumeType, listSitesRequest.volumeType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, id, area, province, city, flavor, volumeType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSitesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
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

