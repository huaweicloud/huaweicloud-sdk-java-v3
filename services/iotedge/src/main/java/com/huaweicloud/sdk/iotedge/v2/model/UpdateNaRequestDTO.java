package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.AccessRomaInfo;
import com.huaweicloud.sdk.iotedge.v2.model.AuthAkSkInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateNaRequestDTO
 */
public class UpdateNaRequestDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endpoint")
    
    
    private String endpoint;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_aksk_info")
    
    
    private AuthAkSkInfo authAkskInfo;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_type")
    
    
    private String accessType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="access_roma_info")
    
    
    private AccessRomaInfo accessRomaInfo;

    public UpdateNaRequestDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * NA系统名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateNaRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 北向NA系统描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public UpdateNaRequestDTO withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    


    /**
     * 访问URL地址
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    

    public UpdateNaRequestDTO withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * 鉴权方式
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    

    public UpdateNaRequestDTO withAuthAkskInfo(AuthAkSkInfo authAkskInfo) {
        this.authAkskInfo = authAkskInfo;
        return this;
    }

    public UpdateNaRequestDTO withAuthAkskInfo(Consumer<AuthAkSkInfo> authAkskInfoSetter) {
        if(this.authAkskInfo == null ){
            this.authAkskInfo = new AuthAkSkInfo();
            authAkskInfoSetter.accept(this.authAkskInfo);
        }
        
        return this;
    }


    /**
     * Get authAkskInfo
     * @return authAkskInfo
     */
    public AuthAkSkInfo getAuthAkskInfo() {
        return authAkskInfo;
    }

    public void setAuthAkskInfo(AuthAkSkInfo authAkskInfo) {
        this.authAkskInfo = authAkskInfo;
    }

    

    public UpdateNaRequestDTO withAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }

    


    /**
     * 接入类型
     * @return accessType
     */
    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    

    public UpdateNaRequestDTO withAccessRomaInfo(AccessRomaInfo accessRomaInfo) {
        this.accessRomaInfo = accessRomaInfo;
        return this;
    }

    public UpdateNaRequestDTO withAccessRomaInfo(Consumer<AccessRomaInfo> accessRomaInfoSetter) {
        if(this.accessRomaInfo == null ){
            this.accessRomaInfo = new AccessRomaInfo();
            accessRomaInfoSetter.accept(this.accessRomaInfo);
        }
        
        return this;
    }


    /**
     * Get accessRomaInfo
     * @return accessRomaInfo
     */
    public AccessRomaInfo getAccessRomaInfo() {
        return accessRomaInfo;
    }

    public void setAccessRomaInfo(AccessRomaInfo accessRomaInfo) {
        this.accessRomaInfo = accessRomaInfo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNaRequestDTO updateNaRequestDTO = (UpdateNaRequestDTO) o;
        return Objects.equals(this.name, updateNaRequestDTO.name) &&
            Objects.equals(this.description, updateNaRequestDTO.description) &&
            Objects.equals(this.endpoint, updateNaRequestDTO.endpoint) &&
            Objects.equals(this.authType, updateNaRequestDTO.authType) &&
            Objects.equals(this.authAkskInfo, updateNaRequestDTO.authAkskInfo) &&
            Objects.equals(this.accessType, updateNaRequestDTO.accessType) &&
            Objects.equals(this.accessRomaInfo, updateNaRequestDTO.accessRomaInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, endpoint, authType, authAkskInfo, accessType, accessRomaInfo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNaRequestDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authAkskInfo: ").append(toIndentedString(authAkskInfo)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    accessRomaInfo: ").append(toIndentedString(accessRomaInfo)).append("\n");
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

