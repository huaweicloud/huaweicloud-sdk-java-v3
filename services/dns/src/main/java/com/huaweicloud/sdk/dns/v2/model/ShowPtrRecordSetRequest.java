package com.huaweicloud.sdk.dns.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowPtrRecordSetRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floatingip_id")
    
    private String floatingipId;

    public ShowPtrRecordSetRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowPtrRecordSetRequest withFloatingipId(String floatingipId) {
        this.floatingipId = floatingipId;
        return this;
    }

    


    /**
     * Get floatingipId
     * @return floatingipId
     */
    public String getFloatingipId() {
        return floatingipId;
    }

    public void setFloatingipId(String floatingipId) {
        this.floatingipId = floatingipId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPtrRecordSetRequest showPtrRecordSetRequest = (ShowPtrRecordSetRequest) o;
        return Objects.equals(this.region, showPtrRecordSetRequest.region) &&
            Objects.equals(this.floatingipId, showPtrRecordSetRequest.floatingipId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(region, floatingipId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPtrRecordSetRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    floatingipId: ").append(toIndentedString(floatingipId)).append("\n");
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

