package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.IncidentDetailInfoV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowIncidentDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_detail_info")
    
    private IncidentDetailInfoV2 incidentDetailInfo = null;

    public ShowIncidentDetailResponse withIncidentDetailInfo(IncidentDetailInfoV2 incidentDetailInfo) {
        this.incidentDetailInfo = incidentDetailInfo;
        return this;
    }

    public ShowIncidentDetailResponse withIncidentDetailInfo(Consumer<IncidentDetailInfoV2> incidentDetailInfoSetter) {
        if(this.incidentDetailInfo == null ){
            this.incidentDetailInfo = new IncidentDetailInfoV2();
            incidentDetailInfoSetter.accept(this.incidentDetailInfo);
        }
        
        return this;
    }


    /**
     * Get incidentDetailInfo
     * @return incidentDetailInfo
     */
    public IncidentDetailInfoV2 getIncidentDetailInfo() {
        return incidentDetailInfo;
    }

    public void setIncidentDetailInfo(IncidentDetailInfoV2 incidentDetailInfo) {
        this.incidentDetailInfo = incidentDetailInfo;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowIncidentDetailResponse showIncidentDetailResponse = (ShowIncidentDetailResponse) o;
        return Objects.equals(this.incidentDetailInfo, showIncidentDetailResponse.incidentDetailInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(incidentDetailInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIncidentDetailResponse {\n");
        sb.append("    incidentDetailInfo: ").append(toIndentedString(incidentDetailInfo)).append("\n");
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

