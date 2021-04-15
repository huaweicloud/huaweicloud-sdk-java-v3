package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class ChecktargetReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device")
    
    private String device;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="param")
    
    private Map<String, String> param = null;
    
    public ChecktargetReq withDevice(String device) {
        this.device = device;
        return this;
    }

    


    /**
     * 需要校验的设备
     * @return device
     */
    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    

    public ChecktargetReq withParam(Map<String, String> param) {
        this.param = param;
        return this;
    }

    

    public ChecktargetReq putParamItem(String key, String paramItem) {
        if(this.param == null) {
            this.param = new HashMap<>();
        }
        this.param.put(key, paramItem);
        return this;
    }

    public ChecktargetReq withParam(Consumer<Map<String, String>> paramSetter) {
        if(this.param == null) {
            this.param = new HashMap<>();
        }
        paramSetter.accept(this.param);
        return this;
    }
    /**
     * 校验参数
     * @return param
     */
    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecktargetReq checktargetReq = (ChecktargetReq) o;
        return Objects.equals(this.device, checktargetReq.device) &&
            Objects.equals(this.param, checktargetReq.param);
    }
    @Override
    public int hashCode() {
        return Objects.hash(device, param);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecktargetReq {\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

