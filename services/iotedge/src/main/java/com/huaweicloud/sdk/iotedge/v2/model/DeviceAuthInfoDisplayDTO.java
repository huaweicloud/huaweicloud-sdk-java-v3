package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.CertificateLocalPathDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 边缘节点认证方式信息。
 */
public class DeviceAuthInfoDisplayDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auth_type")
    
    
    private String authType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="local_path")
    
    
    private CertificateLocalPathDTO localPath;

    public DeviceAuthInfoDisplayDTO withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    


    /**
     * 边缘节点认证方式。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    

    public DeviceAuthInfoDisplayDTO withLocalPath(CertificateLocalPathDTO localPath) {
        this.localPath = localPath;
        return this;
    }

    public DeviceAuthInfoDisplayDTO withLocalPath(Consumer<CertificateLocalPathDTO> localPathSetter) {
        if(this.localPath == null ){
            this.localPath = new CertificateLocalPathDTO();
            localPathSetter.accept(this.localPath);
        }
        
        return this;
    }


    /**
     * Get localPath
     * @return localPath
     */
    public CertificateLocalPathDTO getLocalPath() {
        return localPath;
    }

    public void setLocalPath(CertificateLocalPathDTO localPath) {
        this.localPath = localPath;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeviceAuthInfoDisplayDTO deviceAuthInfoDisplayDTO = (DeviceAuthInfoDisplayDTO) o;
        return Objects.equals(this.authType, deviceAuthInfoDisplayDTO.authType) &&
            Objects.equals(this.localPath, deviceAuthInfoDisplayDTO.localPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authType, localPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceAuthInfoDisplayDTO {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    localPath: ").append(toIndentedString(localPath)).append("\n");
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

