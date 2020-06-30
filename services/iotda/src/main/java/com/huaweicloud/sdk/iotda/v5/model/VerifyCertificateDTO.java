package com.huaweicloud.sdk.iotda.v5.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 验证CA证书结构体。
 */
public class VerifyCertificateDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verify_content")
    
    private String verifyContent;

    public VerifyCertificateDTO withVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
        return this;
    }

    


    /**
     * 验证证书的内容信息。
     * @return verifyContent
     */
    public String getVerifyContent() {
        return verifyContent;
    }

    public void setVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyCertificateDTO verifyCertificateDTO = (VerifyCertificateDTO) o;
        return Objects.equals(this.verifyContent, verifyCertificateDTO.verifyContent);
    }
    @Override
    public int hashCode() {
        return Objects.hash(verifyContent);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyCertificateDTO {\n");
        sb.append("    verifyContent: ").append(toIndentedString(verifyContent)).append("\n");
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

