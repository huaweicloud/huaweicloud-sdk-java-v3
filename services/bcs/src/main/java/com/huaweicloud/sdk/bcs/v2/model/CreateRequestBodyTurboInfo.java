package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 极速文件存储卷信息
 */
public class CreateRequestBodyTurboInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="share_type")
    
    private String shareType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="available_zone")
    
    private String availableZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_code")
    
    private String resourceSpecCode;

    public CreateRequestBodyTurboInfo withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 共享方式
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public CreateRequestBodyTurboInfo withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateRequestBodyTurboInfo withAvailableZone(String availableZone) {
        this.availableZone = availableZone;
        return this;
    }

    


    /**
     * 可用区
     * @return availableZone
     */
    public String getAvailableZone() {
        return availableZone;
    }

    public void setAvailableZone(String availableZone) {
        this.availableZone = availableZone;
    }

    public CreateRequestBodyTurboInfo withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    


    /**
     * 规格
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestBodyTurboInfo createRequestBodyTurboInfo = (CreateRequestBodyTurboInfo) o;
        return Objects.equals(this.shareType, createRequestBodyTurboInfo.shareType) &&
            Objects.equals(this.type, createRequestBodyTurboInfo.type) &&
            Objects.equals(this.availableZone, createRequestBodyTurboInfo.availableZone) &&
            Objects.equals(this.resourceSpecCode, createRequestBodyTurboInfo.resourceSpecCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(shareType, type, availableZone, resourceSpecCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestBodyTurboInfo {\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    availableZone: ").append(toIndentedString(availableZone)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
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

