package com.huaweicloud.sdk.mrs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.AvailableZoneV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAvailableZonesResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zones")
    
    private List<AvailableZoneV2> availableZones = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_az_code")
    

    private String defaultAzCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="support_physical_az_group")
    

    private Boolean supportPhysicalAzGroup;

    public ListAvailableZonesResponse withAvailableZones(List<AvailableZoneV2> availableZones) {
        this.availableZones = availableZones;
        return this;
    }

    
    public ListAvailableZonesResponse addAvailableZonesItem(AvailableZoneV2 availableZonesItem) {
        if(this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        this.availableZones.add(availableZonesItem);
        return this;
    }

    public ListAvailableZonesResponse withAvailableZones(Consumer<List<AvailableZoneV2>> availableZonesSetter) {
        if(this.availableZones == null) {
            this.availableZones = new ArrayList<>();
        }
        availableZonesSetter.accept(this.availableZones);
        return this;
    }

    /**
     * 可用区列表
     * @return availableZones
     */
    public List<AvailableZoneV2> getAvailableZones() {
        return availableZones;
    }

    public void setAvailableZones(List<AvailableZoneV2> availableZones) {
        this.availableZones = availableZones;
    }

    

    public ListAvailableZonesResponse withDefaultAzCode(String defaultAzCode) {
        this.defaultAzCode = defaultAzCode;
        return this;
    }

    


    /**
     * 默认可用区编码
     * @return defaultAzCode
     */
    public String getDefaultAzCode() {
        return defaultAzCode;
    }

    public void setDefaultAzCode(String defaultAzCode) {
        this.defaultAzCode = defaultAzCode;
    }

    

    public ListAvailableZonesResponse withSupportPhysicalAzGroup(Boolean supportPhysicalAzGroup) {
        this.supportPhysicalAzGroup = supportPhysicalAzGroup;
        return this;
    }

    


    /**
     * 支持的物理可用区分组
     * @return supportPhysicalAzGroup
     */
    public Boolean getSupportPhysicalAzGroup() {
        return supportPhysicalAzGroup;
    }

    public void setSupportPhysicalAzGroup(Boolean supportPhysicalAzGroup) {
        this.supportPhysicalAzGroup = supportPhysicalAzGroup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAvailableZonesResponse listAvailableZonesResponse = (ListAvailableZonesResponse) o;
        return Objects.equals(this.availableZones, listAvailableZonesResponse.availableZones) &&
            Objects.equals(this.defaultAzCode, listAvailableZonesResponse.defaultAzCode) &&
            Objects.equals(this.supportPhysicalAzGroup, listAvailableZonesResponse.supportPhysicalAzGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(availableZones, defaultAzCode, supportPhysicalAzGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableZonesResponse {\n");
        sb.append("    availableZones: ").append(toIndentedString(availableZones)).append("\n");
        sb.append("    defaultAzCode: ").append(toIndentedString(defaultAzCode)).append("\n");
        sb.append("    supportPhysicalAzGroup: ").append(toIndentedString(supportPhysicalAzGroup)).append("\n");
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

