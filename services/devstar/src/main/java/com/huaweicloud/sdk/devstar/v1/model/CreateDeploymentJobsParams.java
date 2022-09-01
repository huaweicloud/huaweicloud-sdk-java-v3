package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateDeploymentJobsParams
 */
public class CreateDeploymentJobsParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    @JacksonXmlProperty(localName = "function")

    private FGSDeploymentJobsParam function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cci")

    @JacksonXmlProperty(localName = "cci")

    private CciDeploymentJobsParam cci;

    public CreateDeploymentJobsParams withFunction(FGSDeploymentJobsParam function) {
        this.function = function;
        return this;
    }

    public CreateDeploymentJobsParams withFunction(Consumer<FGSDeploymentJobsParam> functionSetter) {
        if (this.function == null) {
            this.function = new FGSDeploymentJobsParam();
            functionSetter.accept(this.function);
        }

        return this;
    }

    /**
     * Get function
     * @return function
     */
    public FGSDeploymentJobsParam getFunction() {
        return function;
    }

    public void setFunction(FGSDeploymentJobsParam function) {
        this.function = function;
    }

    public CreateDeploymentJobsParams withCci(CciDeploymentJobsParam cci) {
        this.cci = cci;
        return this;
    }

    public CreateDeploymentJobsParams withCci(Consumer<CciDeploymentJobsParam> cciSetter) {
        if (this.cci == null) {
            this.cci = new CciDeploymentJobsParam();
            cciSetter.accept(this.cci);
        }

        return this;
    }

    /**
     * Get cci
     * @return cci
     */
    public CciDeploymentJobsParam getCci() {
        return cci;
    }

    public void setCci(CciDeploymentJobsParam cci) {
        this.cci = cci;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeploymentJobsParams createDeploymentJobsParams = (CreateDeploymentJobsParams) o;
        return Objects.equals(this.function, createDeploymentJobsParams.function)
            && Objects.equals(this.cci, createDeploymentJobsParams.cci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function, cci);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentJobsParams {\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    cci: ").append(toIndentedString(cci)).append("\n");
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
