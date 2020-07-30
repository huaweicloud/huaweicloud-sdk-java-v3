package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RelativeResource
 */
public class RelativeResource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relativeResourceId")
    
    private String relativeResourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relativeResourceName")
    
    private String relativeResourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="relativeCloudServiceType")
    
    private String relativeCloudServiceType;

    public RelativeResource withRelativeResourceId(String relativeResourceId) {
        this.relativeResourceId = relativeResourceId;
        return this;
    }

    


    /**
     * 关联资源Id
     * @return relativeResourceId
     */
    public String getRelativeResourceId() {
        return relativeResourceId;
    }

    public void setRelativeResourceId(String relativeResourceId) {
        this.relativeResourceId = relativeResourceId;
    }

    public RelativeResource withRelativeResourceName(String relativeResourceName) {
        this.relativeResourceName = relativeResourceName;
        return this;
    }

    


    /**
     * 关联资源名称
     * @return relativeResourceName
     */
    public String getRelativeResourceName() {
        return relativeResourceName;
    }

    public void setRelativeResourceName(String relativeResourceName) {
        this.relativeResourceName = relativeResourceName;
    }

    public RelativeResource withRelativeCloudServiceType(String relativeCloudServiceType) {
        this.relativeCloudServiceType = relativeCloudServiceType;
        return this;
    }

    


    /**
     * 关联云服务名称
     * @return relativeCloudServiceType
     */
    public String getRelativeCloudServiceType() {
        return relativeCloudServiceType;
    }

    public void setRelativeCloudServiceType(String relativeCloudServiceType) {
        this.relativeCloudServiceType = relativeCloudServiceType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RelativeResource relativeResource = (RelativeResource) o;
        return Objects.equals(this.relativeResourceId, relativeResource.relativeResourceId) &&
            Objects.equals(this.relativeResourceName, relativeResource.relativeResourceName) &&
            Objects.equals(this.relativeCloudServiceType, relativeResource.relativeCloudServiceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(relativeResourceId, relativeResourceName, relativeCloudServiceType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelativeResource {\n");
        sb.append("    relativeResourceId: ").append(toIndentedString(relativeResourceId)).append("\n");
        sb.append("    relativeResourceName: ").append(toIndentedString(relativeResourceName)).append("\n");
        sb.append("    relativeCloudServiceType: ").append(toIndentedString(relativeCloudServiceType)).append("\n");
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

