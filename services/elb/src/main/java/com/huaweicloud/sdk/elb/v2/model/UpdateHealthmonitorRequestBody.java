package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.UpdateHealthmonitorV2Req;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateHealthmonitorRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="healthmonitor")
    
    private UpdateHealthmonitorV2Req healthmonitor = null;

    public UpdateHealthmonitorRequestBody withHealthmonitor(UpdateHealthmonitorV2Req healthmonitor) {
        this.healthmonitor = healthmonitor;
        return this;
    }

    public UpdateHealthmonitorRequestBody withHealthmonitor(Consumer<UpdateHealthmonitorV2Req> healthmonitorSetter) {
        if(this.healthmonitor == null ){
            this.healthmonitor = new UpdateHealthmonitorV2Req();
            healthmonitorSetter.accept(this.healthmonitor);
        }
        
        return this;
    }


    /**
     * Get healthmonitor
     * @return healthmonitor
     */
    public UpdateHealthmonitorV2Req getHealthmonitor() {
        return healthmonitor;
    }

    public void setHealthmonitor(UpdateHealthmonitorV2Req healthmonitor) {
        this.healthmonitor = healthmonitor;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHealthmonitorRequestBody updateHealthmonitorRequestBody = (UpdateHealthmonitorRequestBody) o;
        return Objects.equals(this.healthmonitor, updateHealthmonitorRequestBody.healthmonitor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(healthmonitor);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthmonitorRequestBody {\n");
        sb.append("    healthmonitor: ").append(toIndentedString(healthmonitor)).append("\n");
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

