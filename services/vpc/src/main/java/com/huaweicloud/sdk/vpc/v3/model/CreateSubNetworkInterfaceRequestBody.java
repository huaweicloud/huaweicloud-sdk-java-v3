package com.huaweicloud.sdk.vpc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v3.model.CreateSubNetworkInterfaceOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateSubNetworkInterfaceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dry_run")
    
    private Boolean dryRun;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_network_interface")
    
    private CreateSubNetworkInterfaceOption subNetworkInterface = null;

    public CreateSubNetworkInterfaceRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    


    /**
     * 功能说明：是否只预检此次请求 取值范围： -true：发送检查请求，不会创建辅助弹性网卡。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回响应码202。 -false（默认值）：发送正常请求，并直接创建辅助弹性网卡。
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreateSubNetworkInterfaceRequestBody withSubNetworkInterface(CreateSubNetworkInterfaceOption subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
        return this;
    }

    public CreateSubNetworkInterfaceRequestBody withSubNetworkInterface(Consumer<CreateSubNetworkInterfaceOption> subNetworkInterfaceSetter) {
        if(this.subNetworkInterface == null ){
            this.subNetworkInterface = new CreateSubNetworkInterfaceOption();
            subNetworkInterfaceSetter.accept(this.subNetworkInterface);
        }
        
        return this;
    }


    /**
     * Get subNetworkInterface
     * @return subNetworkInterface
     */
    public CreateSubNetworkInterfaceOption getSubNetworkInterface() {
        return subNetworkInterface;
    }

    public void setSubNetworkInterface(CreateSubNetworkInterfaceOption subNetworkInterface) {
        this.subNetworkInterface = subNetworkInterface;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubNetworkInterfaceRequestBody createSubNetworkInterfaceRequestBody = (CreateSubNetworkInterfaceRequestBody) o;
        return Objects.equals(this.dryRun, createSubNetworkInterfaceRequestBody.dryRun) &&
            Objects.equals(this.subNetworkInterface, createSubNetworkInterfaceRequestBody.subNetworkInterface);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dryRun, subNetworkInterface);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubNetworkInterfaceRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
        sb.append("    subNetworkInterface: ").append(toIndentedString(subNetworkInterface)).append("\n");
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

