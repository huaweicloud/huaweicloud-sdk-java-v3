package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.ModifyAlarmActionReq;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class UpdateAlarmActionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="alarm_id")
    
    private String alarmId = "al15454523384878yogJg6ao";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ModifyAlarmActionReq body = null;

    public UpdateAlarmActionRequest withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    


    /**
     * Get alarmId
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public UpdateAlarmActionRequest withBody(ModifyAlarmActionReq body) {
        this.body = body;
        return this;
    }

    public UpdateAlarmActionRequest withBody(Consumer<ModifyAlarmActionReq> bodySetter) {
        if(this.body == null ){
            this.body = new ModifyAlarmActionReq();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ModifyAlarmActionReq getBody() {
        return body;
    }

    public void setBody(ModifyAlarmActionReq body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAlarmActionRequest updateAlarmActionRequest = (UpdateAlarmActionRequest) o;
        return Objects.equals(this.alarmId, updateAlarmActionRequest.alarmId) &&
            Objects.equals(this.body, updateAlarmActionRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(alarmId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAlarmActionRequest {\n");
            sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
            sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

