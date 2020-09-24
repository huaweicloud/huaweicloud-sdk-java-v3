package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AccessoryLimitVo
 */
public class AccessoryLimitVo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_count")
    
    private String limitCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_size")
    
    private String limitSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit_file_type")
    
    private String limitFileType;

    public AccessoryLimitVo withLimitCount(String limitCount) {
        this.limitCount = limitCount;
        return this;
    }

    


    /**
     * 限制文件数量
     * @return limitCount
     */
    public String getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(String limitCount) {
        this.limitCount = limitCount;
    }

    public AccessoryLimitVo withLimitSize(String limitSize) {
        this.limitSize = limitSize;
        return this;
    }

    


    /**
     * 限制文件大小，单位是M
     * @return limitSize
     */
    public String getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(String limitSize) {
        this.limitSize = limitSize;
    }

    public AccessoryLimitVo withLimitFileType(String limitFileType) {
        this.limitFileType = limitFileType;
        return this;
    }

    


    /**
     * 限制文件类型
     * @return limitFileType
     */
    public String getLimitFileType() {
        return limitFileType;
    }

    public void setLimitFileType(String limitFileType) {
        this.limitFileType = limitFileType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessoryLimitVo accessoryLimitVo = (AccessoryLimitVo) o;
        return Objects.equals(this.limitCount, accessoryLimitVo.limitCount) &&
            Objects.equals(this.limitSize, accessoryLimitVo.limitSize) &&
            Objects.equals(this.limitFileType, accessoryLimitVo.limitFileType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limitCount, limitSize, limitFileType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessoryLimitVo {\n");
        sb.append("    limitCount: ").append(toIndentedString(limitCount)).append("\n");
        sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
        sb.append("    limitFileType: ").append(toIndentedString(limitFileType)).append("\n");
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

