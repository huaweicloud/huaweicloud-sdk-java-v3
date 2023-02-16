package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SensitiveMaskResponseRules
 */
public class SensitiveMaskResponseRules  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="regex")
    
    
    private String regex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mask_value")
    
    
    private String maskValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operate_time")
    
    
    private String operateTime;

    public SensitiveMaskResponseRules withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public SensitiveMaskResponseRules withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SensitiveMaskResponseRules withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 规则类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public SensitiveMaskResponseRules withRegex(String regex) {
        this.regex = regex;
        return this;
    }

    


    /**
     * 规则正则表达式
     * @return regex
     */
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    

    public SensitiveMaskResponseRules withMaskValue(String maskValue) {
        this.maskValue = maskValue;
        return this;
    }

    


    /**
     * 替换值
     * @return maskValue
     */
    public String getMaskValue() {
        return maskValue;
    }

    public void setMaskValue(String maskValue) {
        this.maskValue = maskValue;
    }

    

    public SensitiveMaskResponseRules withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 规则状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public SensitiveMaskResponseRules withOperateTime(String operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    


    /**
     * 操作时间
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SensitiveMaskResponseRules sensitiveMaskResponseRules = (SensitiveMaskResponseRules) o;
        return Objects.equals(this.id, sensitiveMaskResponseRules.id) &&
            Objects.equals(this.name, sensitiveMaskResponseRules.name) &&
            Objects.equals(this.type, sensitiveMaskResponseRules.type) &&
            Objects.equals(this.regex, sensitiveMaskResponseRules.regex) &&
            Objects.equals(this.maskValue, sensitiveMaskResponseRules.maskValue) &&
            Objects.equals(this.status, sensitiveMaskResponseRules.status) &&
            Objects.equals(this.operateTime, sensitiveMaskResponseRules.operateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, regex, maskValue, status, operateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensitiveMaskResponseRules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
        sb.append("    maskValue: ").append(toIndentedString(maskValue)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
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

