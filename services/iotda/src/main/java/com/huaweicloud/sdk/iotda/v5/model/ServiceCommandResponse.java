package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 命令参数响应对象。
 */
public class ServiceCommandResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_name")

    private String responseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paras")

    private List<ServiceCommandPara> paras = null;

    public ServiceCommandResponse withResponseName(String responseName) {
        this.responseName = responseName;
        return this;
    }

    /**
     * **参数说明**：设备命令响应名称。 **取值范围**：长度不超过128，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return responseName
     */
    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }

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
        if (this.paras == null) {
            this.paras = new ArrayList<>();
        }
        parasSetter.accept(this.paras);
        return this;
    }

    /**
     * **参数说明**：设备命令响应的参数列表。
     * @return paras
     */
    public List<ServiceCommandPara> getParas() {
        return paras;
    }

    public void setParas(List<ServiceCommandPara> paras) {
        this.paras = paras;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceCommandResponse that = (ServiceCommandResponse) obj;
        return Objects.equals(this.responseName, that.responseName) && Objects.equals(this.paras, that.paras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseName, paras);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceCommandResponse {\n");
        sb.append("    responseName: ").append(toIndentedString(responseName)).append("\n");
        sb.append("    paras: ").append(toIndentedString(paras)).append("\n");
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
