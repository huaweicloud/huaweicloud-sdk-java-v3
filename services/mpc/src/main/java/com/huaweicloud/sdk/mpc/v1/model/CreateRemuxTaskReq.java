package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.CommonCreateTaskReq;
import com.huaweicloud.sdk.mpc.v1.model.ObsObjInfo;
import com.huaweicloud.sdk.mpc.v1.model.RemuxOutputParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateRemuxTaskReq
 */
public class CreateRemuxTaskReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    private ObsObjInfo input = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    private ObsObjInfo output = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sync")
    
    private Integer sync;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_param")
    
    private RemuxOutputParam outputParam = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_data")
    
    private String userData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notify_url")
    
    private String notifyUrl;

    public CreateRemuxTaskReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateRemuxTaskReq withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public CreateRemuxTaskReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateRemuxTaskReq withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public CreateRemuxTaskReq withSync(Integer sync) {
        this.sync = sync;
        return this;
    }

    


    /**
     * 是否同步处理, - 0：排队处理 - 1：同步处理  默认值：0 
     * minimum: 0
     * maximum: 2
     * @return sync
     */
    public Integer getSync() {
        return sync;
    }

    public void setSync(Integer sync) {
        this.sync = sync;
    }

    public CreateRemuxTaskReq withOutputParam(RemuxOutputParam outputParam) {
        this.outputParam = outputParam;
        return this;
    }

    public CreateRemuxTaskReq withOutputParam(Consumer<RemuxOutputParam> outputParamSetter) {
        if(this.outputParam == null ){
            this.outputParam = new RemuxOutputParam();
            outputParamSetter.accept(this.outputParam);
        }
        
        return this;
    }


    /**
     * Get outputParam
     * @return outputParam
     */
    public RemuxOutputParam getOutputParam() {
        return outputParam;
    }

    public void setOutputParam(RemuxOutputParam outputParam) {
        this.outputParam = outputParam;
    }

    public CreateRemuxTaskReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    


    /**
     * 用户自定义数据。 
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CreateRemuxTaskReq withNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    


    /**
     * 提供给mpe通知回调用的的url 
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRemuxTaskReq createRemuxTaskReq = (CreateRemuxTaskReq) o;
        return Objects.equals(this.input, createRemuxTaskReq.input) &&
            Objects.equals(this.output, createRemuxTaskReq.output) &&
            Objects.equals(this.sync, createRemuxTaskReq.sync) &&
            Objects.equals(this.outputParam, createRemuxTaskReq.outputParam) &&
            Objects.equals(this.userData, createRemuxTaskReq.userData) &&
            Objects.equals(this.notifyUrl, createRemuxTaskReq.notifyUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(input, output, sync, outputParam, userData, notifyUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRemuxTaskReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("    outputParam: ").append(toIndentedString(outputParam)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
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

