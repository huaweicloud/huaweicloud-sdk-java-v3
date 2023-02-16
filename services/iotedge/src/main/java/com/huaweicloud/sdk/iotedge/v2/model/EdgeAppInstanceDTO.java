package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * EdgeAppInstanceDTO
 */
public class EdgeAppInstanceDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    
    
    private String edgeAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_version")
    
    
    private String appVersion;

    public EdgeAppInstanceDTO withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 边缘应用id，只允许数字、英文小写、中划线，切必须以字母或数字结尾
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public EdgeAppInstanceDTO withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    


    /**
     * 边缘应用版本，只允许数字、英文小写、中划线，切必须以字母或数字结尾
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeAppInstanceDTO edgeAppInstanceDTO = (EdgeAppInstanceDTO) o;
        return Objects.equals(this.edgeAppId, edgeAppInstanceDTO.edgeAppId) &&
            Objects.equals(this.appVersion, edgeAppInstanceDTO.appVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, appVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeAppInstanceDTO {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

