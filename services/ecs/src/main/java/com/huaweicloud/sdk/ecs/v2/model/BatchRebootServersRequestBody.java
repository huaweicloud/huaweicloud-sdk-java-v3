package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.BatchRebootSeversOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class BatchRebootServersRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reboot")
    
    private BatchRebootSeversOption reboot = null;

    public BatchRebootServersRequestBody withReboot(BatchRebootSeversOption reboot) {
        this.reboot = reboot;
        return this;
    }

    public BatchRebootServersRequestBody withReboot(Consumer<BatchRebootSeversOption> rebootSetter) {
        if(this.reboot == null ){
            this.reboot = new BatchRebootSeversOption();
            rebootSetter.accept(this.reboot);
        }
        
        return this;
    }


    /**
     * Get reboot
     * @return reboot
     */
    public BatchRebootSeversOption getReboot() {
        return reboot;
    }

    public void setReboot(BatchRebootSeversOption reboot) {
        this.reboot = reboot;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchRebootServersRequestBody batchRebootServersRequestBody = (BatchRebootServersRequestBody) o;
        return Objects.equals(this.reboot, batchRebootServersRequestBody.reboot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(reboot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRebootServersRequestBody {\n");
        sb.append("    reboot: ").append(toIndentedString(reboot)).append("\n");
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

