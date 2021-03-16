package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.ApiGroupBase;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ApiGroupReq
 */
public class ApiGroupReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remark")
    
    private String remark;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public ApiGroupReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * API分组的名称。  支持汉字、英文、数字、中划线、下划线、点、斜杠、中英文格式下的小括号和冒号、中文格式下的顿号，且只能以英文、汉字和数字开头，3-255个字符。 > 中文字符必须为UTF-8或者unicode编码。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ApiGroupReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    


    /**
     * API分组描述。 > 中文字符必须为UTF-8或者unicode编码。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    

    public ApiGroupReq withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * 分组归属的集成应用编号。  分组版本V2时必填。
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    

    public ApiGroupReq withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 分组版本  - V1：全局分组 - V2：应用级分组
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiGroupReq apiGroupReq = (ApiGroupReq) o;
        return Objects.equals(this.name, apiGroupReq.name) &&
            Objects.equals(this.remark, apiGroupReq.remark) &&
            Objects.equals(this.romaAppId, apiGroupReq.romaAppId) &&
            Objects.equals(this.version, apiGroupReq.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, remark, romaAppId, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiGroupReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

