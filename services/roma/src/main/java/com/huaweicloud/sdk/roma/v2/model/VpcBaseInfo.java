package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VpcBaseInfo
 */
public class VpcBaseInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ecs_id")
    
    private String ecsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ecs_name")
    
    private Integer ecsName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cascade_flag")
    
    private Boolean cascadeFlag;

    public VpcBaseInfo withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    


    /**
     * 云服务器ID
     * @return ecsId
     */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    public VpcBaseInfo withEcsName(Integer ecsName) {
        this.ecsName = ecsName;
        return this;
    }

    


    /**
     * 云服务器名称
     * @return ecsName
     */
    public Integer getEcsName() {
        return ecsName;
    }

    public void setEcsName(Integer ecsName) {
        this.ecsName = ecsName;
    }

    public VpcBaseInfo withCascadeFlag(Boolean cascadeFlag) {
        this.cascadeFlag = cascadeFlag;
        return this;
    }

    


    /**
     * 是否使用级联方式  暂不支持
     * @return cascadeFlag
     */
    public Boolean getCascadeFlag() {
        return cascadeFlag;
    }

    public void setCascadeFlag(Boolean cascadeFlag) {
        this.cascadeFlag = cascadeFlag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcBaseInfo vpcBaseInfo = (VpcBaseInfo) o;
        return Objects.equals(this.ecsId, vpcBaseInfo.ecsId) &&
            Objects.equals(this.ecsName, vpcBaseInfo.ecsName) &&
            Objects.equals(this.cascadeFlag, vpcBaseInfo.cascadeFlag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ecsId, ecsName, cascadeFlag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcBaseInfo {\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    ecsName: ").append(toIndentedString(ecsName)).append("\n");
        sb.append("    cascadeFlag: ").append(toIndentedString(cascadeFlag)).append("\n");
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

