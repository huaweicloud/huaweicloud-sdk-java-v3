package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CommonCreateTaskReq
 */
public class CommonCreateTaskReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync")
    
    private Integer sync;

    public CommonCreateTaskReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CommonCreateTaskReq withInput(Consumer<ObsObjInfo> inputSetter) {
        if(this.input == null ){
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }
        
        return this;
    }


    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public CommonCreateTaskReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CommonCreateTaskReq withOutput(Consumer<ObsObjInfo> outputSetter) {
        if(this.output == null ){
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }
        
        return this;
    }


    /**
     * Get output
     * @return output
     */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public CommonCreateTaskReq withSync(Integer sync) {
        this.sync = sync;
        return this;
    }

    


    /**
     * 是否同步处理, - 0：排队处理 - 1：同步处理  默认值：0 
     * @return sync
     */
    public Integer getSync() {
        return sync;
    }

    public void setSync(Integer sync) {
        this.sync = sync;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommonCreateTaskReq commonCreateTaskReq = (CommonCreateTaskReq) o;
        return Objects.equals(this.input, commonCreateTaskReq.input) &&
            Objects.equals(this.output, commonCreateTaskReq.output) &&
            Objects.equals(this.sync, commonCreateTaskReq.sync);
    }
    @Override
    public int hashCode() {
        return Objects.hash(input, output, sync);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonCreateTaskReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
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

