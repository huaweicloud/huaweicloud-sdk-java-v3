package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建CA证书结构体。
 */
public class CreateCertificateDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;

    public CreateCertificateDTO withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 证书内容信息。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CreateCertificateDTO withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，建议携带该参数指定创建的证书归属到哪个资源空间下，否则创建的证书将会归属到[默认资源空间](https://support.huaweicloud.com/usermanual-iothub/iot_01_0006.html#section0)下。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCertificateDTO createCertificateDTO = (CreateCertificateDTO) o;
        return Objects.equals(this.content, createCertificateDTO.content) &&
            Objects.equals(this.appId, createCertificateDTO.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateDTO {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

