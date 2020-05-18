package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.BatchStopServersOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class BatchStopServersRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-stop")
    
    private BatchStopServersOption osStop = null;

    public BatchStopServersRequestBody withOsStop(BatchStopServersOption osStop) {
        this.osStop = osStop;
        return this;
    }

    public BatchStopServersRequestBody withOsStop(Consumer<BatchStopServersOption> osStopSetter) {
        if(this.osStop == null ){
            this.osStop = new BatchStopServersOption();
        }
        osStopSetter.accept(this.osStop);
        return this;
    }


    /**
     * Get osStop
     * @return osStop
     */
    public BatchStopServersOption getOsStop() {
        return osStop;
    }

    public void setOsStop(BatchStopServersOption osStop) {
        this.osStop = osStop;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchStopServersRequestBody batchStopServersRequestBody = (BatchStopServersRequestBody) o;
        return Objects.equals(this.osStop, batchStopServersRequestBody.osStop);
    }
    @Override
    public int hashCode() {
        return Objects.hash(osStop);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStopServersRequestBody {\n");
            sb.append("    osStop: ").append(toIndentedString(osStop)).append("\n");
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

