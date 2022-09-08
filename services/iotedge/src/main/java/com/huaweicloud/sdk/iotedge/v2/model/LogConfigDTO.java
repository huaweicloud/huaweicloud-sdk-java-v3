package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 日志配置
 */
public class LogConfigDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    
    
    private String level;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rotate_num")
    
    
    private Integer rotateNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rotate_period")
    
    
    private String rotatePeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="component")
    
    
    private String component;

    public LogConfigDTO withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 应用日志文件大小限制，单位MB，默认50，取值范围10-1000
     * minimum: 10
     * maximum: 1000
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public LogConfigDTO withLevel(String level) {
        this.level = level;
        return this;
    }

    


    /**
     * 应用日志级别，可选项：on/off，当type为LTS时有效
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    

    public LogConfigDTO withRotateNum(Integer rotateNum) {
        this.rotateNum = rotateNum;
        return this;
    }

    


    /**
     * 应用日志rotate个数，默认5，取值范围1-10
     * minimum: 1
     * maximum: 10
     * @return rotateNum
     */
    public Integer getRotateNum() {
        return rotateNum;
    }

    public void setRotateNum(Integer rotateNum) {
        this.rotateNum = rotateNum;
    }

    

    public LogConfigDTO withRotatePeriod(String rotatePeriod) {
        this.rotatePeriod = rotatePeriod;
        return this;
    }

    


    /**
     * 应用日志rotate周期，可选项： daily/monthly/weekly/yearly
     * @return rotatePeriod
     */
    public String getRotatePeriod() {
        return rotatePeriod;
    }

    public void setRotatePeriod(String rotatePeriod) {
        this.rotatePeriod = rotatePeriod;
    }

    

    public LogConfigDTO withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * LTS:将日志发送到LTS, local 本地日志
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public LogConfigDTO withComponent(String component) {
        this.component = component;
        return this;
    }

    


    /**
     * app:部署到边缘设备上的应用的日志, system 边缘设备上系统的日志
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogConfigDTO logConfigDTO = (LogConfigDTO) o;
        return Objects.equals(this.size, logConfigDTO.size) &&
            Objects.equals(this.level, logConfigDTO.level) &&
            Objects.equals(this.rotateNum, logConfigDTO.rotateNum) &&
            Objects.equals(this.rotatePeriod, logConfigDTO.rotatePeriod) &&
            Objects.equals(this.type, logConfigDTO.type) &&
            Objects.equals(this.component, logConfigDTO.component);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, level, rotateNum, rotatePeriod, type, component);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfigDTO {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    rotateNum: ").append(toIndentedString(rotateNum)).append("\n");
        sb.append("    rotatePeriod: ").append(toIndentedString(rotatePeriod)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
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

