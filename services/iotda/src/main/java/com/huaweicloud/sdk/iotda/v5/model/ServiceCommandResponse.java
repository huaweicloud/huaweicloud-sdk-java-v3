package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.ServiceCommandPara;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 命令参数响应对象。
 */
public class ServiceCommandResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paras")
    
    private List<ServiceCommandPara> paras = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="response_name")
    
    private String responseName;

    public ServiceCommandResponse withParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
        return this;
    }

    
    public ServiceCommandResponse addParasItem(ServiceCommandPara parasItem) {
        if (this.paras == null) {
            this.paras = new ArrayList<>();
        }
        this.paras.add(parasItem);
        return this;
    }

    public ServiceCommandResponse withParas(Consumer<List<ServiceCommandPara>> parasSetter) {
        if(this.paras == null ){
            this.paras = new ArrayList<>();
        }
        parasSetter.accept(this.paras);
        return this;
    }

    /**
     * 设备命令响应的参数列表。
     * @return paras
     */
    public List<ServiceCommandPara> getParas() {
        return paras;
    }

    public void setParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
    }

    public ServiceCommandResponse withResponseName(String responseName) {
        this.responseName = responseName;
        return this;
    }

    


    /**
     * 设备命令响应名称。
     * @return responseName
     */
    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceCommandResponse serviceCommandResponse = (ServiceCommandResponse) o;
        return Objects.equals(this.paras, serviceCommandResponse.paras) &&
            Objects.equals(this.responseName, serviceCommandResponse.responseName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(paras, responseName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceCommandResponse {\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
        sb.append("    responseName: ").append(toIndentedString(responseName)).append("\n");
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

