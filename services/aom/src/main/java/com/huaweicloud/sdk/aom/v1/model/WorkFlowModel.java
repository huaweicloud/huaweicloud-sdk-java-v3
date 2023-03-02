package com.huaweicloud.sdk.aom.v1.model;





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
 * WorkFlowModel
 */
public class WorkFlowModel  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="en-us")
    
    private Map<String, String> enUs = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="zh-cn")
    
    private Map<String, String> zhCn = null;
    
    public WorkFlowModel withEnUs(Map<String, String> enUs) {
        this.enUs = enUs;
        return this;
    }

    

    public WorkFlowModel putEnUsItem(String key, String enUsItem) {
        if(this.enUs == null) {
            this.enUs = new HashMap<>();
        }
        this.enUs.put(key, enUsItem);
        return this;
    }

    public WorkFlowModel withEnUs(Consumer<Map<String, String>> enUsSetter) {
        if(this.enUs == null) {
            this.enUs = new HashMap<>();
        }
        enUsSetter.accept(this.enUs);
        return this;
    }
    /**
     * 英文描述
     * @return enUs
     */
    public Map<String, String> getEnUs() {
        return enUs;
    }

    public void setEnUs(Map<String, String> enUs) {
        this.enUs = enUs;
    }

    

    public WorkFlowModel withZhCn(Map<String, String> zhCn) {
        this.zhCn = zhCn;
        return this;
    }

    

    public WorkFlowModel putZhCnItem(String key, String zhCnItem) {
        if(this.zhCn == null) {
            this.zhCn = new HashMap<>();
        }
        this.zhCn.put(key, zhCnItem);
        return this;
    }

    public WorkFlowModel withZhCn(Consumer<Map<String, String>> zhCnSetter) {
        if(this.zhCn == null) {
            this.zhCn = new HashMap<>();
        }
        zhCnSetter.accept(this.zhCn);
        return this;
    }
    /**
     * 中文描述
     * @return zhCn
     */
    public Map<String, String> getZhCn() {
        return zhCn;
    }

    public void setZhCn(Map<String, String> zhCn) {
        this.zhCn = zhCn;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkFlowModel workFlowModel = (WorkFlowModel) o;
        return Objects.equals(this.enUs, workFlowModel.enUs) &&
            Objects.equals(this.zhCn, workFlowModel.zhCn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enUs, zhCn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkFlowModel {\n");
        sb.append("    enUs: ").append(toIndentedString(enUs)).append("\n");
        sb.append("    zhCn: ").append(toIndentedString(zhCn)).append("\n");
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

