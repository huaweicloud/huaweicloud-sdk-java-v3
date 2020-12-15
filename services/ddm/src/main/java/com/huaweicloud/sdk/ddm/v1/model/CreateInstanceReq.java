package com.huaweicloud.sdk.ddm.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceDetail;
import com.huaweicloud.sdk.ddm.v1.model.CreateInstanceExtendParam;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateInstanceReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance")
    
    private CreateInstanceDetail instance = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extend_param")
    
    private CreateInstanceExtendParam extendParam = null;

    public CreateInstanceReq withInstance(CreateInstanceDetail instance) {
        this.instance = instance;
        return this;
    }

    public CreateInstanceReq withInstance(Consumer<CreateInstanceDetail> instanceSetter) {
        if(this.instance == null ){
            this.instance = new CreateInstanceDetail();
            instanceSetter.accept(this.instance);
        }
        
        return this;
    }


    /**
     * Get instance
     * @return instance
     */
    public CreateInstanceDetail getInstance() {
        return instance;
    }

    public void setInstance(CreateInstanceDetail instance) {
        this.instance = instance;
    }

    public CreateInstanceReq withExtendParam(CreateInstanceExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateInstanceReq withExtendParam(Consumer<CreateInstanceExtendParam> extendParamSetter) {
        if(this.extendParam == null ){
            this.extendParam = new CreateInstanceExtendParam();
            extendParamSetter.accept(this.extendParam);
        }
        
        return this;
    }


    /**
     * Get extendParam
     * @return extendParam
     */
    public CreateInstanceExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(CreateInstanceExtendParam extendParam) {
        this.extendParam = extendParam;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceReq createInstanceReq = (CreateInstanceReq) o;
        return Objects.equals(this.instance, createInstanceReq.instance) &&
            Objects.equals(this.extendParam, createInstanceReq.extendParam);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instance, extendParam);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceReq {\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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

