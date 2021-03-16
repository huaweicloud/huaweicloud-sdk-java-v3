package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowHotkeyTaskDetailsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hotkey_id")
    
    private String hotkeyId;

    public ShowHotkeyTaskDetailsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ShowHotkeyTaskDetailsRequest withHotkeyId(String hotkeyId) {
        this.hotkeyId = hotkeyId;
        return this;
    }

    


    /**
     * Get hotkeyId
     * @return hotkeyId
     */
    public String getHotkeyId() {
        return hotkeyId;
    }

    public void setHotkeyId(String hotkeyId) {
        this.hotkeyId = hotkeyId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowHotkeyTaskDetailsRequest showHotkeyTaskDetailsRequest = (ShowHotkeyTaskDetailsRequest) o;
        return Objects.equals(this.instanceId, showHotkeyTaskDetailsRequest.instanceId) &&
            Objects.equals(this.hotkeyId, showHotkeyTaskDetailsRequest.hotkeyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, hotkeyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHotkeyTaskDetailsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    hotkeyId: ").append(toIndentedString(hotkeyId)).append("\n");
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

